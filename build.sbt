import com.typesafe.sbt.web.Import.WebKeys

inThisBuild(
  List(
    organization := "ba.sake",
    homepage := Some(url("https://sake92.github.io/hepek")),
    licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    scmInfo := Some(
      ScmInfo(url("https://github.com/sake92/hepek"), "scm:git:git@github.com:sake92/hepek.git")
    ),
    developers := List(
      Developer(
        "sake92",
        "Sakib Hadžiavdić",
        "sakib@sake.ba",
        url("http://sake.ba")
      )
    ),
    scalaVersion := "2.12.8",
    scalafmtOnCompile := true
  )
)

val openhtmltopdfVersion = "0.0.1-RC19"
val seleniumVersion      = "2.52.0"

lazy val hepekProject = (project in file("hepek"))
  .settings(
    name := "hepek",
    libraryDependencies ++= Seq(
      "ba.sake"                  % "hepek-core"                   % "0.1.1",
      "com.lihaoyi"              %% "scalatags"                   % "0.6.8",
      "com.atlassian.commonmark" % "commonmark"                   % "0.12.1",
      "org.jsoup"                % "jsoup"                        % "1.11.3",
      "com.openhtmltopdf"        % "openhtmltopdf-pdfbox"         % openhtmltopdfVersion,
      "com.openhtmltopdf"        % "openhtmltopdf-svg-support"    % openhtmltopdfVersion,
      "com.openhtmltopdf"        % "openhtmltopdf-mathml-support" % openhtmltopdfVersion,
      "org.seleniumhq.selenium"  % "selenium-java"                % seleniumVersion,
      "org.scalatest"            %% "scalatest"                   % "3.0.7" % "test"
    )
  )

// docs
lazy val hepekDocs = (project in file("hepek-docs"))
  .settings(
    hepekTarget := baseDirectory.value / "..",
    (hepek in Compile) := {
      WebKeys.assets.value
      (hepek in Compile).value
    },
    (WebKeys.public in Assets) := baseDirectory.value / ".." / "docs",
    WebKeys.stagingDirectory := baseDirectory.value / ".." / "docs"
  )
  .dependsOn(hepekProject)
  .enablePlugins(HepekPlugin, SbtWeb)

// tests
lazy val hepekTests = (project in file("hepek-tests"))
  .settings(
    (test in Test) := {
      WebKeys.assets.value
      (hepek in Compile).value // run hepek before tests
      (test in Test).value
    },
    libraryDependencies ++= Seq(
      "org.scalatest"           %% "scalatest"    % "3.0.7"         % "test",
      "org.seleniumhq.selenium" % "selenium-java" % seleniumVersion % "test"
    )
  )
  .dependsOn(hepekProject)
  .enablePlugins(HepekPlugin, SbtWeb)

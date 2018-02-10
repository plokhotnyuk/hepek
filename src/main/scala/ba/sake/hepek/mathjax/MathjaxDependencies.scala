package ba.sake.hepek.mathjax

import ba.sake.hepek.html.structure._

trait MathjaxDependencies extends PageDependencies {

  def mathjaxVersion: String = "2.7.2"
  def mathjaxConfig: String  = "AM_CHTML"

  private def mathjaxJSDependencies: List[String] =
    List(
      mathjaxDepsProvider.depPath(
        Dependency("MathJax.js",
                   mathjaxVersion,
                   "mathjax",
                   qParams = Option(s"config=$mathjaxConfig"))
      )
    )

  def mathjaxDepsProvider = DependencyProvider.cdnjs

  override def scriptURLs =
    super.scriptURLs ++ mathjaxJSDependencies

}

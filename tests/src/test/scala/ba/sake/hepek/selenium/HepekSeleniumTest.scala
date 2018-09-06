package ba.sake.hepek.selenium

import java.nio.file.Paths
import ba.sake.hepek.core.Renderable
import org.scalatest._
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.HtmlUnit

trait HepekSeleniumTest extends FlatSpec with Matchers with HtmlUnit with Eventually {
  val basePath = "tests/target/web/public/main/"

  def filePath(renderable: Renderable): String = {
    val pagePath = basePath + renderable.relPath
    val path     = Paths.get(pagePath)
    path.toUri.toString
  }

}

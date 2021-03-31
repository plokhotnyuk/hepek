package ba.sake.hepek.plain

package statik

import ba.sake.hepek.html.statik.StaticPage
import ba.sake.hepek.plain.component.PlainNavbarComponents
import ba.sake.hepek.plain.component.classes.PlainClassesBundle._
import ba.sake.hepek.scalatags.all._

trait PlainStaticPage extends StaticPage with PlainPage {
  def navbar: Option[PlainNavbarComponents] = None

  override def bodyContent: Frag =
    div(
      div(clsNoPrint)(maybeNavbar),
      pageContent
    )

  /* NAVBAR */
  private def maybeNavbar =
    navbar.map { bsNav =>
      bsNav.full(
        brandUrl = staticSiteSettings.indexPage.map(_.ref).getOrElse("#"),
        brandName = siteSettings.name.map(" " + _),
        brandIconUrl = siteSettings.faviconInverted,
        right = navbarLiTags
      )
    }

  private def navbarLiTags: Seq[(Frag, Seq[AttrPair])] =
    for {
      page <- staticSiteSettings.mainPages
      labela = page.pageCategory getOrElse page.pageSettings.label
      klasa = {
        if (this.pageCategory.isEmpty) ""
        else if (page.pageCategory == this.pageCategory) "active"
        else ""
      }
    } yield a(href := page.ref)(labela) -> Seq(cls := klasa)
}

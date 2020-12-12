package controllers

import play.api.mvc._

import java.util.Locale
import javax.inject._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def conversionFrench(m: Float) = Action {
    implicit request: Request[AnyContent] =>
      val formated = String.format(Locale.FRANCE, "%10.2f", m)
      Ok(views.html.index(formated))
  }
}

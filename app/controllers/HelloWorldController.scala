package controllers

import play.api._
import play.api.libs.json._
import play.api.mvc._

import javax.inject._

@Singleton
class HelloWorldController @Inject() (
    val controllerComponents: ControllerComponents
) extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.obj("message" -> "Hello, World!"))
  }
}

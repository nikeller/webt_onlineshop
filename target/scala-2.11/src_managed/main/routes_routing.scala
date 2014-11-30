// @SOURCE:C:/Users/Nina/workspace/webt_onlineshop/conf/routes
// @HASH:c0c7919c771fe238e487cb2af50ef810c6cb7a5b
// @DATE:Mon Dec 01 00:01:06 CET 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_Kategorie_Torten1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Kategorie_Torten.html"))))
private[this] lazy val controllers_Application_Kategorie_Torten1_invoker = createInvoker(
controllers.Application.Kategorie_Torten(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Kategorie_Torten", Nil,"GET", """""", Routes.prefix + """Kategorie_Torten.html"""))
        

// @LINE:8
private[this] lazy val controllers_Application_Kategorie_Pralinen2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Kategorie_Pralinen.html"))))
private[this] lazy val controllers_Application_Kategorie_Pralinen2_invoker = createInvoker(
controllers.Application.Kategorie_Pralinen(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Kategorie_Pralinen", Nil,"GET", """""", Routes.prefix + """Kategorie_Pralinen.html"""))
        

// @LINE:9
private[this] lazy val controllers_Application_Kategorie_Gebaeck3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Kategorie_Gebaeck.html"))))
private[this] lazy val controllers_Application_Kategorie_Gebaeck3_invoker = createInvoker(
controllers.Application.Kategorie_Gebaeck(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Kategorie_Gebaeck", Nil,"GET", """""", Routes.prefix + """Kategorie_Gebaeck.html"""))
        

// @LINE:10
private[this] lazy val controllers_Application_Registrierung4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Registrierung.html"))))
private[this] lazy val controllers_Application_Registrierung4_invoker = createInvoker(
controllers.Application.Registrierung(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Registrierung", Nil,"GET", """""", Routes.prefix + """Registrierung.html"""))
        

// @LINE:11
private[this] lazy val controllers_Application_Warenkorb5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Warenkorb.html"))))
private[this] lazy val controllers_Application_Warenkorb5_invoker = createInvoker(
controllers.Application.Warenkorb(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Warenkorb", Nil,"GET", """""", Routes.prefix + """Warenkorb.html"""))
        

// @LINE:12
private[this] lazy val controllers_Application_Kasse6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Kasse.html"))))
private[this] lazy val controllers_Application_Kasse6_invoker = createInvoker(
controllers.Application.Kasse(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Kasse", Nil,"GET", """""", Routes.prefix + """Kasse.html"""))
        

// @LINE:14
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Kategorie_Torten.html""","""controllers.Application.Kategorie_Torten()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Kategorie_Pralinen.html""","""controllers.Application.Kategorie_Pralinen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Kategorie_Gebaeck.html""","""controllers.Application.Kategorie_Gebaeck()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Registrierung.html""","""controllers.Application.Registrierung()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Warenkorb.html""","""controllers.Application.Warenkorb()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Kasse.html""","""controllers.Application.Kasse()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_Kategorie_Torten1_route(params) => {
   call { 
        controllers_Application_Kategorie_Torten1_invoker.call(controllers.Application.Kategorie_Torten())
   }
}
        

// @LINE:8
case controllers_Application_Kategorie_Pralinen2_route(params) => {
   call { 
        controllers_Application_Kategorie_Pralinen2_invoker.call(controllers.Application.Kategorie_Pralinen())
   }
}
        

// @LINE:9
case controllers_Application_Kategorie_Gebaeck3_route(params) => {
   call { 
        controllers_Application_Kategorie_Gebaeck3_invoker.call(controllers.Application.Kategorie_Gebaeck())
   }
}
        

// @LINE:10
case controllers_Application_Registrierung4_route(params) => {
   call { 
        controllers_Application_Registrierung4_invoker.call(controllers.Application.Registrierung())
   }
}
        

// @LINE:11
case controllers_Application_Warenkorb5_route(params) => {
   call { 
        controllers_Application_Warenkorb5_invoker.call(controllers.Application.Warenkorb())
   }
}
        

// @LINE:12
case controllers_Application_Kasse6_route(params) => {
   call { 
        controllers_Application_Kasse6_invoker.call(controllers.Application.Kasse())
   }
}
        

// @LINE:14
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     
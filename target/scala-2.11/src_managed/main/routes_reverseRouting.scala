// @SOURCE:C:/Users/Nina/workspace/webt_onlineshop/conf/routes
// @HASH:541fab991a7a0d7e9c92bb5279993498c9207ee0
// @DATE:Tue Jan 06 12:19:17 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:17
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
class ReverseAssets {


// @LINE:17
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def Kategorie_Gebaeck(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Kategorie_Gebaeck")
}
                        

// @LINE:10
def Registrierung(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Registrierung")
}
                        

// @LINE:13
def Kasse(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Kasse")
}
                        

// @LINE:11
def TestStuff(eingabe:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "TestStuff" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("eingabe", eingabe)))))
}
                        

// @LINE:12
def Warenkorb(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Warenkorb")
}
                        

// @LINE:8
def Kategorie_Pralinen(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Kategorie_Pralinen")
}
                        

// @LINE:7
def Kategorie_Torten(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Kategorie_Torten")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:17
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:17
class ReverseAssets {


// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def Kategorie_Gebaeck : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Kategorie_Gebaeck",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kategorie_Gebaeck"})
      }
   """
)
                        

// @LINE:10
def Registrierung : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Registrierung",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Registrierung"})
      }
   """
)
                        

// @LINE:13
def Kasse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Kasse",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kasse"})
      }
   """
)
                        

// @LINE:11
def TestStuff : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.TestStuff",
   """
      function(eingabe) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "TestStuff" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("eingabe", eingabe)])})
      }
   """
)
                        

// @LINE:12
def Warenkorb : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Warenkorb",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Warenkorb"})
      }
   """
)
                        

// @LINE:8
def Kategorie_Pralinen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Kategorie_Pralinen",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kategorie_Pralinen"})
      }
   """
)
                        

// @LINE:7
def Kategorie_Torten : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Kategorie_Torten",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kategorie_Torten"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:17
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
class ReverseAssets {


// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def Kategorie_Gebaeck(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Kategorie_Gebaeck(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Kategorie_Gebaeck", Seq(), "GET", """""", _prefix + """Kategorie_Gebaeck""")
)
                      

// @LINE:10
def Registrierung(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Registrierung(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Registrierung", Seq(), "GET", """""", _prefix + """Registrierung""")
)
                      

// @LINE:13
def Kasse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Kasse(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Kasse", Seq(), "GET", """""", _prefix + """Kasse""")
)
                      

// @LINE:11
def TestStuff(eingabe:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.TestStuff(eingabe), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "TestStuff", Seq(classOf[String]), "GET", """""", _prefix + """TestStuff""")
)
                      

// @LINE:12
def Warenkorb(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Warenkorb(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Warenkorb", Seq(), "GET", """""", _prefix + """Warenkorb""")
)
                      

// @LINE:8
def Kategorie_Pralinen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Kategorie_Pralinen(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Kategorie_Pralinen", Seq(), "GET", """""", _prefix + """Kategorie_Pralinen""")
)
                      

// @LINE:7
def Kategorie_Torten(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Kategorie_Torten(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Kategorie_Torten", Seq(), "GET", """""", _prefix + """Kategorie_Torten""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    
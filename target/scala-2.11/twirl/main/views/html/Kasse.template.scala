
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object Kasse extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main("Kasse")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="de">
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sweet Shop</title>

   <!-- Bootstrap -->
<link rel="stylesheet" type="text/css" href=""""),_display_(/*12.47*/routes/*12.53*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*12.96*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(/*13.47*/routes/*13.53*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*13.97*/("""">
 
  </head>
  <body>
  
  <div class="row">
  <div class="col-xs-6 col-sm-4"> <a class="navbar-brand" href=""""),_display_(/*19.66*/routes/*19.72*/.Application.index),format.raw/*19.90*/(""""><h2>Sweet Shop</h2></a></div>
  
  
  
</div>
  
  

<div class="row">
  <div class="col-xs-6 col-md-4"><div class="page-header">
 <h2 class="ueberschrift">Kasse</h2>
</div>  


</div>


  <div class="col-xs-12 col-sm-6 col-md-8">
<table class="table">
 <tr>
 	<th>Gesamtpreis</th>
 	<th>123</th>
 </tr>
</table>
  
  
 <form action=""""),_display_(/*45.17*/routes/*45.23*/.Application.index),format.raw/*45.41*/("""">
			<button>Ware bestellen</button>
		</form>
  </div>
</div>


<div class="panel-footer">Über Uns!</div>


    <!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
    <script src="bootstrap.min.js"></script>
  </body>
</html>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jan 04 02:31:55 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Kasse.scala.html
                  HASH: 4cce83bc159621311614ad7883d538d787597dbc
                  MATRIX: 798->2|819->15|858->17|885->18|1210->316|1225->322|1289->365|1365->414|1380->420|1445->464|1584->576|1599->582|1638->600|2002->937|2017->943|2056->961
                  LINES: 29->2|29->2|29->2|30->3|39->12|39->12|39->12|40->13|40->13|40->13|46->19|46->19|46->19|72->45|72->45|72->45
                  -- GENERATED --
              */
          
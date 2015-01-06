
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
object Warenkorb extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Warenkorb")/*1.19*/{_display_(Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sweet Shop</title>

    <!-- Bootstrap -->
<link rel="stylesheet" href=""""),_display_(/*11.31*/routes/*11.37*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*11.80*/("""">
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*12.81*/("""">


 
  </head>
  <body>
  
  <div class="row">
  <div class="col-xs-6 col-sm-4"> <a class="navbar-brand" href=""""),_display_(/*20.66*/routes/*20.72*/.Application.index),format.raw/*20.90*/(""""><h2>Sweet Shop</h2></a></div>
  <div class="col-xs-6 col-sm-4"><form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Suchen">
        </div>
        <button type="submit" class="btn btn-default">Los</button>
      </form></div>
  <!-- Optional: Setze die Floats der XS-Spalten zurück, falls ihr Inhalt nicht gleich hoch ist -->
  <div class="clearfix visible-xs-block"></div>
  <div class="col-xs-6 col-sm-4"><ul class="nav navbar-nav navbar-right">
       <li> <form action=""""),_display_(/*30.28*/routes/*30.34*/.Application.Registrierung),format.raw/*30.60*/("""">
						<button>Anmelden</button>
					</form></li>
      </ul></div>
</div>
  
  

<div class="row">
  <div class="col-xs-6 col-md-4"><div class="page-header">
  <h2 class="ueberschrift">Warenkorb</h2>
</div>  

</div>


  <div class="col-xs-12 col-sm-6 col-md-8">
  
  <table class="table table-striped">
  <tr>
    <th>Ware</th>
    <th>Menge</th>
    <th>Preis</th>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>
  
<table class="table">
 <tr>
 	<th>Gesamtpreis</th>
 	<th>123</th>
 </tr>
</table>

<form action=""""),_display_(/*78.16*/routes/*78.22*/.Application.index),format.raw/*78.40*/("""">
			<button>weiter Einkaufen</button>
		</form>
		<form action=""""),_display_(/*81.18*/routes/*81.24*/.Application.Kasse),format.raw/*81.42*/("""">
			<button>zur Kasse gehen</button>
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
                  DATE: Mon Jan 05 20:15:09 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Warenkorb.scala.html
                  HASH: 1f6bfb5af407943458cee1f560462fbe05a8ef8a
                  MATRIX: 802->1|827->18|865->19|892->20|1193->294|1208->300|1272->343|1332->376|1347->382|1412->426|1553->540|1568->546|1607->564|2208->1138|2223->1144|2270->1170|2957->1830|2972->1836|3011->1854|3105->1921|3120->1927|3159->1945
                  LINES: 29->1|29->1|29->1|30->2|39->11|39->11|39->11|40->12|40->12|40->12|48->20|48->20|48->20|58->30|58->30|58->30|106->78|106->78|106->78|109->81|109->81|109->81
                  -- GENERATED --
              */
          
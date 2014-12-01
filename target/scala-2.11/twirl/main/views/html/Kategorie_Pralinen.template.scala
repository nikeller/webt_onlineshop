
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
object Kategorie_Pralinen extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main("Pralinen")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="de">
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sweet Shop</title>

    <!-- Bootstrap -->
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*12.80*/(""">
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*13.81*/(""">


 
  </head>
  <body>
  
  <div class="row">
  <div class="col-xs-6 col-sm-4"> <a class="navbar-brand" href=""""),_display_(/*21.66*/routes/*21.72*/.Application.index),format.raw/*21.90*/(""""><h2>Sweet Shop</h2></a></div>
  <div class="col-xs-6 col-sm-4"><form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Suchen">
        </div>
        <button type="submit" class="btn btn-default">Los</button>
      </form></div>
  <!-- Optional: Setze die Floats der XS-Spalten zurück, falls ihr Inhalt nicht gleich hoch ist -->
  <div class="clearfix visible-xs-block"></div>
  <div class="col-xs-6 col-sm-4"><ul class="nav navbar-nav navbar-right">
        <li><form action=""""),_display_(/*31.28*/routes/*31.34*/.Application.Registrierung),format.raw/*31.60*/("""">
						<button>Anmelden</button>
					</form></li>
        <li><form action=""""),_display_(/*34.28*/routes/*34.34*/.Application.Warenkorb),format.raw/*34.56*/("""">
						<button>Warenkorb</button>
					</form></li>
      </ul></div>
</div>
  
  

<div class="row">
  <div class="col-xs-6 col-md-4"><div class="page-header">
  <h2 class="ueberschrift">Kategorien</h2>
</div>  

<ul>
			<li><h3><a class="categorie" href=""""),_display_(/*48.40*/routes/*48.46*/.Application.Kategorie_Torten),format.raw/*48.75*/("""">Torten</a></h3></li>
			<li><h3><a class="categorie" href=""""),_display_(/*49.40*/routes/*49.46*/.Application.Kategorie_Pralinen),format.raw/*49.77*/("""">Pralinen</a></h3>
							<ul>
					<li><h4>Milchschokolade</h4></li>
					<li><h4>Bitterschokolade</h4></li>
					<li><h4>Weiße Schokolade</h4></li>
				</ul></li>
			<li><h3><a class="categorie" href=""""),_display_(/*55.40*/routes/*55.46*/.Application.Kategorie_Gebaeck),format.raw/*55.76*/("""">Gebäck</a></h3></li>
</ul>  


</div>


  <div class="col-xs-12 col-sm-6 col-md-8">
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Milchschokolade</h3>
 		</div>
 		<div class="panel-body">
  	  		Produktbilder
 		</div>
	</div>
	
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Bitterschokolade</h3>
 		</div>
 		<div class="panel-body">
  	  		Produktbilder
 		</div>
	</div>
	
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Weiße Schokolade</h3>
 		</div>
 		<div class="panel-body">
  	  		Produktbilder
 		</div>
	</div>
  
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
                  DATE: Mon Dec 01 16:57:43 CET 2014
                  SOURCE: C:/Svetik/web-tech/webt_onlineshop/app/views/Kategorie_Pralinen.scala.html
                  HASH: 85eba5d65f0efd284fafdec9ba8b84f3b24da8a8
                  MATRIX: 811->3|835->19|873->20|901->22|1220->314|1235->320|1299->363|1359->396|1374->402|1439->446|1587->567|1602->573|1641->591|2252->1175|2267->1181|2314->1207|2424->1290|2439->1296|2482->1318|2783->1592|2798->1598|2848->1627|2938->1690|2953->1696|3005->1727|3243->1938|3258->1944|3309->1974
                  LINES: 29->2|29->2|29->2|30->3|39->12|39->12|39->12|40->13|40->13|40->13|48->21|48->21|48->21|58->31|58->31|58->31|61->34|61->34|61->34|75->48|75->48|75->48|76->49|76->49|76->49|82->55|82->55|82->55
                  -- GENERATED --
              */
          
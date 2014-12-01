
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
object Kategorie_Torten extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Torten,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(torten: models.Torten):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""
"""),_display_(/*2.2*/main("Torten")/*2.16*/{_display_(Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="de">
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sweet Shop</title>

    <!-- Bootstrap -->
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*12.80*/("""">
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*13.81*/("""">


 
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
      <li>  <form action=""""),_display_(/*34.28*/routes/*34.34*/.Application.Warenkorb),format.raw/*34.56*/("""">
						<button>Warenkorb</button>
					</form></li>
      </ul></div>
</div>
  
  

<div class="row">
  <div class="col-xs-6 col-md-4"><div class="page-header">
  <h2 class="ueberschrift">Kategorien</h2>
</div>  

<ul>
			<li><h3><a class="categorie" href=""""),_display_(/*48.40*/routes/*48.46*/.Application.Kategorie_Torten),format.raw/*48.75*/("""">Torten</a></h3>
				<ul>
					<li><h4>Hochzeitstorten</h4></li>
					<li><h4>Geburtstagstorten</h4></li>
				</ul>
			</li>
			<li><h3><a class="categorie" href=""""),_display_(/*54.40*/routes/*54.46*/.Application.Kategorie_Pralinen),format.raw/*54.77*/("""">Pralinen</a></h3></li>
			<li><h3><a class="categorie" href=""""),_display_(/*55.40*/routes/*55.46*/.Application.Kategorie_Gebaeck),format.raw/*55.76*/("""">Gebäck</a></h3></li>
</ul>  

</div>


  <div class="col-xs-12 col-sm-6 col-md-8">
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Hochzeitstorten</h3>
 		</div>
 		
 		<table class="table">
 			<tr>
 				<th>Produktname</th>
 				<th>Produktbeschreibung</th>
 				<th>Produktbild</th>
 				<th>Preis in Euro</th>
 				<th></th>
			</tr>
			<tr>
				<td>"""),_display_(/*76.10*/torten/*76.16*/.produkt_name),format.raw/*76.29*/("""</td>
				<td>"""),_display_(/*77.10*/torten/*77.16*/.produkt_beschreibung),format.raw/*77.37*/("""</td>
				<td>"""),_display_(/*78.10*/torten/*78.16*/.bild),format.raw/*78.21*/("""</td>
				<td>"""),_display_(/*79.10*/torten/*79.16*/.preis),format.raw/*79.22*/("""</td>
				<td><form action=""""),_display_(/*80.24*/routes/*80.30*/.Application.Warenkorb),format.raw/*80.52*/("""">
						<button>In den Warenkorb</button>
					</form></td>
			</tr>
			<tr>
				
			</tr>
		</table>
		
 		
 	
	</div>
	
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Geburtstagstorten</h3>
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

  def render(torten:models.Torten): play.twirl.api.HtmlFormat.Appendable = apply(torten)

  def f:((models.Torten) => play.twirl.api.HtmlFormat.Appendable) = (torten) => apply(torten)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 18:58:55 CET 2014
                  SOURCE: C:/Svetik/web-tech/webt_onlineshop/app/views/Kategorie_Torten.scala.html
                  HASH: aa378ca3557bcf0ceeaca04bf9c944a386db8eb1
                  MATRIX: 741->1|852->24|880->27|902->41|940->42|968->44|1287->336|1302->342|1366->385|1427->419|1442->425|1507->469|1656->591|1671->597|1710->615|2321->1199|2336->1205|2383->1231|2493->1314|2508->1320|2551->1342|2852->1616|2867->1622|2917->1651|3115->1822|3130->1828|3182->1859|3274->1924|3289->1930|3340->1960|3797->2390|3812->2396|3846->2409|3889->2425|3904->2431|3946->2452|3989->2468|4004->2474|4030->2479|4073->2495|4088->2501|4115->2507|4172->2537|4187->2543|4230->2565
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|40->12|40->12|40->12|41->13|41->13|41->13|49->21|49->21|49->21|59->31|59->31|59->31|62->34|62->34|62->34|76->48|76->48|76->48|82->54|82->54|82->54|83->55|83->55|83->55|104->76|104->76|104->76|105->77|105->77|105->77|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80
                  -- GENERATED --
              */
          
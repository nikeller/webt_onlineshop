
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("SweetShop")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

   """),format.raw/*5.4*/("""<!DOCTYPE html>
<html lang="de">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sweet Shop</title>

<!-- Bootstrap -->
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*14.80*/("""">
<link rel="stylesheet" href=""""),_display_(/*15.31*/routes/*15.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*15.81*/("""">

<!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
<script src="bootstrap.min.js"></script>
<script type=text/javascript" src=""""),_display_(/*22.37*/routes/*22.43*/.Assets.at("javascripts/javascript.js")),format.raw/*22.82*/(""""></script>
 
     <style type="text/css">
        .next """),format.raw/*25.15*/("""{"""),format.raw/*25.16*/(""" """),format.raw/*25.17*/("""position: absolute; top: 0; left: 0; opacity: 0; filter:alpha(opacity=0); """),format.raw/*25.91*/("""}"""),format.raw/*25.92*/("""
        """),format.raw/*26.9*/("""#meinFader """),format.raw/*26.20*/("""{"""),format.raw/*26.21*/(""" """),format.raw/*26.22*/("""position: relative; """),format.raw/*26.42*/("""}"""),format.raw/*26.43*/("""
    """),format.raw/*27.5*/("""</style>

</head>
<body>


	<div class="row">
		<div class="col-xs-6 col-sm-4">
			<a class="navbar-brand" href=""""),_display_(/*35.35*/routes/*35.41*/.Application.index),format.raw/*35.59*/(""""><h2>Sweet
					Shop</h2></a>
		</div>
		<div class="col-xs-6 col-sm-4">
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Suchen">
				</div>
				<button type="submit" class="btn btn-default">Los</button>
			</form>
		</div>
		<!-- Optional: Setze die Floats der XS-Spalten zurück, falls ihr Inhalt nicht gleich hoch ist -->
		<div class="clearfix visible-xs-block"></div>
		<div class="col-xs-6 col-sm-4">
			<ul class="nav navbar-nav navbar-right">
				<li><form action=""""),_display_(/*50.24*/routes/*50.30*/.Application.Registrierung),format.raw/*50.56*/("""">
						<button>Anmelden</button>
					</form></li>
				<li><form action=""""),_display_(/*53.24*/routes/*53.30*/.Application.Warenkorb),format.raw/*53.52*/("""">
						<button>Warenkorb</button>
					</form></li>
			</ul>
		</div>
	</div>



	<div class="row">
		<div class="col-xs-6 col-md-4">
			<div class="page-header">
				<h2 class="ueberschrift">Kategorien</h2>
			</div>

			<ul>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*70.35*/routes/*70.41*/.Application.Kategorie_Torten),format.raw/*70.70*/("""">Torten</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*73.35*/routes/*73.41*/.Application.Kategorie_Pralinen),format.raw/*73.72*/("""">Pralinen</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*76.35*/routes/*76.41*/.Application.Kategorie_Gebaeck),format.raw/*76.71*/("""">Gebäck</a>
					</h3></li>
			</ul>

		</div>

		<div class="col-xs-12 col-sm-6 col-md-8">
<div class="panel panel-default">
				
							
		
<script language="JavaScript">
var i = 0;
var path = new Array();
 
// LIST OF IMAGES
path[0] = """"),_display_(/*92.13*/routes/*92.19*/.Assets.at("images/Torte_001.jpg")),format.raw/*92.53*/("""";
path[1] = """"),_display_(/*93.13*/routes/*93.19*/.Assets.at("images/Praline_001.jpg")),format.raw/*93.55*/("""";
path[2] = """"),_display_(/*94.13*/routes/*94.19*/.Assets.at("images/Gebaeck_001.jpg")),format.raw/*94.55*/("""";
path[3] = """"),_display_(/*95.13*/routes/*95.19*/.Assets.at("images/Torte_002.jpg")),format.raw/*95.53*/("""";
path[4] = """"),_display_(/*96.13*/routes/*96.19*/.Assets.at("images/Praline_002.jpg")),format.raw/*96.55*/("""";
path[5] = """"),_display_(/*97.13*/routes/*97.19*/.Assets.at("images/Gebaeck_002.jpg")),format.raw/*97.55*/("""";
path[6] = """"),_display_(/*98.13*/routes/*98.19*/.Assets.at("images/Torte_003.jpg")),format.raw/*98.53*/("""";
path[7] = """"),_display_(/*99.13*/routes/*99.19*/.Assets.at("images/Praline_003.jpg")),format.raw/*99.55*/("""";

function swapImage()
"""),format.raw/*102.1*/("""{"""),format.raw/*102.2*/("""
   """),format.raw/*103.4*/("""document.slide.src = path[i];
   if(i < path.length - 1) i++; else i = 0;
   setTimeout("swapImage()",2000);
"""),format.raw/*106.1*/("""}"""),format.raw/*106.2*/("""
"""),format.raw/*107.1*/("""window.onload=swapImage;
</script>
<img class="imp-responsive" alt="Responsives Bild" height="400" name="slide" src="image_1.gif" width="500" />
		
</div>		
		
   
		
			<!-- <div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Torten</h3>
					
				</div>
				<div class="panel-body">Produktbilder</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Pralinen</h3>
				</div>
				<div class="panel-body">Produktbilder</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Gebäck</h3>
				</div>
				<div class="panel-body">Produktbilder</div>
			</div>

		</div> -->
	</div>


	<div class="panel-footer">Über Uns!</div>


	
</body>
</html>

""")))}),format.raw/*148.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jan 07 14:35:27 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/index.scala.html
                  HASH: ebc9cfe27e7a382da91b82c8ee22a8760226fbd9
                  MATRIX: 723->1|828->18|858->23|883->40|922->42|955->49|1253->320|1268->326|1332->369|1393->403|1408->409|1473->453|1863->816|1878->822|1938->861|2026->921|2055->922|2084->923|2186->997|2215->998|2252->1008|2291->1019|2320->1020|2349->1021|2397->1041|2426->1042|2459->1048|2608->1170|2623->1176|2662->1194|3273->1778|3288->1784|3335->1810|3441->1889|3456->1895|3499->1917|3819->2210|3834->2216|3884->2245|3990->2324|4005->2330|4057->2361|4165->2442|4180->2448|4231->2478|4515->2735|4530->2741|4585->2775|4628->2791|4643->2797|4700->2833|4743->2849|4758->2855|4815->2891|4858->2907|4873->2913|4928->2947|4971->2963|4986->2969|5043->3005|5086->3021|5101->3027|5158->3063|5201->3079|5216->3085|5271->3119|5314->3135|5329->3141|5386->3177|5442->3205|5471->3206|5504->3211|5644->3323|5673->3324|5703->3326|6583->4175
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|42->14|42->14|42->14|43->15|43->15|43->15|50->22|50->22|50->22|53->25|53->25|53->25|53->25|53->25|54->26|54->26|54->26|54->26|54->26|54->26|55->27|63->35|63->35|63->35|78->50|78->50|78->50|81->53|81->53|81->53|98->70|98->70|98->70|101->73|101->73|101->73|104->76|104->76|104->76|120->92|120->92|120->92|121->93|121->93|121->93|122->94|122->94|122->94|123->95|123->95|123->95|124->96|124->96|124->96|125->97|125->97|125->97|126->98|126->98|126->98|127->99|127->99|127->99|130->102|130->102|131->103|134->106|134->106|135->107|176->148
                  -- GENERATED --
              */
          
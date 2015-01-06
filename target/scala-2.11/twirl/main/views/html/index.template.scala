
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
                  DATE: Mon Jan 05 20:15:09 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/index.scala.html
                  HASH: fb278cc47e3186274d07abc7773a020166983a68
                  MATRIX: 723->1|828->18|856->21|881->38|920->40|951->45|1240->307|1255->313|1319->356|1379->389|1394->395|1459->439|1842->795|1857->801|1917->840|2002->897|2031->898|2060->899|2162->973|2191->974|2227->983|2266->994|2295->995|2324->996|2372->1016|2401->1017|2433->1022|2574->1136|2589->1142|2628->1160|3224->1729|3239->1735|3286->1761|3389->1837|3404->1843|3447->1865|3750->2141|3765->2147|3815->2176|3918->2252|3933->2258|3985->2289|4090->2367|4105->2373|4156->2403|4424->2644|4439->2650|4494->2684|4536->2699|4551->2705|4608->2741|4650->2756|4665->2762|4722->2798|4764->2813|4779->2819|4834->2853|4876->2868|4891->2874|4948->2910|4990->2925|5005->2931|5062->2967|5104->2982|5119->2988|5174->3022|5216->3037|5231->3043|5288->3079|5341->3104|5370->3105|5402->3109|5539->3218|5568->3219|5597->3220|6436->4028
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|42->14|42->14|42->14|43->15|43->15|43->15|50->22|50->22|50->22|53->25|53->25|53->25|53->25|53->25|54->26|54->26|54->26|54->26|54->26|54->26|55->27|63->35|63->35|63->35|78->50|78->50|78->50|81->53|81->53|81->53|98->70|98->70|98->70|101->73|101->73|101->73|104->76|104->76|104->76|120->92|120->92|120->92|121->93|121->93|121->93|122->94|122->94|122->94|123->95|123->95|123->95|124->96|124->96|124->96|125->97|125->97|125->97|126->98|126->98|126->98|127->99|127->99|127->99|130->102|130->102|131->103|134->106|134->106|135->107|176->148
                  -- GENERATED --
              */
          
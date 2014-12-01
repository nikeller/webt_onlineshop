
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
object SweetShop_Main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="de">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sweet Shop</title>

<!-- Bootstrap -->
<link rel="stylesheet" href=""""),_display_(/*10.31*/routes/*10.37*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*10.80*/(""">
<link rel="stylesheet" href=""""),_display_(/*11.31*/routes/*11.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*11.81*/(""">

<!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
<script src="bootstrap.min.js"></script>


</head>
<body>


	<div class="row">
		<div class="col-xs-6 col-sm-4">
			<a class="navbar-brand" href=""""),_display_(/*26.35*/routes/*26.41*/.Application.index),format.raw/*26.59*/(""""><h2>Sweet
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
				<li><form action=""""),_display_(/*41.24*/routes/*41.30*/.Application.Registrierung),format.raw/*41.56*/("""">
						<button>Anmelden</button>
					</form></li>
				<li><form action=""""),_display_(/*44.24*/routes/*44.30*/.Application.Warenkorb),format.raw/*44.52*/("""">
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
						<a class="categorie" href=""""),_display_(/*61.35*/routes/*61.41*/.Application.Kategorie_Torten),format.raw/*61.70*/("""">Torten</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*64.35*/routes/*64.41*/.Application.Kategorie_Pralinen),format.raw/*64.72*/("""">Pralinen</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*67.35*/routes/*67.41*/.Application.Kategorie_Gebaeck),format.raw/*67.71*/("""">Gebäck</a>
					</h3></li>
			</ul>

		</div>

		<div class="col-xs-12 col-sm-6 col-md-8">
			<div class="panel panel-default">
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

		</div>
	</div>


	<div class="panel-footer">Über Uns!</div>


	
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 00:26:30 CET 2014
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/SweetShop_Main.scala.html
                  HASH: e937b593eca97488794e6277152c442df6253fac
                  MATRIX: 807->0|1105->271|1120->277|1184->320|1244->353|1259->359|1324->403|1791->843|1806->849|1845->867|2456->1451|2471->1457|2518->1483|2624->1562|2639->1568|2682->1590|3002->1883|3017->1889|3067->1918|3173->1997|3188->2003|3240->2034|3348->2115|3363->2121|3414->2151
                  LINES: 29->1|38->10|38->10|38->10|39->11|39->11|39->11|54->26|54->26|54->26|69->41|69->41|69->41|72->44|72->44|72->44|89->61|89->61|89->61|92->64|92->64|92->64|95->67|95->67|95->67
                  -- GENERATED --
              */
          
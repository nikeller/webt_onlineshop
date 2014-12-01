
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
<link rel="stylesheet" type="css/text" """),_display_(/*10.41*/routes/*10.47*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*10.90*/(""">
<link rel="stylesheet" type="css/text" """),_display_(/*11.41*/routes/*11.47*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*11.91*/(""">

<!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
<script src="bootstrap.min.js"></script>


</head>
<body>


	<div class="row">
		<div class="col-xs-6 col-sm-4">
			<a class="navbar-brand" """),_display_(/*26.29*/routes/*26.35*/.Application.index),format.raw/*26.53*/("""><h2>Sweet
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
						<a class="categorie" """),_display_(/*61.29*/routes/*61.35*/.Application.Kategorie_Torten),format.raw/*61.64*/(""">Torten</a>
					</h3></li>
				<li><h3>
						<a class="categorie" """),_display_(/*64.29*/routes/*64.35*/.Application.Kategorie_Pralinen),format.raw/*64.66*/(""">Pralinen</a>
					</h3></li>
				<li><h3>
						<a class="categorie" """),_display_(/*67.29*/routes/*67.35*/.Application.Kategorie_Gebaeck),format.raw/*67.65*/(""">Gebäck</a>
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
                  DATE: Mon Dec 01 18:50:58 CET 2014
                  SOURCE: C:/Svetik/web-tech/webt_onlineshop/app/views/SweetShop_Main.scala.html
                  HASH: 007650088363156ebb4a9f4c7e825eae9cafdfbf
                  MATRIX: 807->0|1115->281|1130->287|1194->330|1264->373|1279->379|1344->423|1805->857|1820->863|1859->881|2469->1464|2484->1470|2531->1496|2637->1575|2652->1581|2695->1603|3009->1890|3024->1896|3074->1925|3173->1997|3188->2003|3240->2034|3341->2108|3356->2114|3407->2144
                  LINES: 29->1|38->10|38->10|38->10|39->11|39->11|39->11|54->26|54->26|54->26|69->41|69->41|69->41|72->44|72->44|72->44|89->61|89->61|89->61|92->64|92->64|92->64|95->67|95->67|95->67
                  -- GENERATED --
              */
          
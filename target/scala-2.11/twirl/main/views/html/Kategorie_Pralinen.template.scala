
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

Seq[Any](_display_(/*1.2*/main("Pralinen")/*1.18*/ {_display_(Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="de">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sweet Shop</title>

<!-- Bootstrap -->
link rel="stylesheet" href=""""),_display_(/*11.30*/routes/*11.36*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*11.79*/(""">
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*12.81*/(""">



</head>
<body>

	<div class="row">
		<div class="col-xs-6 col-sm-4">
			<a class="navbar-brand" href=""""),_display_(/*21.35*/routes/*21.41*/.Application.index),format.raw/*21.59*/(""""><h2>Sweet
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
				<li><form action=""""),_display_(/*36.24*/routes/*36.30*/.Application.Registrierung),format.raw/*36.56*/("""">
						<button>Anmelden</button>
					</form></li>
				<li><form action=""""),_display_(/*39.24*/routes/*39.30*/.Application.Warenkorb),format.raw/*39.52*/("""">
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
						<a class="categorie" href=""""),_display_(/*56.35*/routes/*56.41*/.Application.Kategorie_Torten),format.raw/*56.70*/("""">Torten</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*59.35*/routes/*59.41*/.Application.Kategorie_Pralinen),format.raw/*59.72*/("""">Pralinen</a>
					</h3>
					<ul>
						<li><h4>Milchschokolade</h4></li>
						<li><h4>Bitterschokolade</h4></li>
						<li><h4>Weiße Schokolade</h4></li>
					</ul></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*67.35*/routes/*67.41*/.Application.Kategorie_Gebaeck),format.raw/*67.71*/("""">Gebäck</a>
					</h3></li>
			</ul>


		</div>


		<div class="col-xs-12 col-sm-6 col-md-8">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Milchschokolade</h3>
				</div>
				<div class="panel-body">Produktbilder</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Bitterschokolade</h3>
				</div>
				<div class="panel-body">Produktbilder</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Weiße Schokolade</h3>
				</div>
				<div class="panel-body">Produktbilder</div>
			</div>

		</div>
	</div>


	<div class="panel-footer">Über Uns!</div>


	<!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
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
                  DATE: Sun Nov 23 00:26:32 CET 2014
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Kategorie_Pralinen.scala.html
                  HASH: f95a130ca13afe9d0f02aaf334da978838b5e586
                  MATRIX: 811->1|835->17|874->19|902->21|1199->291|1214->297|1278->340|1338->373|1353->379|1418->423|1562->540|1577->546|1616->564|2227->1148|2242->1154|2289->1180|2395->1259|2410->1265|2453->1287|2773->1580|2788->1586|2838->1615|2944->1694|2959->1700|3011->1731|3267->1960|3282->1966|3333->1996
                  LINES: 29->1|29->1|29->1|30->2|39->11|39->11|39->11|40->12|40->12|40->12|49->21|49->21|49->21|64->36|64->36|64->36|67->39|67->39|67->39|84->56|84->56|84->56|87->59|87->59|87->59|95->67|95->67|95->67
                  -- GENERATED --
              */
          
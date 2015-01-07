
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
object Kategorie_Gebaeck extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""﻿"""),_display_(/*1.3*/main("Gebäck")/*1.17*/{_display_(Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="de">
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
				<li>
					<form action=""""),_display_(/*37.21*/routes/*37.27*/.Application.Registrierung),format.raw/*37.53*/("""">
						<button>Anmelden</button>
					</form>
				</li>
				<li>
					<form action=""""),_display_(/*42.21*/routes/*42.27*/.Application.Warenkorb),format.raw/*42.49*/("""">
						<button>Warenkorb</button>
					</form>
				</li>
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
						<a class="categorie" href=""""),_display_(/*60.35*/routes/*60.41*/.Application.Kategorie_Torten),format.raw/*60.70*/("""">Torten</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*63.35*/routes/*63.41*/.Application.Kategorie_Pralinen),format.raw/*63.72*/("""">Pralinen</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*66.35*/routes/*66.41*/.Application.Kategorie_Gebaeck),format.raw/*66.71*/("""">Gebäck</a>
					</h3>
					<ul>
						<li><h4>Muffins</h4></li>
						<li><h4>Kekse</h4></li>
						<li><h4>Cake Pops</h4></li>
					</ul></li>
			</ul>


		</div>


		<div class="col-xs-12 col-sm-6 col-md-8">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Muffins</h3>
				</div>
				<!-- Tabelle mit Produkten -->

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Kekse</h3>
				</div>
				<div class="panel-body">Produktbilder</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Cake Pops</h3>
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
                  DATE: Wed Jan 07 14:35:27 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Kategorie_Gebaeck.scala.html
                  HASH: e71567a9c6288be0b2372fbd2b3c50f54815bb6a
                  MATRIX: 810->0|837->2|859->16|897->17|925->19|1223->290|1238->296|1302->339|1363->373|1378->379|1443->423|1588->541|1603->547|1642->565|2260->1156|2275->1162|2322->1188|2441->1280|2456->1286|2499->1308|2825->1607|2840->1613|2890->1642|2996->1721|3011->1727|3063->1758|3171->1839|3186->1845|3237->1875
                  LINES: 29->1|29->1|29->1|29->1|30->2|39->11|39->11|39->11|40->12|40->12|40->12|49->21|49->21|49->21|65->37|65->37|65->37|70->42|70->42|70->42|88->60|88->60|88->60|91->63|91->63|91->63|94->66|94->66|94->66
                  -- GENERATED --
              */
          
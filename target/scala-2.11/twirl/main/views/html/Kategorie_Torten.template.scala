
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
object Kategorie_Torten extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main("Torten")/*2.16*/ {_display_(Seq[Any](format.raw/*2.18*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="de">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sweet Shop</title>

<!-- Bootstrap -->
link rel="stylesheet" href=""""),_display_(/*12.30*/routes/*12.36*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*12.79*/(""">
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*13.81*/(""">


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
				<li>
					<form action=""""),_display_(/*40.21*/routes/*40.27*/.Application.Warenkorb),format.raw/*40.49*/("""">
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
						<a class="categorie" href=""""),_display_(/*58.35*/routes/*58.41*/.Application.Kategorie_Torten),format.raw/*58.70*/("""">Torten</a>
					</h3>
					<ul>
						<li><h4>Hochzeitstorten</h4></li>
						<li><h4>Geburtstagstorten</h4></li>
					</ul></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*65.35*/routes/*65.41*/.Application.Kategorie_Pralinen),format.raw/*65.72*/("""">Pralinen</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*68.35*/routes/*68.41*/.Application.Kategorie_Gebaeck),format.raw/*68.71*/("""">Gebäck</a>
					</h3></li>
			</ul>

		</div>


		<div class="col-xs-12 col-sm-6 col-md-8">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Hochzeitstorten</h3>
				</div>
				<div class="panel-body">Produktbilder</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Geburtstagstorten</h3>
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
                  DATE: Sun Nov 30 22:19:37 CET 2014
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Kategorie_Torten.scala.html
                  HASH: e1f1d5dcea1bb020bd864b8accda2291fa090b7d
                  MATRIX: 809->3|831->17|870->19|898->21|1195->291|1210->297|1274->340|1334->373|1349->379|1414->423|1556->538|1571->544|1610->562|2221->1146|2236->1152|2283->1178|2396->1264|2411->1270|2454->1292|2780->1591|2795->1597|2845->1626|3058->1812|3073->1818|3125->1849|3233->1930|3248->1936|3299->1966
                  LINES: 29->2|29->2|29->2|30->3|39->12|39->12|39->12|40->13|40->13|40->13|48->21|48->21|48->21|63->36|63->36|63->36|67->40|67->40|67->40|85->58|85->58|85->58|92->65|92->65|92->65|95->68|95->68|95->68
                  -- GENERATED --
              */
          
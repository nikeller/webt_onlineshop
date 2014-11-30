
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

Seq[Any](_display_(/*2.2*/main("Warenkorb")/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
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
				<li>
					<form action=""""),_display_(/*37.21*/routes/*37.27*/.Application.Registrierung),format.raw/*37.53*/("""">
						<button>Anmelden</button>
					</form>
				</li>
			</ul>
		</div>
	</div>



	<div class="row">
		<div class="col-xs-6 col-md-4">
			<div class="page-header">
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

			<form action=""""),_display_(/*88.19*/routes/*88.25*/.Application.index),format.raw/*88.43*/("""">
				<button>weiter Einkaufen</button>
			</form>
			<form action=""""),_display_(/*91.19*/routes/*91.25*/.Application.Kasse),format.raw/*91.43*/("""">
				<button>zur Kasse gehen</button>
			</form>

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
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Warenkorb.scala.html
                  HASH: 8ff4eba169e63e736ba3222641eb8fce90e77aa7
                  MATRIX: 802->3|827->20|866->22|894->24|1181->284|1196->290|1260->333|1320->366|1335->372|1400->416|1542->531|1557->537|1596->555|2214->1146|2229->1152|2276->1178|3075->1950|3090->1956|3129->1974|3229->2047|3244->2053|3283->2071
                  LINES: 29->2|29->2|29->2|30->3|39->12|39->12|39->12|40->13|40->13|40->13|48->21|48->21|48->21|64->37|64->37|64->37|115->88|115->88|115->88|118->91|118->91|118->91
                  -- GENERATED --
              */
          
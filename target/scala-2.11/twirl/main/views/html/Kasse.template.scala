
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
object Kasse extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main("Kasse")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
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
			<a class="navbar-brand" href=""""),_display_(/*22.35*/routes/*22.41*/.Application.index),format.raw/*22.59*/(""""><h2>Sweet
					Shop</h2></a>
		</div>



	</div>



	<div class="row">
		<div class="col-xs-6 col-md-4">
			<div class="page-header">
				<h2 class="ueberschrift">Kasse</h2>
			</div>


		</div>


		<div class="col-xs-12 col-sm-6 col-md-8">
			<table class="table">
				<tr>
					<th>Gesamtpreis</th>
					<th>123</th>
				</tr>
			</table>


			<form action=""""),_display_(/*51.19*/routes/*51.25*/.Application.index),format.raw/*51.43*/("""">
				<button>Ware bestellen</button>
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
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Kasse.scala.html
                  HASH: e1b5ad7dc2a718c1e34079dbf295fa54172bc3ea
                  MATRIX: 798->3|819->16|858->18|886->20|1183->290|1198->296|1262->339|1322->372|1337->378|1402->422|1546->539|1561->545|1600->563|2019->955|2034->961|2073->979
                  LINES: 29->2|29->2|29->2|30->3|39->12|39->12|39->12|40->13|40->13|40->13|49->22|49->22|49->22|78->51|78->51|78->51
                  -- GENERATED --
              */
          
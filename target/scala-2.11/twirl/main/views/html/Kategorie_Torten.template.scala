
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
object Kategorie_Torten extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Collection[Torte],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(torten: Collection[Torte]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/(""" """),_display_(/*1.31*/main("Torten")/*1.45*/{_display_(Seq[Any](format.raw/*1.46*/("""
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

				<table class="table">
					<tr>
						<th>Produktname</th>
						<!-- 						<th>Produktbeschreibung</th> -->
						<th>Produktbild</th>
						<th>Preis in Euro</th>
						<th></th>
					</tr>
					"""),_display_(/*89.7*/for(torte <- torten) yield /*89.27*/ {_display_(Seq[Any](format.raw/*89.29*/("""
					"""),format.raw/*90.6*/("""<tr>	
						<td>"""),_display_(/*91.12*/torte/*91.17*/.produkt_name),format.raw/*91.30*/("""</td>
						<td><img class="img-responsive" alt="Responsives Bild" src=""""),_display_(/*92.68*/torte/*92.73*/.bild),format.raw/*92.78*/(""""></td>
						<td>"""),_display_(/*93.12*/torte/*93.17*/.preis),format.raw/*93.23*/("""</td>
						<td><form action=""""),_display_(/*94.26*/routes/*94.32*/.Application.Warenkorb),format.raw/*94.54*/("""">
								<button type="button" class="btn btn-default btn-sm">In
									den Warenkorb</button>
							</form></td>
					</tr>
					""")))}),format.raw/*99.7*/("""
					"""),format.raw/*100.6*/("""<tr>
					</tr>
				</table>



<!-- 		</div>

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Geburtstagstorten</h3>
				</div>
				 		<div class="panel-body">
				  	  		Produktbilder
				 		</div>
				<table class="table">
					<tr>
						<th>Produktname</th>
												<th>Produktbeschreibung</th>
						<th>Produktbild</th>
						<th>Preis in Euro</th>
						<th></th>
					</tr>
					"""),_display_(/*123.7*/for(torte <- torten) yield /*123.27*/ {_display_(Seq[Any](format.raw/*123.29*/("""
					"""),format.raw/*124.6*/("""<tr>	
						<td>"""),_display_(/*125.12*/torte/*125.17*/.produkt_name),format.raw/*125.30*/("""</td>
						<td><img class="img-responsive" alt="Responsives Bild" src=""""),_display_(/*126.68*/torte/*126.73*/.bild),format.raw/*126.78*/(""""></td>
						<td>"""),_display_(/*127.12*/torte/*127.17*/.preis),format.raw/*127.23*/("""</td>
						<td><form action=""""),_display_(/*128.26*/routes/*128.32*/.Application.Warenkorb),format.raw/*128.54*/("""">
								<button type="button" class="btn btn-default btn-sm">In
									den Warenkorb</button>
							</form></td>
					</tr>
					""")))}),format.raw/*133.7*/("""
					"""),_display_(/*134.7*/for(torte <- torten) yield /*134.27*/ {_display_(Seq[Any](format.raw/*134.29*/("""
					"""),format.raw/*135.6*/("""<tr>	
						<td>"""),_display_(/*136.12*/torte/*136.17*/.produkt_name),format.raw/*136.30*/("""</td>
						<td><img class="img-responsive" alt="Responsives Bild" src=""""),_display_(/*137.68*/torte/*137.73*/.bild),format.raw/*137.78*/(""""></td>
						<td>"""),_display_(/*138.12*/torte/*138.17*/.preis),format.raw/*138.23*/("""</td>
						<td><form action=""""),_display_(/*139.26*/routes/*139.32*/.Application.Warenkorb),format.raw/*139.54*/("""">
								<button type="button" class="btn btn-default btn-sm">In
									den Warenkorb</button>
							</form></td>
					</tr>
					""")))}),format.raw/*144.7*/("""
				"""),format.raw/*145.5*/("""</table>
			</div>


		</div>
	</div>
 -->

	<div class="panel-footer">Über Uns!</div>


	<!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
	<script src="bootstrap.min.js"></script>
</body>
</html>
""")))}),format.raw/*163.2*/("""
"""))}
  }

  def render(torten:Collection[Torte]): play.twirl.api.HtmlFormat.Appendable = apply(torten)

  def f:((Collection[Torte]) => play.twirl.api.HtmlFormat.Appendable) = (torten) => apply(torten)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jan 05 20:15:09 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Kategorie_Torten.scala.html
                  HASH: e29920c00aea33f275017fd57da30681611566f8
                  MATRIX: 745->1|860->28|888->30|910->44|948->45|975->46|1264->308|1279->314|1343->357|1403->390|1418->396|1483->440|1619->549|1634->555|1673->573|2269->1142|2284->1148|2331->1174|2440->1256|2455->1262|2498->1284|2806->1565|2821->1571|2871->1600|3077->1779|3092->1785|3144->1816|3249->1894|3264->1900|3315->1930|3768->2357|3804->2377|3844->2379|3877->2385|3921->2402|3935->2407|3969->2420|4069->2493|4083->2498|4109->2503|4155->2522|4169->2527|4196->2533|4254->2564|4269->2570|4312->2592|4478->2728|4512->2734|4982->3177|5019->3197|5060->3199|5094->3205|5139->3222|5154->3227|5189->3240|5290->3313|5305->3318|5332->3323|5379->3342|5394->3347|5422->3353|5481->3384|5497->3390|5541->3412|5708->3548|5742->3555|5779->3575|5820->3577|5854->3583|5899->3600|5914->3605|5949->3618|6050->3691|6065->3696|6092->3701|6139->3720|6154->3725|6182->3731|6241->3762|6257->3768|6301->3790|6468->3926|6501->3931|6958->4357
                  LINES: 26->1|29->1|29->1|29->1|29->1|30->2|39->11|39->11|39->11|40->12|40->12|40->12|49->21|49->21|49->21|64->36|64->36|64->36|68->40|68->40|68->40|86->58|86->58|86->58|93->65|93->65|93->65|96->68|96->68|96->68|117->89|117->89|117->89|118->90|119->91|119->91|119->91|120->92|120->92|120->92|121->93|121->93|121->93|122->94|122->94|122->94|127->99|128->100|151->123|151->123|151->123|152->124|153->125|153->125|153->125|154->126|154->126|154->126|155->127|155->127|155->127|156->128|156->128|156->128|161->133|162->134|162->134|162->134|163->135|164->136|164->136|164->136|165->137|165->137|165->137|166->138|166->138|166->138|167->139|167->139|167->139|172->144|173->145|191->163
                  -- GENERATED --
              */
          
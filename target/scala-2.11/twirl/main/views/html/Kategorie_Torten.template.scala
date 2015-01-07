
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
                  DATE: Wed Jan 07 14:35:28 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Kategorie_Torten.scala.html
                  HASH: b9b86ca57febd95c191cd7ab62d3575f8008e3e3
                  MATRIX: 745->1|860->28|888->30|910->44|948->45|976->47|1274->318|1289->324|1353->367|1414->401|1429->407|1494->451|1639->569|1654->575|1693->593|2304->1177|2319->1183|2366->1209|2479->1295|2494->1301|2537->1323|2863->1622|2878->1628|2928->1657|3141->1843|3156->1849|3208->1880|3316->1961|3331->1967|3382->1997|3856->2445|3892->2465|3932->2467|3966->2474|4011->2492|4025->2497|4059->2510|4160->2584|4174->2589|4200->2594|4247->2614|4261->2619|4288->2625|4347->2657|4362->2663|4405->2685|4576->2826|4611->2833|5104->3299|5141->3319|5182->3321|5217->3328|5263->3346|5278->3351|5313->3364|5415->3438|5430->3443|5457->3448|5505->3468|5520->3473|5548->3479|5608->3511|5624->3517|5668->3539|5840->3680|5875->3688|5912->3708|5953->3710|5988->3717|6034->3735|6049->3740|6084->3753|6186->3827|6201->3832|6228->3837|6276->3857|6291->3862|6319->3868|6379->3900|6395->3906|6439->3928|6611->4069|6645->4075|7120->4519
                  LINES: 26->1|29->1|29->1|29->1|29->1|30->2|39->11|39->11|39->11|40->12|40->12|40->12|49->21|49->21|49->21|64->36|64->36|64->36|68->40|68->40|68->40|86->58|86->58|86->58|93->65|93->65|93->65|96->68|96->68|96->68|117->89|117->89|117->89|118->90|119->91|119->91|119->91|120->92|120->92|120->92|121->93|121->93|121->93|122->94|122->94|122->94|127->99|128->100|151->123|151->123|151->123|152->124|153->125|153->125|153->125|154->126|154->126|154->126|155->127|155->127|155->127|156->128|156->128|156->128|161->133|162->134|162->134|162->134|163->135|164->136|164->136|164->136|165->137|165->137|165->137|166->138|166->138|166->138|167->139|167->139|167->139|172->144|173->145|191->163
                  -- GENERATED --
              */
          
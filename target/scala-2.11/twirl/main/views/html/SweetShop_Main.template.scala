
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
<link rel="stylesheet" type="css/text" href=""""),_display_(/*10.47*/routes/*10.53*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*10.96*/("""">
<link rel="stylesheet" type="css/text" href=""""),_display_(/*11.47*/routes/*11.53*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*11.97*/("""">

<!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
<script src="bootstrap.min.js"></script>

<script type="text/javascript">
        function fade(step) """),format.raw/*20.29*/("""{"""),format.raw/*20.30*/("""
            """),format.raw/*21.13*/("""var imgs = document.getElementById("meinFader").getElementsByTagName("img");

            step = step || 0;

            imgs[counter].style.opacity = step/100;
            imgs[counter].style.filter = "alpha(opacity=" + step + ")"; // 

            step = step + 2;

            if (step <= 100) """),format.raw/*30.30*/("""{"""),format.raw/*30.31*/("""
                """),format.raw/*31.17*/("""window.setTimeout(function () """),format.raw/*31.47*/("""{"""),format.raw/*31.48*/(""" """),format.raw/*31.49*/("""fade(step); """),format.raw/*31.61*/("""}"""),format.raw/*31.62*/(""", 1);
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/(""" """),format.raw/*32.15*/("""else """),format.raw/*32.20*/("""{"""),format.raw/*32.21*/("""
                """),format.raw/*33.17*/("""window.setTimeout(next, 2000);
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""

        """),format.raw/*37.9*/("""function next() """),format.raw/*37.25*/("""{"""),format.raw/*37.26*/("""
            """),format.raw/*38.13*/("""var imgs = document.getElementById("meinFader").getElementsByTagName("img");

            if (typeof(counter) != "number") """),format.raw/*40.46*/("""{"""),format.raw/*40.47*/("""
                """),format.raw/*41.17*/("""counter = 0;
            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/("""

            """),format.raw/*44.13*/("""counter++;

            if (counter < imgs.length) """),format.raw/*46.40*/("""{"""),format.raw/*46.41*/("""
                """),format.raw/*47.17*/("""fade();
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/("""
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""";
    </script>
    <style type="text/css">
        .next """),format.raw/*52.15*/("""{"""),format.raw/*52.16*/(""" """),format.raw/*52.17*/("""position: absolute; top: 0; left: 0; opacity: 0; filter:alpha(opacity=0); """),format.raw/*52.91*/("""}"""),format.raw/*52.92*/("""
        """),format.raw/*53.9*/("""#meinFader """),format.raw/*53.20*/("""{"""),format.raw/*53.21*/(""" """),format.raw/*53.22*/("""position: relative; """),format.raw/*53.42*/("""}"""),format.raw/*53.43*/("""
    """),format.raw/*54.5*/("""</style>

</head>

<body style="background-image:url(/public/images/sweet_hearts.jpg)">


	<div class="row">
		<div class="col-xs-6 col-sm-4">
			<a class="navbar-brand" """),_display_(/*63.29*/routes/*63.35*/.Application.index),format.raw/*63.53*/("""><h2>Sweet
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
				<li><form action=""""),_display_(/*78.24*/routes/*78.30*/.Application.Registrierung),format.raw/*78.56*/("""">
						<button>Anmelden</button>
					</form></li>
				<li><form action=""""),_display_(/*81.24*/routes/*81.30*/.Application.Warenkorb),format.raw/*81.52*/("""">
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
						<a class="categorie" href=""""),_display_(/*98.35*/routes/*98.41*/.Application.Kategorie_Torten),format.raw/*98.70*/("""">Torten</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*101.35*/routes/*101.41*/.Application.Kategorie_Pralinen),format.raw/*101.72*/("""">Pralinen</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*104.35*/routes/*104.41*/.Application.Kategorie_Gebaeck),format.raw/*104.71*/("""">Gebäck</a>
					</h3></li>
			</ul>

		</div>

		<div class="col-xs-12 col-sm-6 col-md-8">
		
		<p id="meinFader">
        <img src="public/images/Torte_001.jpg" alt="">
        <!-- <img src="images/berge2.jpg" alt="" class="next">
        <img src="images/berge3.jpg" alt="" class="next">
        <img src="images/berge4.jpg" alt="" class="next">
        <img src="images/berge5.jpg" alt="" class="next">
        <img src="images/berge6.jpg" alt="" class="next"> -->
    </p>
    <p><a href="javascript:next()">Slideshow starten</a></p>
		
<!-- 			<div class="panel panel-default">
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
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jan 07 14:35:28 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/SweetShop_Main.scala.html
                  HASH: d8e85fc00db88db94b58953cbdbc8af1a8bb38d7
                  MATRIX: 807->0|1121->287|1136->293|1200->336|1277->386|1292->392|1357->436|1775->826|1804->827|1846->841|2180->1147|2209->1148|2255->1166|2313->1196|2342->1197|2371->1198|2411->1210|2440->1211|2487->1230|2516->1231|2545->1232|2578->1237|2607->1238|2653->1256|2725->1300|2754->1301|2791->1311|2820->1312|2859->1324|2903->1340|2932->1341|2974->1355|3127->1480|3156->1481|3202->1499|3256->1525|3285->1526|3329->1542|3410->1595|3439->1596|3485->1614|3534->1635|3563->1636|3600->1646|3629->1647|3718->1708|3747->1709|3776->1710|3878->1784|3907->1785|3944->1795|3983->1806|4012->1807|4041->1808|4089->1828|4118->1829|4151->1835|4358->2015|4373->2021|4412->2039|5022->2622|5037->2628|5084->2654|5190->2733|5205->2739|5248->2761|5568->3054|5583->3060|5633->3089|5740->3168|5756->3174|5809->3205|5918->3286|5934->3292|5986->3322
                  LINES: 29->1|38->10|38->10|38->10|39->11|39->11|39->11|48->20|48->20|49->21|58->30|58->30|59->31|59->31|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|60->32|61->33|62->34|62->34|63->35|63->35|65->37|65->37|65->37|66->38|68->40|68->40|69->41|70->42|70->42|72->44|74->46|74->46|75->47|76->48|76->48|77->49|77->49|80->52|80->52|80->52|80->52|80->52|81->53|81->53|81->53|81->53|81->53|81->53|82->54|91->63|91->63|91->63|106->78|106->78|106->78|109->81|109->81|109->81|126->98|126->98|126->98|129->101|129->101|129->101|132->104|132->104|132->104
                  -- GENERATED --
              */
          

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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("SweetShop")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

   """),format.raw/*5.4*/("""<!DOCTYPE html>
<html lang="de">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sweet Shop</title>

<!-- Bootstrap -->
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*14.80*/(""">
<link rel="stylesheet" href=""""),_display_(/*15.31*/routes/*15.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*15.81*/(""">

<!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
<script src="bootstrap.min.js"></script>


</head>
<body>


	<div class="row">
		<div class="col-xs-6 col-sm-4">
			<a class="navbar-brand" href=""""),_display_(/*30.35*/routes/*30.41*/.Application.index),format.raw/*30.59*/(""""><h2>Sweet
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
				<li><form action=""""),_display_(/*45.24*/routes/*45.30*/.Application.Registrierung),format.raw/*45.56*/("""">
						<button>Anmelden</button>
					</form></li>
				<li><form action=""""),_display_(/*48.24*/routes/*48.30*/.Application.Warenkorb),format.raw/*48.52*/("""">
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
						<a class="categorie" href=""""),_display_(/*65.35*/routes/*65.41*/.Application.Kategorie_Torten),format.raw/*65.70*/("""">Torten</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*68.35*/routes/*68.41*/.Application.Kategorie_Pralinen),format.raw/*68.72*/("""">Pralinen</a>
					</h3></li>
				<li><h3>
						<a class="categorie" href=""""),_display_(/*71.35*/routes/*71.41*/.Application.Kategorie_Gebaeck),format.raw/*71.71*/("""">Gebäck</a>
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
</html>

""")))}),format.raw/*111.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 01:11:05 CET 2014
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/index.scala.html
                  HASH: f1f98ec204b92e4ef3ceb63dd23ba04459f0b64e
                  MATRIX: 723->1|828->18|856->21|881->38|920->40|951->45|1240->307|1255->313|1319->356|1378->388|1393->394|1458->438|1910->863|1925->869|1964->887|2560->1456|2575->1462|2622->1488|2725->1564|2740->1570|2783->1592|3086->1868|3101->1874|3151->1903|3254->1979|3269->1985|3321->2016|3426->2094|3441->2100|3492->2130|4248->2855
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|42->14|42->14|42->14|43->15|43->15|43->15|58->30|58->30|58->30|73->45|73->45|73->45|76->48|76->48|76->48|93->65|93->65|93->65|96->68|96->68|96->68|99->71|99->71|99->71|139->111
                  -- GENERATED --
              */
          
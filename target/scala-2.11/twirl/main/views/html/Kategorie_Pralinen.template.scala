
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
object Kategorie_Pralinen extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Collection[Praline],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pralinen: Collection[Praline]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.33*/(""" """),_display_(/*1.35*/main("Pralinen")/*1.51*/{_display_(Seq[Any](format.raw/*1.52*/("""
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
  <div class="col-xs-6 col-sm-4"> <a class="navbar-brand" href=""""),_display_(/*20.66*/routes/*20.72*/.Application.index),format.raw/*20.90*/(""""><h2>Sweet Shop</h2></a></div>
  <div class="col-xs-6 col-sm-4"><form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Suchen">
        </div>
        <button type="submit" class="btn btn-default">Los</button>
      </form></div>
  <!-- Optional: Setze die Floats der XS-Spalten zurück, falls ihr Inhalt nicht gleich hoch ist -->
  <div class="clearfix visible-xs-block"></div>
  <div class="col-xs-6 col-sm-4"><ul class="nav navbar-nav navbar-right">
        <li><form action=""""),_display_(/*30.28*/routes/*30.34*/.Application.Registrierung),format.raw/*30.60*/("""">
						<button>Anmelden</button>
					</form></li>
        <li><form action=""""),_display_(/*33.28*/routes/*33.34*/.Application.Warenkorb),format.raw/*33.56*/("""">
						<button>Warenkorb</button>
					</form></li>
      </ul></div>
</div>
  
  

<div class="row">
  <div class="col-xs-6 col-md-4"><div class="page-header">
  <h2 class="ueberschrift">Kategorien</h2>
</div>  

<ul>
			<li><h3><a class="categorie" href=""""),_display_(/*47.40*/routes/*47.46*/.Application.Kategorie_Torten),format.raw/*47.75*/("""">Torten</a></h3></li>
			<li><h3><a class="categorie" href=""""),_display_(/*48.40*/routes/*48.46*/.Application.Kategorie_Pralinen),format.raw/*48.77*/("""">Pralinen</a></h3>
							<ul>
					<li><h4>Milchschokolade</h4></li>
					<li><h4>Bitterschokolade</h4></li>
					<li><h4>Weiße Schokolade</h4></li>
				</ul></li>
			<li><h3><a class="categorie" href=""""),_display_(/*54.40*/routes/*54.46*/.Application.Kategorie_Gebaeck),format.raw/*54.76*/("""">Gebäck</a></h3></li>
</ul>  


</div>


  <div class="col-xs-12 col-sm-6 col-md-8">
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Milchschokolade</h3>
 		</div>
 		<table class="table">
					<tr>
						<th>Produktname</th>
						<!-- 						<th>Produktbeschreibung</th> -->
						<th>Produktbild</th>
						<th>Preis in Euro</th>
						<th></th>
					</tr>
					"""),_display_(/*74.7*/for(praline <- pralinen) yield /*74.31*/ {_display_(Seq[Any](format.raw/*74.33*/("""
					"""),format.raw/*75.6*/("""<tr>	
						<td>"""),_display_(/*76.12*/praline/*76.19*/.produkt_name),format.raw/*76.32*/("""</td>
						<td><img class="img-responsive" alt="Responsives Bild" src=""""),_display_(/*77.68*/praline/*77.75*/.bild),format.raw/*77.80*/(""""></td>
						<td>"""),_display_(/*78.12*/praline/*78.19*/.preis),format.raw/*78.25*/("""</td>
						<td><form action=""""),_display_(/*79.26*/routes/*79.32*/.Application.Warenkorb),format.raw/*79.54*/("""">
								<button type="button" class="btn btn-default btn-sm">In
									den Warenkorb</button>
							</form></td>
					</tr>
					""")))}),format.raw/*84.7*/("""
					"""),format.raw/*85.6*/("""<tr>
					</tr>
				</table>

	
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Bitterschokolade</h3>
 		</div>
 		<div class="panel-body">
  	  		Produktbilder
 		</div>
	</div>
	
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Weiße Schokolade</h3>
 		</div>
 		<div class="panel-body">
  	  		Produktbilder
 		</div>
	</div>
  
  </div>
</div>


<div class="panel-footer">Über Uns!</div>


    <!-- jQuery (wird für Bootstrap JavaScript-Plugins benötigt) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Binde alle kompilierten Plugins zusammen ein (wie hier unten) oder such dir einzelne Dateien nach Bedarf aus -->
    <script src="bootstrap.min.js"></script>
  </body>
</html>
""")))}))}
  }

  def render(pralinen:Collection[Praline]): play.twirl.api.HtmlFormat.Appendable = apply(pralinen)

  def f:((Collection[Praline]) => play.twirl.api.HtmlFormat.Appendable) = (pralinen) => apply(pralinen)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jan 05 20:15:09 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Kategorie_Pralinen.scala.html
                  HASH: d6e2ccb788be44b9bdbbd87cacb79f6d517042cf
                  MATRIX: 749->1|868->32|896->34|920->50|958->51|985->52|1295->335|1310->341|1374->384|1434->417|1449->423|1514->467|1655->581|1670->587|1709->605|2310->1179|2325->1185|2372->1211|2479->1291|2494->1297|2537->1319|2824->1579|2839->1585|2889->1614|2978->1676|2993->1682|3045->1713|3277->1918|3292->1924|3343->1954|3787->2372|3827->2396|3867->2398|3900->2404|3944->2421|3960->2428|3994->2441|4094->2514|4110->2521|4136->2526|4182->2545|4198->2552|4225->2558|4283->2589|4298->2595|4341->2617|4507->2753|4540->2759
                  LINES: 26->1|29->1|29->1|29->1|29->1|30->2|39->11|39->11|39->11|40->12|40->12|40->12|48->20|48->20|48->20|58->30|58->30|58->30|61->33|61->33|61->33|75->47|75->47|75->47|76->48|76->48|76->48|82->54|82->54|82->54|102->74|102->74|102->74|103->75|104->76|104->76|104->76|105->77|105->77|105->77|106->78|106->78|106->78|107->79|107->79|107->79|112->84|113->85
                  -- GENERATED --
              */
          
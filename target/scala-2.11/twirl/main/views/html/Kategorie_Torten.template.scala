
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

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="de">
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sweet Shop</title>

    <!-- Bootstrap -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="main.css">


 
  </head>
  <body>
  
  <div class="row">
  <div class="col-xs-6 col-sm-4"> <a class="navbar-brand" href="SweetShop_Main.html"><h2>Sweet Shop</h2></a></div>
  <div class="col-xs-6 col-sm-4"><form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Suchen">
        </div>
        <button type="submit" class="btn btn-default">Los</button>
      </form></div>
  <!-- Optional: Setze die Floats der XS-Spalten zurück, falls ihr Inhalt nicht gleich hoch ist -->
  <div class="clearfix visible-xs-block"></div>
  <div class="col-xs-6 col-sm-4"><ul class="nav navbar-nav navbar-right">
        <li><form action="Registrierung.html"><button>Anmelden</button></form></li>
      <li>  <form action="Warenkorb.html"><button>Warenkorb</button></form></li>
      </ul></div>
</div>
  
  

<div class="row">
  <div class="col-xs-6 col-md-4"><div class="page-header">
  <h2 class="ueberschrift">Kategorien</h2>
</div>  

<ul>
			<li><h3><a class="categorie" href="Kategorie_Torten.html">Torten</a></h3>
				<ul>
					<li><h4>Hochzeitstorten</h4></li>
					<li><h4>Geburtstagstorten</h4></li>
				</ul>
			</li>
			<li><h3><a class="categorie" href="Kategorie_Pralinen.html">Pralinen</a></h3></li>
			<li><h3><a class="categorie" href="Kategorie_Gebaeck.html">Gebäck</a></h3></li>
</ul>  

</div>


  <div class="col-xs-12 col-sm-6 col-md-8">
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Hochzeitstorten</h3>
 		</div>
 		<div class="panel-body">
  	  		Produktbilder
 		</div>
	</div>
	
  	<div class="panel panel-default">
  		<div class="panel-heading">
   			 <h3 class="panel-title">Geburtstagstorten</h3>
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
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 21 21:24:08 CET 2014
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Kategorie_Torten.scala.html
                  HASH: b6c801b7e35cf2f75ad2f5b0593c551a393b2cab
                  MATRIX: 809->0
                  LINES: 29->1
                  -- GENERATED --
              */
          
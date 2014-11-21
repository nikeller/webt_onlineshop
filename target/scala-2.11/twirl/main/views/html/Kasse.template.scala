
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
  
  
  
</div>
  
  

<div class="row">
  <div class="col-xs-6 col-md-4"><div class="page-header">
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
  
  
 <form action="SweetShop_Main.html">
			<button>Ware bestellen</button>
		</form>
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
                  DATE: Fri Nov 21 00:30:22 CET 2014
                  SOURCE: C:/Users/Nina/SweetShop/app/views/Kasse.scala.html
                  HASH: 0cebd0f3b24b78157f72ae07e5875d0e7c80368e
                  MATRIX: 798->0
                  LINES: 29->1
                  -- GENERATED --
              */
          
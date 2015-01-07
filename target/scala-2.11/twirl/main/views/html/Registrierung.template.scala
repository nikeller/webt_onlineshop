
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
object Registrierung extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(allePLZ: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.19*/(""" 
"""),_display_(/*3.2*/main("Registrierung")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sweet Shop</title>

    <!-- Bootstrap -->
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*13.80*/("""">
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*14.81*/("""">


<script type="text/javascript">

function test() """),format.raw/*19.17*/("""{"""),format.raw/*19.18*/("""
	 """),format.raw/*20.3*/("""var g = document.getElementById("eingabe").value;
	sendGuess(g);
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/("""
	"""),format.raw/*23.2*/("""function sendGuess(g) """),format.raw/*23.24*/("""{"""),format.raw/*23.25*/("""
	 """),format.raw/*24.3*/("""var requestObj = new XMLHttpRequest();
	 requestObj.onreadystatechange = function() """),format.raw/*25.46*/("""{"""),format.raw/*25.47*/("""
	 """),format.raw/*26.3*/("""/* if (requestObj.readyState == 4 && requestObj.status == 200)"""),format.raw/*26.65*/("""{"""),format.raw/*26.66*/(""" """),format.raw/*26.67*/("""*/
	 document.getElementById("stelle").innerHTML = requestObj.responseText;
	 /* """),format.raw/*28.6*/("""}"""),format.raw/*28.7*/(""" """),format.raw/*28.8*/("""*/
	 """),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""
	 """),format.raw/*30.3*/("""requestObj.open("GET", "TestStuff?eingabe="+g, true);
	 requestObj.send();
	"""),format.raw/*32.2*/("""}"""),format.raw/*32.3*/(""" 



"""),format.raw/*36.1*/("""</script>

 
  </head>
  <body>
  
  <div class="row">
  <div class="col-xs-6 col-sm-4"> <a class="navbar-brand" href=""""),_display_(/*43.66*/routes/*43.72*/.Application.index),format.raw/*43.90*/(""""><h2>Sweet Shop</h2></a></div>
  <div class="col-xs-6 col-sm-4"></div>
  <!-- Optional: Setze die Floats der XS-Spalten zurück, falls ihr Inhalt nicht gleich hoch ist -->
  <div class="clearfix visible-xs-block"></div>
  <div class="col-xs-6 col-sm-4"><ul class="nav navbar-nav navbar-right">
      </ul></div>
</div>
  
  

<div class="row">
  <div class="col-xs-6 col-md-4"><div class="page-header">
</div>  
<form role="form">
 <h4>Anmeldung</h4>
<div class="form-group">
  <label for="beispielFeldEmail1">Email-Adresse</label>
  <input type="email" class="form-control" id="beispielFeldEmail1" placeholder="Email-Adresse">
  </div>
  <div class="form-group">
  <label for="beispielFeldPasswort1">Passwort</label>
  <input type="email" class="form-control" id="beispielFeldPasswort1" placeholder="Passwort">
  </div>
  <button type="submit" class="btn btn-default">Anmelden</button>
  </form>
</form>




</div>
					
  <div class="col-xs-12 col-sm-6 col-md-8">
 

<form role="form">
 <h4>Registrierung</h4>
  <div class="form-group">
    <label for="beispielVorname">Vorname</label>
    <input type="text" class="form-control" id="beispielVorname" placeholder="Vorname">
  </div>
  <div class="form-group">
    <label for="beispielNachname">Nachname</label>
    <input type="text" class="form-control" id="beispielNachname" placeholder="Nachname">
  </div>
  <div class="form-group">
    <label for="beispielStrasseUndHN">Strasse und Hausnummer</label>
    <input type="text" class="form-control" id="beispielStrasseUndHN" placeholder="Strasse und Hausnummer">
  </div>
  <div class="form-group">
    <label for="beispielPLZ">PLZ</label>
    <input type="text" class="form-control" id="eingabe" placeholder="PLZ" onkeyup="test()">
  </div>
  <div id = "stelle"></div>
  <div class="form-group">
    <label for="beispielEmail">E-Mail</label>
    <input type="email" class="form-control" id="beispielEmail" placeholder="E-Mail">
  </div>
  <div class="form-group">
    <label for="beispielPasswort">Passwort</label>
    <input type="password" class="form-control" id="beispielPasswort" placeholder="Passwort">
  </div>
  <div class="form-group">
    <label for="beispielPasswortWDH">Passwort wiederholen</label>
    <input type="password" class="form-control" id="beispielPasswortWDH" placeholder="Passwort wiederholen">
  </div>
  
  <button type="submit" class="btn btn-default">Registrieren</button>
</form>



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

  def render(allePLZ:String): play.twirl.api.HtmlFormat.Appendable = apply(allePLZ)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (allePLZ) => apply(allePLZ)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jan 07 13:20:19 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Registrierung.scala.html
                  HASH: bb51fe2056a82ed2f0d8e88b97688f4eb6fcd87f
                  MATRIX: 731->1|851->18|879->38|908->59|946->60|973->61|1273->334|1288->340|1352->383|1412->416|1427->422|1492->466|1574->520|1603->521|1633->524|1726->590|1754->591|1783->593|1833->615|1862->616|1892->619|2004->703|2033->704|2063->707|2153->769|2182->770|2211->771|2319->852|2347->853|2375->854|2407->859|2435->860|2465->863|2568->939|2596->940|2628->945|2775->1065|2790->1071|2829->1089
                  LINES: 26->1|29->1|30->3|30->3|30->3|31->4|40->13|40->13|40->13|41->14|41->14|41->14|46->19|46->19|47->20|49->22|49->22|50->23|50->23|50->23|51->24|52->25|52->25|53->26|53->26|53->26|53->26|55->28|55->28|55->28|56->29|56->29|57->30|59->32|59->32|63->36|70->43|70->43|70->43
                  -- GENERATED --
              */
          
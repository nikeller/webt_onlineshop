
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
object Registrierung extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main("Registrierung")/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sweet Shop</title>

    <!-- Bootstrap -->
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*12.80*/(""">
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*13.81*/(""">


 
  </head>
  <body>
  
  <div class="row">
  <div class="col-xs-6 col-sm-4"> <a class="navbar-brand" href=""""),_display_(/*21.66*/routes/*21.72*/.Application.index),format.raw/*21.90*/(""""><h2>Sweet Shop</h2></a></div>
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
    <input type="password" class="form-control" id="beispielFeldPasswort1" placeholder="Passwort">
  </div>
  
  <button type="submit" class="btn btn-default">Anmelden</button>
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
    <input type="text" class="form-control" id="beispielPLZ" placeholder="PLZ">
  </div>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Dec 01 01:11:05 CET 2014
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Registrierung.scala.html
                  HASH: d403b48d79ba904143f487a1e5e4074a87cb144f
                  MATRIX: 806->2|835->23|873->24|900->25|1200->298|1215->304|1279->347|1338->379|1353->385|1418->429|1558->542|1573->548|1612->566
                  LINES: 29->2|29->2|29->2|30->3|39->12|39->12|39->12|40->13|40->13|40->13|48->21|48->21|48->21
                  -- GENERATED --
              */
          
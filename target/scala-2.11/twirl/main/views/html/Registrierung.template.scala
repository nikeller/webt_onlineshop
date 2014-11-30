
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

Seq[Any](_display_(/*1.2*/main("Registrierung")/*1.23*/ {_display_(Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sweet Shop</title>

<!-- Bootstrap -->
link rel="stylesheet" href=""""),_display_(/*11.30*/routes/*11.36*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*11.79*/(""">
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("stylesheets/mainStyleSheet.css")),format.raw/*12.81*/(""">


</head>
<body>

	<div class="row">
		<div class="col-xs-6 col-sm-4">
			<a class="navbar-brand" href=""""),_display_(/*20.35*/routes/*20.41*/.Application.index),format.raw/*20.59*/(""""><h2>Sweet
					Shop</h2></a>
		</div>
		<div class="col-xs-6 col-sm-4"></div>
		<!-- Optional: Setze die Floats der XS-Spalten zurück, falls ihr Inhalt nicht gleich hoch ist -->
		<div class="clearfix visible-xs-block"></div>
		<div class="col-xs-6 col-sm-4">
			<ul class="nav navbar-nav navbar-right">
			</ul>
		</div>
	</div>



	<div class="row">
		<div class="col-xs-6 col-md-4">
			<div class="page-header"></div>
			<form role="form">
				<h4>Anmeldung</h4>
				<div class="form-group">
					<label for="beispielFeldEmail1">Email-Adresse</label> <input
						type="email" class="form-control" id="beispielFeldEmail1"
						placeholder="Email-Adresse">
				</div>
				<div class="form-group">
					<label for="beispielFeldPasswort1">Passwort</label> <input
						type="password" class="form-control" id="beispielFeldPasswort1"
						placeholder="Passwort">
				</div>
				
				<input type="submit" class="btn btn-default" value="Anmelden">
				
			</form>
		</div>


		<div class="col-xs-12 col-sm-6 col-md-8">


			<form role="form">
				<h4>Registrierung</h4>
				<div class="form-group">
					<label for="beispielVorname">Vorname</label> <input type="text"
						class="form-control" id="beispielVorname" placeholder="Vorname">
				</div>
				<div class="form-group">
					<label for="beispielNachname">Nachname</label> <input type="text"
						class="form-control" id="beispielNachname" placeholder="Nachname">
				</div>
				<div class="form-group">
					<label for="beispielStrasseUndHN">Strasse und Hausnummer</label> <input
						type="text" class="form-control" id="beispielStrasseUndHN"
						placeholder="Strasse und Hausnummer">
				</div>
				<div class="form-group">
					<label for="beispielPLZ">PLZ</label> <input type="text"
						class="form-control" id="beispielPLZ" placeholder="PLZ">
				</div>
				<div class="form-group">
					<label for="beispielEmail">E-Mail</label> <input type="email"
						class="form-control" id="beispielEmail" placeholder="E-Mail">
				</div>
				<div class="form-group">
					<label for="beispielPasswort">Passwort</label> <input
						type="password" class="form-control" id="beispielPasswort"
						placeholder="Passwort">
				</div>
				<div class="form-group">
					<label for="beispielPasswortWDH">Passwort wiederholen</label> <input
						type="password" class="form-control" id="beispielPasswortWDH"
						placeholder="Passwort wiederholen">
				</div>

				<button type="submit" class="btn btn-default">Registrieren</button>
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
                  DATE: Sun Nov 30 23:47:53 CET 2014
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/Registrierung.scala.html
                  HASH: c20176c1d10d0d38053ecaef92042990b9ea4306
                  MATRIX: 806->1|835->22|874->24|902->26|1189->286|1204->292|1268->335|1328->368|1343->374|1408->418|1550->533|1565->539|1604->557
                  LINES: 29->1|29->1|29->1|30->2|39->11|39->11|39->11|40->12|40->12|40->12|48->20|48->20|48->20
                  -- GENERATED --
              */
          
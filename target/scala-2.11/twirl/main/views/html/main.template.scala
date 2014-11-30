
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<head>
<title>"""),_display_(/*7.9*/title),format.raw/*7.14*/("""</title>
<link rel="stylesheet" media="screen" href=""""),_display_(/*8.46*/routes/*8.52*/.Assets.at("stylesheets/main.css")),format.raw/*8.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.51*/routes/*9.57*/.Assets.at("images/favicon.png")),format.raw/*9.89*/("""">
<script src=""""),_display_(/*10.15*/routes/*10.21*/.Assets.at("javascript/jquery-1.11.1.min.js")),format.raw/*10.66*/("""" type=text/javascript"></script>
<script src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*11.63*/("""" type="text/javascript"></script>
</head>
<body>"""),_display_(/*13.8*/content),format.raw/*13.15*/("""
"""),format.raw/*14.1*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 30 22:19:37 CET 2014
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/main.scala.html
                  HASH: 16d2d0770fbc4450cafdc6ba501f4f9a1ebb6154
                  MATRIX: 727->1|845->31|875->35|943->78|968->83|1049->138|1063->144|1117->178|1197->232|1211->238|1263->270|1308->288|1323->294|1389->339|1465->388|1480->394|1543->436|1621->488|1649->495|1678->497
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|42->14
                  -- GENERATED --
              */
          
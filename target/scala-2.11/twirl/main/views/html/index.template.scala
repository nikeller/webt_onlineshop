
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

 """),_display_(/*3.3*/main("Torten")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/(""" 
 
 """),_display_(/*5.3*/SweetShop_Main()),format.raw/*5.19*/(""" 
 
 """)))}),format.raw/*7.3*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 30 23:58:31 CET 2014
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/index.scala.html
                  HASH: 70456c583a12f9177f89c9081be0573493211fda
                  MATRIX: 723->1|828->18|859->24|881->38|920->40|953->48|989->64|1026->72
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7
                  -- GENERATED --
              */
          
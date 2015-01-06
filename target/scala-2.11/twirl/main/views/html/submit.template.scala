
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
object submit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(created: User):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/(""" 
"""),_display_(/*2.2*/main("submit")/*2.16*/{_display_(Seq[Any](format.raw/*2.17*/("""

"""),_display_(/*4.2*/created/*4.9*/.email),format.raw/*4.15*/("""
"""),_display_(/*5.2*/created/*5.9*/.passwort),format.raw/*5.18*/("""
""")))}))}
  }

  def render(created:User): play.twirl.api.HtmlFormat.Appendable = apply(created)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (created) => apply(created)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jan 05 16:58:51 CET 2015
                  SOURCE: C:/Users/Nina/workspace/webt_onlineshop/app/views/submit.scala.html
                  HASH: 191a677512c1e73b75570e2353f40a5469d1df24
                  MATRIX: 722->1|825->16|854->20|876->34|914->35|944->40|958->47|984->53|1012->56|1026->63|1055->72
                  LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|32->4|33->5|33->5|33->5
                  -- GENERATED --
              */
          
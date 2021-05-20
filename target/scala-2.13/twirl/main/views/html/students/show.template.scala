
package views.html.students

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Student,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(student: Student):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/layout(student.name)/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<a href="#">Name: """),_display_(/*4.22*/student/*4.29*/.name),format.raw/*4.34*/("""</a>
  <p> Age: """),_display_(/*5.13*/student/*5.20*/.age),format.raw/*5.24*/(""" """),format.raw/*5.25*/("""</p>
  <p> Branch: """),_display_(/*6.16*/student/*6.23*/.branch),format.raw/*6.30*/(""" """),format.raw/*6.31*/("""</p>
  <p> Marks: """),_display_(/*7.15*/student/*7.22*/.marks),format.raw/*7.28*/(""" """),format.raw/*7.29*/("""</p>

  <a href=""""),_display_(/*9.13*/routes/*9.19*/.StudentsController.edit(student.id)),format.raw/*9.55*/("""">Edit</a>
  <a href=""""),_display_(/*10.13*/routes/*10.19*/.StudentsController.destroy(student.id)),format.raw/*10.58*/("""">Delete</a>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(student:Student): play.twirl.api.HtmlFormat.Appendable = apply(student)

  def f:((Student) => play.twirl.api.HtmlFormat.Appendable) = (student) => apply(student)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/students/show.scala.html
                  HASH: 0c0d749efa4e209c04958c3b2355b03f75a089a1
                  MATRIX: 916->1|1028->20|1055->22|1083->42|1121->43|1150->46|1195->65|1210->72|1235->77|1278->94|1293->101|1317->105|1345->106|1391->126|1406->133|1433->140|1461->141|1506->160|1521->167|1547->173|1575->174|1619->192|1633->198|1689->234|1739->257|1754->263|1814->302|1858->316
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|34->4|34->4|34->4|35->5|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|37->7|37->7|37->7|39->9|39->9|39->9|40->10|40->10|40->10|41->11
                  -- GENERATED --
              */
          

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
/*1.2*/import java.util

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Student],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(studentForm : Form[Student])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import scala._
/*4.2*/import helper._


Seq[Any](format.raw/*5.1*/("""

"""),format.raw/*7.1*/("""<html>
    <head>
        <title>Add Student</title>
    </head>

    <body>
    <h1>Create Book</h1>

    """),_display_(/*15.6*/helper/*15.12*/.form(action = helper.CSRF(routes.StudentsController.save()))/*15.73*/{_display_(Seq[Any](format.raw/*15.74*/("""

"""),format.raw/*17.1*/("""<!--    """),_display_(/*17.10*/helper/*17.16*/.inputText(studentForm("id"))),format.raw/*17.45*/("""-->
    """),_display_(/*18.6*/helper/*18.12*/.inputText(studentForm("name"))),format.raw/*18.43*/("""
    """),_display_(/*19.6*/helper/*19.12*/.inputText(studentForm("age"))),format.raw/*19.42*/("""
    """),_display_(/*20.6*/helper/*20.12*/.inputText(studentForm("marks"))),format.raw/*20.44*/("""
    """),_display_(/*21.6*/helper/*21.12*/.inputText(studentForm("branch"))),format.raw/*21.45*/("""

    """),format.raw/*23.5*/("""<button class="btn btn-success" type="submit"> Add Student</button>
    """)))}),format.raw/*24.6*/("""
    """),format.raw/*25.5*/("""</body>
</html>




"""))
      }
    }
  }

  def render(studentForm:Form[Student],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(studentForm)(request,messages)

  def f:((Form[Student]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (studentForm) => (request,messages) => apply(studentForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/students/create.scala.html
                  HASH: 99091953af77e2c5dd706cbba35d109b2e4ba36c
                  MATRIX: 619->1|980->19|1144->112|1166->128|1210->144|1238->146|1372->254|1387->260|1457->321|1496->322|1525->324|1561->333|1576->339|1626->368|1661->377|1676->383|1728->414|1760->420|1775->426|1826->456|1858->462|1873->468|1926->500|1958->506|1973->512|2027->545|2060->551|2163->624|2195->629
                  LINES: 23->1|28->2|31->3|32->4|35->5|37->7|45->15|45->15|45->15|45->15|47->17|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|53->23|54->24|55->25
                  -- GENERATED --
              */
          
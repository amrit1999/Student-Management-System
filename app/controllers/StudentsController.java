package controllers;

import models.Student;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.students.*;
import play.i18n.MessagesApi;
import javax.inject.Inject;
import java.util.List;


public class StudentsController extends Controller{

    @Inject
    FormFactory formFactory;
    @Inject
    MessagesApi messagesApi;

    // all students
    public Result index(){
        List<Student> students = Student.find.all();
        return ok(Json.toJson(students));
    }

    // add new student
    public Result create(Http.Request request){
        Form<Student> studentForm = formFactory.form(Student.class);
        return ok(create.render(studentForm,request, messagesApi.preferred(request)));
    }

    // to save student
    public Result save(Http.Request request){
        Form<Student> studentForm = formFactory.form(Student.class).bindFromRequest(request);
        if(studentForm.hasErrors()) {
            return badRequest(create.render(studentForm,request, messagesApi.preferred(request)));
        }
        Student student = studentForm.get();
        student.save();
        return redirect(routes.StudentsController.index());
    }

    // to edit student details
    public Result edit(Integer id,Http.Request request ){
        Student student = Student.find.byId(id);
        if(student==null){
            return notFound("student not found");
        }
        Form<Student> studentForm = formFactory.form(Student.class).fill(student);
        return ok(edit.render(studentForm,student,request, messagesApi.preferred(request)));
    }

    // to update details
    public Result update(Integer id,Http.Request request){
        Form<Student> studentForm = formFactory.form(Student.class).bindFromRequest(request);
        Student oldstudent = Student.find.byId(id);
        if(studentForm.hasErrors()) {
            return badRequest(edit.render(studentForm,oldstudent,request, messagesApi.preferred(request)));
        }
        Student student = studentForm.get();
        oldstudent.name=student.name;
        oldstudent.marks=student.marks;
        oldstudent.age=student.age;
        oldstudent.branch=student.branch;
        oldstudent.update();
        return redirect(routes.StudentsController.index());
    }


    // to delete any particular student
    public Result destroy( Integer id){
        Student student = Student.find.byId(id);
        if(student==null){
            return notFound("Student not found");
        }
        student.delete();
        return redirect(routes.StudentsController.index());
    }

    // for particular student detail
    public Result show(Integer id){
        Student student = Student.find.byId(id);
        if(student==null){
            return notFound("Student not found");
        }
        return ok(Json.toJson(student));
    }


}

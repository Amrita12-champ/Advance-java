package controller;

import dao.StudentService;
import entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/register")
public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id=req.getParameter("id");
        String name=req.getParameter("Username");
        String email=req.getParameter("Email");
        String redgNo =req.getParameter("redg");

        Student student=new Student();

        student.setId(Integer.parseInt(id));
        student.setName(name);
        student.setEmail(email);
        student.setRedgNo(redgNo);

        StudentService service=new StudentService();
        int result=service.register(student);
        if(result>0){
            System.out.println("Student register Successfully");
        }else{
            System.out.println("Student registration fail");
        }







    }
}

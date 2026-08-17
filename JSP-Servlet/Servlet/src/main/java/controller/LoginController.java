package controller;

import dao.StudentService;
import entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (email == null || password == null) {
            resp.sendRedirect("login.html");
            return;
        }

        StudentService service = new StudentService();
        Student validStudent = service.validateStudent(email, password);

        if (validStudent != null) {
            System.out.println("Login successfully for: " + validStudent.getName());

            HttpSession session = req.getSession();
            session.setAttribute("user", validStudent);

            resp.sendRedirect("index.jsp");
            return;
        } else {
            System.out.println("Login failed: Invalid email or password");
            resp.sendRedirect("login.html");
        }
    }
}

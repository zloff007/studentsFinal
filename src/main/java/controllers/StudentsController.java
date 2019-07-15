package controllers;

import database.DBManager;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "StudentsController", urlPatterns = "/students")
public class StudentsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList<Student> students = DBManager.getAllStudents();
        req.setAttribute("allStudents",students);
        req.getRequestDispatcher("WEB-INF/JSP/Students.jsp").forward(req,resp);
    }
}

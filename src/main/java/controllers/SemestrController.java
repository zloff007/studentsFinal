package controllers;

import database.DBManager;
import entity.Semestr;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SemestrController", urlPatterns = "/semestr")
public class SemestrController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ArrayList<Semestr> semestrs = DBManager.getAllActiveSemestrs();
        req.setAttribute("semestr", semestrs);
        req.getRequestDispatcher("WEB-INF/JSP/Semestr.jsp").forward(req,resp);
    }
}

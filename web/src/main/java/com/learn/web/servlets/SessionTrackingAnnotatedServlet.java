package com.learn.web.servlets;

import com.learn.web.module.Student;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by bid on 8/24/14.
 */
@WebServlet(value = {"/SessionTrackingAnnotatedServlet"}, asyncSupported = true)
public class SessionTrackingAnnotatedServlet extends HttpServlet
{

   @Override
   protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException
   {
      HttpSession session = req.getSession();
      Student student = new Student("Dima", 33);
      session.setAttribute("student",student);

      RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
      dispatcher.forward(req, resp);
   }
}

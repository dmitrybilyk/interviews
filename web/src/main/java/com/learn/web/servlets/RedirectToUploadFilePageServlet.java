package com.learn.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by bid on 8/24/14.
 */
@WebServlet(value = {"/RedirectToUploadFilePageServlet"}, asyncSupported = true)
public class RedirectToUploadFilePageServlet extends HttpServlet
{

   @Override
   protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException
   {
      RequestDispatcher dispatcher = req.getRequestDispatcher("uploadFile.jsp");
      resp.sendRedirect("uploadFile.jsp");
   }
}

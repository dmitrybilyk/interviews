package com.learn.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by bid on 8/24/14.
 */
@WebServlet(value = {"/AnnotatedServlet"}, asyncSupported = true)
public class AnnotatedServlet extends HttpServlet
{

   @Override
   protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException
   {
      System.out.println(getServletContext().getRealPath(req.getServletPath()));
      System.out.println(getServletContext().getServerInfo());
//      super.doGet(req, resp);
   }
}

package com.learn.web.servlets;

import com.learn.web.scheduler.Scheduler;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by bid on 8/20/14.
 */
public class SchedulerStartServlet extends HttpServlet
{

   String name;

   @Override
   public void init() throws ServletException
   {
      name = "Dima";
   }

   @Override
   protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException
   {
      Scheduler.getInstance().start();
   }

   private void redirect(
           String aDestinationPage, HttpServletResponse aResponse
   ) throws IOException {
      String urlWithSessionID = aResponse.encodeRedirectURL(aDestinationPage);
      aResponse.sendRedirect( urlWithSessionID );
   }

   private void forward(
           String aResponsePage, HttpServletRequest aRequest, HttpServletResponse aResponse
   ) throws ServletException, IOException {
      RequestDispatcher dispatcher = aRequest.getRequestDispatcher(aResponsePage);
      dispatcher.forward(aRequest, aResponse);
   }

}

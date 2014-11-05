package com.learn.web.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by bid on 8/20/14.
 */
public class TestForwardRedirectServlet extends HttpServlet
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
      if(req.getParameter("contextParameter") != null){
         System.out.println("Context parameter present, context works");
      }

      if(req.getParameter("param").equals("redirect")){
//         redirect("toredirect.jsp", resp);
         redirect("http://football.ua", resp);
      }else{
//         forward("toforward.jsp", req, resp);
         forward("http://terrikon.com", req, resp);
      }

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

package com.learn.web.servlets;

import com.learn.web.springmvc.model.Student;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Created by bid on 8/20/14.
 */
public class TestServletContextServlet extends HttpServlet
{

   @Autowired
   private Student student;

   String name;

   private WebApplicationContext springContext;

   @Override
   public void init() throws ServletException
   {
      name = "Dima";

      springContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletConfig().getServletContext());
      final AutowireCapableBeanFactory beanFactory = springContext.getAutowireCapableBeanFactory();
      beanFactory.autowireBean(this);
   }

   @Override
   protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException
   {

//         redirect("http://football.ua", resp);
      getServletContext().setAttribute("contextParameter", "someContextParam");
         req.setAttribute("returnedParam", "returned parameter");
         forward("index.jsp", req, resp);
   }

   private void redirect(
           String aDestinationPage, HttpServletResponse aResponse
   ) throws IOException
   {
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

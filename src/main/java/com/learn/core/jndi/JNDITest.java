package com.learn.core.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * Created by bid on 8/26/14.
 */
public class JNDITest
{
   public static void main(String[] args)
   {
      DataSource dataSource = null;
      try
      {
         Context context = new InitialContext();
         dataSource = (DataSource) context.lookup("Database");
      }
      catch (NamingException e)
      {
         // Couldn't find the data source: give up
      }
   }
}


// Tomcat context example;
//<Environment name="protocol" type="java.lang.String" value="https://"/>
//<Environment name="endpoint" type="java.lang.String" value="172.0.0.1"/>
//<Environment name="requestPath" type="java.lang.String" value="/path/to/service"/>


//Spring example
//
//<bean id="WSClientConfig" class="com.example.BaseClientConfigImpl">
//<property name="protocol">
//<jee:jndi-lookup jndi-name="java:comp/env/protocol" />
//</property>
//<property name="endpoint">
//<jee:jndi-lookup jndi-name="java:comp/env/endpoint" />
//</property>
//<property name="requestPath">
//<jee:jndi-lookup jndi-name="java:comp/env/requestPath" />
//</property>
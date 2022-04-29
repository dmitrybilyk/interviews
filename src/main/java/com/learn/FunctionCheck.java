package com.learn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FunctionCheck
{
    private final String url = "jdbc:postgresql://10.17.2.32:5432/wfo_core";
    private final String user = "wfo_user";
    private final String password = "wfo_pass";
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect()
    {
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        FunctionCheck app = new FunctionCheck();
        Connection con = app.connect();
        try
        {
            /* CallableStatement stmt = con.prepareCall("{call helloworld()}"); */
            PreparedStatement stmt = con.prepareStatement("call dmytropavelprocedure()");
            stmt.execute();
            System.out.println("Stored Procedure executed successfully");
        }
        catch(Exception err)
        {
            System.out.println("An error has occurred.");
            System.out.println("See full details below.");
            err.printStackTrace();
        }
    }
}
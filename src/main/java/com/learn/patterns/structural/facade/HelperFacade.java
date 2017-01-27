package com.learn.patterns.structural.facade;

import java.sql.Connection;

//We can create a Facade interface like below. Notice the use of Java Enum for type safety.
public class HelperFacade {

    public static String generateReport(DBTypes dbType, ReportTypes reportType, String tableName){
        Connection con = null;
        String report = null;
        switch (dbType){
            case MYSQL:
                con = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch(reportType){
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, con);
                        break;
                }
                report = "mysql report";
                break;
            case ORACLE:
                con = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch(reportType){
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, con);
                        break;
                }
                report = "oracle report";
                break;
        }
        return report;
    }

    public enum DBTypes{
        MYSQL,ORACLE;
    }

    public enum ReportTypes{
        HTML,PDF;
    }
}

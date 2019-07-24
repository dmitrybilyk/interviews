package com.learn.ibatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.Reader;
import java.util.List;

public class TestMainCalibrations {
    public static void main(String[] args) throws Exception {
        //Initialize dao
        CalibrationsDao calibrationsDao = new CalibrationsDaoImpl();

        //Create the SQLMapClient
        Reader reader = Resources.getResourceAsReader("ibatis/sql-maps-config.xml");
        SqlMapClient sqlmapClient = SqlMapClientBuilder.buildSqlMapClient(reader);


      List<SubCalibrationBO> subCalibrationBOs = calibrationsDao.getSubCalibrationsByCalibrationId(1, sqlmapClient);
        for (SubCalibrationBO subCalibrationBO : subCalibrationBOs) {
            System.out.println(subCalibrationBO.getSubCalibrationId());
        }

    }

}



        //System.out.println(Arrays.toString(manager.getAllUsers(sqlmapClient).toArray()));

 
        //Fetch the user detail
        //UserTEO createdUser = manager.getUserById(1, sqlmapClient);
        //System.out.println(createdUser.getEmail());

        // UserTEO userByMail = manager.getUserByEmail("demo-user@howtodoinjava.com", sqlmapClient);
        //System.out.println("User By Email: " + userByMail.getName());

        //Lets delete the user
//       manager.getEmailByUserId().deleteUserById(1, sqlmapClient);

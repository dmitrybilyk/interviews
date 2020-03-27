package com.learn.core.exceptions.trainings2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String s = null;
        String fileName = checkedException();
        System.out.println(fileName);
//        uncheckedException("ddd");
    }

//    @lombok.SneakyThrows
    private static void uncheckedException(String s) throws ArithmeticException {
//        throw new Exception();
//            int i = 10 / 0;
//            return s.isEmpty();
    }

    private static String checkedException() {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader(
                    new File("/home/dmitry/dev/projects/interviews/src/main/resources/log4j_tocheck2.xml")));
            rd.readLine();
            throw new SQLException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        return "dfsd";
    }
}

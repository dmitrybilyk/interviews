package com.learn.core.io.mkyongtutorials;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by dik81 on 16.01.20.
 */
public class WriteObject {
    public static void main(String args[]) {

        WriteObject obj = new WriteObject();

        Address address = new Address();
        address.setStreet("Oschepkova street");
        address.setCountry("Ukraine");

        obj.serializeAddress(address);

    }

    public void serializeAddress(Address address) {

        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {

            fout = new FileOutputStream("c:\\newfile.txt");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(address);

            System.out.println("Done");

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

//    public void serializeAddressJDK7(Address address) {
//
//        try (ObjectOutputStream oos =
//                     new ObjectOutputStream(new FileOutputStream("c:\\temp\\address2.ser"))) {
//
//            oos.writeObject(address);
//            System.out.println("Done");
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//    }

}

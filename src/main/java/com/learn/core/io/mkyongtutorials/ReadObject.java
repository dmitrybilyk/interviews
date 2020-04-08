package com.learn.core.io.mkyongtutorials;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by dik81 on 16.01.20.
 */
public class ReadObject {
    public static void main(String args[]) {

        ReadObject obj = new ReadObject();

        Address address = obj.deserialzeAddress("c:\\newfile.txt");

        System.out.println(address);

    }

    public Address deserialzeAddress(String filename) {

        Address address = null;

        FileInputStream fin = null;
        ObjectInputStream ois = null;

        try {

            fin = new FileInputStream(filename);
            ois = new ObjectInputStream(fin);
            address = (Address) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return address;

    }
}

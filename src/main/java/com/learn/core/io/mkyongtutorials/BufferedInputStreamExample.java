package com.learn.core.io.mkyongtutorials;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
public class BufferedInputStreamExample {
 
	public static void main(String[] args) {
 
		File file = new File("c:\\newfile.txt");
      FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
 
		try {
			fis = new FileInputStream(file);
 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
 
			while (dis.available() != 0) {
//            This method does not properly convert bytes to characters.
            // use BufferedReader.readLine() instead
				System.out.println(bis.read());
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				bis.close();
				dis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
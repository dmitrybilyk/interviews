package com.learn.core.io.mkyongtutorials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class BufferedReaderExample {
 
	public static void main(String[] args) {
 
		BufferedReader br = null;
 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("/io/ittestfile.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
            if (br != null)
            {
               br.close();
            }
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
}
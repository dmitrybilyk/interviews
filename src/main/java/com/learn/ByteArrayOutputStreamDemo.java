package com.learn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayOutputStreamDemo {
   public static void main(String[] args) throws IOException {
      byte[] bs = {65, 66, 67, 68, 69, 70, 71, 72};
      byte[] bs2 = {33, 33, 33, 33, 33, 33, 33, 33};
      OutputStream os = null;
      ByteArrayOutputStream baos = null;
      ByteArrayOutputStream baos2 = null;

      try {
         // create new output stream
         os = new ByteArrayOutputStream();
         
         // create new ByteArrayOutputStream
         baos = new ByteArrayOutputStream();
         baos2 = new ByteArrayOutputStream();

         // write buffer to the byte array output stream
         baos.write(bs);

         // write to the output stream
         baos.writeTo(os);

         baos2.write(bs2);


         baos2.writeTo(os);
         
         // print the byte as default character set
         System.out.println(os.toString());
         
      } catch(Exception e) {
         // if I/O error occurs
         e.printStackTrace();
      } finally {
         if(baos!=null)
            baos.close();
         if(os!=null)
            os.close();
      }   
   }
}
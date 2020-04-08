package com.learn.core.io.nio;

/**
 * Created by dik81 on 15.01.20.
 */
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

//This is an example of java.nio.Buffer
 public class BufferExample2 {

        public static void main (String [] args) throws IOException {

            String testFile = "nio-data.txt";
            Path filePath = Paths.get(testFile);

            writeFile(filePath);
            readFile(filePath);
        }

        private static void writeFile(Path filePath)
                throws IOException {

            String input = "Let us go and train!";
            System.out.println("Text written to file [" + filePath.getFileName() + "]: " + input);

            byte [] inputBytes = input.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.wrap(inputBytes);

            FileChannel writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            int noOfBytesWritten = writeChannel.write(writeBuffer);

            writeChannel.close();
        }

        private static void readFile(Path filePath)
                throws IOException {

            FileChannel readChannel = FileChannel.open(filePath);

            ByteBuffer readBuffer = ByteBuffer.allocate(24);
            int noOfBytesRead = readChannel.read(readBuffer);

            byte [] bytes = readBuffer.array();
            String output = new String(bytes).trim();

            System.out.println("Text read from file [" + filePath.getFileName() + "]: " + output);

            readChannel.close();
        }
 }


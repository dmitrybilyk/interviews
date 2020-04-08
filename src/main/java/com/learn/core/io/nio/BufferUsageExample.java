package com.learn.core.io.nio;

import com.learn.patterns.structural.exam.composite.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by dik81 on 15.01.20.
 */

public class BufferUsageExample {
    public static void main (String [] args) throws IOException {

    //RandomAccessFile newFile = new RandomAccessFile("nio-data.txt", "rw");
        RandomAccessFile aFile = new RandomAccessFile("nio-data.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

    //create buffer with capacity of 48 bytes:
        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf); //read into buffer.
        while (bytesRead != -1) {

            System.out.println("Read " + bytesRead);
            buf.flip();

            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    };
}


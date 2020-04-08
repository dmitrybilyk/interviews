package com.learn.sockets.dateServerAndClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * Trivial client for the date server.
 */
public class DateClient {

    /**
     * Runs the client as an application.  First it displays a dialog
     * box asking for the IP address or hostname of a host running
     * the date server, then connects to it and displays the date that
     * it serves.
     */
    public static void main(String[] args) throws IOException {
//        String serverAddress = JOptionPane.showInputDialog(
//            "Enter IP Address.java of a machine that is\n" +
//            "running the date service on port 9090:");
        Socket s = new Socket("localhost", 9090);
        BufferedReader input =
            new BufferedReader(new InputStreamReader(s.getInputStream()));
        while (input.read() != -1) {
            String answer = input.readLine();
            JOptionPane.showMessageDialog(null, answer);
        }
        System.exit(0);
    }
}
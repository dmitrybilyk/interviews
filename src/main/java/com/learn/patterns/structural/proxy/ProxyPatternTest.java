package com.learn.patterns.structural.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 12.11.13
 * Time: 22:45
 * To change this template use File | Settings | File Templates.
 */
//The definition itself is very clear and proxy pattern is used when we
// want to provide controlled access of a functionality.
public class ProxyPatternTest {

    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("dik81", "035t645");
        try {
            executor.runCommand("echo $JAVA_HOME");
//            executor.runCommand("rmcmd");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }

}

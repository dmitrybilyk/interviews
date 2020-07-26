package com.learn.interview_questions.patterns.structural.proxy.classical;

//The definition itself is very clear and proxy pattern is used when we
// want to provide controlled access of a functionality.
public class ProxyPatternTest {

    public static void main(String[] args){
//        CommandExecutor executor = new CommandExecutorImpl();
        CommandExecutor executor = new CommandExecutorProxy("dik81", "035645");
        try {
            executor.runCommand("echo $JAVA_HOME");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }

}

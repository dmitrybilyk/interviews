package com.learn.patterns.behavioral.command.lambdaexample;

public class TestRun {
   public static void main(String[] args) {                        
      String textBefore = "before-";                        
      String textAfter = "-after";                       
      String insert = "insert";                        
      Document document = new Document();                        
      Command addBefore = new AddStringBegin(document, textBefore);                        
      Command addAfter = new AddStringEnd(document, textAfter);                        
      Command insertStr = new InsertStringCommand(document, insert, 2); 
      ManagerCommands manager = new ManagerCommands();                        
      manager.addCommand(addBefore);                        
      manager.addCommand(addAfter);                        
      manager.addCommand(insertStr);                        
      manager.run();            
   } 
} 
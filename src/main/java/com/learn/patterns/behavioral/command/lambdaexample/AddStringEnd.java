package com.learn.patterns.behavioral.command.lambdaexample;

public class AddStringEnd implements Command {
  private Document document;            
  private String str; 
  public AddStringEnd(Document document, String str) {                        
     this.document= document;                        
     this.str= str;            
  } 
  @Override            
  public void execute() {                        
     document.addStringAfter(str);                        
     document.output("Add string ("+ str+") after document");            
  } 
} 
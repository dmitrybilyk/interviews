package com.learn.core.annotations.SuppressWarnings;


//предупреждения компилятора - хорошая возможность проверить свой код на наличие проблем определённых типов;
//        - на практике следует добиваться того, чтобы код компилировался без предупреждений;
//        - однако в некоторых случаях предупреждений не избежать;
//        - опция компилятора -Xlint позволяет включать/отключать выдачу предупреждений определённых типов;
//        - появившаяся в java 5 аннотация @SuppressWarning позволяет решать эту же задачу гораздо более гибко;
//        - нужно помнить, что как опции -Xlint, так и аннотация @SuppressWarning зависят от используемых компилятора и IDE.

/**
 * Created by dik81 on 10/8/14.
 */
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "unused"})
public class MethodWithUncheckedOperation {

  public void someUnusedMethodWithUncheckedOperation () {
    List list = new ArrayList();
    list.add("element");
    list.get(0).toString();
  }

}

///usr/local/java/jdk1.7.0_09/bin/javac MethodWithUncheckedOperation.java
///usr/local/java/jdk1.7.0_09/bin/javac MethodWithUncheckedOperation.java -Xling (to turn on
//warnings

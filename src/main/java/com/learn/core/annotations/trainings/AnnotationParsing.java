package com.learn.core.annotations.trainings;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationParsing {

    public static void main(String[] args) {
        try {
            for (Method method : AnnotationParsing.class
                    .getClassLoader()
                    .loadClass(("com.learn.core.annotations.trainings.Human"))
                    .getMethods()) {
                // checks if MethodInfo annotation is present for the method
                if (method
                        .isAnnotationPresent(InfoAnnotation.class)) {
                    try {
                        // iterates all the annotations available in the method
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method "
                                    + method + " : " + anno);
                        }
                      InfoAnnotation methodAnno = method
                                .getAnnotation(InfoAnnotation.class);
                        if (methodAnno.something() == 1) {
                            System.out.println("Method with revision no 1 = "
                                    + method);
                        }

                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch ( ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }

}
package com.learn.core.lena.staticInnerClasses;


//    This example defines three variables named x:
//    - the member variable of the class ShadowTest,
//    - the member variable of the inner class FirstLevel, and
//    - the parameter in the method methodInFirstLevel.
//    The variable x defined as a parameter of the method methodInFirstLevel
//    shadows the variable of the inner class FirstLevel.
//    Consequently, when you use the variable x in the method methodInFirstLevel, it refers to the method parameter.
//    To refer to the member variable of the inner class FirstLevel, use the keyword this to represent the enclosing scope:


public class ShadowTest {

    public int x = 0;

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(33);
    }

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }
}


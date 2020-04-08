package com.learn.core.innerclasses.anotherpackage;


// Two nested one's private constructor, because they both are inner classes:
public class InnerPrivateConstructor {
    public class One {
        private One(){
        }
        private void print() {
            System.out.println("One print");
        }
    }
    public class Two extends One {
        public void print(){
  //          System.out.println("Two print");
            super.print();
        }
    }

    public static void main(String[] args) {
        Two two = new InnerPrivateConstructor().new Two();
        two.print();
    }
}

package com.learn.core.lena.staticInnerClasses;

//          Local classes are similar to inner classes because they cannot define or
//      declare any static members. Local classes in static methods, such as the class PhoneNumber,
//      which is defined in the static method validatePhoneNumber, can only refer to static members
//      of the enclosing class. For example, if you do not define the member variable regularExpression
//      as static, then the Java compiler generates an error
//      You cannot declare static initializers or member interfaces in a local class
//      A local class can have static members provided that they are constant variables.

public class LocalClassExample {
  
    static String regularExpression = "[^0-9]";
  
    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

        int numberLength = 10; // need to be final or effectively final for accessing from local class
       
        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(
                  regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

//             Valid in JDK 8 and later:
//            public void printOriginalNumbers() {
//                System.out.println("Original numbers are " + phoneNumber1 +
//                    " and " + phoneNumber2);
//            }
        }
        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
        
        // Valid in JDK 8 and later:
//        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null) 
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
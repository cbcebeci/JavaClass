package com.lecture.four;

public class AutoBoxingOperations {

    public static void main(String[] args) {

        int someNumber = 1;
        Integer someObjectInteger = someNumber;
        Integer someObjectInteger1 = new Integer(someNumber);

        int anotherInteger = someObjectInteger;

        System.out.println(someNumber + " " + someObjectInteger + " " + someObjectInteger1 + " " + anotherInteger);

        float someDoubleNumber = 2132.664f;

        Float objectFloatNumber = someDoubleNumber;
        System.out.println(objectFloatNumber);
        System.out.println(objectFloatNumber.intValue());

        int anotherNumber = 23;
        Integer anotherNumber1 = 23;
        if (anotherNumber == anotherNumber1) {
            System.out.println("These numbers are the same");
        } else {
            System.out.println("These numbers are not the same");
        }

        Integer number1 = 1;
        Integer number2 = 1;
        if (number1 == number2) {
            System.out.println("These numbers are the same");
        }

        Double double1 = 123.29;
        Double double2 = 123.29;
        int result = double2.compareTo(double1);
        System.out.println(result);

        String myName = "Can Berk";
        String myName1 = new String("Can Berk");
        if (myName == myName1) {
            System.out.println("This will never print");

        }
        if (myName.equals("Can Berk")) {
            System.out.println("Hello " + myName);
        }
        if (myName.equals("can berk")) {
            System.out.println("hello again " + myName);
        }

    }
}


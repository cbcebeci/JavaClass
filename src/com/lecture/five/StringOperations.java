package com.lecture.five;

public class StringOperations {

    public static void main(String[] args) {

        String helloWorld = "Hello, World";
        String someString = helloWorld.substring(7);
        System.out.println(someString);


        int lengthOfString = helloWorld.length();
        System.out.println(lengthOfString);

        int indexOfComma = helloWorld.indexOf(",");
        System.out.println(indexOfComma);

        int lastIndexOfO = helloWorld.lastIndexOf("o");
        System.out.println(lastIndexOfO);
    }
}

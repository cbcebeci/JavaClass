package com.lecture.five;

public class LoopOperations {

    public static void main(String[] args) {

        int counter = 3;

        while (counter > 1) {
            System.out.println(counter);
            counter--;
        }

        String helloWorld = "Hello World";
        int characterCount = 0;

        while (helloWorld.length()>characterCount){
            System.out.println(helloWorld.charAt(characterCount));
            characterCount++;
        }

        for(characterCount = 0;characterCount<helloWorld.length();characterCount++){
            System.out.println(helloWorld.charAt(characterCount));
        }

    }
}

package com.lecture.nine;

import java.util.Scanner;

public class JamesBond {

    public static void main(String[] args) {

        /**
         * using the scanner, we will have string.
         * then we will check the string with array information and if some secret string is located, we will replace
         * with 007.
         *
         * secret keys are James Bond, agent.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to say?");
        String sentence = scanner.nextLine();

        /**
         * (?i) means key sensitive. to make it work, we used replaceAll.
         * String secretKey = sentence.replace("(?i)James Bond", "007"); first we replace the words and then
         * assign this new sentence as a secretKey and later we replace the other word and we assign old secretKey
         * sentence as a new secretKey.
         */

        String secretKey = sentence.replaceAll("(?i)James Bond", "007");
        secretKey = secretKey.replaceAll("(?i)agent","007");
        System.out.println(secretKey);

        if (sentence.equals(secretKey)){
            System.out.println("There was no secret key.");
        }else{
            System.out.println("Woop");
        }

    }
}

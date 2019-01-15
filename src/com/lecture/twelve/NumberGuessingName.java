package com.lecture.twelve;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingName {
    /**
     * have a main method
     * welcome user
     * investigate in google how to generate random numbers [1-100]
     * print out those random numbers.
     * ask user to enter a number
     * right; inform and exit
     * wrong; ask again
     * count error guessing
     */

    public static void main(String[] args) {

        System.out.println(Math.abs(-1));

        System.out.println("Welcome to the Number Guessing Game");
        Random random = new Random();
        int randomNumber = random.nextInt(101); //0 to 100 included
        Scanner scanner = new Scanner(System.in);

        int attemptCount = 0;
        while (true) {
            System.out.println("Please enter the number");
            int userNumber = scanner.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("You are correct");
                break;
            } else {
                System.out.println("You are wrong");
                attemptCount++;
                System.out.println("This was your attempt:" + attemptCount);

                //Lets give hint
                int difference = Math.abs((userNumber - randomNumber));
                if (difference < 5) {
                    System.out.println("It is burning");
                } else if (difference < 10) {
                    System.out.println("It is very hot");
                } else if (difference < 25) {
                    System.out.println("It is warm");
                } else {
                    System.out.println("It is cold.");
                }
            }
        }
    }


}


package com.lecture.five;

import java.util.Scanner;

public class HWTeacher {

    public static void main(String[] args) {

        // From the lecturer

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please enter the number.");
        int incomingInt = scanner.nextInt();

        if (incomingInt == 0) {
            System.out.println("There is nothing to print.");
        } else if (incomingInt < 0) {
            System.out.println("This is negative number. Please provide between 1-5 (included)");

        } else if (incomingInt > 5) {
            System.out.println("Please enter a number between 1-5 (included)");

        } else {

            String result = ""; //

            for (int counter = 0; counter < incomingInt; counter++) {

                result = result + incomingInt; // the result is already here '333'
            }
            System.out.println(result);

            // 2.way (shorter and better)

            for (int counter = 0; counter < incomingInt; counter++) {
                System.out.print(incomingInt);
            }

            System.out.println("");

            for (int counter = 0; counter < incomingInt; counter++) {
                System.out.println(incomingInt);
            }
        }
    }
}
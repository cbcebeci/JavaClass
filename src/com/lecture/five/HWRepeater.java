package com.lecture.five;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HWRepeater {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1-5.");

        int number = scanner.nextInt();

        int counter;
        for (counter = 0; counter < number; counter++) {

            System.out.print(number);
        }

        System.out.println("");

        for (counter = 0; counter < number; counter++) {

            System.out.println(number);

        }

    }


}

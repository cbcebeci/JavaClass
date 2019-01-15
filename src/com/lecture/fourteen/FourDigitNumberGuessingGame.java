package com.lecture.fourteen;

import java.util.Random;
import java.util.Scanner;

public class FourDigitNumberGuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(9000) + 1000;

        int randomNumber1 = randomNumber;

        int a = String.valueOf(randomNumber1).charAt(0);
        char b = String.valueOf(randomNumber1).charAt(1);
        char c = String.valueOf(randomNumber1).charAt(2);
        char d = String.valueOf(randomNumber1).charAt(3);

        if (a != b && a != c && a != d && b != c && b != d && c != d) {
            System.out.println(randomNumber);
        }
    }
}
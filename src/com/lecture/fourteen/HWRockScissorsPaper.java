package com.lecture.fourteen;

import java.util.Random;
import java.util.Scanner;

public class HWRockScissorsPaper {

    public static void main(String[] args) {

        System.out.println("Welcome to Rock/Scissors/Paper game. Let's play");
        System.out.println("(Rock = 1, Scissors = 2, Paper = 3, 4 = Finish the Game");
        Random random = new Random();
        int Rock = 1, Scissors = 2, Paper = 3;

        int userCounter = 0;
        int computerCounter = 0;

        while (true) {
            int randomNumber = random.nextInt(3) + 1;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a number.");
            int userNumber = scanner.nextInt();
            if (userNumber == 4) {

                break;
            } else if (userNumber == 1 && randomNumber == 2 || userNumber == 2 && randomNumber == 3 ||
                    userNumber == 3 && randomNumber == 1) {
                System.out.println("Good job! You win!");
                userCounter++;
            } else if (userNumber == 0 || userNumber > 3 || userNumber < 0) {
                System.out.println("Incorrect number!");
            } else if (userNumber == randomNumber) {
                System.out.println("Well, it is tie.");
            } else {
                System.out.println("Sorry, you lost!");
                computerCounter++;
            }


        }
        System.out.println("Thank you for playing. You win " + userCounter + " times and computer win "
                + computerCounter + " times");
    }
}

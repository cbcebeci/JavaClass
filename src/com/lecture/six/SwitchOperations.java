package com.lecture.six;

import java.util.Scanner;

public class SwitchOperations {

    public static void main(String[] args) {
        /**
         * user will insert a number
         * user then will insert another number
         * then we will ask what we will do with these numbers
         * (1=adding 2=substraction 3=multiplication 4=division)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        double number1 = scanner.nextDouble(); //if we write int instead of double then  it says 5/2 = 2 instead of 2.5

        System.out.println("Please enter another number.");
        double number2 = scanner.nextDouble();

        System.out.println("what should i do with these numbers? (1=adding 2=substraction 3=multiplication 4=division)");

        int operation = scanner.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = number1 + number2;
                break;


            case 2:
                result = number1 - number2;
                break;

            case 3:
                result = number1 * number2;
                break;

            case 4:
                result = number1 / number2;
                break;

            default:
                System.out.println("You entered wrong number");
                return;


            }
        System.out.println(result);
    }
}
package com.lecture.three;

import com.sun.tools.internal.xjc.reader.gbind.ElementSets;

import java.util.Scanner;

public class ValueInput {

    public static void main(String[] args) {

        boolean isHungry;
        int chickenKg;
        double cost;
        float drinkCost;
        char secretCode;

        short littleNumber;
        long bigNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter data for isHungry (boolean)");
        isHungry = scanner.nextBoolean();

        if (isHungry) {

            System.out.println("I am hungry");
        } else {
            System.out.println("I am not hungry");
        }
        System.out.println("Do you want chicken?");
        isHungry = scanner.nextBoolean();

        if (isHungry) {

            System.out.println("How much do you want");
            cost = scanner.nextDouble();

        }
        System.out.println("Do you want something to drink?");

        isHungry = scanner.nextBoolean();

        if (isHungry) {
            System.out.println("How many drinks do you want?");

        }

        littleNumber = scanner.nextShort();

        if (littleNumber < 2) {
            System.out.println("Thank you very much");
        } else {
            System.out.println("Please enter smaller than 2");

        }

    }

}




package com.lecture.three;

public class Primitives {

    public static void main(String[] args) {

        boolean isHungry = true;
        int chickenKg = 1;
        double cost = 1.20;
        float drinkCost = 1.01f;
        char secretCode = 'C';

        byte b = 10;
        short littleNumber = 3;
        long bigNumber = 10000000;


        if (isHungry) {

            System.out.println("I am Hungry");
        } else {
            System.out.println("I am not hungry");
        }

        System.out.println("i ate " + chickenKg + "kg chicken");
        System.out.println("Chicken costs " + cost + " and drink costs " + drinkCost + " euros");

        if (cost > drinkCost) {
            System.out.println("chicken cost more than drink");
        } else {
            System.out.println("Drink costs more than chicken");
        }

        // Let's assume that our secret code is D

        if (secretCode == 'B') {

            System.out.println("Correct");
        } else
            System.out.println("Try again");

        if (littleNumber < 7) {
            System.out.println("Please enter smaller number");

        } else
            System.out.println("Your number is Little enough");

        // Compare variable bigNumber with 992525

        if (bigNumber < 992525) {
            System.out.println("Your number is big enough");

        } else
            System.out.println("Please enter bigger number");
    }
}





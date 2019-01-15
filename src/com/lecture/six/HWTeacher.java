package com.lecture.six;

import java.util.Arrays;
import java.util.Scanner;

public class HWTeacher {


    public static void main(String[] args) {

        /**
         * int[] arrayOfInts = new int[5];
         * // initialization
         * arrayOfInts[0] = 10;
         * arrayOfInts[1] = 15;
         * arrayOfInts[2] = 20;
         * arrayOfInts[3] = 25;
         * arrayOfInts[4] = 30;
         */
        /**
         * Task one create an array worth of 7 values;
         * Fruits:(Banana, Orange, Grape, Apple, Kiwi, Pineapple)
         * Vegetable:(Carrot, Potato, Onion, Garlic, Eggplant)
         * //
         */
        /**
         * User will
         */


        Scanner scanner = new Scanner(System.in);
        String[] vegetables = {"Carrot", "Potato", "Onion", "Garlic", "Eggplant"};
        String[] fruits = {"Banana", "Orange", "Grape", "Apple", "Kiwi", "Pineapple"};

        String[] customerList = new String[7];
        System.out.println("Please enter vegetable or fruit.");
        System.out.println("Vegetable=>" + Arrays.toString(vegetables));
        System.out.println("Fruit=>" + Arrays.toString(fruits));
        System.out.println();

        for (int counter = 0; counter < customerList.length; counter++) {
            customerList[counter] = scanner.next();
        }

        /**
         * Find out the amount of vegetables. first we need a result to print.
         */

        int vegetableAmount = 0;
        int fruitAmount = 0;

        /**
         * This loop is responsible for the customerItem loop. Meaning it gets the first item of the customer and
         * then checks if it is the item of the vegetables or fruits
         */

        for (String customerItem : customerList) {
            System.out.println("Deciding" + customerItem + "if fruit or vegetable");
            for (int counter = 0; counter < vegetables.length; counter++) {

                //This part decide if it is a vegetable or not
                //String[] vegetables = {"Carrot", "Potato", "Onion", "Garlic", "Eggplant"};
                if (customerItem.equals(vegetables[counter])) {
                    vegetableAmount++;
                    System.out.println(customerItem + " is a vegetable.");
                    break;
                }

            }
            for (int counter = 0; counter < fruits.length; counter++) {

                //This part decide if it is a fruit or not
                //String[] fruits = {"Banana", "Orange", "Grape", "Apple", "Kiwi", "Pineapple"};
                if (customerItem.equals(fruits[counter])) {
                    fruitAmount++;
                    System.out.println(customerItem + " is a fruit.");
                    break;
                }
            }
        }
        if ((vegetableAmount + fruitAmount) != 7) {
            System.out.println("You entered something not in the list");
        } else
            System.out.println("Total vegetable amount " + vegetableAmount);
        System.out.println("Total fruit amount " + fruitAmount);


    }
}

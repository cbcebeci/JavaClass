package com.lecture.seven;

import java.util.Arrays;
import java.util.Scanner;

public class IntroductionToMethods {

    /**
     * Every method has one purpose. do not give more than one.
     */

    public void welcomeUser(String[] vegetables, String[] fruits) {
        System.out.println("Please enter vegetable or fruit.");
        System.out.println("Vegetable=>" + Arrays.toString(vegetables));
        System.out.println("Fruit=>" + Arrays.toString(fruits));
    }

    /**
     * This part will decide if it is vegetable
     * useritem will be the input
     *
     * @return
     */
    public boolean isThisVegetable(String[] customerItem, String[] vegetables) {
        for (int counter = 0; counter < vegetables.length; counter++) {

            //This part decide if it is a vegetable or not
            //String[] vegetables = {"Carrot", "Potato", "Onion", "Garlic", "Eggplant"};
            if (customerItem.equals(vegetables[counter])) {
                System.out.println(customerItem + " is a vegetable.");
                return true;
            }
        }
        return false;
    }

    public boolean isThisFruit(String[] customerItem, String[] fruits) {
        for (String fruitItem : fruits) {
            if (customerItem.equals(fruitItem))
                return true;
        }
        return false;
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] vegetables = {"Carrot", "Potato", "Onion", "Garlic", "Eggplant"};
        String[] fruits = {"Banana", "Orange", "Grape", "Apple", "Kiwi", "Pineapple"};

        String[] customerList = new String[7];
        IntroductionToMethods introductionToMethods = new IntroductionToMethods();
        introductionToMethods.welcomeUser(vegetables, fruits);

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
            System.out.println("Deciding " + customerItem + " if fruit or vegetable");
            //This part decide if it is a vegetable or not
            //String[] vegetables = {"Carrot", "Potato", "Onion", "Garlic", "Eggplant"};
            boolean isThisVegetable = introductionToMethods.isThisVegetable(customerList, vegetables);

            //This part decide if it is a fruit or not
            //String[] fruits = {"Banana", "Orange", "Grape", "Apple", "Kiwi", "Pineapple"};
            boolean isThisFruit = introductionToMethods.isThisFruit(customerList, fruits);
            if (isThisVegetable) {
                vegetableAmount++;
            } else if (isThisFruit) {
                fruitAmount++;
            } else {
                System.out.println("What is this?!?!?! " + customerItem);
                System.exit(1);
            }

        }
        System.out.println("Total vegetable amount " + vegetableAmount);
        System.out.println("Total fruit amount " + fruitAmount);
    }
}
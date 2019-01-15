package com.lecture.twelve;

import com.lecture.thirteen.Account;

import java.util.Scanner;


public class SuperMarket {

    /**
     * first part;
     * maximum 5 items
     * assign price
     * print items
     * use arrays (one for item and one for price)
     * <p>
     * second part;
     * check for dublicates (means if it happens to enter same item, which doesn't matter upper/lower case, system
     * says that it is already there.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] itemNames = new String[5]; // that's because it is asked for 5 items.
        double[] itemPrices = new double[5];
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        System.out.println("welcome to the supermarket. Admin please enter items and prices");

        for (int counter = 0; counter < itemNames.length; counter++) { //it will run 5times cuz we put length and
            System.out.println("Please enter the new item name.");//it is 5.
            String itemName = scanner.next();
            if (superMarketUtilities.getItemIndex(itemName, itemNames) != -1) {
                System.out.println("This is the duplicate item " + itemNames);
                counter--; //duplicate items shouldn't be counted. that's why counter-- is added.

            } else {
                itemNames[counter] = itemName;
                System.out.println("Please enter the price for item " + itemName);
                double itemPrice = scanner.nextDouble();
                itemPrices[counter] = itemPrice;

            }

        }
        for (int counter = 0; counter < itemNames.length; counter++) {
            System.out.println(itemNames[counter] + " " + itemPrices[counter]);
        }


        //----------------------------------- Lecture 13 --------------------------------------
        /**
         * create a class called "account"
         * balance (money) (double)
         * bought items (array)
         * quantities (array)
         *
         * Constructor
         */

        System.out.println("Please enter your budget.");
        double budget = scanner.nextDouble();
        Account account = new Account(budget);
        System.out.println("Your budget is " + account.getBalance());

        //Let's buy some items
        //if you are 'done' you finished buying.

        while (true) {
            System.out.println("What do you want to buy? (done = finish buying)");
            String requestedItem = scanner.next();
            if (requestedItem.equalsIgnoreCase("done")) {
                break;
            }
            int locatedIndex = superMarketUtilities.getItemIndex(requestedItem, itemNames);
            if (locatedIndex == -1) {
                System.out.println("This item does not exist");
            } else {
                //Now here we know items exists in the super market
                //we ask how many you want. then we will call our method in account.
                //and add that item.

                //----------------------------------- Lecture 14 --------------------------------

                System.out.println("How many of " + requestedItem + " do you want?");
                int requestedQuantity = scanner.nextInt();

                //Let's check if the person has the enough money to buy the product
                //if so deduct the balance and insert the items.

                double totalCost = itemPrices[locatedIndex] * requestedQuantity;
                totalCost = superMarketUtilities.round(totalCost);
                boolean isEnoughMoney = account.deduct(totalCost);
                if (isEnoughMoney) {
                    account.insertBoughtItems(requestedItem, requestedQuantity);

                }
                if (requestedItem.equalsIgnoreCase("done")) {
                    System.out.println("You finished your shopping. You bought " + requestedQuantity + requestedItem);
                }


            }
        }
        account.printAccountInfo();

    }
}


package com.lecture.thirteen;

import com.lecture.twelve.SuperMarketUtilities;

public class Account {
    private double balance;
    private String[] boughtItems = new String[5];
    private Integer[] quantities = new Integer[5];

    public Account(double balance) { // it is a constructor.
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public String[] getBoughtItems() {
        return boughtItems;
    }

    public Integer[] getQuantities() {
        return quantities;
    }

    /**
     * this will check if the item was already bought.
     * if it is bought already increase the amount with the existing quantity
     * if it is bought for the first time, then insert the item and put the amount inside the quantity.
     * it will put the incoming item in the first empty place of the arrays.
     */

    public void insertBoughtItems(String incomingItem, int amount) {

        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        int indexOfItem = superMarketUtilities.getItemIndex(incomingItem, boughtItems);
        if (indexOfItem != -1) {
            //This means we have already bought this item so let's increase the amount.

            quantities[indexOfItem] = quantities[indexOfItem] + amount;

        } else {
            //Here we have a new item bought
            //Let's find the empty place in the boughtitems array

            int emptyIndex = superMarketUtilities.findEmptyIndex(boughtItems);
            if (emptyIndex == -1) {
                System.out.println("What the hell is going on?" + " We must find an empty place");
                System.exit(1);
            } else {
                boughtItems[emptyIndex] = incomingItem;
                quantities[emptyIndex] = amount;
            }

        }


    }
    //------------------------------ Lecture 14 --------------------------------------

    public boolean deduct(double cost) {
        double threshold = .0001;
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();

        if (Math.abs(balance - cost) < threshold) {   // this part checks if there is equality or not.
            System.out.println("There is enough balance");
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;

        } else if (balance > cost) {
            System.out.println("There is enough balance");
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;

        } else {
            System.out.println("There is not enough money.");
            return false;
        }

    }

    public void printAccountInfo() {
        for (int counter = 0; counter < boughtItems.length; counter++) {
            if (boughtItems[counter] != null) {
                System.out.println("Item: " + boughtItems[counter] + " quantity: " + quantities[counter]);
            }
        }
    }


}

package com.lecture.two;

import javax.print.attribute.standard.Finishings;

public class BiggestNumber2 {

    public static void main(String[] args) {

        int firstNumber = 201;
        int secondNumber = 12;
        int thirdNumber = 7;

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println(firstNumber);
            } else {
                System.out.println(thirdNumber);

            }
        } else if (secondNumber > thirdNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }

    }
}

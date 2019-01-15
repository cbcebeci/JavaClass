package com.lecture.four;

import java.util.Scanner;

public class HWClub {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");

        String name = scanner.next();
        if (name.equalsIgnoreCase("Murat")) {
            System.out.println("You are not allowed to go in!");

        } else {
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            if (age < 18) {
                System.out.println("Go do your homework");

            } else {
                System.out.println("Welcome to the club " + name);
            }
        }

    }

}


// Your are a doorman in this club and you have to ask for the name in this club.

// if name is Murat, which does not matter if it is upper or lower case, print 'you are not allowed to go in'

//otherwise then ask for the age. if the age is below 18. print 'go do your homework'

//if it is above 18, print 'welcome to the club + person name



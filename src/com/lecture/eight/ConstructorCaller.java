package com.lecture.eight;

import java.util.Scanner;

public class ConstructorCaller {

    public static void main(String[] args) {

        Person person = new Person(" Canberk", "Cebeci", 29, "male");
        System.out.println(person.name +" " +person.surname+ " " +person.age+ " " +person.gender);

        VarArgsExample varArgsExample = new VarArgsExample();
        int result = varArgsExample.sum(1,2,3,4,45,234,3445,4);
        System.out.println("result "+result); // system prints out the "result variable value"

        AgeDefiner ageDefiner = new AgeDefiner();
        Scanner scanner = new Scanner(System.in);
        ageDefiner.ageWoman(2,5,36,86,25);
        System.out.println("");
        ageDefiner.ageMan(5,67,35,46,18);
    }
}
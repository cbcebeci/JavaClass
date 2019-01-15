package com.lecture.seven;

import java.util.Scanner;

public class AdvancedWelcomeUtilities {

    /**
     * it will have a field of name and surname
     * then you will have a method that will assign value to name and surname
     * then you will have another method that will print name and surname.
     */

    String name;
    String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNameAndSurname(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printNameAndSurname(String name, String surname) {
        System.out.println("Name: " +name+ " Surname: " +surname);
    }


}






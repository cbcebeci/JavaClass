package com.lecture.eight;

public class Person {

    String name;
    String surname;
    int age;
    String gender;

    public Person(String name, String surname, int age, String gender) {

        /**
         * we use 'this' because parameter and field are defined with the same value. when it is written
         * this.name means the field. (implies 'String name' part.
         */


        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    /**
     * getset is put in order to avoid violation coming from other users.
     *
     */

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

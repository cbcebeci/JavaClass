package com.lecture.six;

public class ArrayOperations {

    public static void main(String[] args) {

        int[] arrayOfIntegers = {1, 2, 3, 4, 5, 6};

        // Print all the array values

        for (int item : arrayOfIntegers) {  // we write here int because we create as an int before.
            System.out.println(item);
        }


        for (int item : arrayOfIntegers) // all the values except 1

            if (item != 1) { // means if it is not 1 then print
                System.out.println(item);
            }
        System.out.println("");

        for (int item : arrayOfIntegers)

            if (item == 1) {
                continue; // basically it is the same with the previous example.

            } else {
                System.out.println(item);
            }

        System.out.println("");

        for (int item : arrayOfIntegers)

            if (item==4){
                break; // prints everything until this value.
            }else{
                System.out.println(item);
            }


    }
}

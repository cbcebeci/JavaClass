package com.lecture.eight;

public class AgeDefiner {
    /**
     * there will be two method, one for woman and one for man
     * Woman: <18, print you are very young.
     * 18-45 : you are young
     * 46-60 : you are still young
     * 61-...: you were young
     * <p>
     * For man;
     * <18 : You are very young
     * 18-31: You are still young
     * 32-45: Game over
     * 46-...: Are you still alive?
     */

    public void ageWoman(int... ages) {

        for (int someNumber : ages)
            if (someNumber < 0) {
                System.out.println("Please enter a correct value");
            } else if (someNumber < 18) {
                System.out.println("You are very young.");

                /**
                 * No need to write like else if (someNumber > 17 && someNumber < 46).
                 * it is okay if we write like "else if (someNumber < 46)" because when 20 is written, the method
                 * checks first <18, if it is not there then goes to another level (...<46)
                 */
            } else if (someNumber < 46) {
                System.out.println("You are young.");
            } else if (someNumber < 61) {
                System.out.println("You are still young.");
            } else {
                System.out.println("You were young");
            }
    }

    public void ageMan(int... ages) {

        for (int someNumber : ages)
            if (someNumber < 0) {
                System.out.println("Please enter a correct value");
            } else if (someNumber < 18) {
                System.out.println("You are very young.");
            } else if (someNumber < 31) {
                System.out.println("You are still young.");
            } else if (someNumber < 46) {
                System.out.println("Game over.");
            } else {
                System.out.println("Are you still alive?");
            }
    }
}


package org.giddap.dreamfactory.mitbbs;

/**
 * Problem Description:
 * If you have numbers in a 10,000 item array that range from 1 to 1 million,
 * and there is one duplicate. How do you find the duplicate with the simplest
 * algorithm?
 */
public class FindDuplicate {
    private final static int LENGTH = 10000;
    private final static int SCALE = 100;
    public int findDuplicate(int[] numbers) {
        if (numbers.length != LENGTH) {
            throw new IllegalArgumentException("Incorrect number of elements");
        }

        for (int i = 0; i < LENGTH; i++) {
            int n = numbers[i];
            if (n <= LENGTH) {

            } else {

            }
        }
        throw new IllegalStateException("");
    }
}

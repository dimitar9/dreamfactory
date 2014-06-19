package org.giddap.dreamfactory.cc150;

/**
 *
 */
public class Q1804NumberOfTwosBetweenZeroAndN {
    public int calculate(final int n) {
        if (n < 0) {
            return 0;
        }

        int i = 0;
        int a = n;
        while ((a >>= 1) > 0) {
            i++;
        }
        return i;
    }
}

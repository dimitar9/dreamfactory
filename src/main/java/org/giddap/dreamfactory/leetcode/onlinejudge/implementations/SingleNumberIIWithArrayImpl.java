package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SingleNumberII;

/**
 * Time: O(n); Space: O(1)
 *
 * Algorithm:
 * 1. Use a 32-element int array to count the number of occurrances of each bit.
 * 2. Modulize it by '3' to find out the individual bit of 'one appearance' int.
 * 3. Reconstruct the int from the bits.
 */
public class SingleNumberIIWithArrayImpl implements SingleNumberII {
    @Override
    public int singleNumber(int[] A) {
        final int n = A.length;
        if (n == 0) {
            return 0;
        }
        int[] c = new int[32];
        for (int a : A) {
            int i = 0;
            while (i < 32) {
                c[i] += a & 0x1;
                i++;
                a >>>= 1;
            }
        }
        int r = 0;
        for (int i = 0; i < 32; i++) {
            r |= ((c[i] % 3) << i);
        }
        return r;
    }
}

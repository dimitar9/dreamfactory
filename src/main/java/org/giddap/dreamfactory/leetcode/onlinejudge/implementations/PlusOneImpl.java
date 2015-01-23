package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PlusOne;

import java.util.Arrays;


public class PlusOneImpl implements PlusOne {
    @Override
    public int[] plusOne(int[] digits) {
        final int n = digits.length;
        if (n == 0) {
            return new int[0];
        }
        int[] ret = new int[n + 1];
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            ret[i + 1] = sum % 10;
            carry = sum / 10;
        }
        if (carry != 0) {
            ret[0] = carry;
            return ret;
        } else {
            return Arrays.copyOfRange(ret, 1, ret.length);
        }
    }
}

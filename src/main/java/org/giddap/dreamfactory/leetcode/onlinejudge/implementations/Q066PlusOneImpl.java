package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q066PlusOne;

import java.util.Arrays;


public class Q066PlusOneImpl implements Q066PlusOne {
    @Override
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = digits.length;
        if (len == 0) {
            return new int[0];
        }
        int[] ret = new int[digits.length + 1];
        int carry = 1;
        for (int i = len - 1; i >= 0; i--) {
            int sum = carry + digits[i];
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

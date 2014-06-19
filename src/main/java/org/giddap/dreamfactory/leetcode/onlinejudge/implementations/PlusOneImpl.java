package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PlusOne;

import java.util.Arrays;


public class PlusOneImpl implements PlusOne {
    @Override
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = digits.length;
        int[] ret = new int[len + 1];
        ret[len] = 1;
        int carry = 0;
        for (int i = len - 1; i >= 0; i--) {
            int sum = ret[i + 1] + digits[i] + carry;
            ret[i + 1] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            ret[0] = carry;
            return ret;
        } else {
            return Arrays.copyOfRange(ret, ret.length > 1 ? 1 : 0, len + 1);
        }
    }
}

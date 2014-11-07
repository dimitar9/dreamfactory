package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MultiplyStrings;

public class MultiplyStringsImpl implements MultiplyStrings {

    @Override
    public String multiply(String num1, String num2) {
        final int len1 = num1.length();
        final int len2 = num2.length();
        if (len1 == 0 || len2 == 0) {
            return "";
        }
        int[] ret = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            int carry = 0;
            int d1 = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int sum = carry;
                sum += d1 * d2;
                sum += ret[i + j + 1];
                ret[i + j + 1] = sum % 10;
                carry = sum / 10;
            }

            if (carry != 0) {
                ret[i] += carry;
            }
        }

        StringBuilder num = new StringBuilder();
        boolean leadingZero = true;
        for (int i = 0; i < ret.length; i++) {
            if (leadingZero && ret[i] == 0) {
                continue;
            } else {
                num.append(ret[i]);
                leadingZero = false;
            }
        }

        return num.length() == 0 ? "0" : num.toString();
    }
}

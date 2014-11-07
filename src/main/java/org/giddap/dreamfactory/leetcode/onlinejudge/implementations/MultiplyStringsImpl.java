package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MultiplyStrings;

public class MultiplyStringsImpl implements MultiplyStrings {

    @Override
    public String multiply(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();

        if (n1.length < n2.length) {
            char[] tmp = n1;
            n1 = n2;
            n2 = tmp;
        }

        int[] m = new int[n1.length + n2.length];
        for (int i = n2.length - 1; i >= 0; i--) {
            int in22 = n2[i] - '0';
            int carry = 0;
            for (int j = n1.length - 1; j >= 0; j--) {
                int in11 = n1[j] - '0';
                int one = in22 * in11 + carry + m[i + j + 1];
                m[i + j + 1] = one % 10;
                carry = one / 10;
            }
            if (carry != 0) {
                m[i] += carry;
            }
        }

        StringBuilder ret = new StringBuilder();
        boolean nonzero = false;
        for (int i : m) {
            if (i != 0 && !nonzero) {
                nonzero = true;
            }
            if (nonzero) {
                ret.append(i);
            }

        }
        return ret.length() == 0 ? "0" : ret.toString();
    }
}

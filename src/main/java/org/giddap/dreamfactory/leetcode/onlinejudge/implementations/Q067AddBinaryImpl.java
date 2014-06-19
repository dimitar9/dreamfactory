package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q067AddBinary;

public class Q067AddBinaryImpl implements Q067AddBinary {
    @Override
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function

        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder ret = new StringBuilder();
        int c = 0;
        while (i >= 0 || j >= 0 || c > 0) {
            int sum = c;
            if (i >= 0) {
                sum += (int) (a.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum += (int) (b.charAt(j) - '0');
                j--;
            }
            ret.insert(0, sum % 2);
            c = sum / 2;
        }
        return ret.toString();
    }
}

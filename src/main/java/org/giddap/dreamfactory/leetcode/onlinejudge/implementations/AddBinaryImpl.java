package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.AddBinary;

public class AddBinaryImpl implements AddBinary {
    @Override
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder ret = new StringBuilder();
        int c = 0;
        while (i >= 0 || j >= 0 || c > 0) {
            int sum = c;
            if (i >= 0) {
                sum += (a.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum += (b.charAt(j) - '0');
                j--;
            }
            ret.insert(0, sum % 2);
            c = sum / 2;
        }
        return ret.toString();
    }
}

package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.CountAndSay;

public class CountAndSayImpl implements CountAndSay {
    @Override
    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        String ret = "1";
        int i = 2;
        while (i <= n) {
            StringBuilder tmp = new StringBuilder();
            char[] chars = ret.toCharArray();
            int j = 0;
            int len = chars.length;
            while (j < len) {
                int k = j + 1;
                while (k < len && chars[j] == chars[k]) {
                    k++;
                }
                tmp.append((char)('0' + (k - j)));
                tmp.append(chars[j]);
                j = k;
            }
            ret = tmp.toString();
            i++;
        }
        return ret;
    }
}

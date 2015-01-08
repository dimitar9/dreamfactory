package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.CountAndSay;

public class CountAndSayImpl implements CountAndSay {
    @Override
    public String countAndSay(int n) {
        String prev = "1";
        int i = 1;
        while (i < n) {
            char[] chars = prev.toCharArray();
            StringBuilder curr = new StringBuilder();
            int j = 0;
            while (j < chars.length) {
                int k = j + 1;
                while (k < chars.length && chars[j] == chars[k]) {
                    k++;
                }
                curr.append(k - j);
                curr.append(chars[j]);
                j = k;
            }
            prev = curr.toString();
            i++;
        }
        return prev;
    }
}

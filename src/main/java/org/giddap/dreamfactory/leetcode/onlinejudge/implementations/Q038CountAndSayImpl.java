package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q038CountAndSay;

public class Q038CountAndSayImpl implements Q038CountAndSay {
    @Override
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function

        if (n == 0) {
            return "";
        }

        String ret = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder tmp = new StringBuilder();
            char prev = ret.charAt(0);
            int count = 1;
            for (int j = 1; j < ret.length(); j++) {
                char curr = ret.charAt(j);
                if (curr == prev) {
                    count++;
                } else {
                    tmp.append(count);
                    tmp.append(prev);
                    count = 1;
                }
                prev = curr;
            }
            tmp.append(count);
            tmp.append(prev);

            ret = tmp.toString();
        }

        return ret;
    }
}

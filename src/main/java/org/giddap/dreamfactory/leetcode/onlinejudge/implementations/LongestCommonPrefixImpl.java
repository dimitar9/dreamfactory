package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LongestCommonPrefix;

public class LongestCommonPrefixImpl implements LongestCommonPrefix {
    @Override
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int i = 0;
        String firstWord = strs[0];
        while (i < firstWord.length()) {
            for (int j = 1; j < strs.length; j++) {
                String currWord = strs[j];
                if (i >= currWord.length() || firstWord.charAt(i) != currWord.charAt(i)) {
                    return firstWord.substring(0, i);
                }
            }
            i++;
        }
        return firstWord;
    }
}

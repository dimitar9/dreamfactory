package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q087ScrambleString;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Q087ScrambleStringDfsImpl implements Q087ScrambleString {
    public boolean isScramble(String s1, String s2) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        final int s1Len = s1.length();
        final int s2Len = s2.length();

        if (s1Len != s2Len) {
            return false;
        } else if (s1Len == 1) {
            return s1.charAt(0) == s2.charAt(0);
        }

        boolean ret = false;
        for (int j = 1; j < s1Len; j++) {
            String word11 = s1.substring(0, j);
            String word12 = s1.substring(j, s1Len);
            for (int k = 1; k < s2Len; k++) {
                String word21 = s2.substring(0, k);
                String word22 = s2.substring(k, s2Len);
                if (haveSameCharacters(word11, word21)) {
                    ret |= (isScramble(word11, word21) && isScramble(word12, word22));
                } else if (haveSameCharacters(word11, word22)) {
                    ret |= (isScramble(word11, word22) && isScramble(word12, word21));
                }
            }
        }
        return ret;
    }

    private boolean haveSameCharacters(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> charsAndCounts = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            if (charsAndCounts.containsKey(s1.charAt(i))) {
                charsAndCounts.put(s1.charAt(i), charsAndCounts.get(s1.charAt(i)) + 1);
            } else {
                charsAndCounts.put(s1.charAt(i), 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char c2 = s2.charAt(i);
            if (charsAndCounts.containsKey(c2)) {
                int count = charsAndCounts.get(c2);
                count--;
                if (count <= 0) {
                    charsAndCounts.remove(c2);
                } else {
                    charsAndCounts.put(c2, count);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

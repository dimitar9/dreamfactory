package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstringOnImpl implements MinimumWindowSubstring {
    @Override
    public String minWindow(String S, String T) {
        Map<Character, Integer> needToFind = new HashMap<Character, Integer>();
        Map<Character, Integer> hasFound = new HashMap<Character, Integer>();
        for (char ch : T.toCharArray()) {
            if (needToFind.containsKey(ch)) {
                needToFind.put(ch, needToFind.get(ch) + 1);
            } else {
                needToFind.put(ch, 1);
                hasFound.put(ch, 0);
            }
        }

        int start = 0;
        String mws = S;
        int count = T.length();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (!needToFind.containsKey(ch)) {
                continue;
            }
            hasFound.put(ch, hasFound.get(ch) + 1);
            if (count != 0 && hasFound.get(ch) <= needToFind.get(ch)) {
                count--;
            }

            if (count == 0) {
                // see if we can advance 'start'
                while (!needToFind.containsKey(S.charAt(start))
                        || hasFound.get(S.charAt(start)) > needToFind.get(S.charAt(start))) {
                    char startChar = S.charAt(start);
                    if (needToFind.containsKey(startChar)) {
                        hasFound.put(startChar, hasFound.get(startChar) - 1);
                    }
                    start++;
                }

                if (i - start + 1 < mws.length()) {
                    mws = S.substring(start, i + 1);
                }
            }
        }

        return count == 0 ? mws : "";
    }
}

package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharactersImpl implements LongestSubstringWithoutRepeatingCharacters {
    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            throw new IllegalArgumentException("s cannot be null");
        }
        final int len = s.length();
        if (len <= 1) {
            return len;
        }
        int start = 0;
        int end = 1;
        Map<Character, Integer> cToPosMap = new HashMap<Character, Integer>();
        cToPosMap.put(s.charAt(0), 0);
        String lsb = s.charAt(0) + "";

        while (end < len) {
            char c = s.charAt(end);
            if (cToPosMap.containsKey(c) && cToPosMap.get(c) >= start) {
                if (end - start > lsb.length()) {
                    lsb = s.substring(start, end);
                }
                start = cToPosMap.get(c) + 1;
            }
            cToPosMap.put(c, end);
            end++;
        }
        if (end - start > lsb.length()) {
            lsb = s.substring(start, end);
        }
        return lsb.length();
    }
}

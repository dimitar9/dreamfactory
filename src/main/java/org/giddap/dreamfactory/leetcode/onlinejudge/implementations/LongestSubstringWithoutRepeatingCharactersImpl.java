package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharactersImpl implements LongestSubstringWithoutRepeatingCharacters {
    @Override
    public int lengthOfLongestSubstring(String s) {
        final int n = s.length();
        Map<Character, Integer> visited = new HashMap();
        int lls = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            char c = s.charAt(j);
            if (visited.containsKey(c) && visited.get(c) >= i) {
                lls = Math.max(lls, j - i);
                i = visited.get(c) + 1;
            }
            visited.put(c, j);
        }
        lls = Math.max(lls, n - i);
        return lls;
    }
}

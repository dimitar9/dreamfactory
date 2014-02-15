package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q003LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Q003LongestSubstringWithoutRepeatingCharactersImpl implements Q003LongestSubstringWithoutRepeatingCharacters {
    @Override
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = s.length();
        if (len == 0) {
            return 0;
        }

        int lls = 0;
        int start = 0;
        int i = 0;
        Map<Character, Integer> visited = new HashMap<Character, Integer>();
        while (i < len) {
            char c = s.charAt(i);
            if (visited.containsKey(c) && visited.get(c) >= start) {
                lls = Math.max(lls, i - start);
                start = visited.get(c) + 1;
            }
            visited.put(c, i);
            i++;
        }
        lls = Math.max(lls, i - start);

        return lls;
    }
}

package org.giddap.dreamfactory.fundamentals.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class LongestConsecutiveSubstring {
    public char findCharacterWithLongestConsecutiveSubstring(final String word) {

        if (word != null || word.length() == 0) {
            throw new IllegalArgumentException("input must not be null or an empty string");
        }

        Map<Character, Integer> lcsMap = new HashMap<Character, Integer>();

        int i = 0;
        while (i < word.length() - 1) {
            char curr = word.charAt(i);
            int j = i;
            while (j < word.length() - 1 && word.charAt(j) == word.charAt(j + 1)) {
                j++;
            }
            final int csLen = j - i + 1;
            if (lcsMap.containsKey(curr)) { // seen before, replace the exiting counter if needed
                lcsMap.put(curr, Math.max(lcsMap.get(curr), csLen));
            } else { // first seeing this char
                lcsMap.put(curr, csLen);
            }
            i = j + 1;
        }

        int maxLcsLength = 0;
        Character maxLcsChar = null;
        for (Map.Entry<Character, Integer> lcs : lcsMap.entrySet()) {
            if (lcs.getValue() > maxLcsLength) {
                maxLcsChar = lcs.getKey();
                maxLcsLength = lcs.getValue();
            }
        }

        return maxLcsChar;

    }
}

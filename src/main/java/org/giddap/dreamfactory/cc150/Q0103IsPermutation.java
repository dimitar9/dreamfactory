package org.giddap.dreamfactory.cc150;

import java.util.HashMap;
import java.util.Map;

public class Q0103IsPermutation {

    public boolean isPermutation(final String word1, final String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> chars = new HashMap<Character, Integer>();
        for (int i = 0; i < word1.length(); i++) {
            final char c = word1.charAt(i);
            if (chars.containsKey(c)) {
                chars.put(c, chars.get(c) + 1);
            } else {
                chars.put(c, 1);
            }
        }

        for (int j = 0; j < word2.length(); j++) {
            final char c = word2.charAt(j);
            if (chars.containsKey(c)) {
                final int count = chars.get(c);
                if (count - 1 <= 0) {
                    chars.remove(c);
                } else {
                    chars.put(c, count - 1);
                }
            } else {
                return false;
            }
        }

        return chars.isEmpty();
    }
}

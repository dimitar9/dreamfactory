package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ScrambleString;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class ScrambleStringDfsImpl implements ScrambleString {

    public boolean isScramble(String s1, String s2) {
        final int len = s1.length();
        if (len != s2.length()) {
            return false;
        }

        if (s1.equals(s2)) {
            return true;
        }

        boolean ret = false;
        for (int i = 1; i < len; i++) {
            String s1Front = s1.substring(0, i);
            String s1Back = s1.substring(i, len);

            if (hasSameCharacters(s1Front, s2.substring(0, i))
                    && hasSameCharacters(s1Back, s2.substring(i, len))) {
                ret = isScramble(s1Front, s2.substring(0, i)) &&
                        isScramble(s1Back, s2.substring(i, len));
            }

            if (ret) {
                return true;
            }

            if (hasSameCharacters(s1Front, s2.substring(len - i, len))
                    && hasSameCharacters(s1Back, s2.substring(0, len - i))) {
                ret = isScramble(s1Front, s2.substring(len - i, len)) &&
                        isScramble(s1Back, s2.substring(0, len - i));
            }

            if (ret) {
                return true;
            }
        }
        return ret;
    }

    private boolean hasSameCharacters(String w1, String w2) {
        Map<Character, Integer> chars1 = new HashMap<>();
        for (char c : w1.toCharArray()) {
            if (chars1.containsKey(c)) {
                chars1.put(c, chars1.get(c) + 1);
            } else {
                chars1.put(c, 1);
            }
        }

        for (char c : w2.toCharArray()) {
            if (chars1.containsKey(c)) {
                int count = chars1.get(c);
                if (count == 1) {
                    chars1.remove(c);
                } else {
                    chars1.put(c, chars1.get(c) - 1);
                }
            } else {
                return false;
            }
        }
        return chars1.isEmpty();
    }
}

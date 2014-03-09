package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ReverseWordsInAString;

import java.util.Arrays;

/**
 * 弼馬溫注解：
 * Seperation of Concerns.
 * Step 1: Normalize
 * Step 2: Reverse the entire string.
 * Step 3: Reverse the individual word one by one.
 * <p/>
 * Note: In step 3, there is an extra reverse for the last word as there
 * won't be ' ' for the last word after normalization.
 */
public class ReverseWordsInAStringImpl implements ReverseWordsInAString {
    @Override
    public String reverseWords(String s) {
        // normalize the string
        char[] ns = normalize(s.toCharArray());

        // reverse the entire string;
        reverse(ns, 0, ns.length - 1);

        // reverse individual word, one by one, seperated by space
        int lastend = -1;
        for (int i = 0; i < ns.length; i++) {
            if (i > 0 && ns[i] == ' ') {
                reverse(ns, lastend + 1, i - 1);
                lastend = i;
            }
        }

        reverse(ns, lastend + 1, ns.length - 1);

        return new String(ns);
    }

    public char[] normalize(char[] chars) {
        final int len = chars.length;

        if (len == 0) {
            return chars;
        }

        int i = 0;
        // remove leading spaces, if any
        while (i < len && chars[i] == ' ') {
            i++;
        }

        if (i == len) {
            return new char[0];
        }

        // remove consecutive spaces, if any
        int j = 0;
        for (; i < len; i++) {
            if ((chars[i] != ' ') || (j > 0 && chars[j - 1] != ' ')) {
                chars[j] = chars[i];
                j++;
            }
        }

        // remove the trailing space, if any
        if (chars[j - 1] == ' ') {
            j--;
        }

        return Arrays.copyOf(chars, j);
    }

    // start: inclusive
    // end: inclusive
    public void reverse(char[] chars, int start, int end) {
        int i = start;
        int j = end;
        while (i >= 0 && j < chars.length && i < j) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
    }
}

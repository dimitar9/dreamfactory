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
        if (s == null || s.length() == 0) {
            return "";
        }
        final int n = s.length();
        char[] cs = s.toCharArray();
        int m = 0;
        for (int j = 0; j < n; j++) {
            if ((m > 0 && cs[j] == ' ' && cs[m - 1] != ' ') || (cs[j] != ' ')) {
                cs[m] = cs[j];
                m++;
            }
        }
        m--;
        if (m == -1) {
            return "";
        }
        if (m > 0 && cs[m] == ' ') {
            m--;
        }

        reverse(cs, 0, m);
        int start = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            if (cs[i] == ' ') {
                reverse(cs, start, i - 1);
                sb.append(cs, start, i - start);
                sb.append(' ');
                start = i + 1;
            }
        }
        reverse(cs, start, m);
        sb.append(cs, start, m - start + 1);
        return sb.toString();
    }

    private void reverse(char[] chars, int s, int e) {
        while(s < e) {
            char tmp = chars[s];
            chars[s] = chars[e];
            chars[e] = tmp;
            s++;
            e--;
        }
    }
//    public String reverseWords(String s) {
//        // normalize the string
//        char[] ns = normalize(s.toCharArray());
//
//        // reverse the entire string;
//        reverse(ns, 0, ns.length - 1);
//
//        // reverse individual word, one by one, seperated by space
//        int lastend = -1;
//        for (int i = 0; i < ns.length; i++) {
//            if (i > 0 && ns[i] == ' ') {
//                reverse(ns, lastend + 1, i - 1);
//                lastend = i;
//            }
//        }
//
//        reverse(ns, lastend + 1, ns.length - 1);
//
//        return new String(ns);
//    }
//
//    public char[] normalize(char[] chars) {
//        final int len = chars.length;
//
//        if (len == 0) {
//            return chars;
//        }
//
//        int i = 0;
//        // remove leading spaces, if any
//        while (i < len && chars[i] == ' ') {
//            i++;
//        }
//
//        if (i == len) {
//            return new char[0];
//        }
//
//        // remove consecutive spaces, if any
//        int j = 0;
//        for (; i < len; i++) {
//            if ((chars[i] != ' ') || (j > 0 && chars[j - 1] != ' ')) {
//                chars[j] = chars[i];
//                j++;
//            }
//        }
//
//        // remove the trailing space, if any
//        if (chars[j - 1] == ' ') {
//            j--;
//        }
//
//        return Arrays.copyOf(chars, j);
//    }
//
//    // start: inclusive
//    // end: inclusive
//    public void reverse(char[] chars, int start, int end) {
//        int i = start;
//        int j = end;
//        while (i >= 0 && j < chars.length && i < j) {
//            char tmp = chars[i];
//            chars[i] = chars[j];
//            chars[j] = tmp;
//            i++;
//            j--;
//        }
//    }
}

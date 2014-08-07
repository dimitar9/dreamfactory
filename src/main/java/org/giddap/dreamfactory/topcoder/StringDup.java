package org.giddap.dreamfactory.topcoder;

/**
 * http://community.topcoder.com/stat?c=problem_statement&pm=40&rd=2001
 * <p/>
 * Problem Statement
 * <p/>
 * Create a class called StringDup. Given a string made up of ONLY letters and
 * digits, determine which character is repeated the most in the string ('A' is
 * different than 'a'). If there is a tie, the character which appears first in
 * the string (from left to right) should be returned.
 * <p/>
 * Examples :
 * <p/>
 * aaiicccnn = c
 * aabbccdd = a
 * ab2sbf2dj2skl = 2
 * <p/>
 * Here is the method signature :
 * <p/>
 * public char getMax(String input);
 * <p/>
 * We will check to make sure that the input contains only letters and digits (no
 * punctuation marks or spaces).
 */
public class StringDup {
    public char getMax(String input) {
        if (input.length() < 1) {
            return '\0';
        }
        int[] counters = new int[256];
        int[] firstApperances = new int[256];

        for (int i = 0; i < firstApperances.length; i++) {
            firstApperances[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            counters[c] = counters[c] + 1;
            if (firstApperances[c] == -1) {
                firstApperances[c] = i;
            }
        }

        char maxChar = input.charAt(0);
        for (int i = 0; i < counters.length; i++) {
            if ((counters[i] > counters[maxChar])) {
                maxChar = (char) i;
            } else if ((counters[i] == counters[maxChar])) {
                if (firstApperances[i] < firstApperances[maxChar]) {
                    maxChar = (char) i;
                }
            }
        }
        return maxChar;
    }
}

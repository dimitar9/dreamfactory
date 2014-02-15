package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q058LengthOfLastWord;

public class Q058LengthOfLastWordImpl implements Q058LengthOfLastWord {
    @Override
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int currIdx = s.length() - 1;
        while (currIdx >= 0 && s.charAt(currIdx) == ' ') {
            currIdx--;
        }

        int llw = 0;
        while (currIdx >= 0 && s.charAt(currIdx) != ' ') {
            llw++;
            currIdx--;
        }
        return llw;
    }
}

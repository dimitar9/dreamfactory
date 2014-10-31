package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LengthOfLastWord;

public class LengthOfLastWordImpl implements LengthOfLastWord {
    @Override
    public int lengthOfLastWord(String s) {
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

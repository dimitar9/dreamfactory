package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ValidNumber;

public class ValidNumberImpl implements ValidNumber {
    @Override
    public boolean isNumber(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function

        boolean num = false;
        boolean dot = false;   //decimal sign
        boolean exp = false;   //exponential sign
        boolean spa = false;   //space

        final int len = s.length();
        final char[] chars = s.toCharArray();

        int i = 0;
        //skip spaces on left
        while (i < len && chars[i] == ' ') {
            i++;
        }

        //skip +/- sign
        if (i < len && (chars[i] == '-' || chars[i] == '+')) {
            i++;
        }

        while (i < len) {
            char c = chars[i];
            if (c == ' ') {
                spa = true;
            } else if (spa) {
                return false; //space inside of non-space make number invalid
            } else if (c >= '0' && c <= '9') {
                num = true;
            } else if (c == 'e') {
                //exponential sign already exist, or no number in front
                //then invalid number.
                if (exp || !num) {
                    return false;
                }
                exp = true;
                num = false; // need number after exponential sign, so make it false
            } else if (c == '.') {
                //no decimal sign after exponential sign and decimal sign
                if (exp || dot) {
                    return false;
                }
                dot = true;
            } else if (c == '-' || c == '+') {
                // +/- sign should only follow exponential sign
                if (chars[i - 1] != 'e') {
                    return false;
                }
            } else {//any other characters would make number invalid
                return false;
            }
            i++;
        }

        return num;
    }
}

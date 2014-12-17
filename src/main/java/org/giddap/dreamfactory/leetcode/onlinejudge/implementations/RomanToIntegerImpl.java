package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

/**
 * Notes:
 * <p/>
 * Symbols are placed from left to right in order of value, starting with the largest.
 * <p/>
 * However, in a few specific cases,[2] to avoid four characters being repeated in succession
 * (such as IIII or XXXX) these can be reduced using subtractive notation as follows:[3][4]
 * the numeral
 * <ol>
 * <li>I can be placed before V and X to make 4 units (IV) and 9 units (IX respectively)</li>
 * <li>X can be placed before L and C to make 40 (XL) and 90 (XC respectively)</li>
 * <li>C can be placed before D and M to make 400 (CD) and 900 (CM) according to the same pattern[5]</li>
 * </ol>
 * <p/>
 * Tricks:
 * Use a variable to remember the prev value to avoid having to compute the value repeatedly.
 */
public class RomanToIntegerImpl implements RomanToInteger {

    Map<Character, Integer> romanToIntMap = null;

    public int romanToInt(String s) {
        init();

        int ret = 0;
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = romanToIntMap.get(s.charAt(i));
            ret += curr;
            if (i > 0 && prev < curr) {
                ret -= prev * 2;
            }
            prev = curr;
        }
        return ret;
    }

    private void init() {
        romanToIntMap = new HashMap<Character, Integer>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
    }
}

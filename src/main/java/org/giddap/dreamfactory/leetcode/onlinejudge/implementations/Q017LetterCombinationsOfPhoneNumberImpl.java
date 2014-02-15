package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q017LetterCombinationsOfPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q017LetterCombinationsOfPhoneNumberImpl implements Q017LetterCombinationsOfPhoneNumber {

    private Map<Character, Character[]> digitToLetterMap;

    @Override
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        init();

        ArrayList<String> ret = new ArrayList<String>();
        ret.add("");

        for (int i = 0; i < digits.length(); i++) {
            ArrayList<String> tmp = new ArrayList<String>();
            char currDigit = digits.charAt(i);
            if (digitToLetterMap.containsKey(currDigit)) {
                Character[] chars = digitToLetterMap.get(currDigit);
                for (Character c : chars) {
                    for (String letters : ret) {
                        tmp.add(letters + c);
                    }
                }
                ret = tmp;
            }
        }
        return ret;
    }

    private void init() {
        digitToLetterMap = new HashMap<Character, Character[]>();
        digitToLetterMap.put('2', new Character[]{'a', 'b', 'c'});
        digitToLetterMap.put('3', new Character[]{'d', 'e', 'f'});
        digitToLetterMap.put('4', new Character[]{'g', 'h', 'i'});
        digitToLetterMap.put('5', new Character[]{'j', 'k', 'l'});
        digitToLetterMap.put('6', new Character[]{'m', 'n', 'o'});
        digitToLetterMap.put('7', new Character[]{'p', 'q', 'r', 's'});
        digitToLetterMap.put('8', new Character[]{'t', 'u', 'v'});
        digitToLetterMap.put('9', new Character[]{'w', 'x', 'y', 'z'});
    }
}

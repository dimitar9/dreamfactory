package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q012IntegerToRoman;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q012IntegerToRomanImpl implements Q012IntegerToRoman {
    private LinkedHashMap<String, Integer> ROMAN_TO_INT;

    @Override
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        init();

        StringBuilder ret = new StringBuilder();
        for (Map.Entry<String, Integer> roman : ROMAN_TO_INT.entrySet()) {
            while (num >= roman.getValue()) {
                ret.append(roman.getKey());
                num -= roman.getValue();
            }
            if (num == 0) {
                break;
            }
        }

        return ret.toString();
    }

    private void init() {
        ROMAN_TO_INT = new LinkedHashMap<String, Integer>();
        ROMAN_TO_INT.put("M", 1000);
        ROMAN_TO_INT.put("CM", 900);
        ROMAN_TO_INT.put("D", 500);
        ROMAN_TO_INT.put("CD", 400);
        ROMAN_TO_INT.put("C", 100);
        ROMAN_TO_INT.put("XC", 90);
        ROMAN_TO_INT.put("L", 50);
        ROMAN_TO_INT.put("XL", 40);
        ROMAN_TO_INT.put("X", 10);
        ROMAN_TO_INT.put("IX", 9);
        ROMAN_TO_INT.put("V", 5);
        ROMAN_TO_INT.put("IV", 4);
        ROMAN_TO_INT.put("I", 1);
    }
}



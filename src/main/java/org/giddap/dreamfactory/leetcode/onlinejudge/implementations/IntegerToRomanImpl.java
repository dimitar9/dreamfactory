package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.IntegerToRoman;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRomanImpl implements IntegerToRoman {

    @Override
    public String intToRoman(int num) {
        TreeMap<Integer, String> intToRoman = createIntToRoman();

        StringBuilder ret = new StringBuilder();
        for (Map.Entry<Integer, String> one : intToRoman.entrySet()) {
            int key = one.getKey();
            String value = one.getValue();
            while (num >= key) {
                ret.append(value);
                num -= key;
            }
        }
        return ret.toString();
    }

    private TreeMap<Integer, String> createIntToRoman() {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        };

        TreeMap<Integer, String> intToRoman = new TreeMap<Integer, String>(comp);
        intToRoman.put(1000, "M");
        intToRoman.put(900, "CM");
        intToRoman.put(500, "D");
        intToRoman.put(400, "CD");
        intToRoman.put(100, "C");
        intToRoman.put(90, "XC");
        intToRoman.put(50, "L");
        intToRoman.put(40, "XL");
        intToRoman.put(10, "X");
        intToRoman.put(9, "IX");
        intToRoman.put(5, "V");
        intToRoman.put(4, "IV");
        intToRoman.put(1, "I");
        return intToRoman;
    }
}



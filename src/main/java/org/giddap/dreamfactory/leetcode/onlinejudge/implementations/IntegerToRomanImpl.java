package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.IntegerToRoman;

import java.util.*;

public class IntegerToRomanImpl implements IntegerToRoman {

    @Override
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        SortedMap<Integer, String>  intToRoman = createIntToRoman();
        for (SortedMap.Entry<Integer, String> one : intToRoman.entrySet()) {
            int intVal = one.getKey();
            String romanVal = one.getValue();
            while (num >= intVal) {
                num -= intVal;
                sb.append(romanVal);
            }
        }
        return sb.toString();
    }

    private SortedMap<Integer, String> createIntToRoman() {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        };

        SortedMap<Integer, String> intToRoman = new TreeMap<>(comp);
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



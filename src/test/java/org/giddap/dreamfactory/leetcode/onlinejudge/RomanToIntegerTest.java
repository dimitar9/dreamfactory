package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RomanToIntegerImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RomanToIntegerTest {
    private RomanToInteger solution = new RomanToIntegerImpl();

    @Test
    public void small01() {
        assertTrue(25 == solution.romanToInt("XXV"));
    }

    @Test
    public void small02() {
        assertTrue(2307 == solution.romanToInt("MMCCCVII"));
    }

    @Test
    public void small03() {
        assertTrue(1996 == solution.romanToInt("MCMXCVI"));
    }

    @Test
    public void small04() {
        assertTrue(2425 == solution.romanToInt("MMCDXXV"));
    }
}


/*
Test cases
Input	 Output	 Expected
"DCXXI"	621	621
"MCMXCVI"	1996	1996
"MDCCCLXXXIV"	1884	1884
"MCDLXXVI"	1476	1476
"MMCCCXCIX"	2399	2399
"MMCDXXV"	2425	2425
"MDLXX"	1570	1570
"MMMDCCLXV"	3765	3765
"MMCCCVII"	2307	2307
*/
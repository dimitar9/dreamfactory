package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.CandyScanTwiceImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.CandyScanOnceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyTest {
    private Candy solution2 = new CandyScanTwiceImpl();
    private Candy solution = new CandyScanOnceImpl();

    @Test
    public void small01() {
        int[] input = {1, 2, 2};
        assertEquals(4, solution.candy(input));
    }

    @Test
    public void small02() {
        int[] input = {2, 1};
        assertEquals(3, solution.candy(input));
    }

    @Test
    public void small03() {
        int[] input = {1, 1, 1};
        assertEquals(3, solution.candy(input));
    }

    @Test
    public void small04() {
        int[] input = {5,1,1,1,10,2,1,1,1,3};
        assertEquals(15, solution.candy(input));
    }

    @Test
    public void large01() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160};
        assertEquals(12880, solution.candy(input));
    }
}

package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q004MedianofTwoSortedArraysMitAndSophieImpl;
import org.junit.Assert;
import org.junit.Test;

public class Q004MedianofTwoSortedArraysTest {
    private Q004MedianofTwoSortedArrays solution = new Q004MedianofTwoSortedArraysMitAndSophieImpl();

    @Test
    public void small01() {
        int[] a = {5, 25, 35};
        int[] b = {1, 7, 9, 11};

        double median = solution.findMedianSortedArrays(a, b);
        Assert.assertTrue(new Double(9).compareTo(median) == 0);
    }

    @Test
    public void small02() {
        int[] a = {5, 25, 27};
        int[] b = {1, 7, 99};

        double median = solution.findMedianSortedArrays(a, b);
        Assert.assertTrue(new Double(16).compareTo(median) == 0);
    }

    @Test
    public void small03() {
        int[] a = {};
        int[] b = {1};

        double median = solution.findMedianSortedArrays(a, b);
        Assert.assertTrue(new Double(1.0).compareTo(median) == 0);
    }
}

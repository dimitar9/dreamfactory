package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MedianofTwoSortedArraysMergeAndCountImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MedianofTwoSortedArraysBinarySearchOnMedianImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MedianofTwoSortedArraysWithFindKthElementImpl;
import org.junit.Assert;
import org.junit.Test;

public class MedianofTwoSortedArraysTest {
    private MedianofTwoSortedArrays solution = new MedianofTwoSortedArraysBinarySearchOnMedianImpl();
    private MedianofTwoSortedArrays solution2 = new MedianofTwoSortedArraysMergeAndCountImpl();
    private MedianofTwoSortedArrays solution3 = new MedianofTwoSortedArraysWithFindKthElementImpl();

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

    @Test
    public void small04() {
        int[] a = {1};
        int[] b = {1};

        double median = solution.findMedianSortedArrays(a, b);
        Assert.assertTrue(new Double(1.0).compareTo(median) == 0);
    }

    @Test
    public void small05() {
        int[] a = {2, 2, 2};
        int[] b = {2, 2, 2, 2};

        double median = solution.findMedianSortedArrays(a, b);
        Assert.assertTrue(new Double(2.0).compareTo(median) == 0);
    }

    @Test
    public void small06() {
        int[] a = {1};
        int[] b = {2, 3, 4, 5};

        double median = solution.findMedianSortedArrays(a, b);
        Assert.assertTrue(new Double(3.0).compareTo(median) == 0);
    }

    @Test
    public void small07() {
        int[] a = {3};
        int[] b = {1 , 2};

        double median = solution.findMedianSortedArrays(a, b);
        Assert.assertTrue(new Double(2.0).compareTo(median) == 0);
    }

    @Test
    public void small08() {
        int[] a = {};
        int[] b = {1 , 2, 3, 4};

        double median = solution.findMedianSortedArrays(a, b);
        Assert.assertTrue(new Double(2.5).compareTo(median) == 0);
    }
}

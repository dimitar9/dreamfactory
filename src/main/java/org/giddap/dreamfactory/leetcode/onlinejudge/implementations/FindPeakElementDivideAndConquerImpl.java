package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

/**
 * Divide and conquer
 */
public class FindPeakElementDivideAndConquerImpl {
    public int findPeakElement(int[] num) {
        return findPE(num, 0, num.length - 1);
    }

    private int findPE(int[] num, int l, int r) {
        int m = l + (r - l) / 2;

        if ((m == 0 || num[m - 1] < num[m])
                && (m == num.length - 1 || num[m] > num[m + 1])) {
            return m;
        } else if (m > 0 && num[m - 1] > num[m]) {
            return findPE(num, l, m - 1);
        } else {
            return findPE(num, m + 1, r);
        }
    }
}

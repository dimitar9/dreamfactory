package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.FindPeakElement;

/**
 * Created by peng on 12/8/14.
 */
public class FindPeakElementLinearScanImpl implements FindPeakElement {
    @Override
    public int findPeakElement(int[] num) {
        final int len = num.length;
        if (len == 0) {
            return -1;
        }
        if (len == 1 || num[0] > num[1]) {
            return 0;
        }
        if (num[len - 2] < num[len - 1]) {
            return len - 1;
        }
        for (int i = 1; i < len - 1; i++) {
            if (num[i - 1] < num[i] && num[i] > num[i + 1]) {
                return i;
            }
        }
        throw new IllegalStateException("Should not reach here.");
    }
}

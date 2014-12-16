package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.CompareVersionNumbers;

/**
 *
 */
public class CompareVersionNumbersImpl implements CompareVersionNumbers {
    @Override
    public int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        final int len1 = nums1.length;
        final int len2 = nums2.length;
        final int maxLen = Math.max(nums1.length, nums2.length);
        for (int i = 0; i < maxLen; i++) {
            int v1 = (i >= len1) ? 0 : Integer.valueOf(nums1[i]);
            int v2 = (i >= len2) ? 0 : Integer.valueOf(nums2[i]);
            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }
        return 0;
    }
}

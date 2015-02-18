package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LongestConsecutiveSequence;

import java.util.HashMap;
import java.util.Map;

/**
 * Time: O(n); Space: O(n)
 * Leverage Union-Find algorithm.
 */
public class LongestConsecutiveSequenceImpl implements LongestConsecutiveSequence {
    @Override
    public int longestConsecutive(int[] num) {
        Map<Integer, Integer> m = new HashMap<>();
        int lcs = 1;
        for (int n : num) {
            if (!m.containsKey(n)) {
                m.put(n, n);
                // as the ceiling of the union
                if (m.containsKey(n - 1)) {
                    int lower = m.get(n - 1);
                    m.put(lower, n);
                    m.put(n, lower);
                    lcs = Math.max(n - lower + 1, lcs);
                }
                // as the bottom of the union
                if (m.containsKey(n + 1)) {
                    int upper = m.get(n + 1);
                    int lower = m.get(n);
                    m.put(upper, lower);
                    m.put(lower, upper);
                    lcs = Math.max(upper - lower + 1, lcs);
                }
            }
        }
        return lcs;
    }
}

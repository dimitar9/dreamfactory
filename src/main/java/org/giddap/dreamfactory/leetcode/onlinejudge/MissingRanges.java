package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.List;

/**
 * https://oj.leetcode.com/problems/missing-ranges/
 * <p/>
 * Given a sorted integer array where the range of elements are [0, 99] inclusive,
 * return its missing ranges.
 * <p/>
 * For example, given [0, 1, 3, 50, 75], return [“2”, “4->49”, “51->74”, “76->99”]
 */
public interface MissingRanges {
    List<String> findMissingRanges(int[] vals, int start, int end);
}

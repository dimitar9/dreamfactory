package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.Interval;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/insert-interval/">Insert Interval</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * <p/>
 * You may assume that the intervals were initially sorted according to their start times.
 * <p/>
 * <pre>
 * Example 1:
 * Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
 *
 * Example 2:
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
 *
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/234/insert-interval">Leetcode discussion</a>
 */
public interface Q057InsertInterval {
    ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval);
}

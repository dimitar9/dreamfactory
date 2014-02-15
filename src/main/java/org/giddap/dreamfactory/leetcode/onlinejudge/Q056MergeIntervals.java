package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.Interval;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/merge-intervals/">Merge Intervals</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a collection of intervals, merge all overlapping intervals.
 * <p/>
 * <pre>
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/233/merge-intervals">Leetcode discussion</a>
 */
public interface Q056MergeIntervals {
    ArrayList<Interval> merge(ArrayList<Interval> intervals);
}

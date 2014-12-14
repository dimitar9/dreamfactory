package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.InsertInterval;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class InsertIntervalBinarySearchWithoutExtraSpaceImpl implements InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // Binary search the insertion position - index
        int insertPos = binarySearchInsertionPosition(intervals, newInterval);

        Interval tmp = newInterval;
        int i = insertPos;
        while (i < intervals.size()) {
            Interval in = intervals.remove(i);
            if (in.end < tmp.start) {
                intervals.add(i, in);
                i++;
            } else if (tmp.end < in.start) {
                intervals.add(i, in);
                intervals.add(i, tmp);
                return intervals;
            } else {
                tmp = new Interval(Math.min(in.start, tmp.start),
                        Math.max(in.end, tmp.end));
            }
        }
        intervals.add(tmp);
        return intervals;
    }

    private int binarySearchInsertionPosition(List<Interval> intervals, Interval newInterval) {
        int l = -1;
        int h = intervals.size();
        while (h - l > 1) {
            int m = (h + l) / 2;
            if (intervals.get(m).end >= newInterval.start) {
                h = m;
            } else {
                l = m;
            }
        }
        return h;
    }
}

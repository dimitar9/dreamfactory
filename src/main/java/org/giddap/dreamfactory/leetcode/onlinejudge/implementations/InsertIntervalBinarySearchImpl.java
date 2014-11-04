package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.InsertInterval;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class InsertIntervalBinarySearchImpl implements InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> ret = new ArrayList<Interval>();

        // Binary search the insertion position - index
        int insertPos = binarySearchInsertionPosition(intervals, newInterval);

        // Add the prefix to the result as it is
        int i = 0;
        while (i < insertPos) {
            ret.add(new Interval(intervals.get(i).start, intervals.get(i).end));
            i++;
        }

        if (ret.isEmpty()) {
            ret.add(newInterval);
        }

        // Merge the rest
        i--;
        Interval curr = newInterval;
        do {

            Interval last = ret.get(ret.size() - 1);
            if (curr.start > last.end) {
                ret.add(curr);
            } else {
                ret.remove(ret.size() - 1);
                ret.add(new Interval(last.start, Math.max(curr.end, last.end)));
            }
            i++;
            curr = intervals.get(i);
        } while (i < intervals.size());

        return ret;
    }

    private int binarySearchInsertionPosition(List<Interval> intervals, Interval newInterval) {
        int l = -1;
        int h = intervals.size();
        while (h - l > 1) {
            int m = (h + l) / 2;
            if (intervals.get(m).start > newInterval.start) {
                h = m;
            } else {
                l = m;
            }
        }
        return l + 1;
    }
}

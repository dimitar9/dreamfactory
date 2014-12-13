package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.InsertInterval;

import java.util.List;

/**
 *
 */
public class InsertIntervalWithoutExtraSpaceImpl implements InsertInterval {
    @Override
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        Interval tmp = newInterval;
        int i = 0;
        while (i < intervals.size()) {
            Interval curr = intervals.remove(i);
            if (tmp.end < curr.start) {
                intervals.add(i, curr);
                intervals.add(i, tmp);
                return intervals;
            } else if (curr.end < tmp.start) {
                intervals.add(i, curr);
                i++;
            } else {
                tmp = new Interval(Math.min(tmp.start, curr.start),
                        Math.max(tmp.end, curr.end));
            }
        }

        intervals.add(tmp);
        return intervals;
    }
}

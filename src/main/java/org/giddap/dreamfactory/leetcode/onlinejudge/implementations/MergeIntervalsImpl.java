package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervalsImpl implements MergeIntervals {
    @Override
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ret = new ArrayList<Interval>();
        final int n = intervals.size();
        if (n == 0) {
            return ret;
        }

        Comparator<Interval> comp = new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        };

        Collections.sort(intervals, comp);

        ret.add(intervals.get(0));
        for (int i = 1; i < n; i++) {
            Interval last = ret.get(ret.size() - 1);
            Interval cur = intervals.get(i);

            if (last.end < cur.start) {
                ret.add(cur);
            } else {
                Interval one = new Interval(last.start, Math.max(last.end, cur.end));
                ret.remove(ret.size() - 1);
                ret.add(one);
            }
        }
        return ret;
    }
}
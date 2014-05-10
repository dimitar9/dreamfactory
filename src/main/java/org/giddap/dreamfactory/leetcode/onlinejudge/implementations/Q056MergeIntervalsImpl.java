package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q056MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q056MergeIntervalsImpl implements Q056MergeIntervals {
    @Override
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function

        final int len = intervals.size();
        if (len == 0) {
            return intervals;
        }

        Comparator<Interval> comp = new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        };

        Collections.sort(intervals, comp);

        ArrayList<Interval> ret = new ArrayList<Interval>();
        ret.add(intervals.get(0));
        for (int i = 1; i < len; i++) {
            Interval curr = intervals.get(i);
            Interval prev = ret.get(ret.size() - 1);

            if (prev.end < curr.start) {
                ret.add(curr);
            } else {
                ret.remove(ret.size() - 1);
                ret.add(new Interval(prev.start, Math.max(prev.end, curr.end)));
            }
        }
        return ret;
    }
}
package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q057InsertInterval;

import java.util.ArrayList;


public class Q057InsertIntervalTwoPassImpl implements Q057InsertInterval {
    @Override
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> ret = new ArrayList<Interval>();

        int i = 0;
        while (i < intervals.size() && (intervals.get(i).start < newInterval.start)) {
            i++;
        }
        intervals.add(i, newInterval);

        ret.add(intervals.get(0));
        for (int j = 1; j < intervals.size(); j++) {
            Interval curr = intervals.get(j);
            Interval lastMerged = ret.get(ret.size() - 1);

            if (curr.start <= lastMerged.end) {
                ret.remove(ret.size() - 1);
                ret.add(new Interval(lastMerged.start, Math.max(lastMerged.end, curr.end)));
            } else {
                ret.add(curr);
            }
        }

        return ret;
    }

}

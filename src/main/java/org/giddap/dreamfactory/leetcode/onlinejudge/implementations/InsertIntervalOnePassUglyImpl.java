package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.InsertInterval;

import java.util.ArrayList;

/**
 *
 */
public class InsertIntervalOnePassUglyImpl implements InsertInterval {
    @Override
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> ret = new ArrayList<Interval>();
        ret.add(newInterval);

        for (Interval curr : intervals) {
            Interval last = ret.get(ret.size() - 1);
            if (last.start < curr.start) {
                if (last.end >= curr.start) {
                    Interval newOne = new Interval(last.start, Math.max(last.end, curr.end));
                    ret.remove(ret.size() - 1);
                    ret.add(newOne);
                } else {
                    ret.add(curr);
                }
            } else { // last.start >= curr.start
                if (curr.end >= last.start) {
                    Interval newOne = new Interval(curr.start, Math.max(last.end, curr.end));
                    ret.remove(ret.size() - 1);
                    ret.add(newOne);
                } else {
                    ret.add(ret.size() - 1, curr);
                }
            }
        }

        return ret;
    }
}

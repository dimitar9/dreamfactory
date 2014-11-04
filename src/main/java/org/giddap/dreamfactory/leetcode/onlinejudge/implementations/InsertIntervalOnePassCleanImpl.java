package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.InsertInterval;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervalOnePassCleanImpl implements InsertInterval {
    @Override
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        Interval temp = newInterval;
        List<Interval> lst = new ArrayList<Interval>();

        for (Interval i : intervals) {
            if (i.end < temp.start) {
                lst.add(i);
            } else if (i.start > temp.end) {
                lst.add(temp);
                temp = i;
            } else {
                temp = new Interval(Math.min(temp.start, i.start), Math.max(temp.end, i.end));
            }
        }

        lst.add(temp);

        return lst;
    }
}

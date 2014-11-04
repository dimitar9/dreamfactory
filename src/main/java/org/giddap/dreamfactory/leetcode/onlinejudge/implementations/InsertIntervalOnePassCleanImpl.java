package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.InsertInterval;

import java.util.ArrayList;

public class InsertIntervalOnePassCleanImpl implements InsertInterval {
    @Override
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function

        Interval temp = newInterval;
        ArrayList<Interval> lst = new ArrayList<Interval>();

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

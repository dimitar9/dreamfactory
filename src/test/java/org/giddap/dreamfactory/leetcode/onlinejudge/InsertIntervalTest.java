package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.Interval;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.InsertIntervalTwoPassImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.InsertIntervalWithoutExtraSpaceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InsertIntervalTest {
    private InsertInterval solution2 = new InsertIntervalTwoPassImpl();
    private InsertInterval solution = new InsertIntervalWithoutExtraSpaceImpl();

    @Test
    public void small01() {
        // [[0,2],[3,5],[6,8],[10,12],[13,15]], [4,7]
        Interval i1 = new Interval(0, 2);
        Interval i2 = new Interval(3, 5);
        Interval i3 = new Interval(6, 8);
        Interval i4 = new Interval(10, 12);
        Interval i5 = new Interval(13, 15);
        ArrayList<Interval> list = new ArrayList<Interval>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);

        Interval i6 = new Interval(4, 7);

        List<Interval> actual = solution.insert(list, i6);

        assertTrue(actual.size() == 4);
        Interval tmp = actual.get(0);
        assertEquals(0, tmp.start);
        assertEquals(2, tmp.end);

        tmp = actual.get(1);
        assertEquals(3, tmp.start);
        assertEquals(8, tmp.end);

        tmp = actual.get(2);
        assertEquals(10, tmp.start);
        assertEquals(12, tmp.end);

        tmp = actual.get(3);
        assertEquals(13, tmp.start);
        assertEquals(15, tmp.end);
    }
}

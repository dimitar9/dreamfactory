package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q118PascalsTriangleImpl;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Q118PascalsTriangleTest {
    private Q118PascalsTriangle solution = new Q118PascalsTriangleImpl();

    @Test
    public void small01() {
        ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
        expected.add(Lists.newArrayList(1));

        assertEquals(expected, solution.generate(1));
    }

    @Test
    public void small02() {
        ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();

        assertEquals(expected, solution.generate(0));
    }

    @Test
    public void small03() {
        ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
        expected.add(Lists.newArrayList(1));
        expected.add(Lists.newArrayList(1, 1));

        assertEquals(expected, solution.generate(2));
    }

    @Test
    public void small04() {
        ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
        expected.add(Lists.newArrayList(1));
        expected.add(Lists.newArrayList(1, 1));
        expected.add(Lists.newArrayList(1, 2, 1));

        assertEquals(expected, solution.generate(3));
    }

    @Test
    public void small05() {
        ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
        expected.add(Lists.newArrayList(1));
        expected.add(Lists.newArrayList(1, 1));
        expected.add(Lists.newArrayList(1, 2, 1));
        expected.add(Lists.newArrayList(1, 3, 3, 1));

        assertEquals(expected, solution.generate(4));
    }

    @Test
    public void small06() {
        ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
        expected.add(Lists.newArrayList(1));
        expected.add(Lists.newArrayList(1, 1));
        expected.add(Lists.newArrayList(1, 2, 1));
        expected.add(Lists.newArrayList(1, 3, 3, 1));
        expected.add(Lists.newArrayList(1, 4, 6, 4, 1));

        assertEquals(expected, solution.generate(5));
    }
}

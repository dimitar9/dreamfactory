package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.TriangleImpl;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    private Triangle solution = new TriangleImpl();

    @Test
    public void small01() {
        ArrayList<ArrayList<Integer>> input = Lists.newArrayList();
        input.add(Lists.newArrayList(1));
        input.add(Lists.newArrayList(2, 3));

        assertEquals(3, solution.minimumTotal(input));
    }

    @Test
    public void small02() {
        ArrayList<ArrayList<Integer>> input = Lists.newArrayList();
        input.add(Lists.newArrayList(-10));

        assertEquals(-10, solution.minimumTotal(input));
    }

    @Test
    public void small03() {
        ArrayList<ArrayList<Integer>> input = Lists.newArrayList();
        input.add(Lists.newArrayList(-1));
        input.add(Lists.newArrayList(-2, -3));
        assertEquals(-4, solution.minimumTotal(input));
    }

    //[[-1],[2,3],[1,-1,-3]]
    @Test
    public void small04() {
        ArrayList<Integer> line1 = Lists.newArrayList(-1);
        ArrayList<Integer> line2 = Lists.newArrayList(2, 3);
        ArrayList<Integer> line3 = Lists.newArrayList(1, -1, -3);

        ArrayList<ArrayList<Integer>> input = Lists.newArrayList();
        input.add(line1);
        input.add(line2);
        input.add(line3);

        assertEquals(-1, solution.minimumTotal(input));
    }
}


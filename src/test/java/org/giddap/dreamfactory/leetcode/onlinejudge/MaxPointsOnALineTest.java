package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.Point;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MaxPointsOnALineImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxPointsOnALineTest {
    private MaxPointsOnALine solution = new MaxPointsOnALineImpl();

    @Test
    public void small01() {
        Point[] points = new Point[]{
                new Point(0, 0), new Point(1, 1), new Point(1, -1)};
        assertEquals(2, solution.maxPoints(points));
    }

    @Test
    public void small02() {
        Point[] points = new Point[]{
                new Point(0, 0), new Point(0, 0)};
        assertEquals(2, solution.maxPoints(points));
    }

    @Test
    public void small03() {
        Point[] points = new Point[]{
                new Point(0, 0), new Point(1, 1), new Point(0, 0)};
        assertEquals(3, solution.maxPoints(points));
    }

    @Test
    public void small04() {
        Point[] points = new Point[]{new Point(0, 0)};
        assertEquals(1, solution.maxPoints(points));
    }

    @Test
    public void small05() {
        Point[] points = new Point[]{
                new Point(1, 1), new Point(1, 1), new Point(2, 3)};
        assertEquals(3, solution.maxPoints(points));
    }
}

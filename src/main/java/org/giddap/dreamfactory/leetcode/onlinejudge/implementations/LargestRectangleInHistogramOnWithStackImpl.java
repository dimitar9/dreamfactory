package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LargestRectangleInHistogram;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogramOnWithStackImpl implements LargestRectangleInHistogram {
    @Override
    public int largestRectangleArea(int[] height) {
        final int len = height.length;
        Deque<Integer> p = new ArrayDeque<>();
        int i = 0, m = 0;
        while (i < height.length) {
            if (p.isEmpty() || height[p.peek()] <= height[i])
                p.push(i++);
            else if (height[p.peek()] > height[i]) {
                m = Math.max(m, height[p.pop()] * (p.isEmpty() ? i : i - p.peek() - 1));
            } else {
                i++;
            }
        }
        while (!p.isEmpty()) {
            m = Math.max(m, height[p.pop()] * (p.isEmpty() ? len : len - p.peek() - 1));
        }
        return m;
    }
}

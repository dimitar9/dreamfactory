package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LargestRectangleInHistogram;

import java.util.Stack;

public class LargestRectangleInHistogramOnWithStackImpl implements LargestRectangleInHistogram {
    @Override
    public int largestRectangleArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = height.length;

        Stack<Integer> p = new Stack<Integer>();
        int i = 0, m = 0;
        while (i < height.length) {
            if (p.isEmpty() || height[p.peek()] <= height[i])
                p.push(i++);
            else {
                m = Math.max(m, height[p.pop()] * (p.empty() ? i : i - p.peek() - 1));
            }
        }
        while (!p.empty()) {
            m = Math.max(m, height[p.pop()] * (p.empty() ? len : len - p.peek() - 1));
        }

        return m;
    }
}

package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MaximalRectangle;

import java.util.Stack;

public class MaximalRectangleOptimalImpl implements MaximalRectangle {
    @Override
    public int maximalRectangle(char[][] matrix) {
        final int numOfRows = matrix.length;
        if (numOfRows == 0) {
            return 0;
        }
        final int numOfCols = matrix[0].length;
        if (numOfCols == 0) {
            return 0;
        }

        int[] cache = new int[numOfRows];
        int maxRectangle = 0;
        for (int i = numOfCols - 1; i >= 0; i--) {
            calculateOnes(matrix, cache, i);
            maxRectangle = Math.max(maxRectangle, calculateMaxArea(cache));
        }
        return maxRectangle;
    }

    private void calculateOnes(char[][] matrix, int[] cache, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] == '1') {
                if (col < matrix[0].length - 1) {
                    cache[i] += 1;
                } else {
                    cache[i] = 1;
                }
            } else {
                cache[i] = 0;
            }
        }
    }

    private int calculateMaxArea(int[] cache) {
        final int len = cache.length;
        Stack<Integer> stack = new Stack<Integer>();
        int maxArea = 0;
        int i = 0;
        while (i < len) {
            if (stack.isEmpty() || cache[stack.peek()] <= cache[i]) {
                stack.push(i);
                i++;
            } else {
                int area = cache[stack.pop()] * (stack.isEmpty() ? i : (i - stack.peek() - 1));
                maxArea = Math.max(maxArea, area);
            }
        }
        while (!stack.isEmpty()) {
            int area = cache[stack.pop()] * (stack.isEmpty() ? len : (len - stack.peek() - 1));
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}

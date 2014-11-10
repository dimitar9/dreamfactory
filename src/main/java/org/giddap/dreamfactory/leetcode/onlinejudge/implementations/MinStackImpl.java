package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MinStack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 */
public class MinStackImpl implements MinStack {
    private Deque<IntergerAndMin> nums = new ArrayDeque<IntergerAndMin>();

    public void push(int x) {
        if (nums.size() > 0) {
            nums.offerFirst(new IntergerAndMin(x, Math.min(x, nums.peekFirst().min)));
        } else {
            nums.offerFirst(new IntergerAndMin(x, x));
        }
    }

    public void pop() {
        verifyNotEmpty();
        nums.pollFirst();
    }

    public int top() {
        verifyNotEmpty();
        return nums.peekFirst().num;
    }

    public int getMin() {
        verifyNotEmpty();
        return nums.peekFirst().min;
    }

    private void verifyNotEmpty() {
        if (nums.size() == 0) {
            throw new IllegalStateException("stack is empty.");
        }
    }

    public static class IntergerAndMin {
        int num;
        int min;
        public IntergerAndMin(final int num, final int min) {
            this.num = num;
            this.min = min;
        }
    }
}

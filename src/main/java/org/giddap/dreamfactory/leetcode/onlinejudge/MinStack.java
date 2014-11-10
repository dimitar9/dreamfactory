package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * https://oj.leetcode.com/problems/min-stack/
 */
public interface MinStack {
    void push(int x);

    void pop();

    int top();

    int getMin();
}

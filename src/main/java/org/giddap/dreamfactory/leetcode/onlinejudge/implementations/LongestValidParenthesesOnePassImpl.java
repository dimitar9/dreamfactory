package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LongestValidParentheses;

import java.util.Stack;

/**
 * Use a stack to keep track of the positions of non-matching '('s.
 * Also need to keep track of the position of the last ')'.
 */
public class LongestValidParenthesesOnePassImpl implements LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int lvp = 0;
        int last = -1;
        Stack<Integer> lefts = new Stack<Integer>();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                lefts.push(i);
            } else {
                if (lefts.isEmpty()) {
                    // no matching left
                    last = i;
                } else {
                    // find a matching pair
                    lefts.pop();
                    if (lefts.isEmpty()) {
                        lvp = Math.max(lvp, i - last);
                    } else {
                        lvp = Math.max(lvp, i - lefts.peek());
                    }
                }
            }
        }
        return lvp;
    }
}

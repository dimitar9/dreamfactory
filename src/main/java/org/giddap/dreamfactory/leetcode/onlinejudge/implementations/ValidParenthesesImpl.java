package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ValidParentheses;

import java.util.*;

public class ValidParenthesesImpl implements ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (pairs.containsKey(c)) {
                if (!stack.isEmpty()) {
                    if (pairs.get(c) != stack.pollFirst()) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                stack.addFirst(c);
            }
        }
        return stack.isEmpty();
    }
}

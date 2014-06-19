package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q020ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q020ValidParenthesesImpl implements Q020ValidParentheses {
    private Map<Character, Character> pairs;

    public boolean isValid(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        init();
        Stack<Character> pending = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (pairs.containsKey(chars[i])) {
                if (pending.isEmpty()) {
                    return false;
                } else {
                    if (pairs.get(chars[i]) != pending.pop()) {
                        return false;
                    }
                }
            } else {
                pending.push(chars[i]);
            }
        }
        return pending.isEmpty();
    }

    private void init() {
        pairs = new HashMap<Character, Character>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');
    }
}

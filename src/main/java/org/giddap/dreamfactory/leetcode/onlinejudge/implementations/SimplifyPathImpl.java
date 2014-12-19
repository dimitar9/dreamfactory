package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SimplifyPath;

import java.util.ArrayDeque;
import java.util.Deque;


public class SimplifyPathImpl implements SimplifyPath {
    @Override
    public String simplifyPath(String path) {
        String[] segments = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String s : segments) {
            if (s.equals(".") || s.equals("")) {
                continue;
            } else if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pollFirst();
                } else {
                    continue;
                }
            } else {
                stack.offerFirst(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, "/");
            sb.insert(1, stack.poll());
        }
        return sb.length() != 0 ? sb.toString() : "/";
    }
}

package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreakII;

import java.util.*;

/**
 * Time-Limit Exceeded
 */
public class WordBreakIIDfsImpl implements WordBreakII {
    @Override
    public List<String> wordBreak(String s, Set<String> dict) {
        List<String> r = new ArrayList<>();
        helper(r, new ArrayList<>(), s, dict);
        return r;
    }

    private void helper(
            List<String> r, List<String> c, String suffix, Set<String> dict) {
        if (suffix.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            if (c.size() > 0) {
                sb.append(c.get(0));
            }
            for (int i = 1; i < c.size(); i++) {
                sb.append(" ");
                sb.append(c.get(i));
            }
            r.add(sb.toString());
        } else {
            for (int i = 1; i <= suffix.length(); i++) {
                String ss = suffix.substring(0, i);
                if (dict.contains(ss)) {
                    c.add(ss);
                    helper(r, c, suffix.substring(i), dict);
                    c.remove(c.size() - 1);
                }
            }
        }
    }
}

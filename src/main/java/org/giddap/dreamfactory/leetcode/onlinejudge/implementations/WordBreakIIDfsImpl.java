package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreakII;

import java.util.*;

/**
 *
 */
public class WordBreakIIDfsImpl implements WordBreakII {
    Map<String, List<String>> memo = new HashMap<>();

    @Override
    public List<String> wordBreak(String s, Set<String> dict) {
        List<String> ret = new ArrayList<String>();

        for (int i = 1; i <= s.length(); i++) {
            String front = s.substring(0, i);
            String back = s.substring(i);
            if (dict.contains(front)) {
                List<String> backAll = null;
                if (memo.containsKey(back)) {
                    backAll = memo.get(back);
                } else {
                    backAll = wordBreak(back, dict);
                    memo.put(back, backAll);
                }
                if (backAll.isEmpty()) {
                    ret.add(front);
                } else {
                    for (String one : backAll) {
                        ret.add(front + " " + one);
                    }
                }
            }
        }

        return ret;
    }
}

package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreakII;

import java.util.*;

/**
 *
 */
public class WordBreakIIDfsImpl implements WordBreakII {
    @Override
    public List<String> wordBreak(String s, Set<String> dict) {
        List<String> ret = new ArrayList<String>();
        breakIt(ret, "", s, dict);
        return ret;
    }

    private void breakIt(List<String> ret, String curr, String remaining, Set<String> dict) {
        if (remaining.length() == 0) {
            ret.add(curr);
        } else {
            for (int i = 1; i <= remaining.length(); i++) {
                String front = remaining.substring(0, i);
                String back = remaining.substring(i);
                if (dict.contains(front)) {
                    breakIt(ret, curr.length() == 0 ? front : curr + " " + front, remaining.substring(i), dict);
                }
            }
        }
    }
}

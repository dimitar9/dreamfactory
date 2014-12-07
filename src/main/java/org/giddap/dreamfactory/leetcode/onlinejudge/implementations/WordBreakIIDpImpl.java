package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreakII;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class WordBreakIIDpImpl implements WordBreakII {
    @Override
    public List<String> wordBreak(String s, Set<String> dict) {

        List<String> ret = new ArrayList<>();
        final int len = s.length();
        if (len == 0) {
            return ret;
        }

        // initialize the memo and the storeage for lists of broken words
        List<List<String>> words = new ArrayList<List<String>>();
        boolean[] memo = new boolean[len + 1];
        memo[0] = true;
        List<String> tmp = new ArrayList<>();
        tmp.add("");
        words.add(tmp);

        for (int i = 1; i <= len; i++) {
            List<String> iWords = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                String w = s.substring(j, i);
                if (memo[j] && dict.contains(w)) {
                    for (String prev : words.get(j)) {
                        if (prev.length() != 0) {
                            iWords.add(prev + " " + w);
                        } else {
                            iWords.add(w);
                        }
                    }
                    memo[i] = true;
                }
            }
            words.add(iWords);
        }

        return words.get(words.size() - 1);
    }
}

package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreakII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 */
public class WordBreakIIImpl implements WordBreakII {
    @Override
    public ArrayList<String> wordBreak(String s, Set<String> dict) {
        boolean[] memo = new boolean[s.length() + 1];
        Map<Integer, List<Integer>> idxMap = new HashMap<Integer, List<Integer>>();
        memo[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (memo[j] && dict.contains(s.substring(j, i + 1))) {
                    memo[i + 1] = true;
                    if (idxMap.containsKey(i + 1)) {
                        idxMap.get(i + 1).add(j);
                    } else {
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(j);
                        idxMap.put(i + 1, tmp);
                    }
                }
            }
        }
        ArrayList<String> ret = new ArrayList<String>();
        if (!memo[memo.length - 1]) {
            return ret;
        }

        Queue<Integer> frontier = new LinkedList<Integer>();
        frontier.offer(s.length());
        while (!frontier.isEmpty()) {
            List<Integer> words = idxMap.get(frontier.poll());

        }
        return ret;
    }


}

package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q127WordLadder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class Q127WordLadderImpl implements Q127WordLadder {
    @Override
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function

        Queue<String> curr = new LinkedList<String>();
        curr.offer(start);

        Queue<String> next = new LinkedList<String>();

        Set<String> visited = new HashSet<String>();
        visited.add(start);

        int len = 1;
        while (!curr.isEmpty()) {
            String word = curr.poll();

            StringBuilder tmp = new StringBuilder(word);
            for (int i = 0; i < word.length(); i++) {
                for (char j = 'a'; j <= 'z'; j++) {
                    if (word.charAt(i) == j) {
                        continue;
                    }
                    tmp.setCharAt(i, j);
                    String newWord = tmp.toString();
                    if (newWord.equals(end)) {
                        return len + 1;
                    }

                    if (!visited.contains(newWord) && dict.contains(newWord)) {
                        next.offer(newWord);
                        visited.add(newWord);
                    }
                    tmp.setCharAt(i, word.charAt(i));
                }
            }

            if (curr.isEmpty()) {
                curr = next;
                next = new LinkedList<String>();
                len++;
            }
        }

        return 0;
    }
}

package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordLadder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * BFS is typically more efficient in finding depth as the program terminates
 * at the first leaf node.
 * <p/>
 * Another thing to note is that we shall leverage the fact that the alphabet
 * contains only 26 characters. Instead of iterating through the dict,
 * which might be huge, we could just change the word one char at a time to
 * get all possible transformations and use that to query the dict for better
 * performance.
 */
public class WordLadderBfsImpl implements WordLadder {
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

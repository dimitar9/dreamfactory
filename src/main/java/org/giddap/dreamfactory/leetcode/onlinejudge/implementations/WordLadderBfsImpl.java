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
    public int ladderLength(String start, String end, Set<String> dict) {
        Queue<String> explore = new LinkedList<>();
        explore.offer(start);
        Set<String> visited = new HashSet<>();
        visited.add(start);
        int numOfLadders = 1;
        int numOfNodesAtEachLevel = 1;
        while(!explore.isEmpty()) {
            String curr = explore.poll();
            numOfNodesAtEachLevel--;
            for (int i = 0; i < curr.length(); i++) {
                char[] chars = curr.toCharArray();
                char c = chars[i];
                for (char d = 'a'; d <= 'z'; d++) {
                    if (c == d) {
                        continue;
                    }
                    chars[i] = d;
                    String one = new String(chars);
                    if (one.equals(end)) {
                        return ++numOfLadders;
                    } else if (dict.contains(one) && !visited.contains(one)) {
                        visited.add(one);
                        explore.offer(one);
                    }
                }
            }
            if (numOfNodesAtEachLevel == 0) {
                numOfLadders++;
                numOfNodesAtEachLevel = explore.size();
            }
        }
        return 0;
    }
}

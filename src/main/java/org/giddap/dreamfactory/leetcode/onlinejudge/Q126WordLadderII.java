package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * <a href="http://leetcode.com/onlinejudge#question_126">Q126 Word Ladder II</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given two words (start and end), and a dictionary, find all shortest transformation sequence(s) from start to end,
 * such that:
 * <p/>
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the dictionary
 * For example,
 * <p/>
 * Given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * <p/>
 * Return
 * <p/>
 * [
 * ["hit","hot","dot","dog","cog"],
 * ["hit","hot","lot","log","cog"]
 * ]
 * Note:
 * <p/>
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/1051/word-ladder-ii">Leetcode discussion</a>
 */
public class Q126WordLadderII {
    public ArrayList<ArrayList<String>> findLadders(String start, String end, HashSet<String> dict) {
        ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
        ArrayList<String> one = new ArrayList<String>();
        one.add(start);
        ret.add(one);

        if (start.equals(end)) {
            ret.get(0).add(end);
            return ret;
        }

        Queue<String> frontier = new LinkedList<String>();
        frontier.offer(start);
        int numOfNodesOnSameLevel = 1;

//        Map<String, String> visited = new HashSet<String>();
//        visited.add(start);
//
//        int ladderLength = 1;
//        while(!frontier.isEmpty()) {
//            String curr = frontier.poll();
//            numOfNodesOnSameLevel--;
//
//            StringBuilder tmp = new StringBuilder(curr);
//            for (int i = 0; i < curr.length(); i++) {
//                for (char j = 'a'; j <= 'z'; j++) {
//                    if (curr.charAt(i) == j) {
//                        continue;
//                    }
//                    tmp.setCharAt(i, j);
//                    String newWord = tmp.toString();
//                    if (newWord.toString().equals(end)) {
//                        ret
//
//                        return ladderLength + 1;
//                    } else if (!visited.contains(newWord.toString()) && dict.contains(newWord.toString())) {
//                        frontier.add(newWord.toString());
//                        visited.add(newWord.toString());
//                    }
//                    tmp.setCharAt(i, curr.charAt(i));
//                }
//            }

//            if (numOfNodesOnSameLevel == 0) {
//                numOfNodesOnSameLevel = frontier.size();
//                ladderLength++;
//            }
//        }
        return new ArrayList<ArrayList<String>>();
    }

    // backtrack to reconstruct the path from start -> end.
    private ArrayList<ArrayList<String>> constructPath(Map<String, List<String>> paths, String s, String start, int depth) {
        ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
        if (depth > 0 && s.equals(start)) {
            ArrayList<String> one = new ArrayList<String>();
            one.add(s);
            ret.add(one);
            return ret;
        }

        for (Map.Entry<String, List<String>> entry : paths.entrySet()) {

        }
//                ) {
//            vector<vector<string>> temp = print(map, it.first->second, start,
//                    depth+1);
//            for (int i = 0; i < temp.size(); i++) {
//                temp[i].push_back(s);
//            }
//            ret.insert(ret.end(), temp.begin(), temp.end());
//        }
        return ret;
    }
}


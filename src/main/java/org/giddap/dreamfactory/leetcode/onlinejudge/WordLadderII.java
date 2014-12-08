package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * <a href="https://oj.leetcode.com/problems/word-ladder-ii/">Word Ladder II</a>
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
public interface WordLadderII {
    ArrayList<ArrayList<String>> findLadders(String start, String end, HashSet<String> dict);
}

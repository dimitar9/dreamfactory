package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.Set;

/**
 * <a href="http://oj.leetcode.com/problems/word-ladder/">Word Ladder</a>
 * <p/>
 * Given two words (start and end), and a dictionary, find the length of
 * shortest transformation sequence from start to end, such that:
 * <p/>
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the dictionary
 * <pre>
 * For example,
 *
 * Given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 *
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * </pre>
 * <p/>
 * Note:
 * <p/>
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 */
public interface WordLadder {
    int ladderLength(String start, String end, Set<String> dict);
}

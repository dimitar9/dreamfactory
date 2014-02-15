package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.HashSet;

/**
 * <a href="http://oj.leetcode.com/problems/word-ladder/">Word Ladder</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start
 * to end, such that:
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
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/1108/word-ladder">Leetcode discussion</a>
 * @see <a href="http://blog.sina.com.cn/s/blog_b9285de20101j1xl.html">A Blog from peking2</a>
 * @see <a href="http://www.mitbbs.com/article_t/JobHunting/32325007.html">mitbbs discussion</a>
 */
public interface Q127WordLadder {
    int ladderLength(String start, String end, HashSet<String> dict);
}

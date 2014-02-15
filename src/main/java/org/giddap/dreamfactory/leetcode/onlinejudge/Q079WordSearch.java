package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/word-search/">Word Search</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p/>
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 * <p/>
 * <pre>
 * For example,
 * Given board =
 *
 * [
 *      ["ABCE"],
 *      ["SFCS"],
 *      ["ADEE"]
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/254/word-search">Leetcode discussion</a>
 */
public interface Q079WordSearch {
    boolean exist(char[][] board, String word);
}

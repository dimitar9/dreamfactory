package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://leetcode.com/onlinejudge#question_87">Q087 Scramble String</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
 * <p/>
 * Below is one possible representation of s1 = "great":
 * <p/>
 * <pre>
 *       great
 *      /    \
 *     gr    eat
 *    / \    / \
 *   g   r  e   at
 *              / \
 *             a   t
 * </pre>
 * To scramble the string, we may choose any non-leaf node and swap its two children.
 * <p/>
 * For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat".
 * <p/>
 * <pre>
 *       rgeat
 *       /   \
 *     rg    eat
 *    / \    /  \
 *   r   g  e   at
 *             / \
 *            a   t
 * </pre>
 * We say that "rgeat" is a scrambled string of "great".
 * <p/>
 * Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae".
 * <p/>
 * <pre>
 *       rgtae
 *       /    \
 *      rg    tae
 *     / \    /  \
 *    r   g  ta   e
 *           / \
 *          t   a
 * </pre>
 * We say that "rgtae" is a scrambled string of "great".
 * <p/>
 * Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/262/scramble-string">Leetcode discussion</a>
 * @see <a href="http://blog.sina.com.cn/s/blog_b9285de20101gy6n.html">A blog from Peking2</a>
 */
public interface Q087ScrambleString {
    boolean isScramble(String s1, String s2);
}

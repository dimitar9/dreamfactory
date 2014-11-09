package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="https://oj.leetcode.com/problems/longest-valid-parentheses/">
 *     Longest Valid Parentheses</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 * <p/>
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * <p/>
 * Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 * <p/>
 *
 * @see <a href="http://coding-exercise.blogspot.com/2013/03/leetcode-longest-valid-parentheses.html">Coding Exercise</a>
 * @see <a href="http://discuss.leetcode.com/questions/212/longest-valid-parentheses">LeetCode discussion</a>
 * @see <a href="http://yucoding.blogspot.com/2013/01/leetcode-question-46-longest-valid.html">Yu's Coding</a>
 *      http://jane4532.blogspot.com/2013/07/longest-valid-parenthesisleetcode.html
 * @see <a href="http://www.mitbbs.com/article_t/JobHunting/32066231.html">mitbbs discussion</a>
 */
public interface LongestValidParentheses {
    int longestValidParentheses(String s);
}

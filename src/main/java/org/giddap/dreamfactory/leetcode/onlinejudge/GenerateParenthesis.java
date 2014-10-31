package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.List;

/**
 * <a href="http://oj.leetcode.com/problems/generate-parentheses/">Generate Parentheses</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p/>
 * <pre>
 * For example, given n = 3, a solution set is:
 *
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/203/generate-parentheses">Leetcode discussion</a>
 */
public interface GenerateParenthesis {
    List<String> generateParenthesis(int n);
}

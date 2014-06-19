package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/valid-number/">Valid Number</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Validate if a given string is numeric.
 * <p/>
 * Some examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * <p/>
 * Note: It is intended for the problem statement to be ambiguous.
 * You should gather all requirements up front before implementing one.
 * <p/>
 * Regular expression: [-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/241/valid-number">Leetcode discussion</a>
 * @see <a href="http://www.mitbbs.com/article_t/JobHunting/32300249.html">Mitbbs discussion</a>
 * @see <a href="http://dl.dropboxusercontent.com/u/19732851/LeetCode/ValidNumber.html">A clean solution</a>
 */
public interface Q065ValidNumber {
    boolean isNumber(String s);
}

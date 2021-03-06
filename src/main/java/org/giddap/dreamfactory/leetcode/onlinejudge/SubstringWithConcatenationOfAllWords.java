package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.List;

/**
 * <a href="https://oj.leetcode.com/problems/substring-with-concatenation-of-all-words/">Substring With Concatenation Of All Words</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * You are given a string, S, and a list of words, L, that are all of the same length. Find all starting indices
 * of substring(s) in S that is a concatenation of each word in L exactly once and without any intervening characters.
 * <p/>
 * <pre>
 * For example, given:
 * S: "barfoothefoobarman"
 * L: ["foo", "bar"]
 *
 * You should return the indices: [0,9].
 * (order does not matter).
 * </pre>
 * <p/>
 * http://n00tc0d3r.blogspot.com/2013/06/substring-with-concatenation-of-all.html
 * http://blog.csdn.net/fightforyourdream/article/details/14165397
 *
 * @see <a href="http://blog.unieagle.net/2012/10/28/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Asubstring-with-concatenation-of-all-words/">A blog from UniEagle</a>
 * @see <a href="http://gongxuns.blogspot.com/2012/12/leetcode-substring-with-concatenation.html">A blog from gongxun</a>
 */
public interface SubstringWithConcatenationOfAllWords {
    List<Integer> findSubstring(String S, String[] L);
}

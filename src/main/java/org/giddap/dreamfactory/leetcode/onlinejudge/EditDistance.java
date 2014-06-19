package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/edit-distance/
 * <p/>
 * Given two words word1 and word2, find the minimum number of steps required
 * to convert word1 to word2. (each operation is counted as 1 step.)
 * <p/>
 * You have the following 3 operations permitted on a word:
 * <p/>
 * a) Insert a character
 * b) Delete a character
 * c) Replace a character
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/248/edit-distance
 * http://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
 * http://blog.unieagle.net/2012/09/19/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Aedit-distance%EF%BC%8C%E5%AD%97%E7%AC%A6%E4%B8%B2%E4%B9%8B%E9%97%B4%E7%9A%84%E7%BC%96%E8%BE%91%E8%B7%9D%E7%A6%BB%EF%BC%8C%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/
 */
public interface EditDistance {
    int minDistance(String word1, String word2);
}

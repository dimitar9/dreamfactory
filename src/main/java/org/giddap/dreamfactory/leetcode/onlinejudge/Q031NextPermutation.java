package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://leetcode.com/onlinejudge#question_31">Q031 Next Permutation</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * <p/>
 * If such arrangement is not possible, it must rearrange it as the lowest possible order
 * (ie, sorted in ascending order).
 * <p/>
 * The replacement must be in-place, do not allocate extra memory.
 * <p/>
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are
 * in the right-hand column.
 * <pre>
 * 1,2,3 -> 1,3,2
 * 3,2,1 -> 1,2,3
 * 1,1,5 -> 1,5,1
 * </pre>
 * <p/>
 *
 * @see <a href="http://wordaligned.org/articles/next-permutation">Next permutation: When C++ gets it right</a>
 * @see <a href="http://www.mitbbs.com/article_t/JobHunting/32148331.html">Mitbbs discussion</a>
 * @see <a href="http://blog.bjrn.se/2008/04/lexicographic-permutations-using.html">
 *      Lexicographic permutations using Algorithm L (STL next_permutation in Python)</a>
 * @see <a href="http://codeforces.com/blog/entry/3980">A Java implementation</a>
 */
public interface Q031NextPermutation {
    void nextPermutation(int[] num);
}

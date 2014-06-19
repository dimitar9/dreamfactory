package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/permutations-ii/">Permutations II</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * <p/>
 * For example,
 * [1,1,2] have the following unique permutations:
 * [1,1,2], [1,2,1], and [2,1,1].
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/225/permutations-ii">Leetcode discussion</a>
 *      http://fisherlei.blogspot.ca/2012/12/leetcode-permutations-ii.html
 * @see <a href="http://ozitabcode.blogspot.com/2013/03/leetcode-solutions-permutations-ii.html">A blog from ozitabcode</a>
 * @see <a href="http://n1b-algo.blogspot.com/2009/01/string-permutations.html">A blog from n1b-algo</a>
 */
public interface Q047PermutationsII {
    ArrayList<ArrayList<Integer>> permuteUnique(int[] num);
}

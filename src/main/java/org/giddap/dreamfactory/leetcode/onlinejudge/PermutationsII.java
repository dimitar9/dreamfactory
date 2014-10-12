package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;
import java.util.List;

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
 * http://n00tc0d3r.blogspot.com/2013/05/permutations.html
 * http://fisherlei.blogspot.ca/2012/12/leetcode-permutations-ii.html
 * http://ozitabcode.blogspot.com/2013/03/leetcode-solutions-permutations-ii.html
 * http://n1b-algo.blogspot.com/2009/01/string-permutations.html
 */
public interface PermutationsII {
    List<List<Integer>> permuteUnique(int[] num);
}

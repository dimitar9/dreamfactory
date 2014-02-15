package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/permutation-sequence/
 * <p/>
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
 * <p/>
 * By listing and labeling all of the permutations in order,
 * We get the following sequence (ie, for n = 3):
 * <p/>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 * <p/>
 * Note: Given n will be between 1 and 9 inclusive.
 * <p/>
 * Links:
 * http://www.keithschwarz.com/interesting/code/?dir=factoradic-permutation
 * http://gongxuns.blogspot.com/2012/12/leetcode-permutation-sequence.html
 * http://blog.csdn.net/zyfo2/article/details/8612872
 * http://blog.unieagle.net/2012/10/16/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Apermutation-sequence/
 * http://discuss.leetcode.com/questions/237/permutation-sequence
 * http://yucoding.blogspot.com/2013/04/leetcode-question-68-permutation.html
 * http://stackoverflow.com/questions/7918806/finding-n-th-permutation-without-computing-others
 * http://stackoverflow.com/questions/1506078/fast-permutation-number-permutation-mapping-algorithms
 */
public interface Q060PermutationSequence {
    String getPermutation(int n, int k);
}

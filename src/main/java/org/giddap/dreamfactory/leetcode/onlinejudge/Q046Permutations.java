package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/permutations/">Permutations</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a collection of numbers, return all possible permutations.
 * <p/>
 * <pre>
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/224/permutations">Leetcode discussion</a>
 * @see <a href="http://www.cut-the-knot.org/do_you_know/AllPerm.shtml">Permutations at cut-the-knot.org</a>
 * @see <a href="http://introcs.cs.princeton.edu/java/23recursion/Permutations.java.html">Princeton blog</a>
 * @see <a href="http://introcs.cs.princeton.edu/java/23recursion/JohnsonTrotter.java.html">Johnson Trotter</a>
 * @see <a href="http://lucitworks.com/CodingAlgorithms/permutation.htm">Another blog on permutation</a>
 * @see <a href="http://tropenhitze.wordpress.com/2010/01/25/steinhaus-johnson-trotter-permutation-algorithm-explained-and-implemented-in-java/">Another article on Johnson Trotter</a>
 * @see <a href="http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/">Article from Geeksforgeeks</a>
 * @see <a href="http://www.geeksforgeeks.org/lexicographic-permutations-of-string/">Lexicographic permutations from Geeksforgeeks</a>
 * @see <a href="http://www.geeksforgeeks.org/print-all-permutations-with-repetition-of-characters/">Permutations with duplicates from Geeksforgeeks</a>
 * @see <a href="http://www.geeksforgeeks.org/forums/topic/permutations-of-a-string-without-repeatition-2/">Permutations without duplicates from Geeksforgeeks</a>
 */
public interface Q046Permutations {
    ArrayList<ArrayList<Integer>> permute(int[] num);
}

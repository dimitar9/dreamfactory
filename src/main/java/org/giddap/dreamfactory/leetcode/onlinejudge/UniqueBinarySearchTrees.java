package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/unique-binary-search-trees/">Unique Binary Search Trees</a>
 * <p/>
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * <p/>
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * <p/>
 * <pre>
 * 1         3     3      2      1
 *  \       /     /      / \      \
 *   3     2     1      1   3      2
 *  /     /       \                 \
 * 2     1         2                 3
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/270/unique-binary-search-trees">Leetcode discussion</a>
 * @see <a href="http://www.youtube.com/watch?v=UfA_v0VmiDg">saurabhschool on youtube</a>
 * @see <a href="http://en.wikipedia.org/wiki/Catalan_number">Catalan Numbers on Wikipedia</a>
 * @see <a href="https://www.youtube.com/watch?v=m9Khxn2g-6w">Catalan numbers part 1</a>
 */
public interface UniqueBinarySearchTrees {
    int numTrees(int n);
}

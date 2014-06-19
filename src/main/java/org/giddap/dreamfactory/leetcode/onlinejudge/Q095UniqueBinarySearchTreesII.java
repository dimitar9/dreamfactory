package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.ArrayList;

/**
 * http://leetcode.com/onlinejudge#question_95
 * <p/>
 * Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 * <p/>
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 * <p/>
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * <p/>
 * Links:
 * http://gongxuns.blogspot.com/2013/01/leetcodeunique-binary-search-trees-ii.html
 * http://blog.unieagle.net/2012/11/04/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Aunique-binary-search-trees-ii/
 * http://discuss.leetcode.com/questions/269/unique-binary-search-trees-ii
 */
public interface Q095UniqueBinarySearchTreesII {
    ArrayList<TreeNode> generateTrees(int n);
}

package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.TreeNode;

/**
 * http://leetcode.com/onlinejudge#question_106
 * <p/>
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * <p/>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * <p/>
 * Comments:
 * Recursively, find the root from post-order array (the last element) and then go left and/or right via the index
 * range from inorder array.
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/186/construct-binary-tree-from-inorder-and-postorder-traversal
 */
public interface Q106ConstructBinaryTreeFromInorderAndPostorderTraversal {
    TreeNode buildTree(int[] inorder, int[] postorder);
}

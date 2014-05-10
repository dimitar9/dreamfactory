package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * http://oj.leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * <p/>
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * <p/>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/148/construct-binary-tree-from-preorder-and-inorder-traversal
 * http://leetcode.com/2010/09/serializationdeserialization-of-binary.html
 * http://leetcode.com/2010/09/saving-binary-search-tree-to-file.html
 */
public interface Q105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    TreeNode buildTree(int[] preorder, int[] inorder);
}

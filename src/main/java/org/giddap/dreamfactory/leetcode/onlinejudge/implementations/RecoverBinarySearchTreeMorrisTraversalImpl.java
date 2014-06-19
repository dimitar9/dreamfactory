package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.RecoverBinarySearchTree;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Morris Traversal (Threaded tree).
 * <ul>
 * <li></li>
 * </ul>
 * </li>
 * <li>
 * Time complexity: O(n).
 * </li>
 * <li>
 * Space complexity: O(1).
 * </li>
 * </ul>
 */
public class RecoverBinarySearchTreeMorrisTraversalImpl implements RecoverBinarySearchTree {
    @Override
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode smaller = null;
        TreeNode larger = null;

        TreeNode curr = root;
        TreeNode prev = null;
        while (curr != null) {
            TreeNode prevMark = curr.left;
            if (prevMark != null) {
                while (prevMark.right != null && prevMark.right != curr) {
                    prevMark = prevMark.right;
                }

                if (prevMark.right == null) {
                    prevMark.right = curr;
                    curr = curr.left;
                } else if (prevMark.right == curr) {
                    prevMark.right = null;
                    if (prev != null) {
                        if (curr.val < prev.val) {
                            smaller = curr;
                            if (larger == null) {
                                larger = prev;
                            }
                        }
                    }
                    prev = curr;
                    curr = curr.right;

                }
            } else {
                if (prev != null) {
                    if (curr.val < prev.val) {
                        smaller = curr;
                        if (larger == null) {
                            larger = prev;
                        }
                    }
                }
                prev = curr;
                curr = curr.right;
            }
        }

        if (smaller != null && larger != null) {
            int tmp = smaller.val;
            smaller.val = larger.val;
            larger.val = tmp;
        }

    }
}

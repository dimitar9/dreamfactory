package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Threaded Tree Traversal
 *
 */
public class BinaryTreeInorderTraversalMorrisTraversalImpl
        implements BinaryTreeInorderTraversal {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        TreeNode curr = root;
        while (curr != null) {
            TreeNode prev = curr.left;
            if (prev != null) {
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else if (prev.right == curr) {
                    prev.right = null;
                    ret.add(curr.val);
                    curr = curr.right;
                }
            } else {
                ret.add(curr.val);
                curr = curr.right;
            }
        }
        return ret;
    }
}

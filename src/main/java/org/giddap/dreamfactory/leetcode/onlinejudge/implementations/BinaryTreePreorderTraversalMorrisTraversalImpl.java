package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreePreorderTraversal;

import java.util.ArrayList;

/**
 * 弼馬溫注解：
 * Construct the threaded tree and traverse following pre-order.
 */
public class BinaryTreePreorderTraversalMorrisTraversalImpl
        implements BinaryTreePreorderTraversal {
    @Override
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        TreeNode curr = root;
        while (curr != null) {
            ret.add(curr.val);
            TreeNode tPrev = curr.left;
            if (tPrev != null) {
                while (tPrev.right != null && tPrev.right != curr) {
                    tPrev = tPrev.right;
                }
                if (tPrev.right == null) {
                    tPrev.right = curr;
                    curr = curr.left;
                } else if (tPrev.right == curr) {
                    ret.remove(ret.size() - 1);
                    tPrev.right = null;
                    curr = curr.right;
                }
            } else {
                curr = curr.right;
            }
        }
        return ret;
    }
}

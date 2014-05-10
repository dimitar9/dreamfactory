package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeInorderTraversal;

import java.util.ArrayList;

/**
 * 弼馬溫注解：
 */
public class BinaryTreeInorderTraversalMorrisTraversalImpl
        implements BinaryTreeInorderTraversal {
    @Override
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
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

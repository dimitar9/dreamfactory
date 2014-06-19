package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.SymmetricTree;

public class SymmetricTreeRecursiveImpl implements SymmetricTree {

    @Override
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }

        if (a == null || b == null || a.val != b.val) {
            return false;
        }

        return isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
    }
}


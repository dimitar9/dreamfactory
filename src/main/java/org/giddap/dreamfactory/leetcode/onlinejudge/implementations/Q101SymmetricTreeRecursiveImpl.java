package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q101SymmetricTree;

public class Q101SymmetricTreeRecursiveImpl implements Q101SymmetricTree {

    @Override
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode tn1, TreeNode tn2) {
        if (tn1 == null && tn2 == null) {
            return true;
        } else if ((tn1 == null && tn2 != null) || (tn1 != null && tn2 == null)) {
            return false;
        } else {
            if (tn1.val != tn2.val) {
                return false;
            } else {
                return isSymmetric(tn1.left, tn2.right) && isSymmetric(tn1.right, tn2.left);
            }
        }
    }
}

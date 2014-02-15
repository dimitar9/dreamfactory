package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q129SumRootToLeafNumbers;

public class Q129SumRootToLeafNumbersImpl implements Q129SumRootToLeafNumbers {
    @Override
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return addUp(root, 0);
    }

    private int addUp(TreeNode node, int base) {
        if (node == null) {
            return 0;
        }

        int curr = base * 10 + node.val;

        if (node.left == null && node.right == null) {
            return curr;
        }

        return addUp(node.left, curr) + addUp(node.right, curr);
    }
}

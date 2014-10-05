package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.BalancedBinaryTreeImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 *
 */
public class BalancedBinaryTreeTest {
    private BalancedBinaryTree solution = new BalancedBinaryTreeImpl();

    @Test
    public void small01() {
        // input: {1,#,2,#,3}
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(2);
        TreeNode n5 = new TreeNode(3);

        n1.right = n3;
        n3.right = n5;

        assertFalse(solution.isBalanced(n1));
    }
}

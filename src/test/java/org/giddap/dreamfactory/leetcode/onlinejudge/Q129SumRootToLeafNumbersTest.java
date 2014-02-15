package org.giddap.dreamfactory.leetcode.onlinejudge;


import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q129SumRootToLeafNumbersImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q129SumRootToLeafNumbersTest {
    private Q129SumRootToLeafNumbers solution = new Q129SumRootToLeafNumbersImpl();

    @Test
    public void small01() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        assertEquals(25, solution.sumNumbers(root));
    }

    @Test
    public void small02() {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        root.left = left1;
        root.right = right1;
        TreeNode left2 = new TreeNode(4);
        left1.left = left2;

        assertEquals(137, solution.sumNumbers(root));
    }

}

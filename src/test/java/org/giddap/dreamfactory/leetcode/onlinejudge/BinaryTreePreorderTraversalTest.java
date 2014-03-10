package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.BinaryTreePreorderTraversalMorrisTraversalImpl;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BinaryTreePreorderTraversalTest {
    private BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversalMorrisTraversalImpl();

    @Test
    public void small01() {
        TreeNode tn1 = new TreeNode(3);
        TreeNode tn2 = new TreeNode(1);
        TreeNode tn3 = new TreeNode(2);

        tn1.left = tn2;
        tn1.right = tn3;

        ArrayList<Integer> expected = Lists.newArrayList(3, 1, 2);
        assertEquals(expected, solution.preorderTraversal(tn1));
    }

    @Test
    public void small02() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(4);
        TreeNode tn3 = new TreeNode(3);
        TreeNode tn4 = new TreeNode(2);

        tn1.left = tn2;
        tn1.right = tn3;

        tn2.left = tn4;

        ArrayList<Integer> expected = Lists.newArrayList(1, 4, 2, 3);
        assertEquals(expected, solution.preorderTraversal(tn1));
    }
}

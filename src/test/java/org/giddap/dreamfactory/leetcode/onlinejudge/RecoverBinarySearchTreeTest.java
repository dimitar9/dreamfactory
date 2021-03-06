package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RecoverBinarySearchTreeImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RecoverBinarySearchTreeIterativeWithStackImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RecoverBinarySearchTreeMorrisTraversalImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecoverBinarySearchTreeTest {
    private RecoverBinarySearchTree solution1 = new RecoverBinarySearchTreeIterativeWithStackImpl();
    private RecoverBinarySearchTree solution2 = new RecoverBinarySearchTreeImpl();
    private RecoverBinarySearchTree solution = new RecoverBinarySearchTreeMorrisTraversalImpl();

    @Test
    public void small01() {
        TreeNode tn1 = new TreeNode(0);
        TreeNode tn2 = new TreeNode(1);
        tn1.left = tn2;

        solution.recoverTree(tn1);
        assertEquals(1, tn1.val);
        assertEquals(0, tn2.val);
    }

    @Test
    public void small02() {
        TreeNode tn1 = new TreeNode(3);
        TreeNode tn2 = new TreeNode(1);
        TreeNode tn3 = new TreeNode(2);
        tn1.left = tn2;
        tn1.right = tn3;

        solution.recoverTree(tn1);
        assertEquals(2, tn1.val);
        assertEquals(1, tn1.left.val);
        assertEquals(3, tn1.right.val);
    }

    @Test
    public void small03() {
        TreeNode tn1 = new TreeNode(2);
        TreeNode tn2 = new TreeNode(3);
        TreeNode tn3 = new TreeNode(1);
        tn1.left = tn2;
        tn1.right = tn3;

        solution.recoverTree(tn1);
        assertEquals(2, tn1.val);
        assertEquals(1, tn1.left.val);
        assertEquals(3, tn1.right.val);
    }

    @Test
    public void small04() {
        TreeNode tn1 = new TreeNode(2);
        TreeNode tn2 = new TreeNode(3);
        TreeNode tn3 = new TreeNode(1);

        tn1.right = tn2;
        tn2.left = tn3;

        solution.recoverTree(tn1);
        assertEquals(1, tn1.val);
        assertEquals(3, tn1.right.val);
        assertEquals(2, tn1.right.left.val);
    }
}

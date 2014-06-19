package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.BinaryTreePostorderTraversalIterativeWithStackImpl;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BinaryTreePostorderTraversalTest {
    private BinaryTreePostorderTraversal solution = new
            BinaryTreePostorderTraversalIterativeWithStackImpl();

    @Test
    public void small01() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(3);

        tn1.right = tn2;
        tn2.left = tn3;

        ArrayList<Integer> expected = Lists.newArrayList(3, 2, 1);
        assertEquals(expected, solution.postorderTraversal(tn1));
    }
}

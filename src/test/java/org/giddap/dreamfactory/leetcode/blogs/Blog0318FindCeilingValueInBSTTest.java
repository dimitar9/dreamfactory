package org.giddap.dreamfactory.leetcode.blogs;

import org.giddap.dreamfactory.commons.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class Blog0318FindCeilingValueInBSTTest {
    private Blog0318FindCeilingValueInBST solution = new Blog0318FindCeilingValueInBST();

    TreeNode tn1;

    @Before
    public void setup() {
        tn1 = new TreeNode(8);
        TreeNode tn2 = new TreeNode(3);
        TreeNode tn3 = new TreeNode(12);
        TreeNode tn4 = new TreeNode(2);
        TreeNode tn5 = new TreeNode(6);
        TreeNode tn6 = new TreeNode(10);
        TreeNode tn7 = new TreeNode(15);
        TreeNode tn10 = new TreeNode(4);

        tn1.left = tn2;
        tn1.right = tn3;

        tn2.left = tn4;
        tn2.right = tn5;

        tn3.left = tn6;
        tn3.right = tn7;

        tn5.left = tn10;
    }

    @Test
    public void small01() {
        assertEquals(15, solution.findCeilingInBSTRecursive(tn1, 13));
        assertEquals(15, solution.findCeilingInBSTIterative(tn1, 13));
    }

    @Test
    public void small02() {
        assertEquals(6, solution.findCeilingInBSTRecursive(tn1, 4));
        assertEquals(6, solution.findCeilingInBSTIterative(tn1, 4));
    }

    @Test
    public void small03() {
        assertEquals(10, solution.findCeilingInBSTRecursive(tn1, 8));
        assertEquals(10, solution.findCeilingInBSTIterative(tn1, 8));
    }

    @Test
    public void small04() {
        assertEquals(2, solution.findCeilingInBSTRecursive(tn1, 1));
        assertEquals(2, solution.findCeilingInBSTIterative(tn1, 1));
    }
}

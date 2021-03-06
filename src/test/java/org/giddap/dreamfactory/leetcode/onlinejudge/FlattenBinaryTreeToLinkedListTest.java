package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.FlattenBinaryTreeToLinkedListImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.FlattenBinaryTreeToLinkedListIterativeWithStackImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.FlattenBinaryTreeToLinkedListIterativeWithoutStackImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlattenBinaryTreeToLinkedListTest {
    private FlattenBinaryTreeToLinkedList solution1 = new
            FlattenBinaryTreeToLinkedListImpl();

    private FlattenBinaryTreeToLinkedList solution2 = new
            FlattenBinaryTreeToLinkedListIterativeWithStackImpl();

    private FlattenBinaryTreeToLinkedList solution = new
            FlattenBinaryTreeToLinkedListIterativeWithoutStackImpl();

    @Test
    public void small01() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);

        tn1.left = tn2;

        solution.flatten(tn1);

        assertEquals(tn1.val, tn1.val);
        assertEquals(tn2.val, tn1.right.val);
    }
}

/*
Test cases
Input	 Output	 Expected
{}	{}	{}
{0}	{0}	{0}
{1,2}	{1,#,2}	{1,#,2}
{1,#,2}	{1,#,2}	{1,#,2}
{1,2,3}	{1,#,2,#,3}	{1,#,2,#,3}
{1,2,#,3}	{1,#,2,#,3}	{1,#,2,#,3}
{1,#,2,3}	{1,#,2,#,3}	{1,#,2,#,3}
{1,#,2,#,3}	{1,#,2,#,3}	{1,#,2,#,3}
{1,2,#,#,3}	{1,#,2,#,3}	{1,#,2,#,3}
{1,2,#,3,4,5}	{1,#,2,#,3,#,5,#,4}	{1,#,2,#,3,#,5,#,4}
{1,2,5,3,4,#,6}	{1,#,2,#,3,#,4,#,5,#,6}	{1,#,2,#,3,#,4,#,5,#,6}
{1,2,#,3,#,4,#,5,#,6}	{1,#,2,#,3,#,4,#,5,#,6}	{1,#,2,#,3,#,4,#,5,#,6}
{1,#,2,#,3,#,4,#,5,#,6}	{1,#,2,#,3,#,4,#,5,#,6}	{1,#,2,#,3,#,4,#,5,#,6}
{1,#,2,#,3,#,4}	{1,#,2,#,3,#,4}	{1,#,2,#,3,#,4}
{1,#,2,#,4,3}	{1,#,2,#,4,#,3}	{1,#,2,#,4,#,3}
{1,#,3,2,4}	{1,#,3,#,2,#,4}	{1,#,3,#,2,#,4}
{1,#,4,2,#,#,3}	{1,#,4,#,2,#,3}	{1,#,4,#,2,#,3}
{1,#,4,3,#,2}	{1,#,4,#,3,#,2}	{1,#,4,#,3,#,2}
{2,1,3,#,#,#,4}	{2,#,1,#,3,#,4}	{2,#,1,#,3,#,4}
{2,1,4,#,#,3}	{2,#,1,#,4,#,3}	{2,#,1,#,4,#,3}
{3,1,4,#,2}	{3,#,1,#,2,#,4}	{3,#,1,#,2,#,4}
{3,2,4,1}	{3,#,2,#,1,#,4}	{3,#,2,#,1,#,4}
{4,1,#,#,2,#,3}	{4,#,1,#,2,#,3}	{4,#,1,#,2,#,3}
{4,1,#,#,3,2}	{4,#,1,#,3,#,2}	{4,#,1,#,3,#,2}
{4,2,#,1,3}	{4,#,2,#,1,#,3}	{4,#,2,#,1,#,3}
{4,3,#,1,#,#,2}	{4,#,3,#,1,#,2}	{4,#,3,#,1,#,2}
{4,3,#,2,#,1}	{4,#,3,#,2,#,1}	{4,#,3,#,2,#,1}
{7,-10,2,-4,3,-8,#,#,#,#,-1,11}	{7,#,-10,#,-4,#,3,#,-1,#,2,#,-8,#,11}	{7,#,-10,#,-4,#,3,#,-1,#,2,#,-8,#,11}
{1,#,2,#,3,#,4,#,5}	{1,#,2,#,3,#,4,#,5}	{1,#,2,#,3,#,4,#,5}
{1,#,2,#,3,#,5,4}	{1,#,2,#,3,#,5,#,4}	{1,#,2,#,3,#,5,#,4}
{1,#,2,#,4,3,5}	{1,#,2,#,4,#,3,#,5}	{1,#,2,#,4,#,3,#,5}
{1,#,2,#,5,3,#,#,4}	{1,#,2,#,5,#,3,#,4}	{1,#,2,#,5,#,3,#,4}
{1,#,2,#,5,4,#,3}	{1,#,2,#,5,#,4,#,3}	{1,#,2,#,5,#,4,#,3}
{1,#,3,2,4,#,#,#,5}	{1,#,3,#,2,#,4,#,5}	{1,#,3,#,2,#,4,#,5}
{1,#,3,2,5,#,#,4}	{1,#,3,#,2,#,5,#,4}	{1,#,3,#,2,#,5,#,4}
{1,#,4,2,5,#,3}	{1,#,4,#,2,#,3,#,5}	{1,#,4,#,2,#,3,#,5}
{1,#,4,3,5,2}	{1,#,4,#,3,#,2,#,5}	{1,#,4,#,3,#,2,#,5}
{1,#,5,2,#,#,3,#,4}	{1,#,5,#,2,#,3,#,4}	{1,#,5,#,2,#,3,#,4}
{1,#,5,2,#,#,4,3}	{1,#,5,#,2,#,4,#,3}	{1,#,5,#,2,#,4,#,3}
{1,#,5,3,#,2,4}	{1,#,5,#,3,#,2,#,4}	{1,#,5,#,3,#,2,#,4}
{1,#,5,4,#,2,#,#,3}	{1,#,5,#,4,#,2,#,3}	{1,#,5,#,4,#,2,#,3}
{1,#,5,4,#,3,#,2}	{1,#,5,#,4,#,3,#,2}	{1,#,5,#,4,#,3,#,2}
{2,1,3,#,#,#,4,#,5}	{2,#,1,#,3,#,4,#,5}	{2,#,1,#,3,#,4,#,5}
{2,1,3,#,#,#,5,4}	{2,#,1,#,3,#,5,#,4}	{2,#,1,#,3,#,5,#,4}
{2,1,4,#,#,3,5}	{2,#,1,#,4,#,3,#,5}	{2,#,1,#,4,#,3,#,5}
{2,1,5,#,#,3,#,#,4}	{2,#,1,#,5,#,3,#,4}	{2,#,1,#,5,#,3,#,4}
{2,1,5,#,#,4,#,3}	{2,#,1,#,5,#,4,#,3}	{2,#,1,#,5,#,4,#,3}
{3,1,4,#,2,#,5}	{3,#,1,#,2,#,4,#,5}	{3,#,1,#,2,#,4,#,5}
{3,1,5,#,2,4}	{3,#,1,#,2,#,5,#,4}	{3,#,1,#,2,#,5,#,4}
{3,2,4,1,#,#,5}	{3,#,2,#,1,#,4,#,5}	{3,#,2,#,1,#,4,#,5}
{3,2,5,1,#,4}	{3,#,2,#,1,#,5,#,4}	{3,#,2,#,1,#,5,#,4}
{4,1,5,#,2,#,#,#,3}	{4,#,1,#,2,#,3,#,5}	{4,#,1,#,2,#,3,#,5}
{4,1,5,#,3,#,#,2}	{4,#,1,#,3,#,2,#,5}	{4,#,1,#,3,#,2,#,5}
{4,2,5,1,3}	{4,#,2,#,1,#,3,#,5}	{4,#,2,#,1,#,3,#,5}
{4,3,5,1,#,#,#,#,2}	{4,#,3,#,1,#,2,#,5}	{4,#,3,#,1,#,2,#,5}
{4,3,5,2,#,#,#,1}	{4,#,3,#,2,#,1,#,5}	{4,#,3,#,2,#,1,#,5}
{5,1,#,#,2,#,3,#,4}	{5,#,1,#,2,#,3,#,4}	{5,#,1,#,2,#,3,#,4}
{5,1,#,#,2,#,4,3}	{5,#,1,#,2,#,4,#,3}	{5,#,1,#,2,#,4,#,3}
{5,1,#,#,3,2,4}	{5,#,1,#,3,#,2,#,4}	{5,#,1,#,3,#,2,#,4}
{5,1,#,#,4,2,#,#,3}	{5,#,1,#,4,#,2,#,3}	{5,#,1,#,4,#,2,#,3}
{5,1,#,#,4,3,#,2}	{5,#,1,#,4,#,3,#,2}	{5,#,1,#,4,#,3,#,2}
{5,2,#,1,3,#,#,#,4}	{5,#,2,#,1,#,3,#,4}	{5,#,2,#,1,#,3,#,4}
{5,2,#,1,4,#,#,3}	{5,#,2,#,1,#,4,#,3}	{5,#,2,#,1,#,4,#,3}
{5,3,#,1,4,#,2}	{5,#,3,#,1,#,2,#,4}	{5,#,3,#,1,#,2,#,4}
{5,3,#,2,4,1}	{5,#,3,#,2,#,1,#,4}	{5,#,3,#,2,#,1,#,4}
{5,4,#,1,#,#,2,#,3}	{5,#,4,#,1,#,2,#,3}	{5,#,4,#,1,#,2,#,3}
{5,4,#,1,#,#,3,2}	{5,#,4,#,1,#,3,#,2}	{5,#,4,#,1,#,3,#,2}
{5,4,#,2,#,1,3}	{5,#,4,#,2,#,1,#,3}	{5,#,4,#,2,#,1,#,3}
{5,4,#,3,#,1,#,#,2}	{5,#,4,#,3,#,1,#,2}	{5,#,4,#,3,#,1,#,2}
{5,4,#,3,#,2,#,1}	{5,#,4,#,3,#,2,#,1}	{5,#,4,#,3,#,2,#,1}
{1,#,2,#,3,#,4,#,6,5}	{1,#,2,#,3,#,4,#,6,#,5}	{1,#,2,#,3,#,4,#,6,#,5}
{1,#,2,#,3,#,5,4,6}	{1,#,2,#,3,#,5,#,4,#,6}	{1,#,2,#,3,#,5,#,4,#,6}
{1,#,2,#,3,#,6,4,#,#,5}	{1,#,2,#,3,#,6,#,4,#,5}	{1,#,2,#,3,#,6,#,4,#,5}
{1,#,2,#,3,#,6,5,#,4}	{1,#,2,#,3,#,6,#,5,#,4}	{1,#,2,#,3,#,6,#,5,#,4}
{1,#,2,#,4,3,5,#,#,#,6}	{1,#,2,#,4,#,3,#,5,#,6}	{1,#,2,#,4,#,3,#,5,#,6}
{1,#,2,#,4,3,6,#,#,5}	{1,#,2,#,4,#,3,#,6,#,5}	{1,#,2,#,4,#,3,#,6,#,5}
{1,#,2,#,5,3,6,#,4}	{1,#,2,#,5,#,3,#,4,#,6}	{1,#,2,#,5,#,3,#,4,#,6}
{1,#,2,#,5,4,6,3}	{1,#,2,#,5,#,4,#,3,#,6}	{1,#,2,#,5,#,4,#,3,#,6}
{1,#,2,#,6,3,#,#,4,#,5}	{1,#,2,#,6,#,3,#,4,#,5}	{1,#,2,#,6,#,3,#,4,#,5}
{1,#,2,#,6,3,#,#,5,4}	{1,#,2,#,6,#,3,#,5,#,4}	{1,#,2,#,6,#,3,#,5,#,4}
{1,#,2,#,6,4,#,3,5}	{1,#,2,#,6,#,4,#,3,#,5}	{1,#,2,#,6,#,4,#,3,#,5}
{1,#,2,#,6,5,#,3,#,#,4}	{1,#,2,#,6,#,5,#,3,#,4}	{1,#,2,#,6,#,5,#,3,#,4}
{1,#,2,#,6,5,#,4,#,3}	{1,#,2,#,6,#,5,#,4,#,3}	{1,#,2,#,6,#,5,#,4,#,3}
{1,#,3,2,4,#,#,#,5,#,6}	{1,#,3,#,2,#,4,#,5,#,6}	{1,#,3,#,2,#,4,#,5,#,6}
{1,#,3,2,4,#,#,#,6,5}	{1,#,3,#,2,#,4,#,6,#,5}	{1,#,3,#,2,#,4,#,6,#,5}
{1,#,3,2,5,#,#,4,6}	{1,#,3,#,2,#,5,#,4,#,6}	{1,#,3,#,2,#,5,#,4,#,6}
{1,#,3,2,6,#,#,4,#,#,5}	{1,#,3,#,2,#,6,#,4,#,5}	{1,#,3,#,2,#,6,#,4,#,5}
{1,#,3,2,6,#,#,5,#,4}	{1,#,3,#,2,#,6,#,5,#,4}	{1,#,3,#,2,#,6,#,5,#,4}
{1,#,4,2,5,#,3,#,6}	{1,#,4,#,2,#,3,#,5,#,6}	{1,#,4,#,2,#,3,#,5,#,6}
{1,#,4,2,6,#,3,5}	{1,#,4,#,2,#,3,#,6,#,5}	{1,#,4,#,2,#,3,#,6,#,5}
{1,#,4,3,5,2,#,#,6}	{1,#,4,#,3,#,2,#,5,#,6}	{1,#,4,#,3,#,2,#,5,#,6}
{1,#,4,3,6,2,#,5}	{1,#,4,#,3,#,2,#,6,#,5}	{1,#,4,#,3,#,2,#,6,#,5}
{1,#,5,2,6,#,3,#,#,#,4}	{1,#,5,#,2,#,3,#,4,#,6}	{1,#,5,#,2,#,3,#,4,#,6}
{1,#,5,2,6,#,4,#,#,3}	{1,#,5,#,2,#,4,#,3,#,6}	{1,#,5,#,2,#,4,#,3,#,6}
{1,#,5,3,6,2,4}	{1,#,5,#,3,#,2,#,4,#,6}	{1,#,5,#,3,#,2,#,4,#,6}
{1,#,5,4,6,2,#,#,#,#,3}	{1,#,5,#,4,#,2,#,3,#,6}	{1,#,5,#,4,#,2,#,3,#,6}
{1,#,5,4,6,3,#,#,#,2}	{1,#,5,#,4,#,3,#,2,#,6}	{1,#,5,#,4,#,3,#,2,#,6}
{1,#,6,2,#,#,3,#,4,#,5}	{1,#,6,#,2,#,3,#,4,#,5}	{1,#,6,#,2,#,3,#,4,#,5}
{1,#,6,2,#,#,3,#,5,4}	{1,#,6,#,2,#,3,#,5,#,4}	{1,#,6,#,2,#,3,#,5,#,4}
{1,#,6,2,#,#,4,3,5}	{1,#,6,#,2,#,4,#,3,#,5}	{1,#,6,#,2,#,4,#,3,#,5}
{1,#,6,2,#,#,5,3,#,#,4}	{1,#,6,#,2,#,5,#,3,#,4}	{1,#,6,#,2,#,5,#,3,#,4}
{1,#,6,2,#,#,5,4,#,3}	{1,#,6,#,2,#,5,#,4,#,3}	{1,#,6,#,2,#,5,#,4,#,3}
{1,#,6,3,#,2,4,#,#,#,5}	{1,#,6,#,3,#,2,#,4,#,5}	{1,#,6,#,3,#,2,#,4,#,5}
{1,#,6,3,#,2,5,#,#,4}	{1,#,6,#,3,#,2,#,5,#,4}	{1,#,6,#,3,#,2,#,5,#,4}
{1,#,6,4,#,2,5,#,3}	{1,#,6,#,4,#,2,#,3,#,5}	{1,#,6,#,4,#,2,#,3,#,5}
{1,#,6,4,#,3,5,2}	{1,#,6,#,4,#,3,#,2,#,5}	{1,#,6,#,4,#,3,#,2,#,5}
{1,#,6,5,#,2,#,#,3,#,4}	{1,#,6,#,5,#,2,#,3,#,4}	{1,#,6,#,5,#,2,#,3,#,4}
{1,#,6,5,#,2,#,#,4,3}	{1,#,6,#,5,#,2,#,4,#,3}	{1,#,6,#,5,#,2,#,4,#,3}
{1,#,6,5,#,3,#,2,4}	{1,#,6,#,5,#,3,#,2,#,4}	{1,#,6,#,5,#,3,#,2,#,4}
{1,#,6,5,#,4,#,2,#,#,3}	{1,#,6,#,5,#,4,#,2,#,3}	{1,#,6,#,5,#,4,#,2,#,3}
{1,#,6,5,#,4,#,3,#,2}	{1,#,6,#,5,#,4,#,3,#,2}	{1,#,6,#,5,#,4,#,3,#,2}
{2,1,3,#,#,#,4,#,5,#,6}	{2,#,1,#,3,#,4,#,5,#,6}	{2,#,1,#,3,#,4,#,5,#,6}
{2,1,3,#,#,#,4,#,6,5}	{2,#,1,#,3,#,4,#,6,#,5}	{2,#,1,#,3,#,4,#,6,#,5}
{2,1,3,#,#,#,5,4,6}	{2,#,1,#,3,#,5,#,4,#,6}	{2,#,1,#,3,#,5,#,4,#,6}
{2,1,3,#,#,#,6,4,#,#,5}	{2,#,1,#,3,#,6,#,4,#,5}	{2,#,1,#,3,#,6,#,4,#,5}
{2,1,3,#,#,#,6,5,#,4}	{2,#,1,#,3,#,6,#,5,#,4}	{2,#,1,#,3,#,6,#,5,#,4}
{2,1,4,#,#,3,5,#,#,#,6}	{2,#,1,#,4,#,3,#,5,#,6}	{2,#,1,#,4,#,3,#,5,#,6}
{2,1,4,#,#,3,6,#,#,5}	{2,#,1,#,4,#,3,#,6,#,5}	{2,#,1,#,4,#,3,#,6,#,5}
{2,1,5,#,#,3,6,#,4}	{2,#,1,#,5,#,3,#,4,#,6}	{2,#,1,#,5,#,3,#,4,#,6}
{2,1,5,#,#,4,6,3}	{2,#,1,#,5,#,4,#,3,#,6}	{2,#,1,#,5,#,4,#,3,#,6}
{2,1,6,#,#,3,#,#,4,#,5}	{2,#,1,#,6,#,3,#,4,#,5}	{2,#,1,#,6,#,3,#,4,#,5}
{2,1,6,#,#,3,#,#,5,4}	{2,#,1,#,6,#,3,#,5,#,4}	{2,#,1,#,6,#,3,#,5,#,4}
{2,1,6,#,#,4,#,3,5}	{2,#,1,#,6,#,4,#,3,#,5}	{2,#,1,#,6,#,4,#,3,#,5}
{2,1,6,#,#,5,#,3,#,#,4}	{2,#,1,#,6,#,5,#,3,#,4}	{2,#,1,#,6,#,5,#,3,#,4}
{2,1,6,#,#,5,#,4,#,3}	{2,#,1,#,6,#,5,#,4,#,3}	{2,#,1,#,6,#,5,#,4,#,3}
{3,1,4,#,2,#,5,#,#,#,6}	{3,#,1,#,2,#,4,#,5,#,6}	{3,#,1,#,2,#,4,#,5,#,6}
{3,1,4,#,2,#,6,#,#,5}	{3,#,1,#,2,#,4,#,6,#,5}	{3,#,1,#,2,#,4,#,6,#,5}
{3,1,5,#,2,4,6}	{3,#,1,#,2,#,5,#,4,#,6}	{3,#,1,#,2,#,5,#,4,#,6}
{3,1,6,#,2,4,#,#,#,#,5}	{3,#,1,#,2,#,6,#,4,#,5}	{3,#,1,#,2,#,6,#,4,#,5}
{3,1,6,#,2,5,#,#,#,4}	{3,#,1,#,2,#,6,#,5,#,4}	{3,#,1,#,2,#,6,#,5,#,4}
{3,2,4,1,#,#,5,#,#,#,6}	{3,#,2,#,1,#,4,#,5,#,6}	{3,#,2,#,1,#,4,#,5,#,6}
{3,2,4,1,#,#,6,#,#,5}	{3,#,2,#,1,#,4,#,6,#,5}	{3,#,2,#,1,#,4,#,6,#,5}
{3,2,5,1,#,4,6}	{3,#,2,#,1,#,5,#,4,#,6}	{3,#,2,#,1,#,5,#,4,#,6}
{3,2,6,1,#,4,#,#,#,#,5}	{3,#,2,#,1,#,6,#,4,#,5}	{3,#,2,#,1,#,6,#,4,#,5}
{3,2,6,1,#,5,#,#,#,4}	{3,#,2,#,1,#,6,#,5,#,4}	{3,#,2,#,1,#,6,#,5,#,4}
{4,1,5,#,2,#,6,#,3}	{4,#,1,#,2,#,3,#,5,#,6}	{4,#,1,#,2,#,3,#,5,#,6}
{4,1,6,#,2,5,#,#,3}	{4,#,1,#,2,#,3,#,6,#,5}	{4,#,1,#,2,#,3,#,6,#,5}
{4,1,5,#,3,#,6,2}	{4,#,1,#,3,#,2,#,5,#,6}	{4,#,1,#,3,#,2,#,5,#,6}
{4,1,6,#,3,5,#,2}	{4,#,1,#,3,#,2,#,6,#,5}	{4,#,1,#,3,#,2,#,6,#,5}
{4,2,5,1,3,#,6}	{4,#,2,#,1,#,3,#,5,#,6}	{4,#,2,#,1,#,3,#,5,#,6}
{4,2,6,1,3,5}	{4,#,2,#,1,#,3,#,6,#,5}	{4,#,2,#,1,#,3,#,6,#,5}
{4,3,5,1,#,#,6,#,2}	{4,#,3,#,1,#,2,#,5,#,6}	{4,#,3,#,1,#,2,#,5,#,6}
{4,3,6,1,#,5,#,#,2}	{4,#,3,#,1,#,2,#,6,#,5}	{4,#,3,#,1,#,2,#,6,#,5}
{4,3,5,2,#,#,6,1}	{4,#,3,#,2,#,1,#,5,#,6}	{4,#,3,#,2,#,1,#,5,#,6}
{4,3,6,2,#,5,#,1}	{4,#,3,#,2,#,1,#,6,#,5}	{4,#,3,#,2,#,1,#,6,#,5}
{5,1,6,#,2,#,#,#,3,#,4}	{5,#,1,#,2,#,3,#,4,#,6}	{5,#,1,#,2,#,3,#,4,#,6}
{5,1,6,#,2,#,#,#,4,3}	{5,#,1,#,2,#,4,#,3,#,6}	{5,#,1,#,2,#,4,#,3,#,6}
{5,1,6,#,3,#,#,2,4}	{5,#,1,#,3,#,2,#,4,#,6}	{5,#,1,#,3,#,2,#,4,#,6}
{5,1,6,#,4,#,#,2,#,#,3}	{5,#,1,#,4,#,2,#,3,#,6}	{5,#,1,#,4,#,2,#,3,#,6}
{5,1,6,#,4,#,#,3,#,2}	{5,#,1,#,4,#,3,#,2,#,6}	{5,#,1,#,4,#,3,#,2,#,6}
{5,2,6,1,3,#,#,#,#,#,4}	{5,#,2,#,1,#,3,#,4,#,6}	{5,#,2,#,1,#,3,#,4,#,6}
{5,2,6,1,4,#,#,#,#,3}	{5,#,2,#,1,#,4,#,3,#,6}	{5,#,2,#,1,#,4,#,3,#,6}
{5,3,6,1,4,#,#,#,2}	{5,#,3,#,1,#,2,#,4,#,6}	{5,#,3,#,1,#,2,#,4,#,6}
{5,3,6,2,4,#,#,1}	{5,#,3,#,2,#,1,#,4,#,6}	{5,#,3,#,2,#,1,#,4,#,6}
{5,4,6,1,#,#,#,#,2,#,3}	{5,#,4,#,1,#,2,#,3,#,6}	{5,#,4,#,1,#,2,#,3,#,6}
{5,4,6,1,#,#,#,#,3,2}	{5,#,4,#,1,#,3,#,2,#,6}	{5,#,4,#,1,#,3,#,2,#,6}
{5,4,6,2,#,#,#,1,3}	{5,#,4,#,2,#,1,#,3,#,6}	{5,#,4,#,2,#,1,#,3,#,6}
{5,4,6,3,#,#,#,1,#,#,2}	{5,#,4,#,3,#,1,#,2,#,6}	{5,#,4,#,3,#,1,#,2,#,6}
{5,4,6,3,#,#,#,2,#,1}	{5,#,4,#,3,#,2,#,1,#,6}	{5,#,4,#,3,#,2,#,1,#,6}
{6,1,#,#,2,#,3,#,4,#,5}	{6,#,1,#,2,#,3,#,4,#,5}	{6,#,1,#,2,#,3,#,4,#,5}
{6,1,#,#,2,#,3,#,5,4}	{6,#,1,#,2,#,3,#,5,#,4}	{6,#,1,#,2,#,3,#,5,#,4}
{6,1,#,#,2,#,4,3,5}	{6,#,1,#,2,#,4,#,3,#,5}	{6,#,1,#,2,#,4,#,3,#,5}
{6,1,#,#,2,#,5,3,#,#,4}	{6,#,1,#,2,#,5,#,3,#,4}	{6,#,1,#,2,#,5,#,3,#,4}
{6,1,#,#,2,#,5,4,#,3}	{6,#,1,#,2,#,5,#,4,#,3}	{6,#,1,#,2,#,5,#,4,#,3}
{6,1,#,#,3,2,4,#,#,#,5}	{6,#,1,#,3,#,2,#,4,#,5}	{6,#,1,#,3,#,2,#,4,#,5}
{6,1,#,#,3,2,5,#,#,4}	{6,#,1,#,3,#,2,#,5,#,4}	{6,#,1,#,3,#,2,#,5,#,4}
{6,1,#,#,4,2,5,#,3}	{6,#,1,#,4,#,2,#,3,#,5}	{6,#,1,#,4,#,2,#,3,#,5}
{6,1,#,#,4,3,5,2}	{6,#,1,#,4,#,3,#,2,#,5}	{6,#,1,#,4,#,3,#,2,#,5}
{6,1,#,#,5,2,#,#,3,#,4}	{6,#,1,#,5,#,2,#,3,#,4}	{6,#,1,#,5,#,2,#,3,#,4}
{6,1,#,#,5,2,#,#,4,3}	{6,#,1,#,5,#,2,#,4,#,3}	{6,#,1,#,5,#,2,#,4,#,3}
{6,1,#,#,5,3,#,2,4}	{6,#,1,#,5,#,3,#,2,#,4}	{6,#,1,#,5,#,3,#,2,#,4}
{6,1,#,#,5,4,#,2,#,#,3}	{6,#,1,#,5,#,4,#,2,#,3}	{6,#,1,#,5,#,4,#,2,#,3}
{6,1,#,#,5,4,#,3,#,2}	{6,#,1,#,5,#,4,#,3,#,2}	{6,#,1,#,5,#,4,#,3,#,2}
{6,2,#,1,3,#,#,#,4,#,5}	{6,#,2,#,1,#,3,#,4,#,5}	{6,#,2,#,1,#,3,#,4,#,5}
{6,2,#,1,3,#,#,#,5,4}	{6,#,2,#,1,#,3,#,5,#,4}	{6,#,2,#,1,#,3,#,5,#,4}
{6,2,#,1,4,#,#,3,5}	{6,#,2,#,1,#,4,#,3,#,5}	{6,#,2,#,1,#,4,#,3,#,5}
{6,2,#,1,5,#,#,3,#,#,4}	{6,#,2,#,1,#,5,#,3,#,4}	{6,#,2,#,1,#,5,#,3,#,4}
{6,2,#,1,5,#,#,4,#,3}	{6,#,2,#,1,#,5,#,4,#,3}	{6,#,2,#,1,#,5,#,4,#,3}
{6,3,#,1,4,#,2,#,5}	{6,#,3,#,1,#,2,#,4,#,5}	{6,#,3,#,1,#,2,#,4,#,5}
{6,3,#,1,5,#,2,4}	{6,#,3,#,1,#,2,#,5,#,4}	{6,#,3,#,1,#,2,#,5,#,4}
{6,3,#,2,4,1,#,#,5}	{6,#,3,#,2,#,1,#,4,#,5}	{6,#,3,#,2,#,1,#,4,#,5}
{6,3,#,2,5,1,#,4}	{6,#,3,#,2,#,1,#,5,#,4}	{6,#,3,#,2,#,1,#,5,#,4}
{6,4,#,1,5,#,2,#,#,#,3}	{6,#,4,#,1,#,2,#,3,#,5}	{6,#,4,#,1,#,2,#,3,#,5}
{6,4,#,1,5,#,3,#,#,2}	{6,#,4,#,1,#,3,#,2,#,5}	{6,#,4,#,1,#,3,#,2,#,5}
{6,4,#,2,5,1,3}	{6,#,4,#,2,#,1,#,3,#,5}	{6,#,4,#,2,#,1,#,3,#,5}
{6,4,#,3,5,1,#,#,#,#,2}	{6,#,4,#,3,#,1,#,2,#,5}	{6,#,4,#,3,#,1,#,2,#,5}
{6,4,#,3,5,2,#,#,#,1}	{6,#,4,#,3,#,2,#,1,#,5}	{6,#,4,#,3,#,2,#,1,#,5}
{6,5,#,1,#,#,2,#,3,#,4}	{6,#,5,#,1,#,2,#,3,#,4}	{6,#,5,#,1,#,2,#,3,#,4}
{6,5,#,1,#,#,2,#,4,3}	{6,#,5,#,1,#,2,#,4,#,3}	{6,#,5,#,1,#,2,#,4,#,3}
{6,5,#,1,#,#,3,2,4}	{6,#,5,#,1,#,3,#,2,#,4}	{6,#,5,#,1,#,3,#,2,#,4}
{6,5,#,1,#,#,4,2,#,#,3}	{6,#,5,#,1,#,4,#,2,#,3}	{6,#,5,#,1,#,4,#,2,#,3}
{6,5,#,1,#,#,4,3,#,2}	{6,#,5,#,1,#,4,#,3,#,2}	{6,#,5,#,1,#,4,#,3,#,2}
{6,5,#,2,#,1,3,#,#,#,4}	{6,#,5,#,2,#,1,#,3,#,4}	{6,#,5,#,2,#,1,#,3,#,4}
{6,5,#,2,#,1,4,#,#,3}	{6,#,5,#,2,#,1,#,4,#,3}	{6,#,5,#,2,#,1,#,4,#,3}
{6,5,#,3,#,1,4,#,2}	{6,#,5,#,3,#,1,#,2,#,4}	{6,#,5,#,3,#,1,#,2,#,4}
{6,5,#,3,#,2,4,1}	{6,#,5,#,3,#,2,#,1,#,4}	{6,#,5,#,3,#,2,#,1,#,4}
{6,5,#,4,#,1,#,#,2,#,3}	{6,#,5,#,4,#,1,#,2,#,3}	{6,#,5,#,4,#,1,#,2,#,3}
{6,5,#,4,#,1,#,#,3,2}	{6,#,5,#,4,#,1,#,3,#,2}	{6,#,5,#,4,#,1,#,3,#,2}
{6,5,#,4,#,2,#,1,3}	{6,#,5,#,4,#,2,#,1,#,3}	{6,#,5,#,4,#,2,#,1,#,3}
{6,5,#,4,#,3,#,1,#,#,2}	{6,#,5,#,4,#,3,#,1,#,2}	{6,#,5,#,4,#,3,#,1,#,2}
{6,5,#,4,#,3,#,2,#,1}	{6,#,5,#,4,#,3,#,2,#,1}	{6,#,5,#,4,#,3,#,2,#,1}
{3,9,20,#,#,15,7}	{3,#,9,#,20,#,15,#,7}	{3,#,9,#,20,#,15,#,7}
{0,2,4,1,#,3,-1,5,1,#,6,#,8}	{0,#,2,#,1,#,5,#,1,#,4,#,3,#,6,#,-1,#,8}	{0,#,2,#,1,#,5,#,1,#,4,#,3,#,6,#,-1,#,8}
{-8,-6,7,6,#,#,#,#,5}	{-8,#,-6,#,6,#,5,#,7}	{-8,#,-6,#,6,#,5,#,7}
{-8,3,0,-8,#,#,#,#,-1,#,8}	{-8,#,3,#,-8,#,-1,#,8,#,0}	{-8,#,3,#,-8,#,-1,#,8,#,0}
{3,4,5,-7,-6,#,#,-7,#,-5,#,#,#,-4}	{3,#,4,#,-7,#,-7,#,-6,#,-5,#,-4,#,5}	{3,#,4,#,-7,#,-7,#,-6,#,-5,#,-4,#,5}
{7,-7,8,#,#,-3,6,#,9,#,#,#,-5}	{7,#,-7,#,8,#,-3,#,9,#,-5,#,6}	{7,#,-7,#,8,#,-3,#,9,#,-5,#,6}
{-9,-3,2,#,4,4,0,-6,#,-5}	{-9,#,-3,#,4,#,-6,#,2,#,4,#,-5,#,0}	{-9,#,-3,#,4,#,-6,#,2,#,4,#,-5,#,0}
{0,-3,-2,-9,-8,#,#,2,#,#,-5,5}	{0,#,-3,#,-9,#,2,#,5,#,-8,#,-5,#,-2}	{0,#,-3,#,-9,#,2,#,5,#,-8,#,-5,#,-2}
{-2,0,-1,#,3,0,#,6,#,5,-5}	{-2,#,0,#,3,#,6,#,-1,#,0,#,5,#,-5}	{-2,#,0,#,3,#,6,#,-1,#,0,#,5,#,-5}
{0,-4,-3,#,-1,8,#,#,3,#,-9,-2,#,4}	{0,#,-4,#,-1,#,3,#,-2,#,-3,#,8,#,-9,#,4}	{0,#,-4,#,-1,#,3,#,-2,#,-3,#,8,#,-9,#,4}
{-1,-7,9,#,#,-1,-7,#,8,-9}	{-1,#,-7,#,9,#,-1,#,8,#,-7,#,-9}	{-1,#,-7,#,9,#,-1,#,8,#,-7,#,-9}
{9,#,2,0,#,-7,#,-1}	{9,#,2,#,0,#,-7,#,-1}	{9,#,2,#,0,#,-7,#,-1}
{5,0,-4,-1,-6,-9,#,7,#,1,3,#,0,#,9,#,#,6,0,#,-7,#,#,#,#,#,#,-4,#,1,#,#,-4}	{5,#,0,#,-1,#,7,#,9,#,-6,#,1,#,3,#,6,#,0,#,-4,#,-9,#,0,#,-7,#,-4,#,1,#,-4}	{5,#,0,#,-1,#,7,#,9,#,-6,#,1,#,3,#,6,#,0,#,-4,#,-9,#,0,#,-7,#,-4,#,1,#,-4}
{4,-4,8,1,#,#,#,-4,-9,#,#,8,-9,7,-9,-6,6,#,#,#,#,#,#,-7,#,#,-1}	{4,#,-4,#,1,#,-4,#,-9,#,8,#,7,#,-9,#,-9,#,-6,#,6,#,-7,#,-1,#,8}	{4,#,-4,#,1,#,-4,#,-9,#,8,#,7,#,-9,#,-9,#,-6,#,6,#,-7,#,-1,#,8}
{2,0,5,#,-5,-1,#,#,5,5,7,#,#,0,-3,-9,#,#,8}	{2,#,0,#,-5,#,5,#,5,#,-1,#,5,#,0,#,8,#,-3,#,7,#,-9}	{2,#,0,#,-5,#,5,#,5,#,-1,#,5,#,0,#,8,#,-3,#,7,#,-9}
{-2,-9,0,3,5,-1,9,5,2,#,#,-3,#,-7,6,-6,#,#,#,-1,#,#,#,-9,9,#,#,#,#,8,#,-2,5}	{-2,#,-9,#,3,#,5,#,-6,#,2,#,5,#,0,#,-1,#,-3,#,-1,#,9,#,-7,#,6,#,-9,#,8,#,9,#,-2,#,5}	{-2,#,-9,#,3,#,5,#,-6,#,2,#,5,#,0,#,-1,#,-3,#,-1,#,9,#,-7,#,6,#,-9,#,8,#,9,#,-2,#,5}
{5,2,-2,4,-4,-9,2,7,2,#,-9,-9,#,#,3,#,7,#,#,#,#,#,#,#,3}	{5,#,2,#,4,#,7,#,7,#,2,#,-4,#,-9,#,-2,#,-9,#,-9,#,2,#,3,#,3}	{5,#,2,#,4,#,7,#,7,#,2,#,-4,#,-9,#,-2,#,-9,#,-9,#,2,#,3,#,3}
{3,7,2,7,-4,1,#,-6,6,#,#,#,#,7,#,-5,6,#,-3,#,0,-7,#,8,#,-9,#,2,#,#,#,#,-8}	{3,#,7,#,7,#,-6,#,7,#,-3,#,8,#,6,#,-5,#,0,#,-9,#,-8,#,6,#,-7,#,2,#,-4,#,2,#,1}	{3,#,7,#,7,#,-6,#,7,#,-3,#,8,#,6,#,-5,#,0,#,-9,#,-8,#,6,#,-7,#,2,#,-4,#,2,#,1}
{1,#,-9,#,8,4,-3,#,#,-3,#,-6,#,#,-6,-4,-9,#,#,6}	{1,#,-9,#,8,#,4,#,-3,#,-3,#,-6,#,-6,#,-4,#,-9,#,6}	{1,#,-9,#,8,#,4,#,-3,#,-3,#,-6,#,-6,#,-4,#,-9,#,6}
{-9,5,0,-2,-6,#,#,5,#,#,-3,6,-5,#,#,#,0}	{-9,#,5,#,-2,#,5,#,6,#,0,#,-5,#,-6,#,-3,#,0}	{-9,#,5,#,-2,#,5,#,6,#,0,#,-5,#,-6,#,-3,#,0}
{4,-7,-3,#,#,-9,-3,9,-7,-4,#,6,#,-6,-6,#,#,0,6,5,#,9,#,#,-1,-4,#,#,#,-2}	{4,#,-7,#,-3,#,-9,#,9,#,6,#,0,#,-1,#,6,#,-4,#,-7,#,-6,#,5,#,-6,#,9,#,-2,#,-3,#,-4}	{4,#,-7,#,-3,#,-9,#,9,#,6,#,0,#,-1,#,6,#,-4,#,-7,#,-6,#,5,#,-6,#,9,#,-2,#,-3,#,-4}
{-6,8,-4,8,-5,-1,#,-9,9,8,8,#,#,-5,6,#,#,#,-4,#,4,#,#,8,8,#,#,#,5,#,#,#,#,#,-9}	{-6,#,8,#,8,#,-9,#,-5,#,6,#,8,#,8,#,9,#,-5,#,8,#,-4,#,8,#,4,#,5,#,-9,#,-4,#,-1}	{-6,#,8,#,8,#,-9,#,-5,#,6,#,8,#,8,#,9,#,-5,#,8,#,-4,#,8,#,4,#,5,#,-9,#,-4,#,-1}
{69,73,68,18,20,18,39,7,-3,13,-1,42,5,93,70,63,17,#,91,-4,30,#,-1,64,-4,16,49,48,78,51,43,92,45,#,53,9,36,80,-6,58,78,#,#,41,81,89,67,71,#,25,#,82,54,28,14,61,57,35,5,83,9,18,#,-9,-9,50,92,93,#,0,80,62,1,28,29,27,89,21,#,85,-9,#,56,56,-9,#,#,43,#,29,97,-7,#,35,25,90,67,53,18,61,7,23,81,37,19,26,2,0,19,#,#,77,37,-2,#,49,39,28,1,37,11,87,83,68,55,53,33,-2,22,7,52,#,14,#,18,50,97,-8,-7,#,21,59,72,27,#,64,#,#,47,#,#,38,46,#,#,99,#,#,48,13,85,78,7,64,43,59,71,11,37,12,37,50,2,#,#,89,87,#,78,97,#,31,86,37,96,34,38,6,36,#,#,99,63,#,12,#,82,#,81,70,19,#,81,32,#,#,#,#,79,10,#,91,48,-3,94,65,#,20,26,96,21,92,91,#,89,9,74,#,#,96,#,64,67,50,96,#,#,#,#,#,#,40,78,#,27,3,17,#,#,2,45,#,#,#,#,#,13,#,#,17,45,69,30,#,#,43,#,4,13,-6,66,6,#,16,48,55,98,69,57,#,5,9,65,-9,55,2,#,#,#,#,#,#,68,#,#,#,5,61,51,#,#,32,43,#,35,20,#,-7,38,30,1,80,#,#,42,86,42,#,#,#,#,47,#,#,#,62,29,-9,83,60,71,48,#,24,#,76,6,65,18,95,29,11,#,38,#,#,#,#,21,3,6,23,36,#,45,#,34,#,#,#,#,#,#,41,#,57,13,18,92,43,83,#,#,#,#,#,#,#,2,-4,97,#,93,#,62,#,#,48,18,71,92,53,89,#,#,#,95,#,16,#,#,#,83,87,5,#,#,3,-8,-4,65,#,#,#,22,#,31,#,#,#,63,#,#,62,#,57,12,85,45,23,55,#,#,#,81,83,23,#,3,#,83,#,-4,#,#,#,#,#,64,#,15,50,57,#,#,#,4,#,#,#,29,#,#,87,#,22,92,#,#,67,90,#,93,47,46,#,#,#,28,72,18,59,25,3,74,#,#,#,-5,28,-1,61,15,#,#,#,#,79,#,16,#,#,59,47,-7,98,31,50,#,#,#,#,19,#,93,#,22,#,#,-5,40,#,#,#,75,30,#,7,53,76,#,#,#,#,#,68,19,#,63,41,91,#,43,#,49,#,#,#,#,#,46,#,#,87,74,49,1,21,62,6,34,77,#,#,#,#,#,#,-9,61,#,#,#,7,#,45,#,#,63,#,#,7,#,#,16,86,#,#,63,#,61,72,#,13,#,24,91,#,#,59,#,#,48,14,77,#,#,#,#,92,#,#,#,#,#,#,84,#,#,76,82,63,84,84,94,#,#,#,#,#,47,40,#,#,#,#,75,20,#,#,#,-9,#,#,24,74,#,51,#,#,91,#,83,17,#,#,#,42,49,88,57,85,1,#,94,#,28,36,78,#,53,#,27,25,46,97,58,#,#,#,#,#,#,#,#,12,33,#,#,6,#,#,#,87,#,#,#,#,#,#,#,9,#,83,#,#,#,90,11,#,61,#,89,#,46,#,86,81,#,#,#,#,#,#,#,53,#,#,59,#,#,#,#,#,#,#,29,#,47,97,0,#,#,#,#,9,#,17,#,91,45,9,61,21,#,#,64,#,69,#,44,#,#,#,#,12,#,2,-8,88,#,#,#,#,#,-8,#,93,#,#,#,86,#,#,97,#,#,#,#,72,#,#,#,#,#,50,#,#,#,#,#,47,70,#,62,#,-3,-5,59,15,#,-3,37,#,#,#,#,20,-2,#,8,90,#,#,#,61,#,#,#,#,#,#,#,15,12,95,#,#,73,11,76,76,49,#,#,51,#,#,#,#,#,#,#,#,#,#,#,#,#,42,#,#,-9,#,#,#,#,#,#,#,#,80,#,#,70,31,78,98,#,#,#,#,#,#,#,#,#,#,#,#,7,#,#,#,#,57,#,#,#,#,-3,#,#,-7,#,31,42,#,#,#,#,62,17,7,#,#,63,#,#,#,#,83,51,#,76,77,#,#,40,#,#,95,#,27,55,61,#,#,#,#,#,#,#,#,#,#,#,#,#,#,#,#,#,#,#,95,#,93,19,#,37,#,73,#,#,#,#,#,75,#,#,#,#,#,22,#,#,#,#,#,-7,99,#,#,#,#,#,94,63,#,#,#,#,#,#,#,39,77,#,-2,15,#,69,33,9,#,#,#,#,#,#,#,#,#,42,#,#,#,69,35,#,36,#,11,#,#,#,52,#,#,#,#,#,#,#,51,50,#,#,#,#,#,#,30,#,#,#,#,#,63,#,#,#,#,#,#,56,28}	{69,#,73,#,18,#,7,#,63,#,92,#,83,#,26,#,31,#,5,#,81,#,86,#,86,#,61,#,83,#,63,#,29,#,23,#,61,#,47,#,51,#,3,#,72,#,97,#,42,#,0,#,-9,#,2,#,37,#,96,#,32,#,83,#,13,#,43,#,-4,#,24,#,91,#,9,#,9,#,0,#,34,#,35,#,38,#,20,#,19,#,6,#,-7,#,64,#,38,#,15,#,59,#,17,#,36,#,30,#,50,#,48,#,91,#,45,#,57,#,14,#,9,#,80,#,61,#,70,#,95,#,69,#,77,#,21,#,31,#,93,#,33,#,9,#,51,#,63,#,56,#,28,#,50,#,19,#,78,#,37,#,1,#,45,#,18,#,17,#,53,#,-9,#,77,#,37,#,99,#,80,#,4,#,63,#,42,#,-9,#,-2,#,12,#,86,#,29,#,42,#,-3,#,91,#,9,#,50,#,49,#,82,#,39,#,81,#,92,#,28,#,70,#,47,#,87,#,92,#,64,#,98,#,73,#,19,#,1,#,81,#,62,#,22,#,92,#,29,#,36,#,93,#,37,#,32,#,-9,#,67,#,84,#,69,#,90,#,83,#,93,#,76,#,44,#,82,#,11,#,20,#,13,#,-4,#,80,#,0,#,87,#,79,#,60,#,47,#,63,#,84,#,12,#,46,#,84,#,2,#,-8,#,94,#,88,#,7,#,71,#,83,#,10,#,48,#,28,#,80,#,68,#,91,#,24,#,72,#,18,#,47,#,48,#,76,#,59,#,40,#,25,#,6,#,3,#,75,#,-8,#,74,#,20,#,93,#,55,#,-3,#,65,#,18,#,-5,#,94,#,95,#,28,#,-9,#,-1,#,24,#,86,#,57,#,29,#,61,#,74,#,97,#,15,#,51,#,-6,#,62,#,53,#,65,#,11,#,33,#,20,#,38,#,26,#,1,#,-2,#,96,#,21,#,79,#,91,#,21,#,3,#,16,#,83,#,72,#,-3,#,75,#,6,#,59,#,17,#,22,#,92,#,23,#,47,#,-7,#,42,#,49,#,50,#,36,#,98,#,88,#,57,#,31,#,85,#,47,#,-7,#,70,#,31,#,42,#,22,#,42,#,1,#,62,#,91,#,45,#,50,#,94,#,-3,#,30,#,58,#,28,#,7,#,89,#,34,#,52,#,9,#,74,#,29,#,14,#,78,#,27,#,18,#,96,#,89,#,50,#,64,#,41,#,19,#,28,#,-5,#,62,#,17,#,59,#,7,#,-7,#,67,#,57,#,93,#,36,#,15,#,63,#,99,#,69,#,78,#,-3,#,37,#,13,#,22,#,53,#,97,#,50,#,18,#,92,#,-5,#,27,#,40,#,25,#,20,#,83,#,51,#,-2,#,76,#,94,#,35,#,63,#,36,#,30,#,46,#,8,#,77,#,96,#,43,#,83,#,75,#,97,#,90,#,40,#,58,#,-1,#,-1,#,68,#,18,#,42,#,64,#,41,#,21,#,-8,#,-7,#,81,#,85,#,21,#,-9,#,59,#,40,#,78,#,72,#,27,#,-4,#,89,#,56,#,27,#,3,#,2,#,30,#,17,#,-4,#,7,#,53,#,97,#,76,#,67,#,56,#,64,#,-9,#,47,#,2,#,93,#,45,#,62,#,5,#,16,#,71,#,49,#,25,#,43,#,39,#,93,#,48,#,82,#,29,#,38,#,46,#,97,#,54,#,-7,#,99,#,13,#,78,#,28,#,35,#,48,#,25,#,13,#,17,#,48,#,68,#,12,#,61,#,33,#,19,#,18,#,63,#,6,#,45,#,71,#,41,#,91,#,87,#,92,#,43,#,85,#,69,#,53,#,49,#,89,#,30,#,14,#,90,#,78,#,7,#,43,#,95,#,67,#,64,#,4,#,16,#,46,#,13,#,43,#,-6,#,83,#,66,#,87,#,87,#,9,#,15,#,95,#,12,#,27,#,39,#,11,#,55,#,77,#,74,#,83,#,95,#,61,#,-2,#,52,#,15,#,5,#,49,#,1,#,90,#,73,#,11,#,11,#,76,#,70,#,51,#,61,#,53,#,59,#,6,#,71,#,16,#,3,#,21,#,61,#,76,#,49,#,62,#,89,#,-8,#,6,#,46,#,51,#,34,#,86,#,48,#,-4,#,77,#,81,#,65,#,18,#,11,#,55,#,98,#,22,#,37,#,69,#,31,#,-9,#,57,#,57,#,61,#,12,#,5,#,63,#,61,#,37,#,9,#,65,#,62,#,7,#,50,#,-9,#,57,#,7,#,12,#,45,#,53,#,55,#,85,#,63,#,59,#,45,#,2,#,2,#,23,#,7,#,55,#,16,#,43,#,35,#,23,#,81,#,89,#,87,#,5,#,37,#,78,#,68,#,19,#,97}	{69,#,73,#,18,#,7,#,63,#,92,#,83,#,26,#,31,#,5,#,81,#,86,#,86,#,61,#,83,#,63,#,29,#,23,#,61,#,47,#,51,#,3,#,72,#,97,#,42,#,0,#,-9,#,2,#,37,#,96,#,32,#,83,#,13,#,43,#,-4,#,24,#,91,#,9,#,9,#,0,#,34,#,35,#,38,#,20,#,19,#,6,#,-7,#,64,#,38,#,15,#,59,#,17,#,36,#,30,#,50,#,48,#,91,#,45,#,57,#,14,#,9,#,80,#,61,#,70,#,95,#,69,#,77,#,21,#,31,#,93,#,33,#,9,#,51,#,63,#,56,#,28,#,50,#,19,#,78,#,37,#,1,#,45,#,18,#,17,#,53,#,-9,#,77,#,37,#,99,#,80,#,4,#,63,#,42,#,-9,#,-2,#,12,#,86,#,29,#,42,#,-3,#,91,#,9,#,50,#,49,#,82,#,39,#,81,#,92,#,28,#,70,#,47,#,87,#,92,#,64,#,98,#,73,#,19,#,1,#,81,#,62,#,22,#,92,#,29,#,36,#,93,#,37,#,32,#,-9,#,67,#,84,#,69,#,90,#,83,#,93,#,76,#,44,#,82,#,11,#,20,#,13,#,-4,#,80,#,0,#,87,#,79,#,60,#,47,#,63,#,84,#,12,#,46,#,84,#,2,#,-8,#,94,#,88,#,7,#,71,#,83,#,10,#,48,#,28,#,80,#,68,#,91,#,24,#,72,#,18,#,47,#,48,#,76,#,59,#,40,#,25,#,6,#,3,#,75,#,-8,#,74,#,20,#,93,#,55,#,-3,#,65,#,18,#,-5,#,94,#,95,#,28,#,-9,#,-1,#,24,#,86,#,57,#,29,#,61,#,74,#,97,#,15,#,51,#,-6,#,62,#,53,#,65,#,11,#,33,#,20,#,38,#,26,#,1,#,-2,#,96,#,21,#,79,#,91,#,21,#,3,#,16,#,83,#,72,#,-3,#,75,#,6,#,59,#,17,#,22,#,92,#,23,#,47,#,-7,#,42,#,49,#,50,#,36,#,98,#,88,#,57,#,31,#,85,#,47,#,-7,#,70,#,31,#,42,#,22,#,42,#,1,#,62,#,91,#,45,#,50,#,94,#,-3,#,30,#,58,#,28,#,7,#,89,#,34,#,52,#,9,#,74,#,29,#,14,#,78,#,27,#,18,#,96,#,89,#,50,#,64,#,41,#,19,#,28,#,-5,#,62,#,17,#,59,#,7,#,-7,#,67,#,57,#,93,#,36,#,15,#,63,#,99,#,69,#,78,#,-3,#,37,#,13,#,22,#,53,#,97,#,50,#,18,#,92,#,-5,#,27,#,40,#,25,#,20,#,83,#,51,#,-2,#,76,#,94,#,35,#,63,#,36,#,30,#,46,#,8,#,77,#,96,#,43,#,83,#,75,#,97,#,90,#,40,#,58,#,-1,#,-1,#,68,#,18,#,42,#,64,#,41,#,21,#,-8,#,-7,#,81,#,85,#,21,#,-9,#,59,#,40,#,78,#,72,#,27,#,-4,#,89,#,56,#,27,#,3,#,2,#,30,#,17,#,-4,#,7,#,53,#,97,#,76,#,67,#,56,#,64,#,-9,#,47,#,2,#,93,#,45,#,62,#,5,#,16,#,71,#,49,#,25,#,43,#,39,#,93,#,48,#,82,#,29,#,38,#,46,#,97,#,54,#,-7,#,99,#,13,#,78,#,28,#,35,#,48,#,25,#,13,#,17,#,48,#,68,#,12,#,61,#,33,#,19,#,18,#,63,#,6,#,45,#,71,#,41,#,91,#,87,#,92,#,43,#,85,#,69,#,53,#,49,#,89,#,30,#,14,#,90,#,78,#,7,#,43,#,95,#,67,#,64,#,4,#,16,#,46,#,13,#,43,#,-6,#,83,#,66,#,87,#,87,#,9,#,15,#,95,#,12,#,27,#,39,#,11,#,55,#,77,#,74,#,83,#,95,#,61,#,-2,#,52,#,15,#,5,#,49,#,1,#,90,#,73,#,11,#,11,#,76,#,70,#,51,#,61,#,53,#,59,#,6,#,71,#,16,#,3,#,21,#,61,#,76,#,49,#,62,#,89,#,-8,#,6,#,46,#,51,#,34,#,86,#,48,#,-4,#,77,#,81,#,65,#,18,#,11,#,55,#,98,#,22,#,37,#,69,#,31,#,-9,#,57,#,57,#,61,#,12,#,5,#,63,#,61,#,37,#,9,#,65,#,62,#,7,#,50,#,-9,#,57,#,7,#,12,#,45,#,53,#,55,#,85,#,63,#,59,#,45,#,2,#,2,#,23,#,7,#,55,#,16,#,43,#,35,#,23,#,81,#,89,#,87,#,5,#,37,#,78,#,68,#,19,#,97}
{42,10,11,60,65,50,98,66,84,35,97,-6,#,-1,73,2,61,8,20,11,21,13,50,88,89,20,59,65,66,#,81,-7,12,20,-5,82,-8,96,44,58,91,31,65,29,3,93,74,#,#,10,-4,91,55,85,20,52,18,#,#,11,6,91,6,58,82,#,#,21,#,84,#,7,31,#,-9,57,32,94,61,44,61,35,31,-7,54,15,75,21,-9,65,57,74,#,-2,89,24,6,95,#,#,47,#,#,79,#,36,31,79,86,9,5,86,92,-4,83,76,3,24,10,1,10,72,95,43,0,#,38,41,40,-6,10,93,62,94,82,4,-3,25,91,19,36,#,95,37,67,13,15,18,39,57,13,64,50,#,#,26,-3,-7,99,#,-9,77,16,91,9,#,#,#,26,#,78,83,19,76,92,74,96,46,14,#,#,8,98,#,#,26,#,-7,64,39,91,79,60,80,10,3,-2,29,85,53,70,50,24,#,56,#,#,33,#,-5,71,8,62,72,35,83,#,#,#,14,85,-5,17,#,5,2,14,-8,3,73,49,#,89,#,84,#,85,-3,16,8,-9,#,#,91,18,76,#,5,58,58,4,#,#,#,#,95,#,-3,82,99,6,#,#,49,58,-3,54,91,63,#,12,#,26,34,64,93,#,#,#,#,25,-9,91,64,33,76,27,#,#,80,#,#,#,50,68,#,#,#,10,#,#,60,#,#,50,8,#,30,35,36,5,17,22,61,38,40,#,12,98,68,65,60,48,#,20,44,20,59,78,10,91,81,8,3,27,61,#,69,#,53,#,#,#,#,#,92,#,#,#,99,91,15,71,21,66,37,5,#,#,#,12,52,#,#,7,69,28,#,#,68,13,94,76,#,#,#,82,-7,94,#,#,#,42,#,3,#,22,#,25,#,89,99,#,74,60,93,25,75,56,#,14,#,1,24,6,#,#,#,#,-1,#,#,66,3,73,91,60,#,#,16,42,17,81,14,96,33,#,55,#,#,-9,67,4,9,53,#,#,#,#,#,#,#,#,#,42,96,#,29,16,59,#,-3,56,90,#,72,#,#,87,#,#,#,#,#,#,#,#,#,75,#,#,54,#,4,39,-2,#,44,80,14,#,95,8,76,19,#,#,#,#,#,#,#,66,#,68,92,94,5,8,96,#,80,#,#,#,40,52,30,-7,85,#,72,90,1,44,4,59,19,#,#,#,-9,-8,32,63,1,#,25,#,21,33,37,96,-1,43,#,83,80,65,68,99,88,#,48,77,14,#,14,8,#,#,#,#,#,#,#,#,#,89,#,#,14,#,37,#,#,#,#,#,#,#,20,#,#,#,61,20,#,#,#,34,50,53,#,#,51,#,98,25,42,77,59,36,18,68,4,-5,36,71,#,37,78,#,#,#,#,#,#,#,#,#,#,44,74,92,#,#,3,21,76,32,79,#,59,3,86,-9,81,-4,#,#,#,31,61,32,#,#,98,#,-8,5,64,#,43,32,#,78,#,36,#,#,#,48,#,#,#,78,71,#,71,80,12,#,#,#,#,#,29,52,1,83,5,95,2,56,93,65,86,95,#,#,#,#,58,7,#,20,-2,84,#,-9,13,#,#,33,#,58,#,#,0,38,#,#,-9,#,88,#,78,24,#,14,#,#,9,75,53,-3,#,88,71,84,76,62,85,53,#,#,#,79,36,-5,#,91,57,17,#,#,#,#,36,12,-7,51,63,-3,77,40,13,17,10,5,89,-4,72,27,53,#,83,65,#,#,#,#,#,33,#,96,#,#,85,60,9,38,23,#,#,#,39,#,#,#,16,85,99,51,#,#,#,#,#,#,54,#,#,62,#,#,57,90,61,99,69,2,23,71,35,#,-4,51,-1,#,30,3,#,#,17,42,#,#,77,95,39,85,#,-8,43,5,86,#,33,56,47,78,9,70,57,3,29,71,#,#,#,#,#,#,#,#,47,92,85,38,-3,#,#,22,#,#,34,37,#,86,79,68,84,#,#,#,#,#,#,#,78,58,#,#,49,#,#,11,#,#,#,#,#,#,#,88,65,#,50,#,52,#,55,#,13,0,#,#,#,#,30,86,60,68,48,85,#,#,#,20,#,#,#,39,52,77,62,#,82,-6,#,#,60,#,71,#,#,#,39,0,53,#,#,11,#,#,#,3,85,3,78,#,78,-1,30,72,#,#,#,#,35,29,40,79,86,12,21,#,48,46,70,98,62,22,93,#,#,#,#,#,#,#,45,#,#,#,#,#,-6,#,#,#,#,71,#,#,#,#,68,#,41,93,#,#,62,78,-7,14,#,19,16,91,#,#,#,#,#,20,90,51,42,#,#,93,85,#,#,58,9,#,-3,27,86,42,#,#,#,#,#,17,#,#,#,#,22,-8,93,8,49,90,#,#,63,19,39,#,#,#,17,4,54,8,-5,76,#,#,-9,-6,#,34,#,51,10,20,#,23,14,91,26,47,#,47,67,#,#,26,#,#,#,#,#,#,#,#,34,#,15,0,85,13,3,88,86,#,80,39,33,#,52,#,#,39,#,-4,21,#,#,#,2,89,#,#,-1,-6,#,17,-1,65,#,#,#,#,#,19,#,#,63,#,#,#,#,#,-1,68,#,#,#,#,#,#,#,#,17,#,#,#,93,42,#,#,#,12,#,#,#,92,85,82,8,#,#,34,18,90,50,#,99,89,#,19,#,#,78,#,74,-2,#,#,#,63,#,#,38,38,#,#,#,#,#,#,#,#,#,#,74,#,8,#,#,#,49,#,#,#,21,0,#,2,60,15,36,83,59,54,#,-3,#,#,#,-8,#,5,49,32,#,#,#,#,#,7,#,#,#,55,#,#,26,78,98,#,#,57,#,#,83,63,#,#,#,#,81,#,#,33,#,#,#,#,#,#,16,14,#,#,-4,44,#,#,37,16,16,33,#,84,#,25,10,#,#,30,#,#,#,#,#,#,65,#,#,#,93,#,#,#,44,57,12,52,-4,67,#,49,#,#,#,#,#,#,#,64,17,#,#,#,83,4,61,75,#,#,#,#,#,#,24,#,78,-7,#,-5,#,#,30,79,#,44,94,55,14,59,#,#,#,#,#,#,60,#,#,#,#,25,#,#,#,#,97,34,#,#,#,#,80,67,0,#,22,#,96,#,#,#,#,#,#,#,#,47,#,#,#,#,89,#,#,#,#,43,64,#,#,9,#,#,96,37,79,#,#,#,28,81,#,#,5,#,#,7,96,41,82,-6,20,#,#,#,8,#,#,#,#,#,#,#,#,#,82,8,#,#,#,#,#,#,#,#,39,6,#,#,#,#,90,59,-8,#,#,#,#,#,23,#,#,#,15,89,#,#,86,50,40,70,#,#,32,#,#,#,44,-2,#,38,39,#,#,#,#,#,#,#,#,#,2,#,#,#,#,2,#,#,65,47,#,#,62,27,62,38,31,27,#,#,37,#,#,#,#,#,#,#,62,74,86,-7,#,23,#,#,56,#,#,#,6,#,86,72,30,#,#,21,41,92,#,#,#,#,22,#,74,96,87,#,#,#,#,#,-7,#,51,34,80,#,#,#,#,#,#,#,16,20,#,#,15,81,#,55,#,61,#,#,22,#,5,14,#,34,23,#,30,#,6,64,2,65,#,54,#,#,14,#,0,#,#,#,26,#,#,78,#,49,#,#,13,#,#,#,43,#,#,-1,41,33,#,5,78,#,#,#,#,#,#,#,#,#,#,75,#,#,#,#,#,#,63,70,#,#,#,#,#,40,#,#,#,66,#,#,15,#,7,43,#,60,12,#,#,#,#,#,#,#,19,#,74,-5,55,#,#,#,#,52,-4,-5,#,#,#,65,#,#,67,#,3,#,#,95,#,#,36,#,81,#,#,#,#,#,88,74,#,67,#,#,#,#,68,#,#,#,#,52,#,#,82,90,75,25,#,23,#,68,6,11,#,59,#,#,#,#,#,#,#,#,-2,#,#,#,61,#,#,#,32,80,#,#,#,51,6,#,91,#,#,37,#,26,#,78,#,#,#,#,#,#,#,34,#,#,#,#,#,#,24,31,#,#,99,56,#,#,62,12,43,#,#,#,#,#,#,33,#,68,#,#,#,#,53,4,65,4,#,86,#,46,-9,#,#,83,#,#,#,#,93,#,#,78,#,63,#,#,#,#,#,67,#,#,#,#,72,93,25,#,#,27,#,#,92,44,#,#,#,#,2,9,31,#,#,73,92,62,86,#,#,-6,#,#,#,#,58,#,#,#,#,#,#,#,#,54,#,#,#,#,#,#,#,#,16,#,#,#,#,#,#,#,#,#,#,#,28,#,48,#,#,#,#,#,26,#,#,#,#,#,#,37,66,#,#,92,#,#,#,#,86,89,#,#,#,#,#,#,5,85,#,#,75,#,35,#,#,#,#,#,#,#,27,#,#,#,#,#,#,67,84,94,44,#,#,#,#,#,#,#,#,#,#,70,#,#,49,#,#,16,#,#,#,#,#,#,#,87,#,-7,52,#,#,#,67,#,#,#,#,#,#,#,#,#,#,#,#,#,#,80,#,76,#,25,#,91,#,12,41,#,#,26,#,#,#,#,#,#,#,#,#,#,#,#,#,#,94}	{42,#,10,#,60,#,66,#,2,#,81,#,61,#,-7,#,11,#,79,#,8,#,30,#,4,#,29,#,52,#,88,#,39,#,1,#,65,#,83,#,50,#,17,#,79,#,35,#,-2,#,5,#,52,#,95,#,55,#,93,#,42,#,28,#,13,#,24,#,31,#,81,#,98,#,36,#,44,#,2,#,13,#,0,#,12,#,56,#,80,#,93,#,65,#,30,#,86,#,92,#,5,#,43,#,5,#,14,#,86,#,60,#,85,#,7,#,-1,#,99,#,56,#,28,#,49,#,25,#,82,#,96,#,41,#,33,#,62,#,48,#,16,#,91,#,12,#,41,#,5,#,43,#,68,#,8,#,82,#,78,#,-6,#,95,#,48,#,34,#,20,#,85,#,18,#,90,#,8,#,86,#,6,#,9,#,26,#,17,#,95,#,8,#,22,#,76,#,58,#,7,#,20,#,50,#,19,#,20,#,5,#,-7,#,61,#,38,#,64,#,40,#,12,#,91,#,86,#,39,#,12,#,66,#,-2,#,39,#,99,#,89,#,84,#,52,#,19,#,77,#,98,#,68,#,-9,#,62,#,78,#,82,#,8,#,75,#,91,#,68,#,92,#,13,#,82,#,74,#,-2,#,-6,#,94,#,33,#,65,#,5,#,58,#,60,#,63,#,8,#,92,#,79,#,60,#,96,#,0,#,71,#,38,#,48,#,80,#,60,#,20,#,6,#,-4,#,80,#,44,#,40,#,-9,#,39,#,38,#,38,#,39,#,6,#,0,#,52,#,88,#,53,#,20,#,30,#,78,#,11,#,24,#,-7,#,14,#,3,#,10,#,59,#,85,#,78,#,72,#,9,#,85,#,3,#,74,#,75,#,78,#,8,#,90,#,53,#,78,#,-1,#,49,#,90,#,59,#,63,#,33,#,26,#,70,#,68,#,-3,#,30,#,72,#,21,#,-8,#,0,#,83,#,3,#,10,#,1,#,88,#,44,#,71,#,84,#,35,#,2,#,29,#,60,#,23,#,15,#,91,#,4,#,76,#,40,#,36,#,15,#,40,#,89,#,83,#,79,#,59,#,86,#,66,#,50,#,54,#,40,#,15,#,53,#,4,#,37,#,70,#,7,#,65,#,66,#,4,#,92,#,87,#,12,#,43,#,86,#,62,#,86,#,-3,#,12,#,59,#,85,#,21,#,-8,#,32,#,60,#,46,#,53,#,48,#,5,#,46,#,49,#,44,#,12,#,-9,#,86,#,-7,#,41,#,89,#,52,#,26,#,94,#,-2,#,32,#,38,#,-2,#,81,#,19,#,8,#,84,#,8,#,20,#,58,#,76,#,29,#,3,#,-9,#,79,#,70,#,98,#,-8,#,36,#,62,#,7,#,39,#,22,#,-5,#,93,#,55,#,27,#,32,#,91,#,63,#,57,#,17,#,85,#,61,#,1,#,3,#,53,#,69,#,25,#,70,#,53,#,21,#,36,#,45,#,12,#,33,#,-7,#,51,#,-6,#,26,#,78,#,82,#,24,#,50,#,24,#,10,#,56,#,92,#,37,#,63,#,-3,#,71,#,98,#,96,#,77,#,40,#,-5,#,20,#,82,#,21,#,1,#,10,#,33,#,-8,#,84,#,72,#,-5,#,99,#,-1,#,13,#,68,#,57,#,2,#,19,#,83,#,17,#,41,#,93,#,83,#,63,#,2,#,74,#,-5,#,43,#,10,#,5,#,62,#,78,#,91,#,83,#,89,#,-7,#,81,#,14,#,33,#,65,#,55,#,93,#,47,#,-4,#,19,#,71,#,15,#,80,#,72,#,16,#,91,#,27,#,65,#,53,#,71,#,68,#,83,#,20,#,16,#,14,#,62,#,52,#,78,#,27,#,-4,#,63,#,5,#,85,#,67,#,-5,#,65,#,90,#,51,#,-4,#,62,#,38,#,65,#,44,#,31,#,27,#,67,#,67,#,99,#,95,#,8,#,21,#,88,#,66,#,48,#,33,#,42,#,77,#,96,#,93,#,37,#,16,#,37,#,3,#,62,#,37,#,14,#,5,#,14,#,85,#,85,#,16,#,33,#,60,#,58,#,84,#,8,#,9,#,9,#,25,#,62,#,95,#,74,#,38,#,-3,#,10,#,86,#,36,#,72,#,75,#,93,#,35,#,-7,#,81,#,25,#,27,#,30,#,23,#,65,#,35,#,11,#,96,#,7,#,43,#,72,#,35,#,12,#,0,#,83,#,52,#,31,#,38,#,44,#,-9,#,41,#,14,#,7,#,85,#,69,#,28,#,89,#,23,#,86,#,42,#,40,#,-5,#,17,#,68,#,13,#,14,#,21,#,58,#,57,#,-6,#,5,#,94,#,37,#,39,#,76,#,10,#,2,#,14,#,82,#,32,#,93,#,-8,#,-7,#,94,#,20,#,3,#,62,#,73,#,42,#,49,#,3,#,61,#,16,#,85,#,17,#,20,#,99,#,51,#,91,#,94,#,94,#,89,#,22,#,82,#,84,#,25,#,34,#,61,#,4,#,85,#,89,#,50,#,53,#,-3,#,-3,#,99,#,16,#,74,#,51,#,54,#,22,#,65,#,-8,#,60,#,98,#,62,#,93,#,93,#,56,#,8,#,25,#,97,#,13,#,31,#,44,#,25,#,8,#,93,#,42,#,57,#,49,#,44,#,57,#,6,#,88,#,27,#,74,#,90,#,12,#,86,#,67,#,92,#,44,#,27,#,72,#,52,#,30,#,90,#,77,#,61,#,63,#,-4,#,21,#,68,#,67,#,41,#,92,#,52,#,19,#,49,#,99,#,39,#,25,#,59,#,69,#,2,#,17,#,4,#,36,#,23,#,54,#,64,#,8,#,17,#,22,#,71,#,-5,#,76,#,83,#,74,#,82,#,2,#,9,#,90,#,31,#,67,#,96,#,75,#,73,#,84,#,94,#,25,#,92,#,44,#,80,#,62,#,4,#,87,#,23,#,86,#,-9,#,75,#,18,#,35,#,68,#,-4,#,-9,#,61,#,75,#,-6,#,51,#,34,#,56,#,4,#,-1,#,51,#,-5,#,30,#,10,#,24,#,-7,#,68,#,-6,#,20,#,78,#,51,#,6,#,11,#,34,#,59,#,58,#,-7,#,80,#,3,#,23,#,-5,#,91,#,61,#,19,#,91,#,14,#,36,#,71,#,17,#,14,#,91,#,30,#,79,#,42,#,26,#,44,#,16,#,20,#,47,#,94,#,55,#,15,#,81,#,-2,#,18,#,1,#,37,#,36,#,76,#,24,#,78,#,77,#,47,#,14,#,55,#,59,#,61,#,61,#,95,#,67,#,6,#,65,#,35,#,95,#,5,#,58,#,31,#,37,#,58,#,-1,#,4,#,66,#,67,#,50,#,29,#,-7,#,13,#,15,#,95,#,3,#,73,#,44,#,39,#,26,#,85,#,54,#,18,#,-3,#,91,#,74,#,-8,#,92,#,43,#,5,#,60,#,82,#,39,#,99,#,16,#,3,#,86,#,34,#,21,#,33,#,15,#,60,#,0,#,56,#,85,#,25,#,22,#,13,#,42,#,76,#,47,#,3,#,88,#,97,#,5,#,32,#,80,#,54,#,70,#,76,#,14,#,34,#,34,#,51,#,78,#,86,#,32,#,9,#,80,#,39,#,80,#,23,#,6,#,67,#,30,#,91,#,70,#,33,#,0,#,6,#,37,#,64,#,26,#,16,#,6,#,17,#,79,#,57,#,52,#,22,#,2,#,78,#,65,#,3,#,39,#,96,#,54,#,81,#,59,#,29,#,-4,#,71,#,21,#,3,#,3,#,15,#,57,#,13,#,49,#,14,#,86,#,-9,#,96,#,81,#,-4,#,47,#,92,#,2,#,89,#,47,#,58,#,33,#,75,#,64,#,-3,#,55,#,31,#,85,#,38,#,-1,#,-6,#,54,#,-9,#,61,#,-3,#,17,#,89,#,14,#,32,#,22,#,-1,#,65,#,43,#,0,#,34,#,50,#,91,#,67,#,4,#,98,#,63,#,9,#,-8,#,34,#,37,#,5,#,86,#,19,#,64,#,53,#,64,#,79,#,68,#,63,#,9,#,26,#,11,#,50,#,-6,#,88,#,93,#,21,#,-9,#,26,#,12,#,-3,#,26,#,74,#,65,#,-7,#,34,#,64,#,99,#,93,#,42,#,43,#,84,#,32,#,57,#,-9,#,89,#,98,#,-1,#,20,#,10,#,74,#,77,#,25,#,96,#,78,#,16,#,-9,#,29,#,36,#,16,#,91,#,59,#,48,#,78,#,58,#,-1,#,68,#,96,#,78,#,37,#,49,#,-4,#,-2,#,91,#,64,#,-3,#,56,#,78,#,33,#,90,#,71,#,49,#,9,#,76,#,72,#,71,#,11,#,80,#,27,#,87,#,12,#,89,#,59,#,91,#,24,#,26,#,6,#,78,#,80,#,55,#,95,#,83,#,19,#,50,#,68,#,73,#,65,#,85,#,47,#,76,#,92,#,10,#,20,#,66,#,52,#,79,#,74,#,96,#,60,#,75,#,18,#,36,#,46,#,50,#,14,#,8,#,54,#,31}	{42,#,10,#,60,#,66,#,2,#,81,#,61,#,-7,#,11,#,79,#,8,#,30,#,4,#,29,#,52,#,88,#,39,#,1,#,65,#,83,#,50,#,17,#,79,#,35,#,-2,#,5,#,52,#,95,#,55,#,93,#,42,#,28,#,13,#,24,#,31,#,81,#,98,#,36,#,44,#,2,#,13,#,0,#,12,#,56,#,80,#,93,#,65,#,30,#,86,#,92,#,5,#,43,#,5,#,14,#,86,#,60,#,85,#,7,#,-1,#,99,#,56,#,28,#,49,#,25,#,82,#,96,#,41,#,33,#,62,#,48,#,16,#,91,#,12,#,41,#,5,#,43,#,68,#,8,#,82,#,78,#,-6,#,95,#,48,#,34,#,20,#,85,#,18,#,90,#,8,#,86,#,6,#,9,#,26,#,17,#,95,#,8,#,22,#,76,#,58,#,7,#,20,#,50,#,19,#,20,#,5,#,-7,#,61,#,38,#,64,#,40,#,12,#,91,#,86,#,39,#,12,#,66,#,-2,#,39,#,99,#,89,#,84,#,52,#,19,#,77,#,98,#,68,#,-9,#,62,#,78,#,82,#,8,#,75,#,91,#,68,#,92,#,13,#,82,#,74,#,-2,#,-6,#,94,#,33,#,65,#,5,#,58,#,60,#,63,#,8,#,92,#,79,#,60,#,96,#,0,#,71,#,38,#,48,#,80,#,60,#,20,#,6,#,-4,#,80,#,44,#,40,#,-9,#,39,#,38,#,38,#,39,#,6,#,0,#,52,#,88,#,53,#,20,#,30,#,78,#,11,#,24,#,-7,#,14,#,3,#,10,#,59,#,85,#,78,#,72,#,9,#,85,#,3,#,74,#,75,#,78,#,8,#,90,#,53,#,78,#,-1,#,49,#,90,#,59,#,63,#,33,#,26,#,70,#,68,#,-3,#,30,#,72,#,21,#,-8,#,0,#,83,#,3,#,10,#,1,#,88,#,44,#,71,#,84,#,35,#,2,#,29,#,60,#,23,#,15,#,91,#,4,#,76,#,40,#,36,#,15,#,40,#,89,#,83,#,79,#,59,#,86,#,66,#,50,#,54,#,40,#,15,#,53,#,4,#,37,#,70,#,7,#,65,#,66,#,4,#,92,#,87,#,12,#,43,#,86,#,62,#,86,#,-3,#,12,#,59,#,85,#,21,#,-8,#,32,#,60,#,46,#,53,#,48,#,5,#,46,#,49,#,44,#,12,#,-9,#,86,#,-7,#,41,#,89,#,52,#,26,#,94,#,-2,#,32,#,38,#,-2,#,81,#,19,#,8,#,84,#,8,#,20,#,58,#,76,#,29,#,3,#,-9,#,79,#,70,#,98,#,-8,#,36,#,62,#,7,#,39,#,22,#,-5,#,93,#,55,#,27,#,32,#,91,#,63,#,57,#,17,#,85,#,61,#,1,#,3,#,53,#,69,#,25,#,70,#,53,#,21,#,36,#,45,#,12,#,33,#,-7,#,51,#,-6,#,26,#,78,#,82,#,24,#,50,#,24,#,10,#,56,#,92,#,37,#,63,#,-3,#,71,#,98,#,96,#,77,#,40,#,-5,#,20,#,82,#,21,#,1,#,10,#,33,#,-8,#,84,#,72,#,-5,#,99,#,-1,#,13,#,68,#,57,#,2,#,19,#,83,#,17,#,41,#,93,#,83,#,63,#,2,#,74,#,-5,#,43,#,10,#,5,#,62,#,78,#,91,#,83,#,89,#,-7,#,81,#,14,#,33,#,65,#,55,#,93,#,47,#,-4,#,19,#,71,#,15,#,80,#,72,#,16,#,91,#,27,#,65,#,53,#,71,#,68,#,83,#,20,#,16,#,14,#,62,#,52,#,78,#,27,#,-4,#,63,#,5,#,85,#,67,#,-5,#,65,#,90,#,51,#,-4,#,62,#,38,#,65,#,44,#,31,#,27,#,67,#,67,#,99,#,95,#,8,#,21,#,88,#,66,#,48,#,33,#,42,#,77,#,96,#,93,#,37,#,16,#,37,#,3,#,62,#,37,#,14,#,5,#,14,#,85,#,85,#,16,#,33,#,60,#,58,#,84,#,8,#,9,#,9,#,25,#,62,#,95,#,74,#,38,#,-3,#,10,#,86,#,36,#,72,#,75,#,93,#,35,#,-7,#,81,#,25,#,27,#,30,#,23,#,65,#,35,#,11,#,96,#,7,#,43,#,72,#,35,#,12,#,0,#,83,#,52,#,31,#,38,#,44,#,-9,#,41,#,14,#,7,#,85,#,69,#,28,#,89,#,23,#,86,#,42,#,40,#,-5,#,17,#,68,#,13,#,14,#,21,#,58,#,57,#,-6,#,5,#,94,#,37,#,39,#,76,#,10,#,2,#,14,#,82,#,32,#,93,#,-8,#,-7,#,94,#,20,#,3,#,62,#,73,#,42,#,49,#,3,#,61,#,16,#,85,#,17,#,20,#,99,#,51,#,91,#,94,#,94,#,89,#,22,#,82,#,84,#,25,#,34,#,61,#,4,#,85,#,89,#,50,#,53,#,-3,#,-3,#,99,#,16,#,74,#,51,#,54,#,22,#,65,#,-8,#,60,#,98,#,62,#,93,#,93,#,56,#,8,#,25,#,97,#,13,#,31,#,44,#,25,#,8,#,93,#,42,#,57,#,49,#,44,#,57,#,6,#,88,#,27,#,74,#,90,#,12,#,86,#,67,#,92,#,44,#,27,#,72,#,52,#,30,#,90,#,77,#,61,#,63,#,-4,#,21,#,68,#,67,#,41,#,92,#,52,#,19,#,49,#,99,#,39,#,25,#,59,#,69,#,2,#,17,#,4,#,36,#,23,#,54,#,64,#,8,#,17,#,22,#,71,#,-5,#,76,#,83,#,74,#,82,#,2,#,9,#,90,#,31,#,67,#,96,#,75,#,73,#,84,#,94,#,25,#,92,#,44,#,80,#,62,#,4,#,87,#,23,#,86,#,-9,#,75,#,18,#,35,#,68,#,-4,#,-9,#,61,#,75,#,-6,#,51,#,34,#,56,#,4,#,-1,#,51,#,-5,#,30,#,10,#,24,#,-7,#,68,#,-6,#,20,#,78,#,51,#,6,#,11,#,34,#,59,#,58,#,-7,#,80,#,3,#,23,#,-5,#,91,#,61,#,19,#,91,#,14,#,36,#,71,#,17,#,14,#,91,#,30,#,79,#,42,#,26,#,44,#,16,#,20,#,47,#,94,#,55,#,15,#,81,#,-2,#,18,#,1,#,37,#,36,#,76,#,24,#,78,#,77,#,47,#,14,#,55,#,59,#,61,#,61,#,95,#,67,#,6,#,65,#,35,#,95,#,5,#,58,#,31,#,37,#,58,#,-1,#,4,#,66,#,67,#,50,#,29,#,-7,#,13,#,15,#,95,#,3,#,73,#,44,#,39,#,26,#,85,#,54,#,18,#,-3,#,91,#,74,#,-8,#,92,#,43,#,5,#,60,#,82,#,39,#,99,#,16,#,3,#,86,#,34,#,21,#,33,#,15,#,60,#,0,#,56,#,85,#,25,#,22,#,13,#,42,#,76,#,47,#,3,#,88,#,97,#,5,#,32,#,80,#,54,#,70,#,76,#,14,#,34,#,34,#,51,#,78,#,86,#,32,#,9,#,80,#,39,#,80,#,23,#,6,#,67,#,30,#,91,#,70,#,33,#,0,#,6,#,37,#,64,#,26,#,16,#,6,#,17,#,79,#,57,#,52,#,22,#,2,#,78,#,65,#,3,#,39,#,96,#,54,#,81,#,59,#,29,#,-4,#,71,#,21,#,3,#,3,#,15,#,57,#,13,#,49,#,14,#,86,#,-9,#,96,#,81,#,-4,#,47,#,92,#,2,#,89,#,47,#,58,#,33,#,75,#,64,#,-3,#,55,#,31,#,85,#,38,#,-1,#,-6,#,54,#,-9,#,61,#,-3,#,17,#,89,#,14,#,32,#,22,#,-1,#,65,#,43,#,0,#,34,#,50,#,91,#,67,#,4,#,98,#,63,#,9,#,-8,#,34,#,37,#,5,#,86,#,19,#,64,#,53,#,64,#,79,#,68,#,63,#,9,#,26,#,11,#,50,#,-6,#,88,#,93,#,21,#,-9,#,26,#,12,#,-3,#,26,#,74,#,65,#,-7,#,34,#,64,#,99,#,93,#,42,#,43,#,84,#,32,#,57,#,-9,#,89,#,98,#,-1,#,20,#,10,#,74,#,77,#,25,#,96,#,78,#,16,#,-9,#,29,#,36,#,16,#,91,#,59,#,48,#,78,#,58,#,-1,#,68,#,96,#,78,#,37,#,49,#,-4,#,-2,#,91,#,64,#,-3,#,56,#,78,#,33,#,90,#,71,#,49,#,9,#,76,#,72,#,71,#,11,#,80,#,27,#,87,#,12,#,89,#,59,#,91,#,24,#,26,#,6,#,78,#,80,#,55,#,95,#,83,#,19,#,50,#,68,#,73,#,65,#,85,#,47,#,76,#,92,#,10,#,20,#,66,#,52,#,79,#,74,#,96,#,60,#,75,#,18,#,36,#,46,#,50,#,14,#,8,#,54,#,31}
*/
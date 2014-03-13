package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 弼馬溫注解：
 * Use two stacks: 'first' and 'second':
 * <p/>
 * step 1: push root into 'first'.
 * step 2: pop 'first' and push into 'second'.
 * step 3: push left to 'first' and push right to 'first'.
 * step 4: repeat step 2 and 3 until 'first' is empty.
 * step 5: pop through 'second' to get the result.
 * <p/>
 * Time complexity: O(n).
 * Space complexity: O(n) but will have to use more spaces.
 */
public class BinaryTreePostorderTraversaWithTwoStacksImpl implements
        BinaryTreePostorderTraversal {
    @Override
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<Integer>();

        if (root == null) {
            return ret;
        }

        Stack<TreeNode> first = new Stack<TreeNode>();
        Stack<TreeNode> second = new Stack<TreeNode>();
        first.push(root);
        while (!first.isEmpty()) {
            TreeNode curr = first.pop();
            second.push(curr);
            if (curr.right != null) {
                first.push(curr.right);
            }
            if (curr.left != null) {
                first.push(curr.left);
            }
        }
        while (!second.isEmpty()) {
            ret.add(second.pop().val);
        }
        return ret;
    }
}

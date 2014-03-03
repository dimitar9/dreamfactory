package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.RecoverBinarySearchTree;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>In-Order traversal to find the misplaced pair of nodes.
 * <ul>
 * <li>Use a reference to 'prev' to store the previous node in in-order
 * traversal and compare the current node with 'prev' to see if they are
 * in correct order.</li>
 * </ul>
 * </li>
 * <li>
 * Time complexity: O(n). We will have to traverse the entire tree,
 * in worst case.
 * </li>
 * <li>
 * Space complexity: O(1) if we don't consider memory occupied by the stack.
 * </li>
 * </ul>
 */
public class RecoverBinarySearchTreeImpl implements RecoverBinarySearchTree {

    private TreeNode prev;
    private TreeNode[] nodes;

    @Override
    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        nodes = new TreeNode[2];

        find(root);

        if (nodes[0] != null) {
            int tmp = nodes[0].val;
            nodes[0].val = nodes[1].val;
            nodes[1].val = tmp;
        }
    }

    private void find(TreeNode node) {
        if (node == null) {
            return;
        }

        find(node.left);
        if (node.val < prev.val) {
            nodes[0] = node;

            if (nodes[1] == null) {
                nodes[1] = prev;
            }
        }
        prev = node;
        find(node.right);
    }
}

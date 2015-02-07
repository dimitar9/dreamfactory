package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeInorderTraversal;

import java.util.*;

/**
 * Time: O(n); Space: O(n)
 * Use a stack to track unvisited nodes with left nodes. Need to have 'set' to
 * keep track of nodes whose left nodes have been visited before.
 */
public class BinaryTreeInorderTraversalWithStackAndSetIterativeImpl
        implements BinaryTreeInorderTraversal {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Deque<TreeNode> lefts = new ArrayDeque<>();
        Set<TreeNode> visited = new HashSet<>();
        TreeNode curr = root;
        while (curr != null) {
            if (!visited.contains(curr) && curr.left != null) {
                visited.add(curr);
                lefts.push(curr);
                curr = curr.left;
            } else {
                ret.add(curr.val);
                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    if (!lefts.isEmpty()) {
                        curr = lefts.pop();
                    } else {
                        curr = null;
                    }
                }
            }
        }
        return ret;
    }
}

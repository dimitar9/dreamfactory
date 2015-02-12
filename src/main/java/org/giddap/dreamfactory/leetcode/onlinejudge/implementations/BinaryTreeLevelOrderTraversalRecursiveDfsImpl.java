package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Recursive solution
 */
public class BinaryTreeLevelOrderTraversalRecursiveDfsImpl implements BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        doLevelTraversalRecursivelyWithDfs(ret, 0, root);
        return ret;
    }

    private void doLevelTraversalRecursivelyWithDfs(List<List<Integer>> ret, int level, TreeNode node) {
        if (node == null) {
            return;
        }
        if (level < ret.size()) {
            ret.get(level).add(node.val);
        } else if (level == ret.size()) {
            List<Integer> thisLevel = new ArrayList<>();
            thisLevel.add(node.val);
            ret.add(thisLevel);
        } else {
            throw new IllegalStateException("Missing levels in the result.");
        }
        int nextLevel = level + 1;
        doLevelTraversalRecursivelyWithDfs(ret, nextLevel, node.left);
        doLevelTraversalRecursivelyWithDfs(ret, nextLevel, node.right);
    }
}

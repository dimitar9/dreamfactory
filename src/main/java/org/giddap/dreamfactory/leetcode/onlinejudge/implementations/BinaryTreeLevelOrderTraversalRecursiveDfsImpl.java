package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;

/**
 *
 */
public class BinaryTreeLevelOrderTraversalRecursiveDfsImpl implements BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        doLevelTraversalRecursivelyWithDfs(ret, 0, root);
        return ret;
    }

    private void doLevelTraversalRecursivelyWithDfs(ArrayList<ArrayList<Integer>> ret, int level, TreeNode node) {
        if (node == null) {
            return;
        }
        if (level < ret.size()) {
            ret.get(level).add(node.val);
        } else if (level == ret.size()) {
            ArrayList<Integer> thisLevel = new ArrayList<Integer>();
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

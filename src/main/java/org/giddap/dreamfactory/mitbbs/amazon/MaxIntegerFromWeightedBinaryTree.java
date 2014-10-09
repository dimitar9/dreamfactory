package org.giddap.dreamfactory.mitbbs.amazon;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * There is a binary tree that each node has a value of single digit 0-9.
 * <p/>
 * Find a node-to-node path from the tree that generates the largest integer.
 * <p/>
 * <pre>
 * Example #1
 *        1
 *       / \
 *      2   5
 *     / \
 *    4   3
 * output: 5123 (order matters)
 * ---
 * Example #2
 *           1
 *          /
 *         2
 *        / \
 *       4   3
 *      /
 *     6
 * output: 6423 (not 6421!)
 * </pre>
 */
public class MaxIntegerFromWeightedBinaryTree {
    private int maxNumber = Integer.MIN_VALUE;

    // left bottom up
    // left top down
    // right bottom up
    // right top down
    private Map<TreeNode, String[]> nodePossibleValues = null;

    public int solve(TreeNode node) {
        nodePossibleValues =
                new HashMap<TreeNode, String[]>();
        return 0;
    }

    public String[] solveRecursively(TreeNode node) {

        if (node == null) {
            return new String[4];
        }

        String[] lefts = solveRecursively(node.left);
        String[] rights = solveRecursively(node.right);

        int numFromLeftToRight = Integer.parseInt(lefts[0] + node.val + rights[3]);
        int numFromRightToLeft = Integer.parseInt(rights[2] + node.val + lefts[1]);

        maxNumber = Math.max(maxNumber,
                             Math.max(numFromLeftToRight, numFromRightToLeft));

        String[] ret = new String[4];
        ret[0] = lefts[0] + node.val;
        ret[1] = lefts[1] + node.val;
        ret[0] = lefts[0] + node.val;
        ret[0] = lefts[0] + node.val;

        return ret;
    }
}

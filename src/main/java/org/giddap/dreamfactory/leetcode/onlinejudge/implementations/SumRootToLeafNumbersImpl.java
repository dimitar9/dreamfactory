package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.SumRootToLeafNumbers;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Time complexity: O(n)</li>
 * <li>Space complexity: O(log(n))</li>
 * <li>Thought Process: DFS. Pass the curr base to next recursion level.
 * Returns the sum at the end of tail recursion.
 * </li>
 * </ul>
 */
public class SumRootToLeafNumbersImpl implements SumRootToLeafNumbers {
    @Override
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return addUp(root, 0);
    }

    private int addUp(TreeNode node, int base) {
        if (node == null) {
            return 0;
        }

        int curr = base * 10 + node.val;

        if (node.left == null && node.right == null) {
            return curr;
        }

        return addUp(node.left, curr) + addUp(node.right, curr);
    }
}

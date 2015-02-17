package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeLinkNode;

/**
 * https://oj.leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
 *
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * <p/>
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * <p/>
 * Note:
 * <p/>
 * You may only use constant extra space.
 * <pre>
 * For example,
 * Given the following binary tree,
 *       1
 *      /  \
 *     2    3
 *    / \    \
 *   4   5    7
 * After calling your function, the tree should look like:
 *       1 -> NULL
 *      /  \
 *     2 -> 3 -> NULL
 *    / \    \
 *   4-> 5 -> 7 -> NULL
 * </pre>
 */
public interface PopulatingNextRightPointersInEachNodeII {
    void connect(TreeLinkNode root);
}

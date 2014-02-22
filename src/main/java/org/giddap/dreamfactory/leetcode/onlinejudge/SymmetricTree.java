package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.TreeNode;

/**
 * http://leetcode.com/onlinejudge#question_101
 * <p/>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p/>
 * <pre>
 * For example, this binary tree is symmetric:
 *
 *            1
 *           / \
 *          2   2
 *         / \ / \
 *        3  4 4  3
 * But the following is not:
 *
 *            1
 *           / \
 *          2   2
 *           \   \
 *           3    3
 * </pre>
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 * <p/>
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/274/symmetric-tree
 * http://www.mitbbs.com/article_t/JobHunting/32294441.html
 */
public interface SymmetricTree {
    boolean isSymmetric(TreeNode root);
}

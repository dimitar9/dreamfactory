package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

/**
 * http://oj.leetcode.com/problems/rotate-list/
 * <p/>
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * <p/>
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/238/rotate-list
 */
public interface RotateList {
    ListNode rotateRight(ListNode head, int n);
}

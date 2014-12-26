package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

/**
 * http://oj.leetcode.com/problems/partition-list/
 * <p/>
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than
 * or equal to x.
 * <p/>
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * <p/>
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/261/partition-list
 * http://blog.unieagle.net/2012/10/16/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Apartition-list/
 * http://gongxuns.blogspot.com/2012/12/leetcode-partition-list.html
 */
public interface PartitionList {
    ListNode partition(ListNode head, int x);
}

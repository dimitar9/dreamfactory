package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ReverseLinkedListII;

/**
 * http://oj.leetcode.com/problems/reverse-linked-list-ii/
 * <p/>
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * <p/>
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * <p/>
 * return 1->4->3->2->5->NULL.
 * <p/>
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ? m ? n ? length of list.
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/267/reverse-linked-list-ii
 * http://gongxuns.blogspot.com/2012/12/leetcode-reverse-linked-list-ii.html
 * http://blog.unieagle.net/2012/10/18/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Areverse-linked-list-ii/
 */
public class ReverseLinkedListIIIterativeImpl implements ReverseLinkedListII {
    @Override
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newhead = new ListNode(0);
        newhead.next = head;

        ListNode prev = newhead;
        ListNode curr = head;

        int i = 1;

        while (curr != null && curr.next != null) {
            ListNode next = curr.next;

            // Note the range should be 'm <= i < n'
            if (m < i && i < n) {
                ListNode nextNext = next.next;
                ListNode afterPrev = prev.next;
                next.next = afterPrev;
                prev.next = next;
                curr.next = nextNext;
            } else {
                prev = curr;
                curr = next;
            }
            i++;
        }

        return newhead.next;
    }
}

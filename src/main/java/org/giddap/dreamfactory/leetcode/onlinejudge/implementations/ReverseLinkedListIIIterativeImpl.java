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
        ListNode nhead = new ListNode(0);
        nhead.next = head;
        ListNode prev = nhead;
        ListNode curr = head;
        int i = 1;
        ListNode tail = null;
        while (curr != null) {
            ListNode next = curr.next;
            if (m == i) {
                tail = curr;
            } else if (m < i && i <= n) {
                ListNode tmp = prev.next;
                prev.next = curr;
                curr.next = tmp;
                tail.next = next;
            } else {
                prev = curr;
            }
            curr = next;
            i++;
        }
        return nhead.next;
    }
}

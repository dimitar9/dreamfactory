package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

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
public class Q092ReverseLinkedListIIIterativeImpl implements Q092ReverseLinkedListII {
    @Override
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode beforeM = newHead;
        int i = 1;
        while (i < m) {
            beforeM = beforeM.next;
            i++;
        }

        ListNode prev = beforeM;
        ListNode curr = beforeM.next;
        while (i <= n && curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

        ListNode nodeM = beforeM.next;
        beforeM.next = prev;
        nodeM.next = curr;
        return newHead.next;
    }
}

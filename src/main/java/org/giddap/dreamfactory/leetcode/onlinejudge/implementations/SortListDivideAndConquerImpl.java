package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.SortList;

/**
 * Time: O(n*log(n)); Space: O(1)
 * Algorithm:
 * Merge-sort-like sorting.
 * <p/>
 * 考虑到要求用O(nlogn)的时间复杂度和constant space complexity来sort list，
 * 自然而然想到了merge sort方法。同时我们还已经做过了merge k sorted list和
 * merge 2 sorted list。这样这个问题就比较容易了。
 * <p/>
 * 不过这道题要找linkedlist中点，那当然就要用最经典的faster和slower方法，faster速度是
 * slower的两倍，当faster到链尾时，slower就是中点，slower的next是下一半的开始点。
 * <p/>
 * 解决了这些问题，题目就很容易解出了
 */
public class SortListDivideAndConquerImpl implements SortList {
    @Override
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode r = slow.next;
        slow.next = null;

        ListNode lhead = sortList(head);
        ListNode rhead = sortList(r);
        ListNode newhead = new ListNode(0);
        ListNode prev = newhead;
        while (lhead != null || rhead != null) {
            if (lhead != null && rhead != null) {
                if (lhead.val < rhead.val) {
                    prev.next = lhead;
                    lhead = lhead.next;
                } else {
                    prev.next = rhead;
                    rhead = rhead.next;
                }
            } else if (lhead != null) {
                prev.next = lhead;
                lhead = lhead.next;
            } else if (rhead != null) {
                prev.next = rhead;
                rhead = rhead.next;
            }
            prev = prev.next;
        }
        return newhead.next;
    }
}

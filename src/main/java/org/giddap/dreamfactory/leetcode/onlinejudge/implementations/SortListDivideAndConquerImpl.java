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
        int n = 0;
        ListNode cur = head;
        while (cur != null) {
            n++;
            cur = cur.next;
        }
        if (n == 1) {
            return head;
        }
        int m = (n - 1) / 2;
        int i = 1;
        cur = head;
        while (i <= m) {
            cur = cur.next;
            i++;
        }
        ListNode r = cur.next;
        cur.next = null;

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
//    public ListNode sortList(ListNode head) {
//        int i = 1;
//        ListNode curr = head;
//        while (curr != null && curr.next != null) {
//            curr = curr.next;
//            i++;
//        }
//        return sort(head, i);
//    }
//
//    private ListNode sort(ListNode head, int numOfNodes) {
//        if (head == null || numOfNodes == 1) {
//            return head;
//        }
//
//        int midIdx = (numOfNodes + 1) / 2;
//
//        ListNode leftEnd = head;
//        int i = 1;
//        while (i < midIdx) {
//            leftEnd = leftEnd.next;
//            i++;
//        }
//        ListNode rightHead = leftEnd.next;
//        leftEnd.next = null;
//
//        ListNode leftHead = sort(head, midIdx);
//        rightHead = sort(rightHead, numOfNodes - midIdx);
//
//        ListNode newHead = new ListNode(-1);
//        ListNode curr = newHead;
//        while (leftHead != null && rightHead != null) {
//            if (leftHead.val < rightHead.val) {
//                curr.next = leftHead;
//                leftHead = leftHead.next;
//            } else {
//                curr.next = rightHead;
//                rightHead = rightHead.next;
//            }
//            curr = curr.next;
//            curr.next = null;
//        }
//        if (leftHead == null) {
//            curr.next = rightHead;
//        } else {
//            curr.next = leftHead;
//        }
//
//        return newHead.next;
//    }
}

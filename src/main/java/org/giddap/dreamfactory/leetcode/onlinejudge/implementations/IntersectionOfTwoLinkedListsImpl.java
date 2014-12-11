package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.IntersectionOfTwoLinkedLists;

/**
 * Created by peng on 12/8/14.
 */
public class IntersectionOfTwoLinkedListsImpl implements IntersectionOfTwoLinkedLists {
    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int alen = countLength(headA);
        int blen = countLength(headB);

        if (alen == 0 || blen == 0) {
            return null;
        }

        final int commonLength = Math.min(alen, blen);
        ListNode prev = null;
        while (headA != null && headB != null) {
            if (alen == commonLength && blen == commonLength) {
                if (headA == headB) {
                    prev = headA;
                    break;
                } else {
                    headA = headA.next;
                    headB = headB.next;
                }
            } else if (alen > commonLength) {
                headA = headA.next;
                --alen;
            } else if (blen > commonLength) {
                headB = headB.next;
                --blen;
            } else {
                throw new IllegalStateException("something went wrong.");
            }
        }
        return prev;
    }

    private int countLength(ListNode head) {
        int i = 0;
        while (head != null) {
            head = head.next;
            ++i;
        }
        return i;
    }
}

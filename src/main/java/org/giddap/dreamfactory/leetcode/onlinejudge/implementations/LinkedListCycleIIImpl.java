package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.LinkedListCycleII;

/**
 * 这是另一道题的扩展，利用快慢指针判断出是否有环后，还需要找出环的起点，分析如下：
 * <p/>
 * <ol>
 * <li>设链表长度为len（链表中非空next指针的个数，下面所说的长度均为非空next指针的个数），
 * 链表head到环的起点长度为a，环起点到快慢指针相遇点的长度为b，环的长度为r。</li>
 * <li>假设到快慢指针相遇时，慢指针移动的长度为s，则快指针移动长度为2s，而快指针移动的
 * 长度还等于s加上在环上绕的k圈（k>=1）, 所以2s=s+kr ，即s = kr。</li>
 * <li>由s = a + b 和 s = kr 可知 a + b = kr = (k-1)r + r； 而r = len - a，
 * 所以a + b = (k-1)r + len - a, 即 a = (k-1)r + len - a - b，len - a - b是相遇点
 * 到环的起点的长度，由此可知，从链表头到环起点长度 = (k-1)环长度+从相遇点 到环起点长度，
 * 于是我们从链表头、与相遇点分别设一个指针，每次各走一步，两个指针必定相遇，且相遇点为
 * 环起点</li>
 * </ol>
 */
public class LinkedListCycleIIImpl implements LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode t = head;
        ListNode h = head;
        while (h != null && h.next != null) {
            t = t.next;
            h = h.next.next;
            if (t == h) {
                t = head;
                while (t != h) {
                    t = t.next;
                    h = h.next;
                }
                return t;
            }
        }
        return null;
    }
}

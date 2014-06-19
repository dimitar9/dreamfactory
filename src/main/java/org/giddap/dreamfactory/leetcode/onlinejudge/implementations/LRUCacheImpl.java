package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LRUCache;

import java.util.HashMap;
import java.util.Map;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Use a combo of doubly linked list and hashmap.
 * <ul>
 * <li>list to track the relative order of the items.</li>
 * <li>map to test if an item exists.</li>
 * </ul>
 * </li>
 * <li>
 * Time complexity: O(1) on both operations.
 * </li>
 * <li>
 * Space complexity: O(n).
 * </li>
 * <li>Use dummy head and tail to make it easier for list operations.</li>
 * </ul>
 */
public class LRUCacheImpl implements LRUCache {

    private final Map<Integer, DoublyLinkedListNode> map;
    private final DoublyLinkedList list;
    private final int capacity;

    public LRUCacheImpl(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer, DoublyLinkedListNode>();
        list = new DoublyLinkedList();
    }

    @Override
    public int get(int key) {
        if (map.containsKey(key)) {
            DoublyLinkedListNode node = map.get(key);
            list.takeOut(node);
            list.appendToTail(node);
            return node.val;
        } else {
            return -1;
        }
    }

    @Override
    public void set(int key, int value) {
        if (!map.containsKey(key)) {
            if (map.size() == capacity) {
                DoublyLinkedListNode head = list.removeHead();
                map.remove(head.key);
            }
            DoublyLinkedListNode node = new DoublyLinkedListNode();
            node.val = value;
            node.key = key;
            list.appendToTail(node);
            map.put(key, node);
        } else {
            DoublyLinkedListNode node = map.get(key);
            node.val = value;
            list.takeOut(node);
            list.appendToTail(node);
            map.put(key, node);
        }
    }
}

class DoublyLinkedList {
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    DoublyLinkedList() {
        head = new DoublyLinkedListNode();
        tail = new DoublyLinkedListNode();
        head.next = tail;
        tail.prev = head;
    }

    DoublyLinkedListNode removeHead() {
        DoublyLinkedListNode node = head.next;
        head.next = node.next;
        node.next.prev = head;

        node.next = null;
        node.prev = null;
        return node;
    }

    void appendToTail(DoublyLinkedListNode node) {
        DoublyLinkedListNode currTail = tail.prev;
        currTail.next = node;
        node.prev = currTail;
        node.next = tail;
        tail.prev = node;
    }

    DoublyLinkedListNode takeOut(DoublyLinkedListNode node) {
        DoublyLinkedListNode prev = node.prev;
        DoublyLinkedListNode next = node.next;
        prev.next = next;
        next.prev = prev;

        node.prev = null;
        node.next = null;
        return node;
    }
}

class DoublyLinkedListNode {
    int key;
    int val;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoublyLinkedListNode that = (DoublyLinkedListNode) o;

        if (key != that.key) return false;
        if (val != that.val) return false;
        if (next != null ? !next.equals(that.next) : that.next != null)
            return false;
        if (prev != null ? !prev.equals(that.prev) : that.prev != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = key;
        result = 31 * result + val;
        result = 31 * result + (prev != null ? prev.hashCode() : 0);
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
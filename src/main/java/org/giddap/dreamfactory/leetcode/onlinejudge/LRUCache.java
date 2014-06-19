package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/lru-cache/">LRU Cache</a>
 * <p/>
 * Copyright 2014 LeetCode
 * <p/>
 * <pre>
 * Design and implement a data structure for Least Recently Used (LRU) cache.
 * It should support the following operations: get and set.
 *
 * get(key) - Get the value (will always be positive) of the key if the key
 * exists in the cache, otherwise return -1.
 *
 * set(key, value) - Set or insert the value if the key is not already present.
 * When the cache reached its capacity, it should invalidate the least recently
 * used item before inserting a new item.
 * </pre>
 */
public interface LRUCache {

    int get(int key);

    void set(int key, int value);
}

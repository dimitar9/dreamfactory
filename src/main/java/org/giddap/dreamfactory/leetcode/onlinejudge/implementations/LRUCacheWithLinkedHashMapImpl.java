package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Extend from LinkedHashMap and override '#removeEldestEntry'
 */
public class LRUCacheWithLinkedHashMapImpl extends LinkedHashMap<Integer, Integer> implements LRUCache {

    private final int maxSize;
    private LRUCacheWithLinkedHashMapImpl map;

    public LRUCacheWithLinkedHashMapImpl(int maxSize) {
        super(maxSize);
        this.maxSize = maxSize;
    }

    @Override
    public int get(int key) {
        if (map.containsKey(key)) {
            Integer value = map.remove(key);
            map.put(key, value);
            return value;
        } else {
            return -1;
        }
    }

    @Override
    public void set(int key, int value) {
        if (map.containsKey(key)) {
            int val = map.remove(key);
        }
        map.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > maxSize;
    }
}

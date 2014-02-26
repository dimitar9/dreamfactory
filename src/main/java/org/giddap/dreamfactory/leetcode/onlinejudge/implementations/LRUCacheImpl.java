package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 弼馬溫注解：
 */
public class LRUCacheImpl implements LRUCache {

    private final LinkedHashMap<Integer, Integer> container;

    private final int capacity;

    public LRUCacheImpl(int capacity) {
        this.capacity = capacity;
        this.container = new LinkedHashMap<Integer, Integer>();
    }

    @Override
    public int get(int key) {
        if (container.containsKey(key)) {
            int value = container.remove(key);
            container.put(key, value);
            return value;
        } else {
            return -1;
        }
    }

    @Override
    public void set(int key, int value) {
        if (container.containsKey(key)) {
            int exist = container.remove(key);
        } else {
            if (container.size() == capacity) {
                Map.Entry<Integer, Integer> oldest = null;
                for (Map.Entry<Integer, Integer> one : container.entrySet()) {
                    oldest = one;
                    break;
                }
                container.remove(oldest.getKey());
            }
        }
        container.put(key, value);
    }
}

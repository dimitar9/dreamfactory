package org.giddap.dreamfactory.cc150;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 */
public class Q1809MedianOfStreamingIntegers {

    // Min heap
    private PriorityQueue<Integer> upper = new PriorityQueue<Integer>();

    // Max heap
    private PriorityQueue<Integer> lower = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
        @Override
        public int compare(Integer integer, Integer integer2) {
            return integer2 - integer;
        }
    });

    public void insert(int[] numbers) {
        for (int num : numbers) {
            int currUpperMin = upper.peek();
            int currLowerMax = lower.peek();

            if (num >= currUpperMin) {
                if (lower.size() <= upper.size()) {
                    lower.offer(upper.poll());
                }
                upper.offer(num);
            } else if (num <= currLowerMax) {
                if (lower.size() > upper.size()) {
                    upper.offer(lower.poll());
                }
                lower.offer(num);
            } else {
                if (lower.size() > upper.size()) {
                    upper.offer(num);
                } else {
                    lower.offer(num);
                }
            }
        }
    }

    public int findMedianOfStreamIntegers() {
        if (lower.size() > upper.size()) {
            return lower.peek();
        } else {
            return (lower.peek() + upper.peek()) / 2;
        }
    }
}

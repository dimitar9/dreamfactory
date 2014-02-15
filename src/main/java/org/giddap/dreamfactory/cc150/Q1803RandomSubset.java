package org.giddap.dreamfactory.cc150;

import java.util.Random;

/**
 *
 */
public class Q1803RandomSubset {
    public int[] generate(final int[] numbers, final int m) {
        final int n = numbers.length;

        int[] subset = new int[m];
        for (int i = 0; i < m; i++) {
            subset[i] = numbers[i];
        }

        for (int j = m; j < n; j++) {
            int next = new Random().nextInt(j);
            if (next <= m) {
                subset[next] = numbers[j];
            }
        }
        return subset;
    }

    private void swap(int[] numbers, int a, int b) {
        int tmp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = tmp;
    }
}

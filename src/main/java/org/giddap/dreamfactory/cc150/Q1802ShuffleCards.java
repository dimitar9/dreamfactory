package org.giddap.dreamfactory.cc150;

import java.util.Random;

/**
 *
 */
public class Q1802ShuffleCards {
    public void shuffle(int[] cards) {
        final int numCards = cards.length;
        for (int i = 0; i < numCards - 1; i++) {
            int nextIdx = new Random().nextInt(numCards - i);
            swap(cards, i, i + nextIdx);
        }
    }

    private void swap(int[] cards, int a, int b) {
        int tmp = cards[a];
        cards[a] = cards[b];
        cards[b] = tmp;
    }
}

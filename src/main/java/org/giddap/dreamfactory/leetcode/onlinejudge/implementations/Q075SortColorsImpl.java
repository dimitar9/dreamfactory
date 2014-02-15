package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q075SortColors;

public class Q075SortColorsImpl implements Q075SortColors {

    @Override
    public void sortColors(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int i = 0;
        int redEnd = -1;
        int blueStart = A.length;
        while (i < blueStart) {
            int color = A[i];
            if (color == 0) { // red
                swap(A, ++redEnd, i++);
            } else if (color == 1) { // white
                i++;
            } else if (color == 2) { // blue
                swap(A, --blueStart, i);
            }
        }
    }

    private void swap(int[] colors, int a, int b) {
        int tmp = colors[a];
        colors[a] = colors[b];
        colors[b] = tmp;
    }
}
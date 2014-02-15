package org.giddap.dreamfactory.cc150;

/**
 *
 */
public class Q0106RotateNxNMatrixBy90Degrees {
    public void rotateMatrixBy90Degrees(int[][] matrix) {
        final int len = matrix.length;
        if (len == 0) {
            return;
        }

        int numLayers = (len + 1) / 2;

        for (int i = 0; i < numLayers; i++) {
            int last = len - i * 2 - 1;
            for (int j = 0; j < last; j++) {
                int tmp = matrix[i][i + j];

                // left to top
                matrix[i][i + j] = matrix[i + last - j][i];

                // bottom to left
                matrix[i + last - j][i] = matrix[i + last][i + last - j];

                // right to bottom
                matrix[i + last][i + last - j] = matrix[i + j][i + last];

                // top to right
                matrix[i + j][i + last] = tmp;
            }
        }
    }
}

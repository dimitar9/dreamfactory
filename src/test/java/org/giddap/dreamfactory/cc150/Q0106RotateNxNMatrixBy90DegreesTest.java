package org.giddap.dreamfactory.cc150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class Q0106RotateNxNMatrixBy90DegreesTest {
    private Q0106RotateNxNMatrixBy90Degrees solution = new Q0106RotateNxNMatrixBy90Degrees();

    @Test
    public void small01() {
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 5, 6};
        matrix[2] = new int[]{7, 8, 9};

        int[][] expected = new int[3][3];
        expected[0] = new int[]{7, 4, 1};
        expected[1] = new int[]{8, 5, 2};
        expected[2] = new int[]{9, 6, 3};

        solution.rotateMatrixBy90Degrees(matrix);

        assertEquals(expected, matrix);
    }

    @Test
    public void small02() {
        int[][] matrix = new int[4][4];
        matrix[0] = new int[]{1, 2, 3, 4};
        matrix[1] = new int[]{5, 6, 7, 8};
        matrix[2] = new int[]{9, 10, 11, 12};
        matrix[3] = new int[]{13, 14, 15, 16};

        int[][] expected = new int[4][4];
        expected[0] = new int[]{13, 9, 5, 1};
        expected[1] = new int[]{14, 10, 6, 2};
        expected[2] = new int[]{15, 11, 7, 3};
        expected[3] = new int[]{16, 12, 8, 4};

        solution.rotateMatrixBy90Degrees(matrix);

        assertEquals(expected, matrix);
    }
}

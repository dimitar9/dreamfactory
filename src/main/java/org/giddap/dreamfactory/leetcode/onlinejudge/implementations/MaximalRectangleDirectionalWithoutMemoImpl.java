package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Point;
import org.giddap.dreamfactory.leetcode.onlinejudge.MaximalRectangle;

/**
 *
 */
public class MaximalRectangleDirectionalWithoutMemoImpl implements MaximalRectangle {
    @Override
    public int maximalRectangle(char[][] matrix) {
        final int numOfRows = matrix.length;
        if (numOfRows == 0) {
            return 0;
        }
        final int numOfCols = matrix[0].length;
        if (numOfCols == 0) {
            return 0;
        }

        int maxRectangle = 0;
        for (int lowerLeftY = 0; lowerLeftY < numOfRows; lowerLeftY++) {
            for (int lowerLeftX = 0; lowerLeftX < numOfCols; lowerLeftX++) {
                if (matrix[lowerLeftY][lowerLeftX] == '1') {
                    Point lowerLeft = new Point(lowerLeftX, lowerLeftY);
                    Point upperRight = growOnes(matrix, lowerLeft);
                    int rectangle = calculateArea(lowerLeft, upperRight);
                    if (rectangle > maxRectangle) {
                        maxRectangle = rectangle;
                    }
                }
            }
        }
        return maxRectangle;
    }

    private Point growOnes(char[][] matrix, Point lowerLeft) {
        int maxAreaSoFar = 0;
        Point upperRight = lowerLeft;
        int maxX = matrix[0].length - 1;
        for (int upperRightY = lowerLeft.getY(); upperRightY < matrix.length && matrix[upperRightY][lowerLeft.getX()] == '1'; upperRightY++) {
            int upperRightX = lowerLeft.getX();
            while (upperRightX <= maxX && matrix[upperRightY][upperRightX] == '1') {
                upperRightX++;
            }
            upperRightX--;
            maxX = Math.min(maxX, upperRightX);
            Point tmp = new Point(maxX, upperRightY);
            int currentArea = calculateArea(lowerLeft, tmp);
            if (currentArea > maxAreaSoFar) {
                maxAreaSoFar = currentArea;
                upperRight = tmp;
            }
        }
        return upperRight;
    }

    private int calculateArea(Point lowerLeft, Point upperRight) {
        return (upperRight.getX() - lowerLeft.getX() + 1) * (upperRight.getY() - lowerLeft.getY() + 1);
    }
}

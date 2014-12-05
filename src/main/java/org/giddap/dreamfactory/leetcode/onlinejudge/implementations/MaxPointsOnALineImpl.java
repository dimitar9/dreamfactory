package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Point;
import org.giddap.dreamfactory.leetcode.onlinejudge.MaxPointsOnALine;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class MaxPointsOnALineImpl implements MaxPointsOnALine {

    @Override
    public int maxPoints(Point[] points) {
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            int localMax = 1;
            int numSamePoints = 1;
            Map<Slope, Integer> slopes = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                if (points[j].x == points[i].x && points[j].y == points[i].y) {
                    // same point
                    numSamePoints++;
                    localMax += 1;
                } else {
                    Slope slope = new Slope(points[j].x - points[i].x,
                            points[j].y - points[i].y);
                    if (slopes.containsKey(slope)) {
                        int count = slopes.get(slope) + 1;
                        slopes.put(slope, count);
                        localMax = Math.max(count + numSamePoints - 1, localMax);
                    } else {
                        slopes.put(slope, 2);
                        localMax = Math.max(numSamePoints + 1, localMax);
                    }
                }
            }
            max = Math.max(localMax, max);
        }
        return max;
    }

    private static class Slope {

        final int x;
        final int y;

        public Slope(int x, int y) {
            if (x == 0 && y == 0) {
                this.x = 0;
                this.y = 0;
            } else if (x == 0) {
                this.x = 0;
                this.y = 1;
            } else if (y == 0) {
                this.x = 1;
                this.y = 0;
            } else {
                final int gcd = findGreatestCommonDivisor(x, y);
                this.y = y / gcd;
                this.x = x / gcd;
            }
        }

        private int findGreatestCommonDivisor(final int x, final int y) {
            if (y == 0) {
                return x;
            } else {
                return findGreatestCommonDivisor (y, x % y);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Slope slope = (Slope) o;

            if (x != slope.x) return false;
            if (y != slope.y) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = y;
            result = 31 * result + x;
            return result;
        }
    }
}

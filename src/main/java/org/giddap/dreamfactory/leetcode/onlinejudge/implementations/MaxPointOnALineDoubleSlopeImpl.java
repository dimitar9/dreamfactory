package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Point;
import org.giddap.dreamfactory.leetcode.onlinejudge.MaxPointsOnALine;

import java.util.HashMap;
import java.util.Map;

/**
 * Similar algorithm using 'Doulbe' as the slope
 */
public class MaxPointOnALineDoubleSlopeImpl implements MaxPointsOnALine {
    public int maxPoints(Point[] points) {
        if (points == null) return 0;
        if (points.length <= 2) return points.length;
        int max = 0;
        int duplicate = 1;
        Map<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            map.clear();
            duplicate = 1;
            Point p = points[i];
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                Point tem = points[j];
                double slope = 0.0;
                if (tem.x == p.x && tem.y == p.y) {
                    duplicate++;
                    continue;
                } else if (tem.x == p.x) {
                    slope = Integer.MAX_VALUE;
                } else {
                    slope = tem.y == p.y ? 0 : 1.0 * (tem.y - p.y) / (tem.x - p.x);
                }
                map.put(slope, map.containsKey(slope) ? map.get(slope) + 1 : 1);
            }
            if (map.keySet().size() == 0) {
                max = duplicate;
            }
            for (double key : map.keySet()) {
                max = Math.max(max, duplicate + map.get(key));
            }

        }
        return max;
    }
}

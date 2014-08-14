package org.giddap.dreamfactory.codeforces;

import java.io.*;

/**
 * http://codeforces.com/problemset/problem/1/C
 *
 * Nowadays all circuses in Berland have a round arena with diameter 13 meters,
 * but in the past things were different.
 *
 * In Ancient Berland arenas in circuses were shaped as a regular (equiangular)
 * polygon, the size and the number of angles could vary from one circus to
 * another. In each corner of the arena there was a special pillar, and the
 * rope strung between the pillars marked the arena edges.
 *
 * Recently the scientists from Berland have discovered the remains of the
 * ancient circus arena. They found only three pillars, the others were
 * destroyed by the time.
 *
 * You are given the coordinates of these three pillars. Find out what is the
 * smallest area that the arena could have.
 *
 * Input
 * The input file consists of three lines, each of them contains a pair of
 * numbers –– coordinates of the pillar. Any coordinate doesn't exceed 1000 by
 * absolute value, and is given with at most six digits after decimal point.
 *
 * Output
 * Output the smallest possible area of the ancient arena. This number should
 * be accurate to at least 6 digits after the decimal point. It's guaranteed
 * that the number of angles in the optimal polygon is not larger than 100.
 *
 * <pre>
 * Sample test(s)
 *
 * input
 * 0.000000 0.000000
 * 1.000000 1.000000
 * 0.000000 1.000000
 *
 * output
 * 1.00000000
 * </pre>
 */
public class P001cAncientBerlandCircus implements Runnable {

    double solve(Point p1, Point p2, Point p3) {
        return 0.0;
    }

    @Override
    public void run() {
        InputStream is = null;
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int i = 0;
            String line = null;
            Point p1 = null;
            Point p2 = null;
            Point p3 = null;
            while ((line = br.readLine()) != null) {
                String[] coordinates = line.split(" ");
                if (i == 0) {
                    p1 = new Point(Double.parseDouble(coordinates[0]),
                            Double.parseDouble(coordinates[1]));
                } else if (i == 1) {
                    p2 = new Point(Double.parseDouble(coordinates[0]),
                            Double.parseDouble(coordinates[1]));
                } else if (i == 2) {
                    p3 = new Point(Double.parseDouble(coordinates[0]),
                            Double.parseDouble(coordinates[1]));
                } else {
                    break;
                }
                i++;
            }

            out.println(solve(p1, p2, p3));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            br = null;
            is = null;
            out.close();
        }
    }

    public static void main(String[] args) {
        new P001cAncientBerlandCircus().run();
    }
}

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

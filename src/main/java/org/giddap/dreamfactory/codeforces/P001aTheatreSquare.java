package org.giddap.dreamfactory.codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * instead of having to use '%', use '+ a - 1' / a to mimic 'n % a == 0 ? 0 : 1'
 */
public class P001aTheatreSquare implements Runnable {

    public static void main(String[] args) {
        new Thread(new P001aTheatreSquare()).start();
    }

    private long solve(final int m, final int n, final int a) {
        long z = (n + a - 1) / a;
        long x = (m + a - 1) / a;
        long c = z * x;
        return c;
    }

    public void run() {
        Scanner in = null;
        PrintWriter out = null;
        try {
            in = new Scanner(System.in);
            out = new PrintWriter(System.out);
            int n = in.nextInt();
            int m = in.nextInt();
            int a = in.nextInt();

            out.println(solve(n, m, a));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
            out.close();
        }


    }
}

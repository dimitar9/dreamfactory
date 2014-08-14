package org.giddap.dreamfactory.codeforces;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * http://codeforces.com/problemset/problem/1/B
 * <p/>
 * 注意两个要点：
 * 1. 从10进制转到26进制。
 * 2. 这题中26进制没有0。
 * <p/>
 * References:
 * http://en.wikipedia.org/wiki/Hexavigesimal
 * http://en.wikipedia.org/wiki/Bijective_numeration
 * http://courses.cs.vt.edu/csonline/NumberSystems/Lessons/DecimalToBinaryConversion/index.html
 */
public class P001bSpreadsheets implements Runnable {

    private static final Pattern NON_NUMERIC_COLUMN_ENCODING_PATTERN = Pattern.compile("^[A-Z]+(\\d)+$");

    public static void main(String[] args) {
        new P001bSpreadsheets().run();
    }

    String solve(final String cellCoordinate) {
        if (isNonNumericColumnEncoding(cellCoordinate)) {
            return solveNonNumericColumnEncoding(cellCoordinate);
        } else {
            return solveNumericColumnEncoding(cellCoordinate);
        }
    }

    private String solveNumericColumnEncoding(final String cellCoordinate) {
        String[] numbers = cellCoordinate.split("C");
        int row = Integer.parseInt(numbers[0].substring(1));
        int col = Integer.parseInt(numbers[1]);

        StringBuffer sb = new StringBuffer("");
        while (col > 0) {
            col--;
            sb.append((char) ('A' + col % 26));
            col /= 26;
        }
        // reverse the result, since its
        // digits are in the wrong order
        return sb.reverse().toString() + row;
    }

    private String solveNonNumericColumnEncoding(final String cellCoordinate) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(cellCoordinate);
        String col = "";
        if (m.find()) {
            col = cellCoordinate.substring(0, m.start());
        }

        String row = cellCoordinate.substring(m.start());

        int colNum = 0;
        for (int i = 0; i < col.length(); i++) {
            colNum = colNum * 26 + (col.charAt(i) - 'A' + 1);
        }

        return 'R' + row + 'C' + colNum;
    }

    private boolean isNonNumericColumnEncoding(final String cellCoordinate) {
        Matcher matcher = NON_NUMERIC_COLUMN_ENCODING_PATTERN.matcher(cellCoordinate);
        return matcher.matches();
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
            int numberOfLines = 0;
            while ((line = br.readLine()) != null) {
                // Deal with the line
                if (i == 0) { // first line
                    numberOfLines = Integer.parseInt(line.trim());
                } else if (i <= numberOfLines) {
                    out.println(solve(line.trim()));
                } else {
                    return;
                }
                i++;
            }
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
}

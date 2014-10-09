package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.InterleavingString;

public class InterleavingStringDPImpl implements InterleavingString {
    @Override
    public boolean isInterleave(String s1, String s2, String s3) {
        // Start typing your Java solution below
        // DO NOT write main() function

        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }

        boolean[][] match = new boolean[s1.length() + 1][s2.length() + 1];
        match[0][0] = true;

        int i = 1;
        while (i <= s1.length() && s1.charAt(i - 1) == s3.charAt(i - 1)) {
            match[i][0] = true;
            i++;
        }

        i = 1;
        while (i <= s2.length() && s2.charAt(i - 1) == s3.charAt(i - 1)) {
            match[0][i] = true;
            i++;
        }

        for (i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                char c = s3.charAt(i + j - 1);
                if (c == s1.charAt(i - 1)) {
                    match[i][j] = match[i - 1][j] || match[i][j];
                }
                if (c == s2.charAt(j - 1)) {
                    match[i][j] = match[i][j - 1] || match[i][j];
                }
            }
        }
        return match[s1.length()][s2.length()];
    }
}

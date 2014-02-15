package org.giddap.dreamfactory.geeksforgeeks.dynamicprogramming;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
 * <p/>
 * Problem: Given two strings of size m, n and set of operations replace (R), insert (I) and delete (D) all at equal
 * cost. Find minimum number of edits (operations) required to convert one string into another.
 */
public class Set05EditDistance {
    public int minDistance(String word1, String word2) {
        int[][] table = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < table.length; ++i) {
            for (int j = 0; j < table[i].length; ++j) {
                if (i == 0)
                    table[i][j] = j;
                else if (j == 0)
                    table[i][j] = i;
                else {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1))
                        table[i][j] = table[i - 1][j - 1];
                    else
                        table[i][j] = 1 + Math.min(Math.min(table[i - 1][j - 1],
                                table[i - 1][j]), table[i][j - 1]);
                }
            }
        }
        return table[word1.length()][word2.length()];
    }
}

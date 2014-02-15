package org.giddap.dreamfactory.cc150;

import java.util.Arrays;

public class Q0104ReplaceSpaces {
    public String replaceSpaces(char[] words, int len) {
        // Start typing your Java solution below
        // DO NOT write main() function

        int i = len - 1;
        int j = words.length - 1;

        while (i >= 0) {
            if (words[i] == ' ') {
                words[j--] = '0';
                words[j--] = '2';
                words[j--] = '%';
            } else {
                words[j--] = words[i];
            }
            i--;
        }

        return new String(Arrays.copyOfRange(words, Math.max(0, j + 1), words.length));
    }
}

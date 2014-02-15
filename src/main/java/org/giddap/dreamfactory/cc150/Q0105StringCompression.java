package org.giddap.dreamfactory.cc150;

public class Q0105StringCompression {
    public String compressString(final String word) {
        int i = 0;
        char lastChar = '0';
        int count = 0;
        StringBuilder ret = new StringBuilder();
        while (i < word.length()) {
            lastChar = word.charAt(i);
            count = 1;
            int j = i + 1;
            while (j < word.length() && word.charAt(j) == lastChar) {
                j++;
                count++;
            }
            ret.append(lastChar);
            ret.append(count);
            i = j;
        }
        return ret.length() < word.length() ? ret.toString() : word;
    }
}

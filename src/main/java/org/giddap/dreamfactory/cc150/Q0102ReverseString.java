package org.giddap.dreamfactory.cc150;

/**
 * In-place reverse
 */
public class Q0102ReverseString {
    public String reverse(final String word) {
        int left = 0;
        int right = word.length() - 1;
        char[] chars = word.toCharArray();
        while (left < right) {
            swap(chars, left, right);
            left++;
            right--;
        }
        return new String(chars);
    }

    private void swap(char[] word, int a, int b) {
        char tmp = word[a];
        word[a] = word[b];
        word[b] = tmp;
    }
}

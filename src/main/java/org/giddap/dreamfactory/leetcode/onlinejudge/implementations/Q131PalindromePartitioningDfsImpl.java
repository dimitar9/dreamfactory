package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q131PalindromePartitioning;

import java.util.ArrayList;

public class Q131PalindromePartitioningDfsImpl implements Q131PalindromePartitioning {
    @Override
    public ArrayList<ArrayList<String>> partition(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
        collectPalindromes(ret, new ArrayList<String>(), s);
        return ret;
    }

    private void collectPalindromes(ArrayList<ArrayList<String>> ret, ArrayList<String> palindromes, String suffix) {
        if (suffix.length() == 0) {
            ret.add(new ArrayList<String>(palindromes));
            return;
        }

        for (int i = 0; i < suffix.length(); i++) {
            String prefix = suffix.substring(0, i + 1);
            if (isPalindrome(prefix)) {
                palindromes.add(prefix);
                collectPalindromes(ret, palindromes, suffix.substring(i + 1));
                palindromes.remove(palindromes.size() - 1);
            }
        }
    }

    private boolean isPalindrome(final String word) {
        if (word.length() == 1) {
            return true;
        }

        int l = 0;
        int r = word.length() - 1;
        while (l < r) {
            if (word.charAt(l) != word.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

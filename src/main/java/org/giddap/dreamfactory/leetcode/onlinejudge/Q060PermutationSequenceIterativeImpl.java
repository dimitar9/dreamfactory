package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;
import java.util.List;

public class Q060PermutationSequenceIterativeImpl implements Q060PermutationSequence {
    @Override
    public String getPermutation(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function

        // compute factorials
        int[] factorials = new int[n];
        factorials[0] = 1;
        for (int i = 1; i < n; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        // construct an array of original elements
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // compute lehmer codes and convert it to the actual permutation
        StringBuilder ret = new StringBuilder();
        k--;    // note factorial number begins from 0 instead of 1
        for (int i = n - 1; i >= 0; i--) {
            int lehmerCode = k / factorials[i];
            k = k % factorials[i];

            ret.append(numbers.remove(lehmerCode));
        }

        return ret.toString();
    }
}

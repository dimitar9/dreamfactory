package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Permutations;

import java.util.ArrayList;
import java.util.List;


public class PermutationsSwapImpl implements Permutations {
    @Override
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> results =
                new ArrayList<>();
        if (num.length == 0) {
            return results;
        }
        permute(results, num, 0);
        return results;
    }

    public void permute(
            List<List<Integer>> results, int[] numbers, int currIdx) {
        if (currIdx == numbers.length) {
            List<Integer> onePerm = new ArrayList<>();
            for (int n : numbers) {
                onePerm.add(n);
            }
            results.add(onePerm);
            return;
        }

        for (int i = currIdx; i < numbers.length; i++) {
            swap(numbers, currIdx, i);
            permute(results, numbers, currIdx + 1);
            swap(numbers, i, currIdx);
        }
    }

    private void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }
}

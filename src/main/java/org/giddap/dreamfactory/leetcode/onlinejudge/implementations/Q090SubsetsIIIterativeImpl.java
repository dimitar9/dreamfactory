package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q090SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Approach: base case and build.
 * <ul>
 * <li>Start with an empty set []</li>
 * <li>1: [] [1]</li>
 * <li>2: [] [1] [2] [1, 2]</li>
 * <li>2: [] [1] [2] [1, 2] [2, 2] [1, 2, 2]</li>
 * <li>2: [] [1] [2] [1, 2] [2, 2] [1, 2, 2] [2, 2, 2] [1, 2, 2, 2]</li>
 * </ul>
 * </li>
 * <li>
 * Time complexity: O(n) on both operations.
 * </li>
 * <li>
 * Space complexity: O(2^n).
 * </li>
 * <li>Sort the array first.</li>
 * <li>Count the number of new subsets added from last round and use
 * only these subsets if a duplicate number is encountered.</li>
 * </ul>
 */
public class Q090SubsetsIIIterativeImpl implements Q090SubsetsII {
    @Override
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> seed = new ArrayList<Integer>();
        ret.add(seed);
        Arrays.sort(num);

        int count = 0;
        for (int i = 0; i < num.length; i++) {
            ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
            int start = 0;
            if (i > 0 && num[i] == num[i - 1]) {
                start = ret.size() - count;
            }
            for (int j = start; j < ret.size(); j++) {
                ArrayList<Integer> one = new ArrayList<Integer>(ret.get(j));
                one.add(num[i]);
                temp.add(one);
            }
            count = temp.size();
            ret.addAll(temp);
        }
        return ret;
    }
}

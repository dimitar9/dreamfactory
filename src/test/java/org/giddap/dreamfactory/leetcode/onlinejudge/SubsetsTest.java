package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.SubsetsIterativeImpl;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class SubsetsTest {
    private Subsets solution = new SubsetsIterativeImpl();

    @Test
    public void small01() {
        int[] input = new int[]{1, 2, 3};

        ArrayList<Integer> ss1 = Lists.newArrayList(3);
        ArrayList<Integer> ss2 = Lists.newArrayList(2);
        ArrayList<Integer> ss3 = Lists.newArrayList(1);
        ArrayList<Integer> ss4 = Lists.newArrayList(1, 2, 3);
        ArrayList<Integer> ss5 = Lists.newArrayList(1, 3);
        ArrayList<Integer> ss6 = Lists.newArrayList(2, 3);
        ArrayList<Integer> ss7 = Lists.newArrayList(1, 2);
        ArrayList<Integer> ss8 = Lists.newArrayList();

        ArrayList<ArrayList<Integer>> expected = Lists.newArrayList(ss8, ss3, ss7, ss2, ss6, ss4, ss5, ss1);
        ArrayList<ArrayList<Integer>> actual = solution.subsets(input);

        assertEquals(expected.size(), actual.size());
        assertEquals(Sets.newHashSet(expected), Sets.newHashSet(actual));
    }

    @Test
    public void small02() {
        int[] input = new int[]{4, 1, 0};

        ArrayList<Integer> ss1 = Lists.newArrayList(1);
        ArrayList<Integer> ss2 = Lists.newArrayList(4);
        ArrayList<Integer> ss3 = Lists.newArrayList(0);
        ArrayList<Integer> ss4 = Lists.newArrayList(4, 1, 0);
        ArrayList<Integer> ss5 = Lists.newArrayList(4, 1);
        ArrayList<Integer> ss6 = Lists.newArrayList(4, 0);
        ArrayList<Integer> ss7 = Lists.newArrayList(1, 0);
        ArrayList<Integer> ss8 = Lists.newArrayList();

        ArrayList<ArrayList<Integer>> expected = Lists.newArrayList(ss8, ss3, ss7, ss2, ss6, ss4, ss5, ss1);
        ArrayList<ArrayList<Integer>> actual = solution.subsets(input);

        assertEquals(expected.size(), actual.size());
        assertEquals(Sets.newHashSet(expected), Sets.newHashSet(actual));
    }

    @Test
    public void small03() {
        int[] input = new int[]{1};

        ArrayList<Integer> ss3 = Lists.newArrayList(1);
        ArrayList<Integer> ss8 = Lists.newArrayList();

        ArrayList<ArrayList<Integer>> expected = Lists.newArrayList(ss8, ss3);
        ArrayList<ArrayList<Integer>> actual = solution.subsets(input);

        assertEquals(expected.size(), actual.size());
        assertEquals(Sets.newHashSet(expected), Sets.newHashSet(actual));
    }
}

/*
Test cases
Input 	Output 	Expected
[0]	[[],[0]]	[[],[0]]
[1,2]	[[],[1],[2],[1,2]]	[[],[1],[2],[1,2]]
[3,9]	[[],[3],[9],[3,9]]	[[],[3],[9],[3,9]]
[1,2,3]	[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]	[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
[4,1,0]	[[],[0],[1],[0,1],[4],[0,4],[1,4],[0,1,4]]	[[],[0],[1],[0,1],[4],[0,4],[1,4],[0,1,4]]
[-1,1,2]	[[],[-1],[1],[-1,1],[2],[-1,2],[1,2],[-1,1,2]]	[[],[-1],[1],[-1,1],[2],[-1,2],[1,2],[-1,1,2]]
[3,2,4,1]	[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3],[4],[1,4],[2,4],[1,2,4],[3,4],[1,3,4],[2,3,4],[1,2,3,4]]	[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3],[4],[1,4],[2,4],[1,2,4],[3,4],[1,3,4],[2,3,4],[1,2,3,4]]
[9,0,3,5,7]	[[],[0],[3],[0,3],[5],[0,5],[3,5],[0,3,5],[7],[0,7],[3,7],[0,3,7],[5,7],[0,5,7],[3,5,7],[0,3,5,7],[9],[0,9],[3,9],[0,3,9],[5,9],[0,5,9],[3,5,9],[0,3,5,9],[7,9],[0,7,9],[3,7,9],[0,3,7,9],[5,7,9],[0,5,7,9],[3,5,7,9],[0,3,5,7,9]]	[[],[0],[3],[0,3],[5],[0,5],[3,5],[0,3,5],[7],[0,7],[3,7],[0,3,7],[5,7],[0,5,7],[3,5,7],[0,3,5,7],[9],[0,9],[3,9],[0,3,9],[5,9],[0,5,9],[3,5,9],[0,3,5,9],[7,9],[0,7,9],[3,7,9],[0,3,7,9],[5,7,9],[0,5,7,9],[3,5,7,9],[0,3,5,7,9]]
[1,9,8,3,-1,0]	[[],[-1],[0],[-1,0],[1],[-1,1],[0,1],[-1,0,1],[3],[-1,3],[0,3],[-1,0,3],[1,3],[-1,1,3],[0,1,3],[-1,0,1,3],[8],[-1,8],[0,8],[-1,0,8],[1,8],[-1,1,8],[0,1,8],[-1,0,1,8],[3,8],[-1,3,8],[0,3,8],[-1,0,3,8],[1,3,8],[-1,1,3,8],[0,1,3,8],[-1,0,1,3,8],[9],[-1,9],[0,9],[-1,0,9],[1,9],[-1,1,9],[0,1,9],[-1,0,1,9],[3,9],[-1,3,9],[0,3,9],[-1,0,3,9],[1,3,9],[-1,1,3,9],[0,1,3,9],[-1,0,1,3,9],[8,9],[-1,8,9],[0,8,9],[-1,0,8,9],[1,8,9],[-1,1,8,9],[0,1,8,9],[-1,0,1,8,9],[3,8,9],[-1,3,8,9],[0,3,8,9],[-1,0,3,8,9],[1,3,8,9],[-1,1,3,8,9],[0,1,3,8,9],[-1,0,1,3,8,9]]	[[],[-1],[0],[-1,0],[1],[-1,1],[0,1],[-1,0,1],[3],[-1,3],[0,3],[-1,0,3],[1,3],[-1,1,3],[0,1,3],[-1,0,1,3],[8],[-1,8],[0,8],[-1,0,8],[1,8],[-1,1,8],[0,1,8],[-1,0,1,8],[3,8],[-1,3,8],[0,3,8],[-1,0,3,8],[1,3,8],[-1,1,3,8],[0,1,3,8],[-1,0,1,3,8],[9],[-1,9],[0,9],[-1,0,9],[1,9],[-1,1,9],[0,1,9],[-1,0,1,9],[3,9],[-1,3,9],[0,3,9],[-1,0,3,9],[1,3,9],[-1,1,3,9],[0,1,3,9],[-1,0,1,3,9],[8,9],[-1,8,9],[0,8,9],[-1,0,8,9],[1,8,9],[-1,1,8,9],[0,1,8,9],[-1,0,1,8,9],[3,8,9],[-1,3,8,9],[0,3,8,9],[-1,0,3,8,9],[1,3,8,9],[-1,1,3,8,9],[0,1,3,8,9],[-1,0,1,3,8,9]]
[1,2,3,4,5,6,7,8,10,0]	[[],[0],[1],[0,1],[2],[0,2],[1,2],[0,1,2],[3],[0,3],[1,3],[0,1,3],[2,3],[0,2,3],[1,2,3],[0,1,2,3],[4],[0,4],[1,4],[0,1,4],[2,4],[0,2,4],[1,2,4],[0,1,2,4],[3,4],[0,3,4],[1,3,4],[0,1,3,4],[2,3,4],[0,2,3,4],[1,2,3,4],[0,1,2,3,4],[5],[0,5],[1,5],[0,1,5],[2,5],[0,2,5],[1,2,5],[0,1,2,5],[3,5],[0,3,5],[1,3,5],[0,1,3,5],[2,3,5],[0,2,3,5],[1,2,3,5],[0,1,2,3,5],[4,5],[0,4,5],[1,4,5],[0,1,4,5],[2,4,5],[0,2,4,5],[1,2,4,5],[0,1,2,4,5],[3,4,5],[0,3,4,5],[1,3,4,5],[0,1,3,4,5],[2,3,4,5],[0,2,3,4,5],[1,2,3,4,5],[0,1,2,3,4,5],[6],[0,6],[1,6],[0,1,6],[2,6],[0,2,6],[1,2,6],[0,1,2,6],[3,6],[0,3,6],[1,3,6],[0,1,3,6],[2,3,6],[0,2,3,6],[1,2,3,6],[0,1,2,3,6],[4,6],[0,4,6],[1,4,6],[0,1,4,6],[2,4,6],[0,2,4,6],[1,2,4,6],[0,1,2,4,6],[3,4,6],[0,3,4,6],[1,3,4,6],[0,1,3,4,6],[2,3,4,6],[0,2,3,4,6],[1,2,3,4,6],[0,1,2,3,4,6],[5,6],[0,5,6],[1,5,6],[0,1,5,6],[2,5,6],[0,2,5,6],[1,2,5,6],[0,1,2,5,6],[3,5,6],[0,3,5,6],[1,3,5,6],[0,1,3,5,6],[2,3,5,6],[0,2,3,5,6],[1,2,3,5,6],[0,1,2,3,5,6],[4,5,6],[0,4,5,6],[1,4,5,6],[0,1,4,5,6],[2,4,5,6],[0,2,4,5,6],[1,2,4,5,6],[0,1,2,4,5,6],[3,4,5,6],[0,3,4,5,6],[1,3,4,5,6],[0,1,3,4,5,6],[2,3,4,5,6],[0,2,3,4,5,6],[1,2,3,4,5,6],[0,1,2,3,4,5,6],[7],[0,7],[1,7],[0,1,7],[2,7],[0,2,7],[1,2,7],[0,1,2,7],[3,7],[0,3,7],[1,3,7],[0,1,3,7],[2,3,7],[0,2,3,7],[1,2,3,7],[0,1,2,3,7],[4,7],[0,4,7],[1,4,7],[0,1,4,7],[2,4,7],[0,2,4,7],[1,2,4,7],[0,1,2,4,7],[3,4,7],[0,3,4,7],[1,3,4,7],[0,1,3,4,7],[2,3,4,7],[0,2,3,4,7],[1,2,3,4,7],[0,1,2,3,4,7],[5,7],[0,5,7],[1,5,7],[0,1,5,7],[2,5,7],[0,2,5,7],[1,2,5,7],[0,1,2,5,7],[3,5,7],[0,3,5,7],[1,3,5,7],[0,1,3,5,7],[2,3,5,7],[0,2,3,5,7],[1,2,3,5,7],[0,1,2,3,5,7],[4,5,7],[0,4,5,7],[1,4,5,7],[0,1,4,5,7],[2,4,5,7],[0,2,4,5,7],[1,2,4,5,7],[0,1,2,4,5,7],[3,4,5,7],[0,3,4,5,7],[1,3,4,5,7],[0,1,3,4,5,7],[2,3,4,5,7],[0,2,3,4,5,7],[1,2,3,4,5,7],[0,1,2,3,4,5,7],[6,7],[0,6,7],[1,6,7],[0,1,6,7],[2,6,7],[0,2,6,7],[1,2,6,7],[0,1,2,6,7],[3,6,7],[0,3,6,7],[1,3,6,7],[0,1,3,6,7],[2,3,6,7],[0,2,3,6,7],[1,2,3,6,7],[0,1,2,3,6,7],[4,6,7],[0,4,6,7],[1,4,6,7],[0,1,4,6,7],[2,4,6,7],[0,2,4,6,7],[1,2,4,6,7],[0,1,2,4,6,7],[3,4,6,7],[0,3,4,6,7],[1,3,4,6,7],[0,1,3,4,6,7],[2,3,4,6,7],[0,2,3,4,6,7],[1,2,3,4,6,7],[0,1,2,3,4,6,7],[5,6,7],[0,5,6,7],[1,5,6,7],[0,1,5,6,7],[2,5,6,7],[0,2,5,6,7],[1,2,5,6,7],[0,1,2,5,6,7],[3,5,6,7],[0,3,5,6,7],[1,3,5,6,7],[0,1,3,5,6,7],[2,3,5,6,7],[0,2,3,5,6,7],[1,2,3,5,6,7],[0,1,2,3,5,6,7],[4,5,6,7],[0,4,5,6,7],[1,4,5,6,7],[0,1,4,5,6,7],[2,4,5,6,7],[0,2,4,5,6,7],[1,2,4,5,6,7],[0,1,2,4,5,6,7],[3,4,5,6,7],[0,3,4,5,6,7],[1,3,4,5,6,7],[0,1,3,4,5,6,7],[2,3,4,5,6,7],[0,2,3,4,5,6,7],[1,2,3,4,5,6,7],[0,1,2,3,4,5,6,7],[8],[0,8],[1,8],[0,1,8],[2,8],[0,2,8],[1,2,8],[0,1,2,8],[3,8],[0,3,8],[1,3,8],[0,1,3,8],[2,3,8],[0,2,3,8],[1,2,3,8],[0,1,2,3,8],[4,8],[0,4,8],[1,4,8],[0,1,4,8],[2,4,8],[0,2,4,8],[1,2,4,8],[0,1,2,4,8],[3,4,8],[0,3,4,8],[1,3,4,8],[0,1,3,4,8],[2,3,4,8],[0,2,3,4,8],[1,2,3,4,8],[0,1,2,3,4,8],[5,8],[0,5,8],[1,5,8],[0,1,5,8],[2,5,8],[0,2,5,8],[1,2,5,8],[0,1,2,5,8],[3,5,8],[0,3,5,8],[1,3,5,8],[0,1,3,5,8],[2,3,5,8],[0,2,3,5,8],[1,2,3,5,8],[0,1,2,3,5,8],[4,5,8],[0,4,5,8],[1,4,5,8],[0,1,4,5,8],[2,4,5,8],[0,2,4,5,8],[1,2,4,5,8],[0,1,2,4,5,8],[3,4,5,8],[0,3,4,5,8],[1,3,4,5,8],[0,1,3,4,5,8],[2,3,4,5,8],[0,2,3,4,5,8],[1,2,3,4,5,8],[0,1,2,3,4,5,8],[6,8],[0,6,8],[1,6,8],[0,1,6,8],[2,6,8],[0,2,6,8],[1,2,6,8],[0,1,2,6,8],[3,6,8],[0,3,6,8],[1,3,6,8],[0,1,3,6,8],[2,3,6,8],[0,2,3,6,8],[1,2,3,6,8],[0,1,2,3,6,8],[4,6,8],[0,4,6,8],[1,4,6,8],[0,1,4,6,8],[2,4,6,8],[0,2,4,6,8],[1,2,4,6,8],[0,1,2,4,6,8],[3,4,6,8],[0,3,4,6,8],[1,3,4,6,8],[0,1,3,4,6,8],[2,3,4,6,8],[0,2,3,4,6,8],[1,2,3,4,6,8],[0,1,2,3,4,6,8],[5,6,8],[0,5,6,8],[1,5,6,8],[0,1,5,6,8],[2,5,6,8],[0,2,5,6,8],[1,2,5,6,8],[0,1,2,5,6,8],[3,5,6,8],[0,3,5,6,8],[1,3,5,6,8],[0,1,3,5,6,8],[2,3,5,6,8],[0,2,3,5,6,8],[1,2,3,5,6,8],[0,1,2,3,5,6,8],[4,5,6,8],[0,4,5,6,8],[1,4,5,6,8],[0,1,4,5,6,8],[2,4,5,6,8],[0,2,4,5,6,8],[1,2,4,5,6,8],[0,1,2,4,5,6,8],[3,4,5,6,8],[0,3,4,5,6,8],[1,3,4,5,6,8],[0,1,3,4,5,6,8],[2,3,4,5,6,8],[0,2,3,4,5,6,8],[1,2,3,4,5,6,8],[0,1,2,3,4,5,6,8],[7,8],[0,7,8],[1,7,8],[0,1,7,8],[2,7,8],[0,2,7,8],[1,2,7,8],[0,1,2,7,8],[3,7,8],[0,3,7,8],[1,3,7,8],[0,1,3,7,8],[2,3,7,8],[0,2,3,7,8],[1,2,3,7,8],[0,1,2,3,7,8],[4,7,8],[0,4,7,8],[1,4,7,8],[0,1,4,7,8],[2,4,7,8],[0,2,4,7,8],[1,2,4,7,8],[0,1,2,4,7,8],[3,4,7,8],[0,3,4,7,8],[1,3,4,7,8],[0,1,3,4,7,8],[2,3,4,7,8],[0,2,3,4,7,8],[1,2,3,4,7,8],[0,1,2,3,4,7,8],[5,7,8],[0,5,7,8],[1,5,7,8],[0,1,5,7,8],[2,5,7,8],[0,2,5,7,8],[1,2,5,7,8],[0,1,2,5,7,8],[3,5,7,8],[0,3,5,7,8],[1,3,5,7,8],[0,1,3,5,7,8],[2,3,5,7,8],[0,2,3,5,7,8],[1,2,3,5,7,8],[0,1,2,3,5,7,8],[4,5,7,8],[0,4,5,7,8],[1,4,5,7,8],[0,1,4,5,7,8],[2,4,5,7,8],[0,2,4,5,7,8],[1,2,4,5,7,8],[0,1,2,4,5,7,8],[3,4,5,7,8],[0,3,4,5,7,8],[1,3,4,5,7,8],[0,1,3,4,5,7,8],[2,3,4,5,7,8],[0,2,3,4,5,7,8],[1,2,3,4,5,7,8],[0,1,2,3,4,5,7,8],[6,7,8],[0,6,7,8],[1,6,7,8],[0,1,6,7,8],[2,6,7,8],[0,2,6,7,8],[1,2,6,7,8],[0,1,2,6,7,8],[3,6,7,8],[0,3,6,7,8],[1,3,6,7,8],[0,1,3,6,7,8],[2,3,6,7,8],[0,2,3,6,7,8],[1,2,3,6,7,8],[0,1,2,3,6,7,8],[4,6,7,8],[0,4,6,7,8],[1,4,6,7,8],[0,1,4,6,7,8],[2,4,6,7,8],[0,2,4,6,7,8],[1,2,4,6,7,8],[0,1,2,4,6,7,8],[3,4,6,7,8],[0,3,4,6,7,8],[1,3,4,6,7,8],[0,1,3,4,6,7,8],[2,3,4,6,7,8],[0,2,3,4,6,7,8],[1,2,3,4,6,7,8],[0,1,2,3,4,6,7,8],[5,6,7,8],[0,5,6,7,8],[1,5,6,7,8],[0,1,5,6,7,8],[2,5,6,7,8],[0,2,5,6,7,8],[1,2,5,6,7,8],[0,1,2,5,6,7,8],[3,5,6,7,8],[0,3,5,6,7,8],[1,3,5,6,7,8],[0,1,3,5,6,7,8],[2,3,5,6,7,8],[0,2,3,5,6,7,8],[1,2,3,5,6,7,8],[0,1,2,3,5,6,7,8],[4,5,6,7,8],[0,4,5,6,7,8],[1,4,5,6,7,8],[0,1,4,5,6,7,8],[2,4,5,6,7,8],[0,2,4,5,6,7,8],[1,2,4,5,6,7,8],[0,1,2,4,5,6,7,8],[3,4,5,6,7,8],[0,3,4,5,6,7,8],[1,3,4,5,6,7,8],[0,1,3,4,5,6,7,8],[2,3,4,5,6,7,8],[0,2,3,4,5,6,7,8],[1,2,3,4,5,6,7,8],[0,1,2,3,4,5,6,7,8],[10],[0,10],[1,10],[0,1,10],[2,10],[0,2,10],[1,2,10],[0,1,2,10],[3,10],[0,3,10],[1,3,10],[0,1,3,10],[2,3,10],[0,2,3,10],[1,2,3,10],[0,1,2,3,10],[4,10],[0,4,10],[1,4,10],[0,1,4,10],[2,4,10],[0,2,4,10],[1,2,4,10],[0,1,2,4,10],[3,4,10],[0,3,4,10],[1,3,4,10],[0,1,3,4,10],[2,3,4,10],[0,2,3,4,10],[1,2,3,4,10],[0,1,2,3,4,10],[5,10],[0,5,10],[1,5,10],[0,1,5,10],[2,5,10],[0,2,5,10],[1,2,5,10],[0,1,2,5,10],[3,5,10],[0,3,5,10],[1,3,5,10],[0,1,3,5,10],[2,3,5,10],[0,2,3,5,10],[1,2,3,5,10],[0,1,2,3,5,10],[4,5,10],[0,4,5,10],[1,4,5,10],[0,1,4,5,10],[2,4,5,10],[0,2,4,5,10],[1,2,4,5,10],[0,1,2,4,5,10],[3,4,5,10],[0,3,4,5,10],[1,3,4,5,10],[0,1,3,4,5,10],[2,3,4,5,10],[0,2,3,4,5,10],[1,2,3,4,5,10],[0,1,2,3,4,5,10],[6,10],[0,6,10],[1,6,10],[0,1,6,10],[2,6,10],[0,2,6,10],[1,2,6,10],[0,1,2,6,10],[3,6,10],[0,3,6,10],[1,3,6,10],[0,1,3,6,10],[2,3,6,10],[0,2,3,6,10],[1,2,3,6,10],[0,1,2,3,6,10],[4,6,10],[0,4,6,10],[1,4,6,10],[0,1,4,6,10],[2,4,6,10],[0,2,4,6,10],[1,2,4,6,10],[0,1,2,4,6,10],[3,4,6,10],[0,3,4,6,10],[1,3,4,6,10],[0,1,3,4,6,10],[2,3,4,6,10],[0,2,3,4,6,10],[1,2,3,4,6,10],[0,1,2,3,4,6,10],[5,6,10],[0,5,6,10],[1,5,6,10],[0,1,5,6,10],[2,5,6,10],[0,2,5,6,10],[1,2,5,6,10],[0,1,2,5,6,10],[3,5,6,10],[0,3,5,6,10],[1,3,5,6,10],[0,1,3,5,6,10],[2,3,5,6,10],[0,2,3,5,6,10],[1,2,3,5,6,10],[0,1,2,3,5,6,10],[4,5,6,10],[0,4,5,6,10],[1,4,5,6,10],[0,1,4,5,6,10],[2,4,5,6,10],[0,2,4,5,6,10],[1,2,4,5,6,10],[0,1,2,4,5,6,10],[3,4,5,6,10],[0,3,4,5,6,10],[1,3,4,5,6,10],[0,1,3,4,5,6,10],[2,3,4,5,6,10],[0,2,3,4,5,6,10],[1,2,3,4,5,6,10],[0,1,2,3,4,5,6,10],[7,10],[0,7,10],[1,7,10],[0,1,7,10],[2,7,10],[0,2,7,10],[1,2,7,10],[0,1,2,7,10],[3,7,10],[0,3,7,10],[1,3,7,10],[0,1,3,7,10],[2,3,7,10],[0,2,3,7,10],[1,2,3,7,10],[0,1,2,3,7,10],[4,7,10],[0,4,7,10],[1,4,7,10],[0,1,4,7,10],[2,4,7,10],[0,2,4,7,10],[1,2,4,7,10],[0,1,2,4,7,10],[3,4,7,10],[0,3,4,7,10],[1,3,4,7,10],[0,1,3,4,7,10],[2,3,4,7,10],[0,2,3,4,7,10],[1,2,3,4,7,10],[0,1,2,3,4,7,10],[5,7,10],[0,5,7,10],[1,5,7,10],[0,1,5,7,10],[2,5,7,10],[0,2,5,7,10],[1,2,5,7,10],[0,1,2,5,7,10],[3,5,7,10],[0,3,5,7,10],[1,3,5,7,10],[0,1,3,5,7,10],[2,3,5,7,10],[0,2,3,5,7,10],[1,2,3,5,7,10],[0,1,2,3,5,7,10],[4,5,7,10],[0,4,5,7,10],[1,4,5,7,10],[0,1,4,5,7,10],[2,4,5,7,10],[0,2,4,5,7,10],[1,2,4,5,7,10],[0,1,2,4,5,7,10],[3,4,5,7,10],[0,3,4,5,7,10],[1,3,4,5,7,10],[0,1,3,4,5,7,10],[2,3,4,5,7,10],[0,2,3,4,5,7,10],[1,2,3,4,5,7,10],[0,1,2,3,4,5,7,10],[6,7,10],[0,6,7,10],[1,6,7,10],[0,1,6,7,10],[2,6,7,10],[0,2,6,7,10],[1,2,6,7,10],[0,1,2,6,7,10],[3,6,7,10],[0,3,6,7,10],[1,3,6,7,10],[0,1,3,6,7,10],[2,3,6,7,10],[0,2,3,6,7,10],[1,2,3,6,7,10],[0,1,2,3,6,7,10],[4,6,7,10],[0,4,6,7,10],[1,4,6,7,10],[0,1,4,6,7,10],[2,4,6,7,10],[0,2,4,6,7,10],[1,2,4,6,7,10],[0,1,2,4,6,7,10],[3,4,6,7,10],[0,3,4,6,7,10],[1,3,4,6,7,10],[0,1,3,4,6,7,10],[2,3,4,6,7,10],[0,2,3,4,6,7,10],[1,2,3,4,6,7,10],[0,1,2,3,4,6,7,10],[5,6,7,10],[0,5,6,7,10],[1,5,6,7,10],[0,1,5,6,7,10],[2,5,6,7,10],[0,2,5,6,7,10],[1,2,5,6,7,10],[0,1,2,5,6,7,10],[3,5,6,7,10],[0,3,5,6,7,10],[1,3,5,6,7,10],[0,1,3,5,6,7,10],[2,3,5,6,7,10],[0,2,3,5,6,7,10],[1,2,3,5,6,7,10],[0,1,2,3,5,6,7,10],[4,5,6,7,10],[0,4,5,6,7,10],[1,4,5,6,7,10],[0,1,4,5,6,7,10],[2,4,5,6,7,10],[0,2,4,5,6,7,10],[1,2,4,5,6,7,10],[0,1,2,4,5,6,7,10],[3,4,5,6,7,10],[0,3,4,5,6,7,10],[1,3,4,5,6,7,10],[0,1,3,4,5,6,7,10],[2,3,4,5,6,7,10],[0,2,3,4,5,6,7,10],[1,2,3,4,5,6,7,10],[0,1,2,3,4,5,6,7,10],[8,10],[0,8,10],[1,8,10],[0,1,8,10],[2,8,10],[0,2,8,10],[1,2,8,10],[0,1,2,8,10],[3,8,10],[0,3,8,10],[1,3,8,10],[0,1,3,8,10],[2,3,8,10],[0,2,3,8,10],[1,2,3,8,10],[0,1,2,3,8,10],[4,8,10],[0,4,8,10],[1,4,8,10],[0,1,4,8,10],[2,4,8,10],[0,2,4,8,10],[1,2,4,8,10],[0,1,2,4,8,10],[3,4,8,10],[0,3,4,8,10],[1,3,4,8,10],[0,1,3,4,8,10],[2,3,4,8,10],[0,2,3,4,8,10],[1,2,3,4,8,10],[0,1,2,3,4,8,10],[5,8,10],[0,5,8,10],[1,5,8,10],[0,1,5,8,10],[2,5,8,10],[0,2,5,8,10],[1,2,5,8,10],[0,1,2,5,8,10],[3,5,8,10],[0,3,5,8,10],[1,3,5,8,10],[0,1,3,5,8,10],[2,3,5,8,10],[0,2,3,5,8,10],[1,2,3,5,8,10],[0,1,2,3,5,8,10],[4,5,8,10],[0,4,5,8,10],[1,4,5,8,10],[0,1,4,5,8,10],[2,4,5,8,10],[0,2,4,5,8,10],[1,2,4,5,8,10],[0,1,2,4,5,8,10],[3,4,5,8,10],[0,3,4,5,8,10],[1,3,4,5,8,10],[0,1,3,4,5,8,10],[2,3,4,5,8,10],[0,2,3,4,5,8,10],[1,2,3,4,5,8,10],[0,1,2,3,4,5,8,10],[6,8,10],[0,6,8,10],[1,6,8,10],[0,1,6,8,10],[2,6,8,10],[0,2,6,8,10],[1,2,6,8,10],[0,1,2,6,8,10],[3,6,8,10],[0,3,6,8,10],[1,3,6,8,10],[0,1,3,6,8,10],[2,3,6,8,10],[0,2,3,6,8,10],[1,2,3,6,8,10],[0,1,2,3,6,8,10],[4,6,8,10],[0,4,6,8,10],[1,4,6,8,10],[0,1,4,6,8,10],[2,4,6,8,10],[0,2,4,6,8,10],[1,2,4,6,8,10],[0,1,2,4,6,8,10],[3,4,6,8,10],[0,3,4,6,8,10],[1,3,4,6,8,10],[0,1,3,4,6,8,10],[2,3,4,6,8,10],[0,2,3,4,6,8,10],[1,2,3,4,6,8,10],[0,1,2,3,4,6,8,10],[5,6,8,10],[0,5,6,8,10],[1,5,6,8,10],[0,1,5,6,8,10],[2,5,6,8,10],[0,2,5,6,8,10],[1,2,5,6,8,10],[0,1,2,5,6,8,10],[3,5,6,8,10],[0,3,5,6,8,10],[1,3,5,6,8,10],[0,1,3,5,6,8,10],[2,3,5,6,8,10],[0,2,3,5,6,8,10],[1,2,3,5,6,8,10],[0,1,2,3,5,6,8,10],[4,5,6,8,10],[0,4,5,6,8,10],[1,4,5,6,8,10],[0,1,4,5,6,8,10],[2,4,5,6,8,10],[0,2,4,5,6,8,10],[1,2,4,5,6,8,10],[0,1,2,4,5,6,8,10],[3,4,5,6,8,10],[0,3,4,5,6,8,10],[1,3,4,5,6,8,10],[0,1,3,4,5,6,8,10],[2,3,4,5,6,8,10],[0,2,3,4,5,6,8,10],[1,2,3,4,5,6,8,10],[0,1,2,3,4,5,6,8,10],[7,8,10],[0,7,8,10],[1,7,8,10],[0,1,7,8,10],[2,7,8,10],[0,2,7,8,10],[1,2,7,8,10],[0,1,2,7,8,10],[3,7,8,10],[0,3,7,8,10],[1,3,7,8,10],[0,1,3,7,8,10],[2,3,7,8,10],[0,2,3,7,8,10],[1,2,3,7,8,10],[0,1,2,3,7,8,10],[4,7,8,10],[0,4,7,8,10],[1,4,7,8,10],[0,1,4,7,8,10],[2,4,7,8,10],[0,2,4,7,8,10],[1,2,4,7,8,10],[0,1,2,4,7,8,10],[3,4,7,8,10],[0,3,4,7,8,10],[1,3,4,7,8,10],[0,1,3,4,7,8,10],[2,3,4,7,8,10],[0,2,3,4,7,8,10],[1,2,3,4,7,8,10],[0,1,2,3,4,7,8,10],[5,7,8,10],[0,5,7,8,10],[1,5,7,8,10],[0,1,5,7,8,10],[2,5,7,8,10],[0,2,5,7,8,10],[1,2,5,7,8,10],[0,1,2,5,7,8,10],[3,5,7,8,10],[0,3,5,7,8,10],[1,3,5,7,8,10],[0,1,3,5,7,8,10],[2,3,5,7,8,10],[0,2,3,5,7,8,10],[1,2,3,5,7,8,10],[0,1,2,3,5,7,8,10],[4,5,7,8,10],[0,4,5,7,8,10],[1,4,5,7,8,10],[0,1,4,5,7,8,10],[2,4,5,7,8,10],[0,2,4,5,7,8,10],[1,2,4,5,7,8,10],[0,1,2,4,5,7,8,10],[3,4,5,7,8,10],[0,3,4,5,7,8,10],[1,3,4,5,7,8,10],[0,1,3,4,5,7,8,10],[2,3,4,5,7,8,10],[0,2,3,4,5,7,8,10],[1,2,3,4,5,7,8,10],[0,1,2,3,4,5,7,8,10],[6,7,8,10],[0,6,7,8,10],[1,6,7,8,10],[0,1,6,7,8,10],[2,6,7,8,10],[0,2,6,7,8,10],[1,2,6,7,8,10],[0,1,2,6,7,8,10],[3,6,7,8,10],[0,3,6,7,8,10],[1,3,6,7,8,10],[0,1,3,6,7,8,10],[2,3,6,7,8,10],[0,2,3,6,7,8,10],[1,2,3,6,7,8,10],[0,1,2,3,6,7,8,10],[4,6,7,8,10],[0,4,6,7,8,10],[1,4,6,7,8,10],[0,1,4,6,7,8,10],[2,4,6,7,8,10],[0,2,4,6,7,8,10],[1,2,4,6,7,8,10],[0,1,2,4,6,7,8,10],[3,4,6,7,8,10],[0,3,4,6,7,8,10],[1,3,4,6,7,8,10],[0,1,3,4,6,7,8,10],[2,3,4,6,7,8,10],[0,2,3,4,6,7,8,10],[1,2,3,4,6,7,8,10],[0,1,2,3,4,6,7,8,10],[5,6,7,8,10],[0,5,6,7,8,10],[1,5,6,7,8,10],[0,1,5,6,7,8,10],[2,5,6,7,8,10],[0,2,5,6,7,8,10],[1,2,5,6,7,8,10],[0,1,2,5,6,7,8,10],[3,5,6,7,8,10],[0,3,5,6,7,8,10],[1,3,5,6,7,8,10],[0,1,3,5,6,7,8,10],[2,3,5,6,7,8,10],[0,2,3,5,6,7,8,10],[1,2,3,5,6,7,8,10],[0,1,2,3,5,6,7,8,10],[4,5,6,7,8,10],[0,4,5,6,7,8,10],[1,4,5,6,7,8,10],[0,1,4,5,6,7,8,10],[2,4,5,6,7,8,10],[0,2,4,5,6,7,8,10],[1,2,4,5,6,7,8,10],[0,1,2,4,5,6,7,8,10],[3,4,5,6,7,8,10],[0,3,4,5,6,7,8,10],[1,3,4,5,6,7,8,10],[0,1,3,4,5,6,7,8,10],[2,3,4,5,6,7,8,10],[0,2,3,4,5,6,7,8,10],[1,2,3,4,5,6,7,8,10],[0,1,2,3,4,5,6,7,8,10]]	[[],[0],[1],[0,1],[2],[0,2],[1,2],[0,1,2],[3],[0,3],[1,3],[0,1,3],[2,3],[0,2,3],[1,2,3],[0,1,2,3],[4],[0,4],[1,4],[0,1,4],[2,4],[0,2,4],[1,2,4],[0,1,2,4],[3,4],[0,3,4],[1,3,4],[0,1,3,4],[2,3,4],[0,2,3,4],[1,2,3,4],[0,1,2,3,4],[5],[0,5],[1,5],[0,1,5],[2,5],[0,2,5],[1,2,5],[0,1,2,5],[3,5],[0,3,5],[1,3,5],[0,1,3,5],[2,3,5],[0,2,3,5],[1,2,3,5],[0,1,2,3,5],[4,5],[0,4,5],[1,4,5],[0,1,4,5],[2,4,5],[0,2,4,5],[1,2,4,5],[0,1,2,4,5],[3,4,5],[0,3,4,5],[1,3,4,5],[0,1,3,4,5],[2,3,4,5],[0,2,3,4,5],[1,2,3,4,5],[0,1,2,3,4,5],[6],[0,6],[1,6],[0,1,6],[2,6],[0,2,6],[1,2,6],[0,1,2,6],[3,6],[0,3,6],[1,3,6],[0,1,3,6],[2,3,6],[0,2,3,6],[1,2,3,6],[0,1,2,3,6],[4,6],[0,4,6],[1,4,6],[0,1,4,6],[2,4,6],[0,2,4,6],[1,2,4,6],[0,1,2,4,6],[3,4,6],[0,3,4,6],[1,3,4,6],[0,1,3,4,6],[2,3,4,6],[0,2,3,4,6],[1,2,3,4,6],[0,1,2,3,4,6],[5,6],[0,5,6],[1,5,6],[0,1,5,6],[2,5,6],[0,2,5,6],[1,2,5,6],[0,1,2,5,6],[3,5,6],[0,3,5,6],[1,3,5,6],[0,1,3,5,6],[2,3,5,6],[0,2,3,5,6],[1,2,3,5,6],[0,1,2,3,5,6],[4,5,6],[0,4,5,6],[1,4,5,6],[0,1,4,5,6],[2,4,5,6],[0,2,4,5,6],[1,2,4,5,6],[0,1,2,4,5,6],[3,4,5,6],[0,3,4,5,6],[1,3,4,5,6],[0,1,3,4,5,6],[2,3,4,5,6],[0,2,3,4,5,6],[1,2,3,4,5,6],[0,1,2,3,4,5,6],[7],[0,7],[1,7],[0,1,7],[2,7],[0,2,7],[1,2,7],[0,1,2,7],[3,7],[0,3,7],[1,3,7],[0,1,3,7],[2,3,7],[0,2,3,7],[1,2,3,7],[0,1,2,3,7],[4,7],[0,4,7],[1,4,7],[0,1,4,7],[2,4,7],[0,2,4,7],[1,2,4,7],[0,1,2,4,7],[3,4,7],[0,3,4,7],[1,3,4,7],[0,1,3,4,7],[2,3,4,7],[0,2,3,4,7],[1,2,3,4,7],[0,1,2,3,4,7],[5,7],[0,5,7],[1,5,7],[0,1,5,7],[2,5,7],[0,2,5,7],[1,2,5,7],[0,1,2,5,7],[3,5,7],[0,3,5,7],[1,3,5,7],[0,1,3,5,7],[2,3,5,7],[0,2,3,5,7],[1,2,3,5,7],[0,1,2,3,5,7],[4,5,7],[0,4,5,7],[1,4,5,7],[0,1,4,5,7],[2,4,5,7],[0,2,4,5,7],[1,2,4,5,7],[0,1,2,4,5,7],[3,4,5,7],[0,3,4,5,7],[1,3,4,5,7],[0,1,3,4,5,7],[2,3,4,5,7],[0,2,3,4,5,7],[1,2,3,4,5,7],[0,1,2,3,4,5,7],[6,7],[0,6,7],[1,6,7],[0,1,6,7],[2,6,7],[0,2,6,7],[1,2,6,7],[0,1,2,6,7],[3,6,7],[0,3,6,7],[1,3,6,7],[0,1,3,6,7],[2,3,6,7],[0,2,3,6,7],[1,2,3,6,7],[0,1,2,3,6,7],[4,6,7],[0,4,6,7],[1,4,6,7],[0,1,4,6,7],[2,4,6,7],[0,2,4,6,7],[1,2,4,6,7],[0,1,2,4,6,7],[3,4,6,7],[0,3,4,6,7],[1,3,4,6,7],[0,1,3,4,6,7],[2,3,4,6,7],[0,2,3,4,6,7],[1,2,3,4,6,7],[0,1,2,3,4,6,7],[5,6,7],[0,5,6,7],[1,5,6,7],[0,1,5,6,7],[2,5,6,7],[0,2,5,6,7],[1,2,5,6,7],[0,1,2,5,6,7],[3,5,6,7],[0,3,5,6,7],[1,3,5,6,7],[0,1,3,5,6,7],[2,3,5,6,7],[0,2,3,5,6,7],[1,2,3,5,6,7],[0,1,2,3,5,6,7],[4,5,6,7],[0,4,5,6,7],[1,4,5,6,7],[0,1,4,5,6,7],[2,4,5,6,7],[0,2,4,5,6,7],[1,2,4,5,6,7],[0,1,2,4,5,6,7],[3,4,5,6,7],[0,3,4,5,6,7],[1,3,4,5,6,7],[0,1,3,4,5,6,7],[2,3,4,5,6,7],[0,2,3,4,5,6,7],[1,2,3,4,5,6,7],[0,1,2,3,4,5,6,7],[8],[0,8],[1,8],[0,1,8],[2,8],[0,2,8],[1,2,8],[0,1,2,8],[3,8],[0,3,8],[1,3,8],[0,1,3,8],[2,3,8],[0,2,3,8],[1,2,3,8],[0,1,2,3,8],[4,8],[0,4,8],[1,4,8],[0,1,4,8],[2,4,8],[0,2,4,8],[1,2,4,8],[0,1,2,4,8],[3,4,8],[0,3,4,8],[1,3,4,8],[0,1,3,4,8],[2,3,4,8],[0,2,3,4,8],[1,2,3,4,8],[0,1,2,3,4,8],[5,8],[0,5,8],[1,5,8],[0,1,5,8],[2,5,8],[0,2,5,8],[1,2,5,8],[0,1,2,5,8],[3,5,8],[0,3,5,8],[1,3,5,8],[0,1,3,5,8],[2,3,5,8],[0,2,3,5,8],[1,2,3,5,8],[0,1,2,3,5,8],[4,5,8],[0,4,5,8],[1,4,5,8],[0,1,4,5,8],[2,4,5,8],[0,2,4,5,8],[1,2,4,5,8],[0,1,2,4,5,8],[3,4,5,8],[0,3,4,5,8],[1,3,4,5,8],[0,1,3,4,5,8],[2,3,4,5,8],[0,2,3,4,5,8],[1,2,3,4,5,8],[0,1,2,3,4,5,8],[6,8],[0,6,8],[1,6,8],[0,1,6,8],[2,6,8],[0,2,6,8],[1,2,6,8],[0,1,2,6,8],[3,6,8],[0,3,6,8],[1,3,6,8],[0,1,3,6,8],[2,3,6,8],[0,2,3,6,8],[1,2,3,6,8],[0,1,2,3,6,8],[4,6,8],[0,4,6,8],[1,4,6,8],[0,1,4,6,8],[2,4,6,8],[0,2,4,6,8],[1,2,4,6,8],[0,1,2,4,6,8],[3,4,6,8],[0,3,4,6,8],[1,3,4,6,8],[0,1,3,4,6,8],[2,3,4,6,8],[0,2,3,4,6,8],[1,2,3,4,6,8],[0,1,2,3,4,6,8],[5,6,8],[0,5,6,8],[1,5,6,8],[0,1,5,6,8],[2,5,6,8],[0,2,5,6,8],[1,2,5,6,8],[0,1,2,5,6,8],[3,5,6,8],[0,3,5,6,8],[1,3,5,6,8],[0,1,3,5,6,8],[2,3,5,6,8],[0,2,3,5,6,8],[1,2,3,5,6,8],[0,1,2,3,5,6,8],[4,5,6,8],[0,4,5,6,8],[1,4,5,6,8],[0,1,4,5,6,8],[2,4,5,6,8],[0,2,4,5,6,8],[1,2,4,5,6,8],[0,1,2,4,5,6,8],[3,4,5,6,8],[0,3,4,5,6,8],[1,3,4,5,6,8],[0,1,3,4,5,6,8],[2,3,4,5,6,8],[0,2,3,4,5,6,8],[1,2,3,4,5,6,8],[0,1,2,3,4,5,6,8],[7,8],[0,7,8],[1,7,8],[0,1,7,8],[2,7,8],[0,2,7,8],[1,2,7,8],[0,1,2,7,8],[3,7,8],[0,3,7,8],[1,3,7,8],[0,1,3,7,8],[2,3,7,8],[0,2,3,7,8],[1,2,3,7,8],[0,1,2,3,7,8],[4,7,8],[0,4,7,8],[1,4,7,8],[0,1,4,7,8],[2,4,7,8],[0,2,4,7,8],[1,2,4,7,8],[0,1,2,4,7,8],[3,4,7,8],[0,3,4,7,8],[1,3,4,7,8],[0,1,3,4,7,8],[2,3,4,7,8],[0,2,3,4,7,8],[1,2,3,4,7,8],[0,1,2,3,4,7,8],[5,7,8],[0,5,7,8],[1,5,7,8],[0,1,5,7,8],[2,5,7,8],[0,2,5,7,8],[1,2,5,7,8],[0,1,2,5,7,8],[3,5,7,8],[0,3,5,7,8],[1,3,5,7,8],[0,1,3,5,7,8],[2,3,5,7,8],[0,2,3,5,7,8],[1,2,3,5,7,8],[0,1,2,3,5,7,8],[4,5,7,8],[0,4,5,7,8],[1,4,5,7,8],[0,1,4,5,7,8],[2,4,5,7,8],[0,2,4,5,7,8],[1,2,4,5,7,8],[0,1,2,4,5,7,8],[3,4,5,7,8],[0,3,4,5,7,8],[1,3,4,5,7,8],[0,1,3,4,5,7,8],[2,3,4,5,7,8],[0,2,3,4,5,7,8],[1,2,3,4,5,7,8],[0,1,2,3,4,5,7,8],[6,7,8],[0,6,7,8],[1,6,7,8],[0,1,6,7,8],[2,6,7,8],[0,2,6,7,8],[1,2,6,7,8],[0,1,2,6,7,8],[3,6,7,8],[0,3,6,7,8],[1,3,6,7,8],[0,1,3,6,7,8],[2,3,6,7,8],[0,2,3,6,7,8],[1,2,3,6,7,8],[0,1,2,3,6,7,8],[4,6,7,8],[0,4,6,7,8],[1,4,6,7,8],[0,1,4,6,7,8],[2,4,6,7,8],[0,2,4,6,7,8],[1,2,4,6,7,8],[0,1,2,4,6,7,8],[3,4,6,7,8],[0,3,4,6,7,8],[1,3,4,6,7,8],[0,1,3,4,6,7,8],[2,3,4,6,7,8],[0,2,3,4,6,7,8],[1,2,3,4,6,7,8],[0,1,2,3,4,6,7,8],[5,6,7,8],[0,5,6,7,8],[1,5,6,7,8],[0,1,5,6,7,8],[2,5,6,7,8],[0,2,5,6,7,8],[1,2,5,6,7,8],[0,1,2,5,6,7,8],[3,5,6,7,8],[0,3,5,6,7,8],[1,3,5,6,7,8],[0,1,3,5,6,7,8],[2,3,5,6,7,8],[0,2,3,5,6,7,8],[1,2,3,5,6,7,8],[0,1,2,3,5,6,7,8],[4,5,6,7,8],[0,4,5,6,7,8],[1,4,5,6,7,8],[0,1,4,5,6,7,8],[2,4,5,6,7,8],[0,2,4,5,6,7,8],[1,2,4,5,6,7,8],[0,1,2,4,5,6,7,8],[3,4,5,6,7,8],[0,3,4,5,6,7,8],[1,3,4,5,6,7,8],[0,1,3,4,5,6,7,8],[2,3,4,5,6,7,8],[0,2,3,4,5,6,7,8],[1,2,3,4,5,6,7,8],[0,1,2,3,4,5,6,7,8],[10],[0,10],[1,10],[0,1,10],[2,10],[0,2,10],[1,2,10],[0,1,2,10],[3,10],[0,3,10],[1,3,10],[0,1,3,10],[2,3,10],[0,2,3,10],[1,2,3,10],[0,1,2,3,10],[4,10],[0,4,10],[1,4,10],[0,1,4,10],[2,4,10],[0,2,4,10],[1,2,4,10],[0,1,2,4,10],[3,4,10],[0,3,4,10],[1,3,4,10],[0,1,3,4,10],[2,3,4,10],[0,2,3,4,10],[1,2,3,4,10],[0,1,2,3,4,10],[5,10],[0,5,10],[1,5,10],[0,1,5,10],[2,5,10],[0,2,5,10],[1,2,5,10],[0,1,2,5,10],[3,5,10],[0,3,5,10],[1,3,5,10],[0,1,3,5,10],[2,3,5,10],[0,2,3,5,10],[1,2,3,5,10],[0,1,2,3,5,10],[4,5,10],[0,4,5,10],[1,4,5,10],[0,1,4,5,10],[2,4,5,10],[0,2,4,5,10],[1,2,4,5,10],[0,1,2,4,5,10],[3,4,5,10],[0,3,4,5,10],[1,3,4,5,10],[0,1,3,4,5,10],[2,3,4,5,10],[0,2,3,4,5,10],[1,2,3,4,5,10],[0,1,2,3,4,5,10],[6,10],[0,6,10],[1,6,10],[0,1,6,10],[2,6,10],[0,2,6,10],[1,2,6,10],[0,1,2,6,10],[3,6,10],[0,3,6,10],[1,3,6,10],[0,1,3,6,10],[2,3,6,10],[0,2,3,6,10],[1,2,3,6,10],[0,1,2,3,6,10],[4,6,10],[0,4,6,10],[1,4,6,10],[0,1,4,6,10],[2,4,6,10],[0,2,4,6,10],[1,2,4,6,10],[0,1,2,4,6,10],[3,4,6,10],[0,3,4,6,10],[1,3,4,6,10],[0,1,3,4,6,10],[2,3,4,6,10],[0,2,3,4,6,10],[1,2,3,4,6,10],[0,1,2,3,4,6,10],[5,6,10],[0,5,6,10],[1,5,6,10],[0,1,5,6,10],[2,5,6,10],[0,2,5,6,10],[1,2,5,6,10],[0,1,2,5,6,10],[3,5,6,10],[0,3,5,6,10],[1,3,5,6,10],[0,1,3,5,6,10],[2,3,5,6,10],[0,2,3,5,6,10],[1,2,3,5,6,10],[0,1,2,3,5,6,10],[4,5,6,10],[0,4,5,6,10],[1,4,5,6,10],[0,1,4,5,6,10],[2,4,5,6,10],[0,2,4,5,6,10],[1,2,4,5,6,10],[0,1,2,4,5,6,10],[3,4,5,6,10],[0,3,4,5,6,10],[1,3,4,5,6,10],[0,1,3,4,5,6,10],[2,3,4,5,6,10],[0,2,3,4,5,6,10],[1,2,3,4,5,6,10],[0,1,2,3,4,5,6,10],[7,10],[0,7,10],[1,7,10],[0,1,7,10],[2,7,10],[0,2,7,10],[1,2,7,10],[0,1,2,7,10],[3,7,10],[0,3,7,10],[1,3,7,10],[0,1,3,7,10],[2,3,7,10],[0,2,3,7,10],[1,2,3,7,10],[0,1,2,3,7,10],[4,7,10],[0,4,7,10],[1,4,7,10],[0,1,4,7,10],[2,4,7,10],[0,2,4,7,10],[1,2,4,7,10],[0,1,2,4,7,10],[3,4,7,10],[0,3,4,7,10],[1,3,4,7,10],[0,1,3,4,7,10],[2,3,4,7,10],[0,2,3,4,7,10],[1,2,3,4,7,10],[0,1,2,3,4,7,10],[5,7,10],[0,5,7,10],[1,5,7,10],[0,1,5,7,10],[2,5,7,10],[0,2,5,7,10],[1,2,5,7,10],[0,1,2,5,7,10],[3,5,7,10],[0,3,5,7,10],[1,3,5,7,10],[0,1,3,5,7,10],[2,3,5,7,10],[0,2,3,5,7,10],[1,2,3,5,7,10],[0,1,2,3,5,7,10],[4,5,7,10],[0,4,5,7,10],[1,4,5,7,10],[0,1,4,5,7,10],[2,4,5,7,10],[0,2,4,5,7,10],[1,2,4,5,7,10],[0,1,2,4,5,7,10],[3,4,5,7,10],[0,3,4,5,7,10],[1,3,4,5,7,10],[0,1,3,4,5,7,10],[2,3,4,5,7,10],[0,2,3,4,5,7,10],[1,2,3,4,5,7,10],[0,1,2,3,4,5,7,10],[6,7,10],[0,6,7,10],[1,6,7,10],[0,1,6,7,10],[2,6,7,10],[0,2,6,7,10],[1,2,6,7,10],[0,1,2,6,7,10],[3,6,7,10],[0,3,6,7,10],[1,3,6,7,10],[0,1,3,6,7,10],[2,3,6,7,10],[0,2,3,6,7,10],[1,2,3,6,7,10],[0,1,2,3,6,7,10],[4,6,7,10],[0,4,6,7,10],[1,4,6,7,10],[0,1,4,6,7,10],[2,4,6,7,10],[0,2,4,6,7,10],[1,2,4,6,7,10],[0,1,2,4,6,7,10],[3,4,6,7,10],[0,3,4,6,7,10],[1,3,4,6,7,10],[0,1,3,4,6,7,10],[2,3,4,6,7,10],[0,2,3,4,6,7,10],[1,2,3,4,6,7,10],[0,1,2,3,4,6,7,10],[5,6,7,10],[0,5,6,7,10],[1,5,6,7,10],[0,1,5,6,7,10],[2,5,6,7,10],[0,2,5,6,7,10],[1,2,5,6,7,10],[0,1,2,5,6,7,10],[3,5,6,7,10],[0,3,5,6,7,10],[1,3,5,6,7,10],[0,1,3,5,6,7,10],[2,3,5,6,7,10],[0,2,3,5,6,7,10],[1,2,3,5,6,7,10],[0,1,2,3,5,6,7,10],[4,5,6,7,10],[0,4,5,6,7,10],[1,4,5,6,7,10],[0,1,4,5,6,7,10],[2,4,5,6,7,10],[0,2,4,5,6,7,10],[1,2,4,5,6,7,10],[0,1,2,4,5,6,7,10],[3,4,5,6,7,10],[0,3,4,5,6,7,10],[1,3,4,5,6,7,10],[0,1,3,4,5,6,7,10],[2,3,4,5,6,7,10],[0,2,3,4,5,6,7,10],[1,2,3,4,5,6,7,10],[0,1,2,3,4,5,6,7,10],[8,10],[0,8,10],[1,8,10],[0,1,8,10],[2,8,10],[0,2,8,10],[1,2,8,10],[0,1,2,8,10],[3,8,10],[0,3,8,10],[1,3,8,10],[0,1,3,8,10],[2,3,8,10],[0,2,3,8,10],[1,2,3,8,10],[0,1,2,3,8,10],[4,8,10],[0,4,8,10],[1,4,8,10],[0,1,4,8,10],[2,4,8,10],[0,2,4,8,10],[1,2,4,8,10],[0,1,2,4,8,10],[3,4,8,10],[0,3,4,8,10],[1,3,4,8,10],[0,1,3,4,8,10],[2,3,4,8,10],[0,2,3,4,8,10],[1,2,3,4,8,10],[0,1,2,3,4,8,10],[5,8,10],[0,5,8,10],[1,5,8,10],[0,1,5,8,10],[2,5,8,10],[0,2,5,8,10],[1,2,5,8,10],[0,1,2,5,8,10],[3,5,8,10],[0,3,5,8,10],[1,3,5,8,10],[0,1,3,5,8,10],[2,3,5,8,10],[0,2,3,5,8,10],[1,2,3,5,8,10],[0,1,2,3,5,8,10],[4,5,8,10],[0,4,5,8,10],[1,4,5,8,10],[0,1,4,5,8,10],[2,4,5,8,10],[0,2,4,5,8,10],[1,2,4,5,8,10],[0,1,2,4,5,8,10],[3,4,5,8,10],[0,3,4,5,8,10],[1,3,4,5,8,10],[0,1,3,4,5,8,10],[2,3,4,5,8,10],[0,2,3,4,5,8,10],[1,2,3,4,5,8,10],[0,1,2,3,4,5,8,10],[6,8,10],[0,6,8,10],[1,6,8,10],[0,1,6,8,10],[2,6,8,10],[0,2,6,8,10],[1,2,6,8,10],[0,1,2,6,8,10],[3,6,8,10],[0,3,6,8,10],[1,3,6,8,10],[0,1,3,6,8,10],[2,3,6,8,10],[0,2,3,6,8,10],[1,2,3,6,8,10],[0,1,2,3,6,8,10],[4,6,8,10],[0,4,6,8,10],[1,4,6,8,10],[0,1,4,6,8,10],[2,4,6,8,10],[0,2,4,6,8,10],[1,2,4,6,8,10],[0,1,2,4,6,8,10],[3,4,6,8,10],[0,3,4,6,8,10],[1,3,4,6,8,10],[0,1,3,4,6,8,10],[2,3,4,6,8,10],[0,2,3,4,6,8,10],[1,2,3,4,6,8,10],[0,1,2,3,4,6,8,10],[5,6,8,10],[0,5,6,8,10],[1,5,6,8,10],[0,1,5,6,8,10],[2,5,6,8,10],[0,2,5,6,8,10],[1,2,5,6,8,10],[0,1,2,5,6,8,10],[3,5,6,8,10],[0,3,5,6,8,10],[1,3,5,6,8,10],[0,1,3,5,6,8,10],[2,3,5,6,8,10],[0,2,3,5,6,8,10],[1,2,3,5,6,8,10],[0,1,2,3,5,6,8,10],[4,5,6,8,10],[0,4,5,6,8,10],[1,4,5,6,8,10],[0,1,4,5,6,8,10],[2,4,5,6,8,10],[0,2,4,5,6,8,10],[1,2,4,5,6,8,10],[0,1,2,4,5,6,8,10],[3,4,5,6,8,10],[0,3,4,5,6,8,10],[1,3,4,5,6,8,10],[0,1,3,4,5,6,8,10],[2,3,4,5,6,8,10],[0,2,3,4,5,6,8,10],[1,2,3,4,5,6,8,10],[0,1,2,3,4,5,6,8,10],[7,8,10],[0,7,8,10],[1,7,8,10],[0,1,7,8,10],[2,7,8,10],[0,2,7,8,10],[1,2,7,8,10],[0,1,2,7,8,10],[3,7,8,10],[0,3,7,8,10],[1,3,7,8,10],[0,1,3,7,8,10],[2,3,7,8,10],[0,2,3,7,8,10],[1,2,3,7,8,10],[0,1,2,3,7,8,10],[4,7,8,10],[0,4,7,8,10],[1,4,7,8,10],[0,1,4,7,8,10],[2,4,7,8,10],[0,2,4,7,8,10],[1,2,4,7,8,10],[0,1,2,4,7,8,10],[3,4,7,8,10],[0,3,4,7,8,10],[1,3,4,7,8,10],[0,1,3,4,7,8,10],[2,3,4,7,8,10],[0,2,3,4,7,8,10],[1,2,3,4,7,8,10],[0,1,2,3,4,7,8,10],[5,7,8,10],[0,5,7,8,10],[1,5,7,8,10],[0,1,5,7,8,10],[2,5,7,8,10],[0,2,5,7,8,10],[1,2,5,7,8,10],[0,1,2,5,7,8,10],[3,5,7,8,10],[0,3,5,7,8,10],[1,3,5,7,8,10],[0,1,3,5,7,8,10],[2,3,5,7,8,10],[0,2,3,5,7,8,10],[1,2,3,5,7,8,10],[0,1,2,3,5,7,8,10],[4,5,7,8,10],[0,4,5,7,8,10],[1,4,5,7,8,10],[0,1,4,5,7,8,10],[2,4,5,7,8,10],[0,2,4,5,7,8,10],[1,2,4,5,7,8,10],[0,1,2,4,5,7,8,10],[3,4,5,7,8,10],[0,3,4,5,7,8,10],[1,3,4,5,7,8,10],[0,1,3,4,5,7,8,10],[2,3,4,5,7,8,10],[0,2,3,4,5,7,8,10],[1,2,3,4,5,7,8,10],[0,1,2,3,4,5,7,8,10],[6,7,8,10],[0,6,7,8,10],[1,6,7,8,10],[0,1,6,7,8,10],[2,6,7,8,10],[0,2,6,7,8,10],[1,2,6,7,8,10],[0,1,2,6,7,8,10],[3,6,7,8,10],[0,3,6,7,8,10],[1,3,6,7,8,10],[0,1,3,6,7,8,10],[2,3,6,7,8,10],[0,2,3,6,7,8,10],[1,2,3,6,7,8,10],[0,1,2,3,6,7,8,10],[4,6,7,8,10],[0,4,6,7,8,10],[1,4,6,7,8,10],[0,1,4,6,7,8,10],[2,4,6,7,8,10],[0,2,4,6,7,8,10],[1,2,4,6,7,8,10],[0,1,2,4,6,7,8,10],[3,4,6,7,8,10],[0,3,4,6,7,8,10],[1,3,4,6,7,8,10],[0,1,3,4,6,7,8,10],[2,3,4,6,7,8,10],[0,2,3,4,6,7,8,10],[1,2,3,4,6,7,8,10],[0,1,2,3,4,6,7,8,10],[5,6,7,8,10],[0,5,6,7,8,10],[1,5,6,7,8,10],[0,1,5,6,7,8,10],[2,5,6,7,8,10],[0,2,5,6,7,8,10],[1,2,5,6,7,8,10],[0,1,2,5,6,7,8,10],[3,5,6,7,8,10],[0,3,5,6,7,8,10],[1,3,5,6,7,8,10],[0,1,3,5,6,7,8,10],[2,3,5,6,7,8,10],[0,2,3,5,6,7,8,10],[1,2,3,5,6,7,8,10],[0,1,2,3,5,6,7,8,10],[4,5,6,7,8,10],[0,4,5,6,7,8,10],[1,4,5,6,7,8,10],[0,1,4,5,6,7,8,10],[2,4,5,6,7,8,10],[0,2,4,5,6,7,8,10],[1,2,4,5,6,7,8,10],[0,1,2,4,5,6,7,8,10],[3,4,5,6,7,8,10],[0,3,4,5,6,7,8,10],[1,3,4,5,6,7,8,10],[0,1,3,4,5,6,7,8,10],[2,3,4,5,6,7,8,10],[0,2,3,4,5,6,7,8,10],[1,2,3,4,5,6,7,8,10],[0,1,2,3,4,5,6,7,8,10]]
*/
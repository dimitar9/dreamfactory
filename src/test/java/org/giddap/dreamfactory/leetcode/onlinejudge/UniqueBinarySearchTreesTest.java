package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.UniqueBinarySearchTreesBottomUpDpImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueBinarySearchTreesTest {
    //    private UniqueBinarySearchTrees solution = new UniqueBinarySearchTreesRecursiveImpl();
    private UniqueBinarySearchTrees solution = new UniqueBinarySearchTreesBottomUpDpImpl();

    @Test
    public void small01() {
        assertEquals(5, solution.numTrees(3));
    }
}

/*
Test cases
Input	 Output	 Expected
1	1	1
2	2	2
3	5	5
4	14	14
5	42	42
6	132	132
7	429	429
8	1430	1430
9	4862	4862
10	16796	16796
11	58786	58786
12	208012	208012
13	742900	742900
14	2674440	2674440
*/
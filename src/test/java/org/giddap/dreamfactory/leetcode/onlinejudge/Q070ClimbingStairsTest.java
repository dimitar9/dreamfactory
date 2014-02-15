package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q070ClimbingStairsDPImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q070ClimbingStairsTest {
    private Q070ClimbingStairs solution = new Q070ClimbingStairsDPImpl();

    @Test
    public void small01() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    public void small02() {
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    public void small03() {
        assertEquals(5, solution.climbStairs(4));
    }

    @Test
    public void small04() {
        assertEquals(8, solution.climbStairs(5));
    }
}

/*
Test cases
Input	 Output	 Expected
1	1	1
2	2	2
3	3	3
4	5	5
5	8	8
6	13	13
7	21	21
8	34	34
9	55	55
10	89	89
35	14930352	14930352
11	144	144
28	514229	514229
13	377	377
14	610	610
29	832040	832040
38	63245986	63245986
18	4181	4181
25	121393	121393
20	10946	10946
16	1597	1597
44	1134903170	1134903170
34	9227465	9227465
31	2178309	2178309
21	17711	17711
17	2584	2584
37	39088169	39088169
36	24157817	24157817
22	28657	28657
33	5702887	5702887
15	987	987
45	1836311903	1836311903
27	317811	317811
19	6765	6765
43	701408733	701408733
41	267914296	267914296
24	75025	75025
40	165580141	165580141
30	1346269	1346269
32	3524578	3524578
23	46368	46368
12	233	233
42	433494437	433494437
39	102334155	102334155
26	196418	196418
*/
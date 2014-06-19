package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.UniquePathsDPImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {
    //    private UniquePathsRecursiveDfsImpl solution = new UniquePathsRecursiveDfsImpl();
    private UniquePaths solution = new UniquePathsDPImpl();

    @Test
    public void small01() {
        assertEquals(56, solution.uniquePaths(6, 4));
    }
}

/*
Test cases
Input	 Output	 Expected
1, 2	1	1
1, 10	1	1
2, 1	1	1
10, 1	1	1
1, 1	1	1
2, 2	2	2
3, 3	6	6
4, 4	20	20
5, 5	70	70
3, 7	28	28
4, 6	56	56
6, 4	56	56
10, 10	48620	48620
9, 8	6435	6435
2, 3	3	3
6, 2	6	6
2, 9	9	9
8, 6	792	792
4, 9	165	165
7, 3	28	28
7, 7	924	924
5, 10	715	715
5, 7	210	210
3, 4	10	10
7, 6	462	462
6, 6	252	252
2, 4	4	4
11, 5	1001	1001
8, 8	3432	3432
2, 7	7	7
7, 2	7	7
5, 4	35	35
9, 11	43758	43758
6, 3	21	21
2, 6	6	6
8, 2	8	8
23, 12	193536720	193536720
19, 13	86493225	86493225
36, 7	4496388	4496388
25, 9	10518300	10518300
51, 9	1916797311	1916797311
53, 4	26235	26235
13, 23	548354040	548354040
10, 16	1307504	1307504
16, 8	170544	170544
57, 2	57	57
49, 6	2869685	2869685
38, 10	1101716330	1101716330
41, 7	9366819	9366819
25, 7	593775	593775
29, 4	4495	4495
19, 6	33649	33649
59, 5	557845	557845
11, 18	8436285	8436285
56, 5	455126	455126
27, 11	254186856	254186856
39, 8	45379620	45379620
1, 100	1	1
100, 1	1	1
2, 100	100	100
100, 3	5050	5050
*/
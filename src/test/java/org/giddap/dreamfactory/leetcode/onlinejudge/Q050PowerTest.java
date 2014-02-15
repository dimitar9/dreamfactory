package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q050PowerImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q050PowerTest {
    private Q050Power solution = new Q050PowerImpl();

    @Test
    public void small01() {
        assertEquals((int) Math.pow(2.0, 3.0), (int) solution.pow(2.0, 3));
    }
}

/*
Test cases
Input	 Output	 Expected
8.88023, 3	700.28148	700.28148
34.00515, -3	0.00003	0.00003
3.89707, 2	15.18715	15.18715
22.14659, -2	0.00204	0.00204
0.44528, 0	1.00000	1.00000
8.84372, -5	0.00002	0.00002
0.44894, -5	54.83508	54.83508
0.72348, 2	0.52342	0.52342
8.95371, -1	0.11169	0.11169
8.66731, 4	5643.35434	5643.35434
4.53636, -4	0.00236	0.00236
21.83387, -2	0.00210	0.00210
36.86919, -3	0.00002	0.00002
6.90885, 4	2278.36371	2278.36371
26.45964, 2	700.11255	700.11255
42.38803, 1	42.38803	42.38803
1.60835, -1	0.62176	0.62176
8.55016, 2	73.10524	73.10524
3.36897, -4	0.00776	0.00776
13.71406, -1	0.07292	0.07292
24.31877, 0	1.00000	1.00000
15.53496, 3	3749.12930	3749.12930
3.64302, 5	641.66415	641.66415
85.83033, -1	0.01165	0.01165
21.80146, -1	0.04587	0.04587
44.34497, 1	44.34497	44.34497
38.52708, 0	1.00000	1.00000
30.95427, 1	30.95427	30.95427
12.38265, -1	0.08076	0.08076
60.26072, 1	60.26072	60.26072
19.91386, -3	0.00013	0.00013
1.80249, -4	0.09473	0.09473
58.66067, -1	0.01705	0.01705
2.38621, -2	0.17562	0.17562
30.36176, 2	921.83647	921.83647
3.29993, 0	1.00000	1.00000
24.34302, -1	0.04108	0.04108
15.57408, 0	1.00000	1.00000
23.77364, -1	0.04206	0.04206
31.24428, 0	1.00000	1.00000
13.39448, 3	2403.13171	2403.13171
35.82084, -2	0.00078	0.00078
4.46188, -5	0.00057	0.00057
7.09208, -1	0.14100	0.14100
40.92200, -1	0.02444	0.02444
65.03013, 2	4228.91781	4228.91781
68.71309, 0	1.00000	1.00000
2.38451, -3	0.07376	0.07376
5.73207, -3	0.00531	0.00531
56.54587, 2	3197.43541	3197.43541
62.23270, -1	0.01607	0.01607
12.89673, -1	0.07754	0.07754
0.77964, -4	2.70660	2.70660
85.97151, 0	1.00000	1.00000
28.07445, -3	0.00005	0.00005
23.56502, -3	0.00008	0.00008
1.92768, -2	0.26911	0.26911
0.05930, 2	0.00352	0.00352
25.41728, 2	646.03812	646.03812
3.21311, 2	10.32408	10.32408
16.30100, -3	0.00023	0.00023
13.30252, -3	0.00042	0.00042
13.88514, -4	0.00003	0.00003
9.37733, -3	0.00121	0.00121
33.53483, -1	0.02982	0.02982
17.10433, 3	5004.01037	5004.01037
23.17099, 1	23.17099	23.17099
17.15910, 2	294.43471	294.43471
3.85364, 2	14.85054	14.85054
5.54613, -3	0.00586	0.00586
2.22760, 2	4.96220	4.96220
1.08431, 0	1.00000	1.00000
2.43585, -4	0.02841	0.02841
6.78730, 0	1.00000	1.00000
14.06889, 0	1.00000	1.00000
12.40839, 1	12.40839	12.40839
13.16719, 3	2282.86015	2282.86015
20.15376, 3	8185.93416	8185.93416
0.41109, -1	2.43256	2.43256
2.56264, 5	110.51927	110.51927
20.11319, -3	0.00012	0.00012
14.20556, 1	14.20556	14.20556
7.27861, 4	2806.68581	2806.68581
45.68941, 1	45.68941	45.68941
19.26153, 2	371.00654	371.00654
3.24811, -4	0.00898	0.00898
6.96764, 4	2356.90900	2356.90900
22.65874, -1	0.04413	0.04413
0.81706, -3	1.83332	1.83332
52.79299, -2	0.00036	0.00036
24.68383, -2	0.00164	0.00164
20.86179, -2	0.00230	0.00230
6.82357, 3	317.71298	317.71298
1.56037, -4	0.16869	0.16869
10.99121, -1	0.09098	0.09098
18.68808, -1	0.05351	0.05351
0.65185, 0	1.00000	1.00000
4.50009, -2	0.04938	0.04938
1.17943, 4	1.93503	1.93503
6.54493, 1	6.54493	6.54493
37.32888, -3	0.00002	0.00002
14.91663, -4	0.00002	0.00002
5.98642, 4	1284.30665	1284.30665
23.46214, 2	550.47201	550.47201
25.86960, -2	0.00149	0.00149
11.20693, -3	0.00071	0.00071
12.86805, -3	0.00047	0.00047
2.46747, 5	91.46594	91.46594
17.51948, -1	0.05708	0.05708
4.72453, 1	4.72453	4.72453
15.74949, 1	15.74949	15.74949
75.48067, 2	5697.33154	5697.33154
3.36937, 3	38.25129	38.25129
8.88293, 3	700.92043	700.92043
64.67416, 2	4182.74697	4182.74697
9.33743, -4	0.00013	0.00013
9.19991, -4	0.00014	0.00014
58.99777, 1	58.99777	58.99777
8.79249, -2	0.01294	0.01294
4.40519, 5	1658.91152	1658.91152
18.98132, 2	360.29051	360.29051
30.06939, 0	1.00000	1.00000
8.79778, 1	8.79778	8.79778
21.26670, -1	0.04702	0.04702
88.78972, -1	0.01126	0.01126
50.82887, -1	0.01967	0.01967
15.41021, 1	15.41021	15.41021
8.96216, -2	0.01245	0.01245
10.20931, 2	104.23001	104.23001
1.96463, 4	14.89783	14.89783
3.36872, -3	0.02616	0.02616
35.71617, -2	0.00078	0.00078
50.14166, -1	0.01994	0.01994
53.90172, 2	2905.39542	2905.39542
0.60973, -2	2.68983	2.68983
64.58570, 0	1.00000	1.00000
60.24644, -2	0.00028	0.00028
1.07405, -2	0.86686	0.86686
2.51295, -2	0.15836	0.15836
4.70975, -6	0.00009	0.00009
12.72042, 2	161.80908	161.80908
26.41382, 1	26.41382	26.41382
9.74010, 1	9.74010	9.74010
3.95057, -3	0.01622	0.01622
4.07187, -4	0.00364	0.00364
41.80492, -1	0.02392	0.02392
0.54189, 5	0.04673	0.04673
19.94087, 2	397.63830	397.63830
1.26441, 9	8.26021	8.26021
83.61545, -1	0.01196	0.01196
1.54262, 4	5.66286	5.66286
34.80781, -3	0.00002	0.00002
1.27344, -5	0.29861	0.29861
11.22017, 1	11.22017	11.22017
38.37833, -1	0.02606	0.02606
12.21875, 2	149.29785	149.29785
2.40979, -10	0.00015	0.00015
2.94370, -9	0.00006	0.00006
2.48761, -2	0.16160	0.16160
0.59049, -4	8.22526	8.22526
1.72777, 7	45.96227	45.96227
1.13816, -5	0.52358	0.52358
4.71723, 4	495.16302	495.16302
2.14797, 1	2.14797	2.14797
3.17925, 2	10.10763	10.10763
9.16117, -2	0.01192	0.01192
82.88981, 1	82.88981	82.88981
7.87115, 2	61.95500	61.95500
42.81803, -2	0.00055	0.00055
0.25519, -6	3620.91299	3620.91299
7.36283, 1	7.36283	7.36283
11.12049, 1	11.12049	11.12049
2.33201, -10	0.00021	0.00021
28.34794, 2	803.60570	803.60570
23.24160, -1	0.04303	0.04303
19.61695, -3	0.00013	0.00013
58.52808, -1	0.01709	0.01709
56.38366, -1	0.01774	0.01774
3.76050, -8	0.00003	0.00003
2.23013, -8	0.00163	0.00163
17.37328, 3	5243.79201	5243.79201
0.96555, 8	0.75544	0.75544
64.08355, -2	0.00024	0.00024
26.54253, -3	0.00005	0.00005
12.02289, -4	0.00005	0.00005
4.36852, -2	0.05240	0.05240
5.97540, -2	0.02801	0.02801
55.46854, -2	0.00033	0.00033
19.28868, 3	7176.41466	7176.41466
35.10009, -2	0.00081	0.00081
1.40831, 7	10.98722	10.98722
1.84364, -14	0.00019	0.00019
0.53915, 5	0.04556	0.04556
33.69928, -3	0.00003	0.00003
29.43376, -1	0.03397	0.03397
0.08164, 2	0.00667	0.00667
0.86429, 18	0.07242	0.07242
1.71939, -6	0.03870	0.03870
42.98272, -2	0.00054	0.00054
34.33222, 2	1178.70133	1178.70133
11.29620, -1	0.08853	0.08853
52.03473, -1	0.01922	0.01922
22.88565, 0	1.00000	1.00000
3.67933, 2	13.53747	13.53747
61.54853, 2	3788.22155	3788.22155
1.01696, 8	1.14401	1.14401
4.45523, 3	88.43219	88.43219
2.01973, 4	16.64076	16.64076
2.33417, 3	12.71737	12.71737
0.97911, 5	0.89982	0.89982
9.80159, 3	941.65019	941.65019
1.13183, 16	7.25269	7.25269
1.13313, 20	12.17853	12.17853
0.60146, 12	0.00224	0.00224
1.26346, 4	2.54827	2.54827
1.49142, 20	2964.82630	2964.82630
5.10785, 5	3476.88779	3476.88779
6.23495, 5	9422.47243	9422.47243
1.51524, 6	12.10288	12.10288
0.85318, 20	0.04177	0.04177
3.92588, 6	3661.18879	3661.18879
9.75077, 3	927.07899	927.07899
1.99364, 11	1977.48922	1977.48922
5.94201, 4	1246.61834	1246.61834
0.97267, 13	0.69751	0.69751
2.45354, 3	14.76996	14.76996
3.71687, 7	9800.35035	9800.35035
1.92071, 14	9299.61919	9299.61919
3.32059, 6	1340.57629	1340.57629
2.43864, 5	86.24590	86.24590
9.82860, 4	9331.82622	9331.82622
1.15442, 7	2.73242	2.73242
4.54745, 4	427.63351	427.63351
0.83552, 11	0.13852	0.13852
1.91182, 10	652.33399	652.33399
1.56692, 7	23.19144	23.19144
1.51650, 14	340.24661	340.24661
2.50140, 10	9590.28371	9590.28371
7.54155, 4	3234.76294	3234.76294
1.97615, 5	30.13697	30.13697
3.54072, 5	556.49071	556.49071
0.37930, 7	0.00113	0.00113
7.44690, 3	412.97767	412.97767
1.95421, 13	6062.14063	6062.14063
1.92596, 6	51.03682	51.03682
1.40468, 11	42.00987	42.00987
-13.62608, 3	-2529.95504	-2529.95504
-3.39758, 5	-452.73957	-452.73957
14.67767, 3	3162.06911	3162.06911
-13.13584, 3	-2266.59303	-2266.59303
0.22838, 7	0.00003	0.00003
-4.48392, 6	8127.31576	8127.31576
-1.45677, 11	-62.70481	-62.70481
-12.30723, 3	-1864.15041	-1864.15041
-9.08472, 4	6811.55372	6811.55372
-2.25101, 10	3340.21363	3340.21363
0.36412, 4	0.01758	0.01758
6.60567, 3	288.23759	288.23759
6.25935, 4	1535.03028	1535.03028
-3.32480, 7	-4491.16159	-4491.16159
0.60169, 5	0.07886	0.07886
0.34772, 8	0.00021	0.00021
3.90419, 6	3541.48713	3541.48713
-0.82541, 12	0.10001	0.10001
3.00748, 7	2225.45714	2225.45714
1.76083, 4	9.61324	9.61324
2.56795, 3	16.93401	16.93401
-8.38376, 3	-589.27296	-589.27296
-4.50608, 4	412.28316	412.28316
-0.41731, 8	0.00092	0.00092
-1.78536, 12	1048.84088	1048.84088
0.62334, 19	0.00013	0.00013
-1.54328, 11	-118.27474	-118.27474
-0.50757, 6	0.01710	0.01710
-17.83437, 3	-5672.48449	-5672.48449
-10.92356, 3	-1303.44465	-1303.44465
-1.88835, 12	2055.84284	2055.84284
-1.15132, 14	7.19026	7.19026
-1.38206, 5	-5.04237	-5.04237
-0.93850, 6	0.68329	0.68329
-1.31106, 18	130.98037	130.98037
-1.15682, 7	-2.77243	-2.77243
-2.18690, 5	-50.02011	-50.02011
-1.42765, 9	-24.63745	-24.63745
-2.33453, 3	-12.72326	-12.72326
1.00012, 1024	1.13074	1.13074
1.00001, 123456	3.43684	3.43684
0.00001, 2147483647	0.00000	0.00000
1.00021, 9999	8.16266	8.16266
1.00123, 88	1.11424	1.11424
-1.00001, 447125	-87.46403	-87.46403
-0.99999, 221620	0.10902	0.10902
0.99999, 948688	0.00008	0.00008
-0.99999, 933520	0.00009	0.00009
1.00007, 127164	7340.54568	7340.54568
1.00000, 2147483647	1.00000	1.00000
1.00000, -2147483648	1.00000	1.00000
-1.00000, 2147483647	-1.00000	-1.00000
-1.00000, -2147483648	1.00000	1.00000
*/
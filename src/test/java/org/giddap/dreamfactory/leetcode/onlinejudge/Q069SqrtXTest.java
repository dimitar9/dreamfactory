package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.SqrtXBinarySearchImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q069SqrtXTest {
    //    private Q069SqrtX solution = new Q069SqrtXNewtonImpl();
    private Q069SqrtX solution = new SqrtXBinarySearchImpl();

    @Test
    public void small01() {
        assertEquals(2, solution.sqrt(6));
    }

    @Test
    public void small02() {
        assertEquals(10, solution.sqrt(100));
    }

    @Test
    public void small03() {
        assertEquals(46339, solution.sqrt(2147395599));
    }
}

/*
Test cases
Input	 Output	 Expected
0	0	0
1	1	1
2	1	1
3	1	1
4	2	2
5	2	2
6	2	2
7	2	2
8	2	2
9	3	3
10	3	3
1024	32	32
8192	90	90
2147395599	46339	46339
2147395600	46340	46340
2147483647	46340	46340
183692038	13553	13553
1978959248	44485	44485
29792276	5458	5458
1660267039	40746	40746
1085817232	32951	32951
562464195	23716	23716
808909662	28441	28441
1510227509	38861	38861
1212195572	34816	34816
11290418	3360	3360
519194475	22785	22785
1764975709	42011	42011
1813156381	42581	42581
1041080284	32265	32265
1183562654	34402	34402
856035737	29258	29258
1380590378	37156	37156
1739869407	41711	41711
1785842024	42259	42259
984230921	31372	31372
959598578	30977	30977
1185692718	34433	34433
2088437940	45699	45699
1871180207	43257	43257
591420545	24319	24319
647079221	25437	25437
537001935	23173	23173
2143723787	46300	46300
490786243	22153	22153
1193598064	34548	34548
247776352	15740	15740
674478281	25970	25970
1025073664	32016	32016
277568629	16660	16660
187261672	13684	13684
2110890896	45944	45944
840032824	28983	28983
996171334	31562	31562
1473634757	38387	38387
2052228396	45301	45301
1007461752	31740	31740
1992829232	44641	44641
1669720458	40862	40862
673134485	25944	25944
886425868	29772	29772
705799464	26566	26566
1529170222	39104	39104
119532598	10933	10933
298185223	17268	17268
1167528599	34169	34169
1103763519	33222	33222
1257783801	35465	35465
205737669	14343	14343
1044717811	32322	32322
981480360	31328	31328
797158214	28233	28233
1691797032	41131	41131
1518482296	38967	38967
793398353	28167	28167
35099627	5924	5924
564596712	23761	23761
1041174706	32267	32267
709577908	26637	26637
1589670376	39870	39870
1318743335	36314	36314
896839580	29947	29947
1553077624	39409	39409
11292511	3360	3360
1893010914	43508	43508
879228733	29651	29651
2063520907	45425	45425
752989018	27440	27440
724574317	26917	26917
1585757717	39821	39821
1426123503	37764	37764
1611000185	40137	40137
144073533	12003	12003
807810077	28421	28421
1730532783	41599	41599
442258756	21029	21029
1975338676	44444	44444
686812654	26207	26207
1700042558	41231	41231
33592698	5795	5795
1731530465	41611	41611
534039270	23109	23109
830750912	28822	28822
1275843849	35718	35718
2052521566	45304	45304
1624149266	40300	40300
1310943476	36206	36206
469634630	21671	21671
517840324	22756	22756
2020521384	44950	44950
2059305006	45379	45379
1836583659	42855	42855
769877316	27746	27746
1464898982	38273	38273
1847876170	42986	42986
515404582	22702	22702
196644067	14022	14022
1763913429	41998	41998
1268393600	35614	35614
921218384	30351	30351
1202187499	34672	34672
547033455	23388	23388
384734921	19614	19614
1346261032	36691	36691
1354843532	36808	36808
2115267704	45992	45992
1788519789	42290	42290
1182698561	34390	34390
654596710	25585	25585
1341078699	36620	36620
1216291259	34875	34875
238643527	15448	15448
1875117969	43302	43302
2047042171	45244	45244
1514487376	38916	38916
1780155888	42191	42191
1523707789	39034	39034
677947204	26037	26037
102306870	10114	10114
2041548113	45183	45183
550984940	23473	23473
14128229	3758	3758
1730648124	41601	41601
1320862256	36343	36343
1479027211	38458	38458
1431040646	37829	37829
1836266838	42851	42851
1675671279	40934	40934
1047470428	32364	32364
957176790	30938	30938
449406015	21199	21199
102174279	10108	10108
1504210245	38784	38784
834140937	28881	28881
1448435311	38058	38058
711570130	26675	26675
801924993	28318	28318
1089471452	33007	33007
1894268691	43523	43523
1456521704	38164	38164
283066503	16824	16824
963076302	31033	31033
1695165231	41172	41172
10700825	3271	3271
862634825	29370	29370
1062168960	32590	32590
1790856713	42318	42318
238858967	15455	15455
1740116164	41714	41714
1893163583	43510	43510
132923432	11529	11529
143617457	11984	11984
1907291812	43672	43672
1863571557	43169	43169
1464479713	38268	38268
1238835376	35197	35197
1147128555	33869	33869
1153262904	33959	33959
767023007	27695	27695
47115335	6864	6864
2110439694	45939	45939
1216429022	34877	34877
149289614	12218	12218
1467166292	38303	38303
2050569959	45283	45283
1597724926	39971	39971
31252774	5590	5590
705011305	26552	26552
539712730	23231	23231
1925521465	43880	43880
14049361	3748	3748
822779234	28684	28684
741114119	27223	27223
1709214592	41342	41342
833480059	28870	28870
1603748944	40046	40046
623899904	24977	24977
476853124	21836	21836
1842607911	42925	42925
216532421	14715	14715
222533059	14917	14917
1975531344	44446	44446
360149878	18977	18977
2129824872	46150	46150
1691619253	41129	41129
1824629591	42715	42715
1221176600	34945	34945
691264160	26291	26291
830408847	28816	28816
1988199607	44589	44589
738379496	27173	27173
793364894	28166	28166
1057144981	32513	32513
887669110	29793	29793
113047538	10632	10632
960231293	30987	30987
337910388	18382	18382
144300312	12012	12012
1665242598	40807	40807
877623119	29624	29624
2069821777	45495	45495
1679291959	40979	40979
1700402353	41235	41235
663452248	25757	25757
1241022903	35228	35228
386398764	19657	19657
119717544	10941	10941
1864922808	43184	43184
863251888	29381	29381
1962325456	44298	44298
2081455229	45622	45622
1085784947	32951	32951
1790373152	42312	42312
294121459	17149	17149
1068126171	32682	32682
1334508757	36530	36530
2118751050	46029	46029
141819123	11908	11908
2025772917	45008	45008
801676250	28313	28313
2130018730	46152	46152
616668765	24832	24832
1595041144	39937	39937
1039680064	32244	32244
1504337876	38785	38785
1708088682	41329	41329
1999911357	44720	44720
1842248264	42921	42921
1852388994	43039	43039
1517670307	38957	38957
572387735	23924	23924
1774727123	42127	42127
1049478618	32395	32395
125306440	11194	11194
290695723	17049	17049
143017873	11959	11959
511705204	22620	22620
410413267	20258	20258
2007940681	44810	44810
1374957092	37080	37080
225255075	15008	15008
1941912262	44067	44067
313258392	17699	17699
2015628227	44895	44895
88550073	9410	9410
1381384563	37166	37166
1202653336	34679	34679
59817476	7734	7734
1523203687	39028	39028
1080942606	32877	32877
861493726	29351	29351
1505738769	38803	38803
1697611371	41202	41202
309051222	17579	17579
397935185	19948	19948
1054465599	32472	32472
2017139904	44912	44912
250362894	15822	15822
749230216	27372	27372
1722045250	41497	41497
1768033201	42047	42047
1321617951	36354	36354
1349288725	36732	36732
670028171	25884	25884
1446924392	38038	38038
1639984448	40496	40496
813046045	28513	28513
1958629596	44256	44256
2050397715	45281	45281
673503078	25951	25951
1186103041	34439	34439
128169143	11321	11321
467931693	21631	21631
1499361433	38721	38721
2143797370	46301	46301
556481766	23589	23589
733262348	27078	27078
1198967059	34626	34626
616299242	24825	24825
108982387	10439	10439
132426017	11507	11507
1477792968	38442	38442
1614721157	40183	40183
1830037388	42778	42778
1786844190	42271	42271
2012656342	44862	44862
737019340	27148	27148
1656500446	40700	40700
115535589	10748	10748
1486249556	38551	38551
1231062048	35086	35086
1883568790	43400	43400
660383859	25697	25697
432867125	20805	20805
406113314	20152	20152
2107308251	45905	45905
2072851573	45528	45528
1219159359	34916	34916
1918454200	43800	43800
1975765641	44449	44449
1892662437	43504	43504
957073593	30936	30936
2103934784	45868	45868
213110482	14598	14598
308951378	17577	17577
2100248506	45828	45828
769592249	27741	27741
1042213726	32283	32283
1151731917	33937	33937
1385891491	37227	37227
1151196114	33929	33929
1284157934	35835	35835
716200812	26761	26761
618433623	24868	24868
966711675	31091	31091
355561354	18856	18856
483606317	21991	21991
1703731015	41276	41276
2012061801	44856	44856
599141906	24477	24477
1042496923	32287	32287
1095640201	33100	33100
335227049	18309	18309
1702880782	41265	41265
1528507327	39096	39096
741340363	27227	27227
1662705386	40776	40776
1453875252	38129	38129
1960499722	44277	44277
1433675938	37863	37863
1282157245	35807	35807
1705678511	41299	41299
243265883	15596	15596
1238608381	35193	35193
1918788994	43803	43803
552217261	23499	23499
1191373240	34516	34516
540897595	23257	23257
1594430987	39930	39930
195621509	13986	13986
1926789086	43895	43895
598143453	24456	24456
1479779444	38467	38467
495506250	22259	22259
1216577076	34879	34879
299007471	17291	17291
851067605	29173	29173
1700183394	41233	41233
2002738486	44751	44751
715645758	26751	26751
151841652	12322	12322
897751761	29962	29962
1811285959	42559	42559
487068701	22069	22069
453148895	21287	21287
1192309638	34529	34529
1228409064	35048	35048
2115854281	45998	45998
498701243	22331	22331
1041425138	32271	32271
1402046571	37443	37443
1780858488	42200	42200
599620002	24487	24487
1645312454	40562	40562
871983222	29529	29529
370925348	19259	19259
50046067	7074	7074
2063356462	45424	45424
911822943	30196	30196
1644477055	40552	40552
111494323	10559	10559
691128381	26289	26289
95136860	9753	9753
1591273767	39890	39890
1186634632	34447	34447
1311713937	36217	36217
1890281238	43477	43477
2037702237	45140	45140
864413683	29400	29400
1745536076	41779	41779
605864347	24614	24614
1016255335	31878	31878
495804189	22266	22266
269666658	16421	16421
1503324037	38772	38772
948953085	30805	30805
1461976297	38235	38235
584249453	24171	24171
917323718	30287	30287
1960677540	44279	44279
1625674592	40319	40319
171886642	13110	13110
1594052380	39925	39925
77810946	8821	8821
1817199096	42628	42628
318551954	17848	17848
448736294	21183	21183
1867245164	43211	43211
234424768	15310	15310
1360559237	36885	36885
1364238571	36935	36935
345919092	18598	18598
2051687618	45295	45295
1459375431	38201	38201
1937192859	44013	44013
1090838602	33027	33027
623605720	24972	24972
1679990450	40987	40987
981057191	31321	31321
1488019403	38574	38574
1278042878	35749	35749
1586921538	39836	39836
356791091	18888	18888
1773847068	42117	42117
1856588197	43088	43088
1860115128	43129	43129
575316505	23985	23985
1171080846	34221	34221
296880933	17230	17230
1492640223	38634	38634
984274738	31373	31373
1922555525	43846	43846
1664526865	40798	40798
430843470	20756	20756
2000366471	44725	44725
1334242314	36527	36527
749395425	27375	27375
301619117	17367	17367
1054003830	32465	32465
983820193	31365	31365
1662178354	40769	40769
270758753	16454	16454
1329739285	36465	36465
1566382325	39577	39577
1730134184	41594	41594
1119448497	33458	33458
509737279	22577	22577
206256257	14361	14361
651955299	25533	25533
1490794471	38610	38610
1694275660	41161	41161
1929998177	43931	43931
930232361	30499	30499
2051066751	45288	45288
1556361597	39450	39450
639336910	25285	25285
1763698231	41996	41996
2131678102	46170	46170
1810417756	42549	42549
2060579165	45393	45393
1476834678	38429	38429
647208846	25440	25440
1835651042	42844	42844
993877895	31525	31525
1078052317	32833	32833
1688533866	41091	41091
180636561	13440	13440
1827447742	42748	42748
1990152983	44611	44611
1234640391	35137	35137
663784287	25764	25764
1504847690	38792	38792
1505399144	38799	38799
1993523573	44648	44648
923746367	30393	30393
1088049681	32985	32985
965488422	31072	31072
1433483646	37861	37861
1294305938	35976	35976
1617443721	40217	40217
776794469	27871	27871
841097950	29001	29001
1399958250	37416	37416
1707026831	41316	41316
744681054	27288	27288
808836200	28440	28440
198880093	14102	14102
360895637	18997	18997
793030654	28160	28160
2009297850	44825	44825
273991154	16552	16552
122381684	11062	11062
509023048	22561	22561
2109642197	45930	45930
1116259580	33410	33410
1587075365	39838	39838
1650692415	40628	40628
1296896141	36012	36012
1267039459	35595	35595
1493361750	38644	38644
384052885	19597	19597
1930823747	43941	43941
850725792	29167	29167
1889452029	43467	43467
1776863672	42152	42152
1774472159	42124	42124
830018062	28810	28810
594868446	24389	24389
1060472158	32564	32564
2124324000	46090	46090
64828519	8051	8051
1837266627	42863	42863
817938303	28599	28599
1464786769	38272	38272
1396809810	37373	37373
1562619357	39529	39529
126139321	11231	11231
1595689904	39946	39946
1923514994	43857	43857
919169976	30317	30317
1457504106	38177	38177
50022501	7072	7072
1041551660	32273	32273
1966527154	44345	44345
12181050	3490	3490
10327592	3213	3213
1406118872	37498	37498
1662873465	40778	40778
1307223734	36155	36155
525674683	22927	22927
1008751567	31760	31760
1691276619	41125	41125
309014782	17578	17578
1859477360	43121	43121
1433245000	37858	37858
2085878454	45671	45671
1486465871	38554	38554
115779415	10760	10760
533263252	23092	23092
399454381	19986	19986
92619767	9623	9623
598091771	24455	24455
89237361	9446	9446
910558070	30175	30175
2062878541	45418	45418
1486047171	38549	38549
325693779	18046	18046
41534214	6444	6444
934253427	30565	30565
101725126	10085	10085
960704190	30995	30995
244273885	15629	15629
151747627	12318	12318
2002255851	44746	44746
63317392	7957	7957
163928677	12803	12803
2012583443	44861	44861
1469436264	38333	38333
1826802142	42741	42741
1172323529	34239	34239
1995110947	44666	44666
688070061	26231	26231
716116500	26760	26760
156642082	12515	12515
400063773	20001	20001
1877853	1370	1370
95036888	9748	9748
1886529645	43434	43434
117657268	10846	10846
628300141	25065	25065
138500378	11768	11768
210277035	14500	14500
1226391912	35019	35019
227737739	15090	15090
1120835106	33478	33478
1141786805	33790	33790
1713784911	41397	41397
1446528885	38033	38033
1183321020	34399	34399
500554690	22373	22373
1548254011	39347	39347
2144025210	46303	46303
744828576	27291	27291
1700001638	41231	41231
1998797413	44707	44707
808145968	28427	28427
1863930315	43173	43173
1863897209	43172	43172
130098584	11406	11406
1543248809	39284	39284
888737090	29811	29811
2125209531	46099	46099
83835223	9156	9156
1604853591	40060	40060
134367965	11591	11591
483898996	21997	21997
1606731444	40084	40084
229404854	15146	15146
222944993	14931	14931
1724388712	41525	41525
857704995	29286	29286
361445372	19011	19011
1934665747	43984	43984
2084096907	45651	45651
589183111	24273	24273
908017205	30133	30133
1078400065	32839	32839
155484374	12469	12469
207062443	14389	14389
114237437	10688	10688
656039065	25613	25613
1755316454	41896	41896
110778999	10525	10525
1400867641	37428	37428
1307834445	36163	36163
2109576413	45930	45930
61529961	7844	7844
1024281112	32004	32004
1825989974	42731	42731
191628545	13842	13842
420046274	20495	20495
567243416	23816	23816
169354428	13013	13013
503881497	22447	22447
24613359	4961	4961
303722394	17427	17427
987780493	31428	31428
1631344803	40389	40389
533127248	23089	23089
1210725487	34795	34795
1208249867	34759	34759
1390832243	37293	37293
1572170859	39650	39650
995431967	31550	31550
1327445502	36434	36434
13870322	3724	3724
1903449172	43628	43628
258361919	16073	16073
169354697	13013	13013
2110511615	45940	45940
372599356	19302	19302
825393762	28729	28729
1718344422	41452	41452
483378356	21985	21985
78777755	8875	8875
878695219	29642	29642
445471121	21106	21106
140307716	11845	11845
1902976331	43623	43623
123977447	11134	11134
331936261	18219	18219
175538957	13249	13249
691220863	26291	26291
501290689	22389	22389
679420454	26065	26065
715834223	26755	26755
805013083	28372	28372
1667200948	40831	40831
199695378	14131	14131
1338140331	36580	36580
730442787	27026	27026
1407945246	37522	37522
581488926	24114	24114
155129998	12455	12455
255893565	15996	15996
1908934429	43691	43691
169000320	13000	13000
11859089	3443	3443
19812700	4451	4451
338355017	18394	18394
2122370705	46069	46069
392412057	19809	19809
1163748779	34113	34113
1693231479	41148	41148
875790413	29593	29593
1242526534	35249	35249
424443050	20602	20602
1321261534	36349	36349
1382834250	37186	37186
179935733	13414	13414
1445238981	38016	38016
1714770511	41409	41409
355474691	18854	18854
2136459844	46221	46221
68577553	8281	8281
1034895145	32169	32169
704810419	26548	26548
873590636	29556	29556
554612445	23550	23550
904505798	30075	30075
64247320	8015	8015
1285055232	35847	35847
164967396	12843	12843
645736246	25411	25411
1440185230	37949	37949
420860961	20514	20514
407187027	20178	20178
1609185551	40114	40114
432720050	20801	20801
426999728	20663	20663
1947540568	44130	44130
407607107	20189	20189
819411785	28625	28625
963805700	31045	31045
2100838586	45834	45834
1695202198	41172	41172
58848586	7671	7671
377797988	19437	19437
868980084	29478	29478
1441682837	37969	37969
557733722	23616	23616
166735417	12912	12912
1008969700	31764	31764
913208413	30219	30219
155711613	12478	12478
1077547253	32826	32826
1948103558	44137	44137
860522033	29334	29334
1951137890	44171	44171
355232356	18847	18847
1765027831	42012	42012
2015385210	44893	44893
1640287588	40500	40500
1929995227	43931	43931
513637808	22663	22663
932989171	30544	30544
203372540	14260	14260
920824836	30345	30345
394691074	19866	19866
636092590	25220	25220
1347824564	36712	36712
194747994	13955	13955
1043699698	32306	32306
19752701	4444	4444
1158553694	34037	34037
997054636	31576	31576
1714954899	41412	41412
1217402281	34891	34891
1374852625	37079	37079
436451335	20891	20891
511601470	22618	22618
1932586347	43961	43961
603186752	24559	24559
1520571170	38994	38994
698311112	26425	26425
758898365	27548	27548
450634776	21228	21228
498931022	22336	22336
1619420398	40242	40242
254289018	15946	15946
854163378	29226	29226
1236964581	35170	35170
122190580	11053	11053
346967319	18627	18627
1019476160	31929	31929
635828388	25215	25215
1279956490	35776	35776
1222848700	34969	34969
1556653224	39454	39454
1674647564	40922	40922
1858941291	43115	43115
756994140	27513	27513
1869395558	43236	43236
755157341	27480	27480
776746841	27870	27870
880465605	29672	29672
1752211977	41859	41859
344218092	18553	18553
2097867886	45802	45802
979580954	31298	31298
780669427	27940	27940
461985708	21493	21493
764683653	27652	27652
1383856179	37200	37200
1982556878	44525	44525
1462994765	38249	38249
2142754545	46289	46289
285708006	16902	16902
1961925788	44293	44293
1614691295	40183	40183
539997024	23237	23237
668605518	25857	25857
704172229	26536	26536
662187604	25733	25733
1015572837	31868	31868
1723648389	41516	41516
1298015993	36027	36027
148045679	12167	12167
799013442	28266	28266
707185569	26592	26592
1822693243	42693	42693
510471085	22593	22593
1464179710	38264	38264
1544605154	39301	39301
1265628426	35575	35575
93442903	9666	9666
277587111	16660	16660
870356755	29501	29501
437660996	20920	20920
227971349	15098	15098
1849937710	43010	43010
1218330423	34904	34904
689957057	26267	26267
467137715	21613	21613
454702955	21323	21323
525030287	22913	22913
1930132481	43933	43933
449973852	21212	21212
810738294	28473	28473
1744574621	41768	41768
2064665147	45438	45438
1350735318	36752	36752
265696491	16300	16300
621353728	24926	24926
2012922923	44865	44865
1281269329	35794	35794
197518470	14054	14054
1163455268	34109	34109
1429315008	37806	37806
996531912	31567	31567
1870640837	43250	43250
1104524604	33234	33234
1507002997	38820	38820
1187336899	34457	34457
501646110	22397	22397
625147775	25002	25002
1280779803	35787	35787
779233221	27914	27914
1495504530	38671	38671
1718440799	41454	41454
1007204570	31736	31736
1197958592	34611	34611
789287574	28094	28094
1697161627	41196	41196
1665096308	40805	40805
1243990529	35270	35270
74708266	8643	8643
1447745141	38049	38049
1693964381	41157	41157
885446560	29756	29756
1044836114	32323	32323
1611145881	40139	40139
88698231	9417	9417
1310532605	36201	36201
85015961	9220	9220
2101621154	45843	45843
444318286	21078	21078
282534431	16808	16808
1117592774	33430	33430
1873633295	43285	43285
1279066343	35764	35764
840749963	28995	28995
830674251	28821	28821
638585692	25270	25270
2028086863	45034	45034
1332320361	36500	36500
1263733467	35549	35549
1161383018	34079	34079
2111553582	45951	45951
611754350	24733	24733
732340169	27061	27061
971274504	31165	31165
1809712942	42540	42540
1521627743	39008	39008
520952483	22824	22824
1327325602	36432	36432
618134625	24862	24862
595660749	24406	24406
627587095	25051	25051
164615358	12830	12830
1481107310	38485	38485
1672423209	40895	40895
1775761239	42139	42139
1569805541	39620	39620
835472167	28904	28904
1860777201	43136	43136
1523943047	39037	39037
1279790453	35774	35774
2143311632	46295	46295
494052173	22227	22227
1005940100	31716	31716
1274894328	35705	35705
1334802136	36534	36534
1836614351	42855	42855
1913480020	43743	43743
1215405351	34862	34862
1021451064	31960	31960
1029729840	32089	32089
229304721	15142	15142
985520998	31393	31393
1641484190	40515	40515
961644890	31010	31010
1956795502	44235	44235
1303713484	36106	36106
335788986	18324	18324
330264337	18173	18173
483555439	21989	21989
953923611	30885	30885
925925087	30429	30429
1111142534	33333	33333
1118538969	33444	33444
259548749	16110	16110
636082096	25220	25220
746816561	27327	27327
1829354290	42770	42770
1471554263	38360	38360
460110114	21450	21450
1205813689	34724	34724
603861068	24573	24573
455938098	21352	21352
1699865862	41229	41229
1609801169	40122	40122
1730832426	41603	41603
887184350	29785	29785
1298931872	36040	36040
1496828799	38688	38688
2102589702	45854	45854
172899289	13149	13149
379074991	19469	19469
184410775	13579	13579
1158420287	34035	34035
2020559181	44950	44950
1146055666	33853	33853
967732142	31108	31108
1176789017	34304	34304
1481844652	38494	38494
1297996479	36027	36027
1660344456	40747	40747
288284615	16978	16978
76437918	8742	8742
624003343	24980	24980
1406823584	37507	37507
335986667	18329	18329
1260085439	35497	35497
6156497	2481	2481
17857309	4225	4225
584156054	24169	24169
466266611	21593	21593
1223670998	34981	34981
1188017122	34467	34467
922204710	30367	30367
776053212	27857	27857
650334643	25501	25501
505553488	22484	22484
1663237563	40782	40782
1949266516	44150	44150
2002382287	44747	44747
1618343617	40228	40228
2122165805	46066	46066
233973630	15296	15296
1802754392	42458	42458
1133102444	33661	33661
107049163	10346	10346
801326410	28307	28307
2100834586	45834	45834
1283838181	35830	35830
135687414	11648	11648
1251347418	35374	35374
796698989	28225	28225
423972029	20590	20590
1327785336	36438	36438
1420702332	37692	37692
1830795614	42787	42787
1663772004	40789	40789
533304123	23093	23093
1836952111	42859	42859
1681629313	41007	41007
1117460177	33428	33428
155735075	12479	12479
757816664	27528	27528
157993652	12569	12569
1077939785	32831	32831
1533869876	39164	39164
808328295	28431	28431
1583493273	39793	39793
1049623791	32397	32397
610111163	24700	24700
1438391913	37926	37926
520483760	22814	22814
584793320	24182	24182
1672365543	40894	40894
175754505	13257	13257
1717895765	41447	41447
1779414707	42183	42183
977080915	31258	31258
1671246703	40880	40880
915769240	30261	30261
1112768330	33358	33358
775110473	27840	27840
1712468229	41381	41381
1536740359	39201	39201
2102895810	45857	45857
985686914	31395	31395
1220052325	34929	34929
1619184166	40239	40239
1518991037	38974	38974
909520789	30158	30158
1153329831	33960	33960
488967567	22112	22112
1065255864	32638	32638
1911146495	43716	43716
646961219	25435	25435
2143195649	46294	46294
1297532724	36021	36021
1455289514	38148	38148
1579205274	39739	39739
*/
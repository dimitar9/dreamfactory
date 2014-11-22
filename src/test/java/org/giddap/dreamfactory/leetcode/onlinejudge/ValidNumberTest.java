package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.ValidNumberImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidNumberTest {
    private ValidNumber solution = new ValidNumberImpl();

    @Test
    public void small01() {
        assertTrue(solution.isNumber("1e0"));
    }

    @Test
    public void small02() {
        assertTrue(solution.isNumber(" -1.05e0"));
    }

    @Test
    public void small03() {
        assertFalse(solution.isNumber("abc"));
    }

    @Test
    public void small04() {
        assertFalse(solution.isNumber("0e"));
    }
}

/*
Test cases
Input	 Output	 Expected
"3"	true	true
"e"	false	false
"1"	true	true
"."	false	false
"4"	true	true
"0"	true	true
" "	false	false
"5"	true	true
"2"	true	true
"7"	true	true
"9"	true	true
"6"	true	true
" ."	false	false
"e9"	false	false
"11"	true	true
"1 "	true	true
".1"	true	true
"19"	true	true
"01"	true	true
".2"	true	true
"e."	false	false
"4 "	true	true
"e1"	false	false
" 0"	true	true
"0e"	false	false
".0"	true	true
"3."	true	true
"41"	true	true
"e7"	false	false
"5 "	true	true
".6"	true	true
".."	false	false
"61"	true	true
"65"	true	true
"e0"	false	false
"0."	true	true
"80"	true	true
"5e"	false	false
"1e"	false	false
"10"	true	true
"17"	true	true
"13"	true	true
"1."	true	true
"48"	true	true
".5"	true	true
"21"	true	true
"00"	true	true
". "	false	false
"6e"	false	false
"18"	true	true
"e6"	false	false
"15"	true	true
"05"	true	true
"56"	true	true
"4."	true	true
"73"	true	true
"44"	true	true
"03"	true	true
"ee"	false	false
"60"	true	true
".e"	false	false
"e3"	false	false
"66"	true	true
" e"	false	false
"2e0"	true	true
"210"	true	true
"1e6"	true	true
".20"	true	true
"10e"	false	false
"..2"	false	false
". 1"	false	false
"0.8"	true	true
"4e0"	true	true
"5.6"	true	true
"151"	true	true
"6.1"	true	true
".15"	true	true
"1 4"	false	false
"114"	true	true
"0.7"	true	true
"936"	true	true
".e1"	false	false
"55e"	false	false
"510"	true	true
"0.."	false	false
"e11"	false	false
"010"	true	true
"016"	true	true
".0e"	false	false
"1 0"	false	false
"e81"	false	false
"6e0"	true	true
"1 "	true	true
"605"	true	true
".18"	true	true
"e20"	false	false
" 74"	true	true
"e61"	false	false
".80"	true	true
"00e"	false	false
" 9."	true	true
"000"	true	true
"1e."	false	false
".91"	true	true
"3. "	true	true
"113"	true	true
"005"	true	true
"111"	true	true
"041"	true	true
". 0"	false	false
".1."	false	false
"861"	true	true
"26."	true	true
"1 ."	false	false
"..."	false	false
"101"	true	true
".00"	true	true
"316"	true	true
".1e"	false	false
"500"	true	true
"01."	true	true
"78."	true	true
"3e1"	true	true
"3.."	false	false
"381"	true	true
"315"	true	true
".72"	true	true
"1e9"	true	true
"59."	true	true
"110"	true	true
"1.0"	true	true
"0.1"	true	true
"4.."	false	false
"1.4"	true	true
".2."	false	false
" 9e"	false	false
"811"	true	true
"10."	true	true
" 0e"	false	false
"1.."	false	false
"225"	true	true
"00 "	true	true
"341"	true	true
"108"	true	true
"1.1"	true	true
"..0"	false	false
"920"	true	true
"150"	true	true
".. "	false	false
"008"	true	true
"e44"	false	false
"4e."	false	false
"400"	true	true
"1.3"	true	true
"0e "	false	false
"ee6"	false	false
"3 "	true	true
"46."	true	true
"0.e"	false	false
"235"	true	true
"971"	true	true
"ee."	false	false
"171"	true	true
" .9"	true	true
" 0 "	true	true
"1e1"	true	true
"002"	true	true
"3 6"	false	false
"e.1"	false	false
"0.0"	true	true
"8.."	false	false
"301"	true	true
"7 1"	false	false
"370"	true	true
"6ee"	false	false
".7."	false	false
"070"	true	true
"ee0"	false	false
"01e"	false	false
"761"	true	true
"0e1"	true	true
"130"	true	true
"8 8"	false	false
"0 0"	false	false
"001"	true	true
"911"	true	true
"08."	true	true
"009"	true	true
"6 9"	false	false
"700"	true	true
"e12"	false	false
"115"	true	true
" 00"	true	true
"11."	true	true
".92"	true	true
"801"	true	true
"41."	true	true
"170"	true	true
"3.e"	false	false
"900"	true	true
"e0 "	false	false
"175"	true	true
"708"	true	true
"1.7"	true	true
".05"	true	true
"e9e"	false	false
"1.e"	false	false
"0 ."	false	false
"050"	true	true
"1.8"	true	true
"01 "	true	true
"e1e"	false	false
"41e"	false	false
" e0"	false	false
"100"	true	true
"076"	true	true
" 10"	true	true
"18."	true	true
"9e1"	true	true
"e90"	false	false
" ee"	false	false
".9 "	true	true
"8e "	false	false
"961"	true	true
"8ee"	false	false
"05 "	true	true
"5e4"	true	true
"e51"	false	false
"198"	true	true
"0e3"	true	true
"81."	true	true
"934"	true	true
"1. "	true	true
" 06"	true	true
"e01"	false	false
"09 "	true	true
"f.e"	false	false
"85."	true	true
"te1"	false	false
"Re7"	false	false
"3me"	false	false
"5 "	true	true
"D+ "	false	false
"5.5"	true	true
"e30"	false	false
"Y+."	false	false
"G76"	false	false
"004"	true	true
"e56"	false	false
"02."	true	true
"3e5"	true	true
"e-e"	false	false
"O62"	false	false
".e0"	false	false
"e.+"	false	false
"-1."	true	true
" T3"	false	false
"Ui."	false	false
"53K"	false	false
"Z3m"	false	false
"M0R"	false	false
"+++"	false	false
"+-."	false	false
"6Ze"	false	false
".5e"	false	false
"16U"	false	false
"O +"	false	false
"j+1"	false	false
"i.1"	false	false
"2Se"	false	false
"OL8"	false	false
"J.-"	false	false
"-01"	true	true
"6+1"	false	false
".8+"	false	false
".9."	false	false
"42e"	false	false
"-7."	true	true
"fe "	false	false
"80e"	false	false
"55."	true	true
"7-c"	false	false
"1+8"	false	false
"F 3"	false	false
".93"	true	true
"tue"	false	false
".p7"	false	false
"92m"	false	false
"e4."	false	false
"7j1"	false	false
"A--"	false	false
"O ."	false	false
"+Fe"	false	false
"4. "	true	true
".1+"	false	false
"ee7"	false	false
" H."	false	false
"+eo"	false	false
"3-2"	false	false
"3x1"	false	false
"-+K"	false	false
". ."	false	false
"..i"	false	false
"+.e"	false	false
"05A"	false	false
"a1."	false	false
"0- "	false	false
"o.2"	false	false
"2.e"	false	false
"e 2"	false	false
"ke."	false	false
" 8+"	false	false
"1-3"	false	false
"4 e"	false	false
" 75"	true	true
"..9"	false	false
".x0"	false	false
"M32"	false	false
" Uc"	false	false
"5+6"	false	false
"712"	true	true
"525"	true	true
"-.V"	false	false
"4e+"	false	false
"8q4"	false	false
"4+w"	false	false
". "	false	false
"ex7"	false	false
"e+ "	false	false
". +"	false	false
" we"	false	false
"4.m"	false	false
"8f8"	false	false
"De4"	false	false
"- e"	false	false
"22 "	true	true
".e5"	false	false
"D m"	false	false
"Se6"	false	false
" ub"	false	false
"3Xe"	false	false
"9OU"	false	false
"ie7"	false	false
"+CW"	false	false
"e79"	false	false
"Ie."	false	false
" 23"	true	true
"+ej"	false	false
"3O."	false	false
"5.g"	false	false
"re."	false	false
"+N1"	false	false
"e-b"	false	false
"9 E"	false	false
"8-B"	false	false
"e+U"	false	false
".+."	false	false
"i9a"	false	false
"0-e"	false	false
"G.+"	false	false
"4I2"	false	false
"zl4"	false	false
"e+8"	false	false
"881"	true	true
"3xx"	false	false
"5-q"	false	false
"e.T"	false	false
"7e5"	true	true
"er2"	false	false
"--e"	false	false
"69e"	false	false
"e.e"	false	false
"eu7"	false	false
"-R6"	false	false
"+ev"	false	false
"1-4"	false	false
"+ ."	false	false
"097"	true	true
".-4"	false	false
"eg8"	false	false
"J.."	false	false
".t-"	false	false
"OBe"	false	false
"I L"	false	false
"6+x"	false	false
"-7e"	false	false
"i53"	false	false
"e18"	false	false
"a2+"	false	false
".7-"	false	false
"5fA"	false	false
"NE "	false	false
"ee4"	false	false
"+.8"	true	true
"M0E"	false	false
"51u"	false	false
"J++"	false	false
"ReE"	false	false
"z6e"	false	false
"ee "	false	false
"e2+"	false	false
"+53"	true	true
"8+6"	false	false
"+3e"	false	false
"Oee"	false	false
"U.7"	false	false
"4e6"	true	true
"-0e"	false	false
"-X8"	false	false
"e-1"	false	false
"0x."	false	false
"L7 "	false	false
"5-H"	false	false
"+eM"	false	false
"6e+"	false	false
"m-7"	false	false
"5e."	false	false
"H.P"	false	false
"k74"	false	false
"1+6"	false	false
"1 6"	false	false
"10o"	false	false
"3 x"	false	false
"eR."	false	false
"3+e"	false	false
"e+."	false	false
"Dw."	false	false
"n+-"	false	false
".4K"	false	false
"-75"	true	true
"39E"	false	false
"e. "	false	false
".57"	true	true
"e98"	false	false
" 7e"	false	false
"18e"	false	false
"e9 "	false	false
".+e"	false	false
"-2."	true	true
"..o"	false	false
"-1 "	true	true
"8.0"	true	true
"+.2"	true	true
".m5"	false	false
"9-e"	false	false
"07L"	false	false
"17."	true	true
".ee"	false	false
"..1"	false	false
"4ee"	false	false
"8C."	false	false
"e7."	false	false
"u.1"	false	false
"652"	true	true
"24g"	false	false
"e1."	false	false
"e.2"	false	false
" -."	false	false
"052"	true	true
"e8 "	false	false
"e52"	false	false
"e +"	false	false
"9y9"	false	false
"ee-"	false	false
"-e."	false	false
"eE5"	false	false
".3e"	false	false
".83"	true	true
"3.9"	true	true
"50."	true	true
"hee"	false	false
"0V."	false	false
".e+"	false	false
"ee+"	false	false
".41"	true	true
"8.e"	false	false
"X46"	false	false
"139"	true	true
"7 8"	false	false
"4.7"	true	true
"47."	true	true
"e.."	false	false
"20."	true	true
"68 "	true	true
"e6e"	false	false
".e."	false	false
"9 8"	false	false
"4e3"	true	true
"2e "	false	false
"928"	true	true
"931"	true	true
".W4"	false	false
"VKe"	false	false
"1 3"	false	false
"+ 1"	false	false
"e8."	false	false
"3e4"	true	true
"eeh"	false	false
"3 e"	false	false
"6.r"	false	false
"8e."	false	false
" 65"	true	true
"eM."	false	false
"320"	true	true
" 07"	true	true
"6.5"	true	true
"ey8"	false	false
"0e5"	true	true
"I5z"	false	false
"0 6"	false	false
".ev"	false	false
"8eQ"	false	false
"0+."	false	false
"66."	true	true
"33 "	true	true
"1ee"	false	false
"377"	true	true
"ee8"	false	false
"07e"	false	false
"+93"	true	true
"2e5"	true	true
"9e3"	true	true
"777"	true	true
".-e"	false	false
"e60"	false	false
"8-."	false	false
"X79"	false	false
" 42"	true	true
"6en"	false	false
"9.8"	true	true
"4e7"	true	true
".+8"	false	false
" -e"	false	false
" 56"	true	true
"8 5"	false	false
"-8-"	false	false
"F.4"	false	false
".9e"	false	false
" e"	false	false
".96"	true	true
"6Ye"	false	false
".1i"	false	false
"+61"	true	true
"258"	true	true
"417"	true	true
"6+e"	false	false
"e+3"	false	false
"976"	true	true
"g12"	false	false
".eT"	false	false
"94e"	false	false
"43e"	false	false
"-3."	true	true
"0 4"	false	false
"R.."	false	false
"ee2"	false	false
"+E3"	false	false
"5.8"	true	true
"ez7"	false	false
".45"	true	true
"Q.1"	false	false
"2. "	true	true
"e.5"	false	false
"eze"	false	false
"5.-"	false	false
"e9P"	false	false
" 1."	true	true
".t9"	false	false
"eeK"	false	false
"+8 "	true	true
". 7"	false	false
"0m."	false	false
"..e"	false	false
".H."	false	false
".7e"	false	false
"y60"	false	false
" e3"	false	false
"e 1"	false	false
".z8"	false	false
"1e0"	true	true
"435"	true	true
"54 "	true	true
". U"	false	false
"4 9"	false	false
"97e"	false	false
"i+-"	false	false
".70.E"	false	false
"671.l"	false	false
"ee0.5"	false	false
"6..8+"	false	false
"eeee7"	false	false
".-e.W"	false	false
"e2.20"	false	false
"4e.9-"	false	false
". 0e7"	false	false
"40.81"	true	true
" r7 1"	false	false
"a.e.q"	false	false
"3...."	false	false
"94TEP"	false	false
" +0e-"	false	false
"5-e95"	false	false
"9+5 ."	false	false
"43b6e"	false	false
"4e1.e"	false	false
"e.7e5"	false	false
"0. .e"	false	false
"6.. 3"	false	false
"7-5Ae"	false	false
"e3e6e"	false	false
"e.I85"	false	false
"e.617"	false	false
".44.8"	false	false
"65eFn"	false	false
"6.3.0"	false	false
"46.e3"	true	true
"Qe4qV"	false	false
"75.0."	false	false
".e6ee"	false	false
"He9ee"	false	false
"9 ee "	false	false
"e ..."	false	false
"47 ."	false	false
"eQe99"	false	false
".-5 b"	false	false
" ...e"	false	false
"6e6.5"	false	false
"6ee69"	false	false
"2.-6."	false	false
"7.e-."	false	false
"5 1.8"	false	false
"pee.e"	false	false
"Q0e.e"	false	false
" 57eh"	false	false
"7..-8"	false	false
"e2.e5"	false	false
" 4e3."	false	false
" eee1"	false	false
"07..e"	false	false
"20..8"	false	false
"98005"	true	true
"6.66-"	false	false
".0s+-"	false	false
" -+ "	false	false
"e-.26"	false	false
"...n."	false	false
" 9566"	true	true
"96 e5"	false	false
"28304"	true	true
"2eee."	false	false
"e.343"	false	false
"5+..6"	false	false
"W0e-H"	false	false
"e73-."	false	false
".e7eA"	false	false
"8..e4"	false	false
"eede2"	false	false
".0.39"	false	false
" 8. 4"	false	false
"e24-e"	false	false
".08 0"	false	false
"3eee9"	false	false
"..e6e"	false	false
"28+9."	false	false
"-.. e"	false	false
". .ee"	false	false
". ..8"	false	false
"7e69e"	false	false
"e6.7e"	false	false
"e4e4e"	false	false
" e-F-"	false	false
"e4105"	false	false
" 2.8"	true	true
"8e.9e"	false	false
"5ee.."	false	false
"e6e66"	false	false
"-4..2"	false	false
"-euke"	false	false
"66p45"	false	false
"0..o6"	false	false
"e35e."	false	false
"5.7ee"	false	false
"5.94+"	false	false
"e4e e"	false	false
" 6.2q"	false	false
".568 "	true	true
" 063e"	false	false
"e.e.."	false	false
"ee9.e"	false	false
"-i dv"	false	false
"2-09e"	false	false
"2W0+ "	false	false
"9Tp. "	false	false
" .45."	false	false
".e.ee"	false	false
".e..Q"	false	false
".. 6."	false	false
"2.e7."	false	false
"e51.4"	false	false
" 2.ee"	false	false
"e2.-e"	false	false
"52..."	false	false
"6+65e"	false	false
"1e.66"	false	false
".e.c8"	false	false
" 01+2"	false	false
"3.09e"	false	false
"e7. 7"	false	false
"5692."	true	true
"67551"	true	true
"-J.09"	false	false
".e.-6"	false	false
"1595."	true	true
"e.e89"	false	false
"W.e3e"	false	false
"32+7."	false	false
"+.461"	true	true
"..ee."	false	false
"6..L."	false	false
"2e8e "	false	false
".3+ee"	false	false
"..1e+"	false	false
"-e8+-"	false	false
"..x8e"	false	false
".2e81"	true	true
".204e"	false	false
"e.e03"	false	false
"303 4"	false	false
"eee.9"	false	false
".+.6."	false	false
".9 e "	false	false
"82..3"	false	false
"g13+."	false	false
"0e 5."	false	false
"5ee0."	false	false
". .6e"	false	false
"846.e"	false	false
"60.6."	false	false
"0.e-e"	false	false
"5-673"	false	false
"8P.91"	false	false
"072K "	false	false
"+e3ee"	false	false
"V.e6."	false	false
"42760"	true	true
"ee46."	false	false
"3e-+-"	false	false
"ee2-2"	false	false
" 90e "	false	false
"9.0.8"	false	false
"57-6e"	false	false
".eeeR"	false	false
"64..e"	false	false
"-e58 "	false	false
"..7e8"	false	false
". +.0"	false	false
" 8. 7"	false	false
"e.6.3"	false	false
".e132"	false	false
"9.25."	false	false
"7e57."	false	false
"-.3e6"	true	true
" e.4-"	false	false
"e7..q"	false	false
"75518"	true	true
"8-eee"	false	false
"8.-e9"	false	false
" 3H17"	false	false
"e 91."	false	false
"..e21"	false	false
" ..10"	false	false
"68.89"	true	true
"6y +."	false	false
"e6.8e"	false	false
"e2.3."	false	false
"9. 2 "	false	false
"e7.5."	false	false
"D.-54"	false	false
"35900"	true	true
"3 418"	false	false
"6.-e1"	false	false
"..21e"	false	false
"1 3.e"	false	false
" eek."	false	false
"P+e19"	false	false
".87.."	false	false
"92e1740e91"	false	false
"7 0353372."	false	false
"5 e40e 703"	false	false
"+94.3.+66e"	false	false
"71.5..U29."	false	false
"e8 -.6 e.."	false	false
"949.40. 62"	false	false
"1856.6h..-"	false	false
"e0-19688ee"	false	false
"3-37W.ee39"	false	false
" 257e6748e"	false	false
"32e8 .616 "	false	false
" 277707e26"	true	true
"56+ .84473"	false	false
"2...ee+..E"	false	false
"e667e2743e"	false	false
"e6..6e.ef."	false	false
"3204ee0e.8"	false	false
" +2OO805.8"	false	false
"3 312z -e "	false	false
"-91p7.67e1"	false	false
"98+8e16.6 "	false	false
"Bn.30.L 7+"	false	false
".6T..3.3e1"	false	false
"494e 1+ .."	false	false
"4e77 3287e"	false	false
"e.36e i3x."	false	false
".-x294.8.6"	false	false
"-8115 e957"	false	false
"e136.66.72"	false	false
"2e6u.745-9"	false	false
"37424.59 ."	false	false
"459277e38+"	false	false
"u35e +15-e"	false	false
"76..89e7e9"	false	false
"0N82+r8e64"	false	false
"61990793P0"	false	false
"2-29j. 1."	false	false
"..1.220e ."	false	false
"88+e91e-7+"	false	false
"84ee9e+e4."	false	false
"25332+.6e+"	false	false
"-+4e207 e2"	false	false
"..+.8.515e"	false	false
"W74911+4 ."	false	false
"87e276 -.9"	false	false
"e1C276h7.3"	false	false
"81074470+4"	false	false
".0.5e72e50"	false	false
"9162079+4."	false	false
".6 2e.e.9 "	false	false
"7-9x9eE7we"	false	false
"9W689936e "	false	false
"5e..05 ee7"	false	false
"80+e539.+5"	false	false
"69 e. 60 "	false	false
" . 22k7 19"	false	false
". e2.99.e0"	false	false
"48376682.4"	true	true
"53.7U8e-98"	false	false
"+ r4.e45e5"	false	false
"ee22e4e3Ye"	false	false
"6483ee-.. "	false	false
"3. 07Yf694"	false	false
"078332e437"	true	true
"R7.U-9++- "	false	false
"29 K es745"	false	false
"0 92e359-2"	false	false
"1Y958L81-G"	false	false
"+V+Pee97 e"	false	false
"67.x 0573."	false	false
".-01..29E9"	false	false
"+ .00e1e. "	false	false
"E+9ee93 e+"	false	false
"68.6-76 14"	false	false
"e3+e 2-590"	false	false
"e+pe.39 62"	false	false
"e1e3988e39"	false	false
"24c5 3+.91"	false	false
"733+ee7e.2"	false	false
"e7.e8K1877"	false	false
"88-758.e 3"	false	false
"48-546.JJ8"	false	false
"48e8e17916"	false	false
"1.99353L32"	false	false
"e.7e645C.5"	false	false
"1650-1 953"	false	false
"e2e9e6Xee-"	false	false
"83398Ne55e"	false	false
"78e.634 55"	false	false
"0y651.9117"	false	false
" 11037e4He"	false	false
"e14e71 8"	false	false
".e74065e7+"	false	false
"9997 3+..6"	false	false
".d2378e4X0"	false	false
"vW88151e6e"	false	false
"6e09e+e 55"	false	false
"4 444.3.4 "	false	false
"1.431352e7"	true	true
"2.+.36374e"	false	false
".7.ee95e22"	false	false
"6e..8 6977"	false	false
"4+-e... .0"	false	false
"7T+3.136e2"	false	false
"ey.99+719e"	false	false
"eee3UU25. "	false	false
".9 e 070.2"	false	false
"-651e--1e0"	false	false
"4e3121.40e"	false	false
". 66502h.K"	false	false
" e+76e66l2"	false	false
"86+71+8 2-"	false	false
"06020e6073"	true	true
"+o25621e3 "	false	false
"e72D3.e74 "	false	false
" 5.1e0j3Z3"	false	false
"0eS.e955 1"	false	false
"3e9-t3e048"	false	false
"eV2ee512-8"	false	false
".8N8.4u51."	false	false
"9e98+540 3"	false	false
".6 Ee.U.8 "	false	false
"-+9e148-+."	false	false
"2d218783eM"	false	false
"-070991.58"	true	true
"6L9+4-7e6-"	false	false
".1.+eDe318"	false	false
" 8e50e.e8+"	false	false
"00-684.5+4"	false	false
"3X6e41e1 e"	false	false
".+eg10--85"	false	false
"e2s51981J9"	false	false
"e0e0X 609."	false	false
" 6qt1e2..e"	false	false
" 5M6158.4."	false	false
"h..H655ee "	false	false
"4445ee6..5"	false	false
"47e.6. be."	false	false
"ee..8- e2 "	false	false
" c99.7e8 ."	false	false
" 005047e+6"	true	true
"3.+e35+65e"	false	false
"790554n 82"	false	false
"3+8-917590"	false	false
"Qe8e.0.55+"	false	false
"we57.94x.1"	false	false
"++330.9e9."	false	false
"-e9e..0.80"	false	false
"9-3ee97e+5"	false	false
"3132 63es9"	false	false
"3.31ec25 0"	false	false
"07e.6..033"	false	false
"Vee3854 -4"	false	false
"5e38.6e1e+"	false	false
".41.8..4 +"	false	false
"eAc.23e0X9"	false	false
"+7e1.+510."	false	false
"e6++e39v2S"	false	false
".4T411 ee."	false	false
"p.-2 108e4"	false	false
"439724e2e5"	false	false
"2e+60++604"	false	false
"e4mel8.843"	false	false
"17e3+. . 9"	false	false
" .4292072A"	false	false
"6 7. e040+"	false	false
" 2c e.3802"	false	false
"808e 461+e"	false	false
"+32.82eh8."	false	false
"8a187e5 8y"	false	false
"2439.69..e"	false	false
".4e284v6-7"	false	false
"5o6--49.-1"	false	false
"e.26. 03e1"	false	false
".071e 15g."	false	false
"851822 f2-"	false	false
"8e.950Y.e8"	false	false
"3.+-e01075"	false	false
".9389e41. "	false	false
"F2099e+.0."	false	false
" l8226e 6"	false	false
"E27334-279"	false	false
"v50 e.Ge3 "	false	false
"66.5een1-9"	false	false
"Zb1888.62-"	false	false
"16e45A4548"	false	false
"R0827eeee9"	false	false
".e2545.eg5"	false	false
"03.W790e67"	false	false
"ee168.1710"	false	false
".558.+2eo."	false	false
"--10-Y4332"	false	false
"5e0.e.33-9"	false	false
"597H.42662"	false	false
"56..6e5340"	false	false
"--e6+1.367"	false	false
"+3. e04116"	false	false
" 40q.- .62"	false	false
"4836e66054"	true	true
"9.71727e22"	true	true
"55076.5437"	true	true
"667332e696"	true	true
" 9657.91e9"	true	true
"176.e50455"	true	true
"32.e-80123"	true	true
"72348e7431"	true	true
"850404625 "	true	true
"38e8699485"	true	true
"1328273213"	true	true
"0180e81700"	true	true
"3736762.81"	true	true
"875.1544e7"	true	true
"09e9877950"	true	true
"2e83140193"	true	true
"+93728.248"	true	true
".338e57821"	true	true
"467509860."	true	true
"28545.e624"	true	true
"69861.6e22"	true	true
"7278829.49"	true	true
"256523.e02"	true	true
"378510e004"	true	true
"31355628e8"	true	true
"649.023444"	true	true
"8e52791704"	true	true
" 28096.458"	true	true
"5897972791"	true	true
"91.12e6319"	true	true
"9533917.19"	true	true
"1684068864"	true	true
" 13e58069"	true	true
"063.e57002"	true	true
"9189196467"	true	true
"48920999e5"	true	true
"+32.6318e6"	true	true
".571380561"	true	true
".271508e05"	true	true
"1204327033"	true	true
"511e381307"	true	true
"438.4e0197"	true	true
"11500236.8"	true	true
"17.1661975"	true	true
"3108.16676"	true	true
"798e566054"	true	true
"86e2660151"	true	true
"-044746.47"	true	true
"-1.e49046 "	true	true
"6.298359e7"	true	true
"79850.8484"	true	true
".1657304e3"	true	true
"7771793e51"	true	true
"4.4600e188"	true	true
"0401483909"	true	true
"49.069518 "	true	true
"-611711380"	true	true
"3956847304"	true	true
"8e04316290"	true	true
"87e8864992"	true	true
"06730.433 "	true	true
"4818202950"	true	true
"5.0e893700"	true	true
"9.51061360"	true	true
"-49e445254"	true	true
"460506958 "	true	true
" 758.79e48"	true	true
"0245.89632"	true	true
"46603430e5"	true	true
"14.9e74509"	true	true
".1678343e5"	true	true
"34161516e9"	true	true
"6644.94218"	true	true
"8182423.00"	true	true
"0.01822091"	true	true
"013455.e1 "	true	true
" 303980320"	true	true
"2240e0288 "	true	true
"5.65572636"	true	true
"206e627261"	true	true
"608284e58 "	true	true
"7619102516"	true	true
"7667.592e1"	true	true
" 065374348"	true	true
"52e0281497"	true	true
"6500170671"	true	true
"-26957e471"	true	true
"73.1e21199"	true	true
" 1779.8167"	true	true
"4244035374"	true	true
".653334751"	true	true
"027.78458 "	true	true
"7422994463"	true	true
"-.18205126"	true	true
"6.421826e5"	true	true
"2907418391"	true	true
"1.38354e+8"	true	true
"86e4661377"	true	true
"959440.94f"	false	false
"3.94752969"	true	true
"5409928995"	true	true
"11e1765196"	true	true
"08195.23e4"	true	true
" -54.53061"	true	true
"90.5645081"	true	true
" 089211e1"	true	true
"174356e066"	true	true
"-776e61740"	true	true
"075.44e229"	true	true
"71e4282131"	true	true
"84656e656D"	false	false
"50e5048696"	true	true
"8112626944"	true	true
"5e56301137"	true	true
"9.40044811"	true	true
"34.72e7083"	true	true
" 274560592"	true	true
"97.20015e5"	true	true
"-.13678e62"	true	true
".711445472"	true	true
"59158073.4"	true	true
".703e+4144"	true	true
"19035e2285"	true	true
"163351.537"	true	true
"-576.86e52"	true	true
"1836037755"	true	true
".85e+72041"	true	true
" 4783.99e6"	true	true
" -69e81121"	true	true
"563858.e30"	true	true
"5107355e29"	true	true
" -.7e+0435"	true	true
"334.4e170 "	true	true
"837683754 "	true	true
"8720241.73"	true	true
" -8439e403"	true	true
"157e104927"	true	true
" 4.183e28"	true	true
" 9e4484578"	true	true
" 3.8058575"	true	true
".789866e-3"	true	true
" 9669.1942"	true	true
"631.294768"	true	true
"96e6711821"	true	true
"072594e053"	true	true
"14.8e5449 "	true	true
"228.e16641"	true	true
"34.250e192"	true	true
"509180.201"	true	true
"6.72e36964"	true	true
"0018936 "	true	true
"75679.4172"	true	true
"7580599293"	true	true
"4638737982"	true	true
"+884755133"	true	true
"0e75412409"	true	true
"5.e2617635"	true	true
"92529e2933"	true	true
"-548.6133 "	true	true
"62.2511073"	true	true
"-.498e4176"	true	true
"1638931e36"	true	true
".4665e6746"	true	true
".255852e89"	true	true
" 86833431."	true	true
"4e+1831773"	true	true
"350.4e4320"	true	true
"61030.3805"	true	true
"359043.603"	true	true
"0760542059"	true	true
"94.740867 "	true	true
"0080052.24"	true	true
"837725757."	true	true
"-277586109"	true	true
"+42e+76125"	true	true
"424132.095"	true	true
"661850e060"	true	true
"65.8954924"	true	true
"40949e2471"	true	true
"+15805.526"	true	true
"8340e2262 "	true	true
" 55468.e65"	true	true
"0290.05980"	true	true
"2945e+2553"	true	true
"-94e394725"	true	true
" .15324737"	true	true
"894.125838"	true	true
"6269407694"	true	true
"24949.3065"	true	true
"9.29300496"	true	true
"32.82696e6"	true	true
"17835863e4"	true	true
"01897e3973"	true	true
"+553.9e827"	true	true
"-7.940e321"	true	true
"+7016.99 "	true	true
"88507830.0"	true	true
"-0577.0123"	true	true
"+5.12657e4"	true	true
"166e-02767"	true	true
".107083246"	true	true
"-239.579 "	true	true
"+7859886.9"	true	true
"980.626535"	true	true
".641086857"	true	true
" 801800.62"	true	true
"6901e60835"	true	true
".030136e60"	true	true
"7979661e94"	true	true
"7169404e12"	true	true
"98677e0209"	true	true
"-985911299"	true	true
"+37760e133"	true	true
"6508285.e8"	true	true
"85511.7140"	true	true
"+10e+46749"	true	true
"549007605."	true	true
" 2e3276141"	true	true
" .01600e29"	true	true
"166670788."	true	true
"530.310864"	true	true
"-3844867. "	true	true
"77144.4348"	true	true
"6.39e11454"	true	true
"6e95838852"	true	true
"1817954010"	true	true
"067745624."	true	true
"+335653687"	true	true
"1711357378"	true	true
"3361.55049"	true	true
".3652e6805"	true	true
"3e03084908"	true	true
"3743289465"	true	true
"16092e9004"	true	true
"279e557829"	true	true
"4.21946e1 "	true	true
" 36e208334"	true	true
"36.6e73367"	true	true
"1643.0567 "	true	true
"1e58689735"	true	true
"4517606454"	true	true
".090e63840"	true	true
"24939164. "	true	true
"8605351.e4"	true	true
"79.17e0292"	true	true
".5e2369093"	true	true
" 7.86397e0"	true	true
"348030043 "	true	true
"8814579e23"	true	true
" 93158651."	true	true
"0598.2e682"	true	true
"109727237193.1 "	true	true
" 088742432.12e1"	true	true
"56670244781.326"	true	true
"44e016912630333"	true	true
"45.9874933e+473"	true	true
"52305584e897361"	true	true
"3.42691837e-014"	true	true
" 751892213e9817"	true	true
"8085390941.983 "	true	true
"6531.3012374e10"	true	true
"4335e6773123995"	true	true
" 6.830e81308721"	true	true
"192.752e4900909"	true	true
"51007e+28440985"	true	true
" 35019666.24962"	true	true
".65640791247040"	true	true
"4078046578e3992"	true	true
"43.9947317e9150"	true	true
"1160181001e4999"	true	true
"1371153060292e1"	true	true
"578150404.495e4"	true	true
"-40061713962213901e3"	true	true
"07053299.68e40303731"	true	true
" 01.64358277492401e4"	true	true
" 3501980999044281.e7"	true	true
"577514729524.75e9499"	true	true
"2392184287e931692604"	true	true
"97745e94633129402280"	true	true
"92999522294757.73e62"	true	true
"5080341e437282834303"	true	true
"5e230709357851502907"	true	true
" 971074089184.6e0945"	true	true
"67.4e027373900727208"	true	true
" +51.93483302981e917"	true	true
"992700.5513600757592"	true	true
"83752481.61e73455980"	true	true
"9798912822943623.356"	true	true
"4674e011117523839758"	true	true
"86.870303248e3523581"	true	true
"27968585981718583e27"	true	true
"3290.2169007e5032781"	true	true
" 03346.3200e3078009 "	true	true
"451961827543.37e5642"	true	true
" 2107611403.7798e039"	true	true
"+.0344581871721e7229"	true	true
"56614440300046e+1686"	true	true
" 22709749659768580e8"	true	true
"5e50 "	true	true
"28172"	true	true
"707e8"	true	true
".2854"	true	true
"65992"	true	true
"16.34"	true	true
"+8230"	true	true
"71e86"	true	true
"80.24"	true	true
"86.e3"	true	true
"05. "	true	true
".022 "	true	true
"+0619"	true	true
"9.956"	true	true
"249e6"	true	true
"82938"	true	true
"33314"	true	true
".3849"	true	true
"67593"	true	true
"-788f"	false	false
".0487"	true	true
"197e0"	true	true
"676.5"	true	true
".0277"	true	true
"6e117"	true	true
"61e8 "	true	true
"94617"	true	true
"8.e74"	true	true
".8e44"	true	true
"3.032"	true	true
"8.329"	true	true
"1839."	true	true
"7.766"	true	true
"5225."	true	true
" -391"	true	true
"67e60"	true	true
" 78.9"	true	true
"1936."	true	true
"8e373"	true	true
".0431"	true	true
"621e4"	true	true
" 42.7"	true	true
"62.e3"	true	true
"+.152"	true	true
"+0168"	true	true
"797.7"	true	true
"75007"	true	true
" 669"	true	true
"398e3"	true	true
"478. "	true	true
"1.601"	true	true
"85e99"	true	true
"89026"	true	true
"24464"	true	true
"8.181"	true	true
"3e74 "	true	true
"8e90 "	true	true
" 28. "	true	true
"260.3"	true	true
"26645"	true	true
"-4981"	true	true
"9.2 "	true	true
"41146"	true	true
".69e1"	true	true
"30558"	true	true
"6238."	true	true
"+75.1"	true	true
"90564"	true	true
".3026"	true	true
"30633"	true	true
"9.e32"	true	true
"+6105"	true	true
"80156"	true	true
"3e387"	true	true
"93.13"	true	true
"66575"	true	true
" 300 "	true	true
"00565"	true	true
".55e3"	true	true
"296e6"	true	true
".3635"	true	true
"955e5"	true	true
"9.0e7"	true	true
"927.0"	true	true
"42345"	true	true
"67e46"	true	true
"0.7e2"	true	true
".937 "	true	true
"22862"	true	true
"8394 "	true	true
"5e258"	true	true
"81e+0"	true	true
"6e797"	true	true
"6e404"	true	true
"2.e86"	true	true
"17e01"	true	true
"037.4"	true	true
" .487"	true	true
"26333"	true	true
" 0.40"	true	true
"93924"	true	true
"942.5"	true	true
"02.34"	true	true
"-49e2"	true	true
".06e1"	true	true
"41331"	true	true
"0.4e8"	true	true
"2e531"	true	true
"99553"	true	true
"6.540"	true	true
"74e93"	true	true
"1.756"	true	true
"11.e8"	true	true
" 9.7"	true	true
"+1819"	true	true
" 80.8"	true	true
".8957"	true	true
"36064"	true	true
"19687"	true	true
"4039 "	true	true
"0638D"	false	false
"1711 "	true	true
"2.712"	true	true
"680.7"	true	true
"+.9e3"	true	true
"4110."	true	true
"00690"	true	true
"19693"	true	true
"51998"	true	true
"69.4 "	true	true
"15102"	true	true
"-7.62"	true	true
"-0725"	true	true
"-39. "	true	true
"0.195"	true	true
" 5.31"	true	true
"5.006"	true	true
"+.952"	true	true
" .028"	true	true
"4935."	true	true
"29992"	true	true
"91e66"	true	true
"32.40"	true	true
"64.88"	true	true
".7972"	true	true
"8.252"	true	true
"98e59"	true	true
"44e56"	true	true
"1e686"	true	true
"-.01 "	true	true
"563e8"	true	true
"6196."	true	true
" 6557"	true	true
"+1892"	true	true
"54.60"	true	true
"805e6"	true	true
"09299"	true	true
".4586"	true	true
"3900."	true	true
"72241"	true	true
"81713"	true	true
" 130"	true	true
"3.088"	true	true
"22473"	true	true
"7e179"	true	true
"51263"	true	true
"64e62"	true	true
"55375"	true	true
".5763"	true	true
"59240"	true	true
"+7734"	true	true
"21e40"	true	true
"87.93"	true	true
"0e49 "	true	true
"56e+9"	true	true
"6e16 "	true	true
"41.63"	true	true
"9.247"	true	true
" -.94"	true	true
" 195 "	true	true
"50320"	true	true
"575e5"	true	true
"13034"	true	true
"9384."	true	true
".8e59"	true	true
" 312."	true	true
"2e730"	true	true
".86e4"	true	true
"+0638"	true	true
"+9.94"	true	true
".6830"	true	true
"89.62"	true	true
"597e1"	true	true
"20506"	true	true
"92.e5"	true	true
".9722"	true	true
*/
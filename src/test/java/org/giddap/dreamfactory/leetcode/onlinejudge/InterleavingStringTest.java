package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.InterleavingStringDPImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.InterleavingStringRecursiveImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InterleavingStringTest {
    private InterleavingString solution = new InterleavingStringDPImpl();
    private InterleavingString solution1 = new InterleavingStringRecursiveImpl();

    @Test
    public void small01() {
        assertTrue(solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void small02() {
        assertFalse(solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    public void small03() {
        assertTrue(solution.isInterleave("", "", ""));
    }

    @Test
    public void small04() {
        assertFalse(solution.isInterleave("", "", "a"));
    }

    @Test
    public void large01() {
        assertFalse(solution.isInterleave(
                "bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa",
                "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab",
                "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab"));
    }
}

/*
Test cases
Input	 Output	 Expected
"", "", ""	true	true
"", "", "a"	false	false
"a", "", "a"	true	true
"", "b", "b"	true	true
"a", "", "c"	false	false
"a", "", "aa"	false	false
"", "a", "aa"	false	false
"a", "b", "a"	false	false
"b", "a", "b"	false	false
"a", "b", "ab"	true	true
"a", "b", "aba"	false	false
"a", "b", "abb"	false	false
"aa", "ab", "aaba"	true	true
"aa", "ab", "abaa"	true	true
"aa", "ab", "aaab"	true	true
"aa", "ab", "abaa"	true	true
"ab", "bc", "bcab"	true	true
"ab", "bc", "babc"	true	true
"ab", "bc", "bacb"	true	true
"ab", "bc", "bbac"	false	false
"ef", "gh", "egfh"	true	true
"ef", "gh", "ehgf"	false	false
"", "abc", "abc"	true	true
"", "abc", "ab"	false	false
"", "abc", "abcd"	false	false
"def", "", "def"	true	true
"def", "", "de"	false	false
"def", "", "defg"	false	false
"aabd", "abdc", "aabdabcd"	true	true
"aabd", "abdc", "aabdabdc"	true	true
"aabd", "abdc", "aabdbadc"	false	false
"aabc", "abad", "aabadabc"	true	true
"aabc", "abad", "aabaabdc"	true	true
"aabc", "abad", "aabcabad"	true	true
"aabc", "abad", "aabadabc"	true	true
"aabc", "abad", "aabacbad"	true	true
"aabc", "abad", "aabdabca"	false	false
"aabc", "abad", "aabcbaad"	false	false
"aabcc", "dbbca", "aadbbcbcac"	true	true
"aabcc", "dbbca", "aadbcbbcac"	true	true
"aabcc", "dbbca", "aadbbcbcca"	true	true
"aabcc", "dbbca", "aadbbcbacc"	true	true
"aabcc", "dbbca", "aadbbbaccc"	false	false
"aabaac", "aadaaeaaf", "aadaaeaabaafaac"	true	true
"aabaac", "aadaaeaaf", "aadaaeaabaacaaf"	true	true
"aacaac", "aacaaeaac", "aacaacaaeaacaac"	true	true
"aacaac", "aacaaeaac", "aacaaeaaeaacaac"	false	false
"aabccabc", "dbbabc", "aabdbbccababcc"	true	true
"aacaaac", "abbacb", "aaacbbacacaba"	false	false
"bab", "abbbcba", "babbbabcba"	true	true
"babb", "bbcbbaa", "bbabacbbbab"	false	false
"bbc", "acaab", "abcbcaab"	true	true
"abbbbac", "bbacaa", "bbbcbacbaabaa"	false	false
"acabab", "bcccc", "bccbcccabaa"	false	false
"baccba", "baab", "bbccaaabba"	false	false
"abbcc", "abcc", "aabbbcccc"	true	true
"bcca", "bccca", "bbcccacca"	true	true
"cbab", "abbaabb", "bcbbabbaaab"	false	false
"accbbcba", "bbcaaac", "abcbacccababcba"	false	false
"cacccaa", "acccaacabbbab", "accccaaaccccabbaabab"	true	true
"abaaacbacaab", "bcccababccc", "bcccabaaaaabccaccbacabb"	false	false
"bcccb", "bccbbaba", "bacccccbbbbba"	false	false
"bbaca", "bbabaacbabaaaa", "bbbabacaaabcbabaaaa"	false	false
"bbbcc", "bbaccbbbabcacc", "bbbbacbcccbcbabbacc"	false	false
"bbcbaba", "aaccc", "baccbaabbcca"	false	false
"cabbcaaacacbac", "acabaabacabcca", "cacabaabacaabccbabcaaacacbac"	true	true
"bcaccccacccaa", "aabccbbbbbaca", "aabcbccbbbabaaccccacacccba"	false	false
"bbabb", "bbbaabaabbac", "bbbcbbbababaabbaa"	false	false
"cabcccababba", "bbabcbccbc", "bbcabacbccbbccccababba"	true	true
"bbaabacacbabcbaa", "abccccbaccaca", "bbccccababaaccacaccbaababcbaa"	false	false
"cacabcbaccbbcbb", "acaaccaacbbbabbacc", "accacaabcbacaccacacbbbbcbabbbbacc"	true	true
"cbacbabcbcbbccbacbb", "baccacabaccc", "bcaacabcacbbbcabcccbccbaccbacbb"	false	false
"caccbbcacacabaaa", "ccaaaccabbabbcaa", "ccccaacacababcbbacbbccaacaaabaaa"	false	false
"bccbcccacabbbcab", "cabbabacbc", "abbbbbcccccbcaacacbabbccab"	false	false
"bbcacabbbbbbccb", "aaccbbaccbaca", "aabbcacccbababbbbbbccbccbaca"	true	true
"aaaacbabaacabb", "bcaaccbbbbbbaacba", "bacacaaccabcbbbabbbbaaaaabcaabb"	false	false
"bacbacbabacbab", "bbbcaacaacba", "bbabcbbacacabcbacbaaaabbac"	false	false
"aaabbccbcabb", "bcabcbaabcbbcbbac", "bcbaaaabbccacabccbbcabbacbbbb"	false	false
"cbaccccacbcaaaccccaacbccabba", "babbacacbaabbcccabcaca", "baabbacbacccacacbcabcaaabbaccccccccacabcbccabacaba"	false	false
"bcacbaacbaabaacacbcccb", "bbaacbbcbcbcbacbbbcbaaba", "bbbcaaacbcabbcabcbaaabbcaccaacbacbcbbcccbbbaba"	false	false
"cbaccbbaabbacbaaabbcbccb", "bbcaccccbabbbabbcaccacaaa", "bcbaccbbbcaabbabacccabacabbaacbbbccbbabbcaccacaac"	false	false
"cabbacccabacbcaabaccacacc", "bccacbacabbabaaacbbbbcbbcacc", "cbccacabbacabbbaacbcacaaacbbacbcaabbbbacbcbcacccacacc"	true	true
"bcbbacbaabaabbbacbbbcbbb", "babcbbacaabbaaaabacc", "bbcbbbcbabacbcbaacabaabaabaabbbaaacccbbabbbb"	false	false
"bbbcacacccaacbbbabacbbbb", "cbacaaacbcbbbabbacccbaacba", "bcbabbbacacaaaccbccccacbbacbbbaabbaccbabacabbbbcba"	false	false
"acaccabaabcbbacaacaaaacabbac", "accbccbccccabaaabcacabbaba", "acaccabccbcccaccababaaaababcaccbcbacababacbaaaaacabbac"	false	false
"caacbbccccbbccbaccccc", "cababbbcaccbacbcbacbbaababa", "cabacbacbbbabcccaccccbbabccbcbcbacabbccaacbccaba"	false	false
"babaacabcbbcccacaaacbbbcc", "bbcbbacccbacbbccaccbcccaacbb", "cbabaabbaacbccacbbcacbbbcccabccaaaccbabbccccbcccbacbb"	false	false
"ccabcaacaacccaabacbcacac", "ccbcbacbaaccabbabbca", "cccbccbabcacaacabacaaccccaaabbabbabccabcacac"	true	true
"abbbbbbcabbacaacccababaabcccabcacbcaabbbacccaaaaaababbbacbb", "ccaacabbacaccacababbbbabbcacccacccccaabaababacbbacabbbbabc", "cacbabbacbbbabcbaacbbaccacaacaacccabababbbababcccbabcabbaccabcccacccaabbcbcaccccaaaaabaaaaababbbbacbbabacbbacabbbbabc"	true	true
"bababbbcabbcacbcbcbbaaabbabbabcccaccabcbcaaacbccab", "bbbcaaabcacbccaabbbaccccccbcbcabbcabaaacbaaccbcccbabac", "bbcbcbbaabbcaabcbccbbcabcbacabcbbbcbaaccccbcbcaaabbbcabcbcababbcaccaabcaacbccaabcacaaaacbabbccccabcbabac"	false	false
"bcbccabcccbcbbbcbbacaaccccacbaccabaccbabccbabcaabbbccbbbaa", "ccbccaaccabacaabccaaccbabcbbaacacaccaacbacbbccccbac", "bccbcccabbccaccaccacbacbacbabbcbccbaaccbbaacbcbaacbacbaccaaccabcaccacaacbacbacccbbabcccccbababcaabcbbcccbbbaa"	false	false
"accccaabbccabccabbcaabaabccccbbcabcabaccccabcaccbbccaaaccab", "cbaccbcaaaaacabbbbaaaccbabbcbcbbbbbbabcbbabaababaa", "cbaccbcaaccaaccaabbcacacaabbbbbaccaaacbcbabbbcbccaabbaabbbbcccbbcabbbcbcababbcaabaabcabacaccabcaccbbccaaaccab"	true	true
"cbcccbabbccbbcccbbbcabbbabcababbbbbbaccaccbabbaacbaabbbc", "abcbbcaababccacbaaaccbabaabbaaabcbababbcccbbabbbcbbb", "abcbcccbacbbbbccbcbcacacbbbbacabbbabbcacbcaabcbaaacbcbbbabbbaacacbbaaaabccbcbaabbbaaabbcccbcbabababbbcbbbcbb"	true	true
"cacbbbaaabbacbbbbabbcaccccabaaacacbcaacababbaabbaccacbaabac", "cbcccabbbbaaacbaccbabaabbccbbbabacbaacccbbcaabaabbbcbcbab", "ccbcccacbabbbbbbaaaaabbaaccbabbbbacbcbcbaacccbacabbaccbaaabcacbbcabaabacbbcaacaccbbacaabababaabbbaccbbcacbbacabbaacb"	false	false
"caacaacbbaacccbaababbcababbbcaccabbbbbaabaabacabaacac", "cccbabbbbacacacbbcabaacaaabacbacbabcccbbabbbcacaaaacaccabbb", "accaacbcacabacbbbbaaccbaabcccbbbcaabababcaaababbacaccababbcbabbccacccacbbbbbbabaabaababcaabcabcaaaaacaaccaccabbb"	false	false
"cccbccbcabaccbcabbaacbacababcbbcbbabacbcbcbbbbccabaccb", "baccbbaabacccacacbacccbccbaababaabacabbcbacbabcbcaacacac", "cbacccbccbcbbcabaaaccabaccbbbacaccabcaacabcbaabcccbccbcbaabcbbbbbabacabcabbacbacabbbcbcabaccbcabcbabcbcaacacac"	false	false
"accbaabaaabbcbaacbababacaababbcbabaababcaabbbbbcacbaa", "cabaabcbabcbaaaacababccbbccaaabaacbbaaabccacabaaccbbcbcb", "accbcaaabbaabaaabbcbcbabacbacbababaacaaaaacbabaabbcbccbbabbccaaaaabaabcabbcaabaaabbcbcbbbcacabaaacccbbcbbaacb"	true	true
"bcabacaaabccbcbcbccbbbbabbbcbbbabcbbccbaccaacccbccccaccc", "bbacacaccbacbccacabcbcaabbcabacccaccaccabccaccbccacacaca", "bbcbaabacaccaccaaabacbbcccbcbcaccbcabcbcbbcbababbabbbccabbaccccaccbabcbbccbaaccccaacaccbcbcbcccaccbccacacccacaca"	false	false
"bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa", "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab", "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab"	false	false
*/
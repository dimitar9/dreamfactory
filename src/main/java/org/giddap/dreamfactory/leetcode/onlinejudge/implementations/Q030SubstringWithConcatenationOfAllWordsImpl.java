package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q030SubstringWithConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Q030SubstringWithConcatenationOfAllWordsImpl implements Q030SubstringWithConcatenationOfAllWords {
    @Override
    public ArrayList<Integer> findSubstring(String S, String[] L) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (L.length == 0) {
            return ret;
        }
        Map<String, Integer> words = new HashMap<String, Integer>();
        for (String w : L) {
            if (words.containsKey(w)) {
                words.put(w, words.get(w) + 1);
            } else {
                words.put(w, 1);
            }
        }
        final int unitLen = L[0].length();
        final int fullLen = unitLen * L.length;
        for (int i = 0; i <= S.length() - fullLen; i++) {
            if (fullSubstring(unitLen, S.substring(i, i + fullLen), new HashMap<String, Integer>(words))) {
                ret.add(i);
            }
        }
        return ret;
    }

    private boolean fullSubstring(final int unitLen, String sentence, Map<String, Integer> words) {
        for (int i = 0; i < sentence.length(); i += unitLen) {
            String word = sentence.substring(i, i + unitLen);
            if (words.containsKey(word)) {
                int count = words.get(word);
                if (count - 1 == 0) {
                    words.remove(word);
                } else {
                    words.put(word, count - 1);
                }
            } else {
                return false;
            }
        }
        return words.isEmpty();
    }
}

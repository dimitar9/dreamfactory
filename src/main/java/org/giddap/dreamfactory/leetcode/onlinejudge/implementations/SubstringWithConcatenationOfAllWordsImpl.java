package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SubstringWithConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SubstringWithConcatenationOfAllWordsImpl implements SubstringWithConcatenationOfAllWords {
    @Override
    public List<Integer> findSubstring(String S, String[] L) {
        List<Integer> ret = new ArrayList<Integer>();
        final int numWords = L.length;
        if (numWords == 0) {
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
        final int wl = L[0].length();
        for (int i = 0; i <= S.length() - wl * numWords; i++) {
            Map<String, Integer> tmpwords = new HashMap<String, Integer>(words);
            for (int j = 0; j < numWords; j++) {
                String w = S.substring(i + j * wl, i + j * wl + wl);
                if (tmpwords.containsKey(w)) {
                    int rem = tmpwords.get(w) - 1;
                    if (rem == 0) {
                        tmpwords.remove(w);
                    } else {
                        tmpwords.put(w, rem);
                    }
                } else {
                    break;
                }
            }
            if (tmpwords.isEmpty()) {
                ret.add(i);
            }
        }
        return ret;
    }
}

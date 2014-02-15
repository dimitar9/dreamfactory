package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q049Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q049AnagramsImpl implements Q049Anagrams {
    @Override
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Map<String, List<String>> dict = new HashMap<String, List<String>>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (dict.containsKey(sorted)) {
                dict.get(sorted).add(word);
            } else {
                List<String> words = new ArrayList<String>();
                words.add(word);
                dict.put(sorted, words);
            }
        }

        ArrayList<String> ret = new ArrayList<String>();
        for (List<String> words : dict.values()) {
            if (words.size() > 1) {
                ret.addAll(words);
            }
        }
        return ret;
    }
}

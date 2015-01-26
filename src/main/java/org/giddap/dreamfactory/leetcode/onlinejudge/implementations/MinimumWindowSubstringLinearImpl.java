package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstringLinearImpl implements
        MinimumWindowSubstring {
    @Override
    public String minWindow(String S, String T) {
        Map<Character, Integer> demand = new HashMap<>();
        for (Character c : T.toCharArray()) {
            if (demand.containsKey(c)) {
                demand.put(c, demand.get(c) + 1);
            } else {
                demand.put(c, 1);
            }
        }

        Map<Character, Integer> supply = new HashMap<>();
        int start = 0;
        String mws = S;
        int countDown = T.length();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!demand.containsKey(c)) {
                continue;
            }
            supply.put(c, supply.containsKey(c) ? (supply.get(c) + 1) : 1);
            if (countDown != 0 && (supply.get(c) <= demand.get(c))) {
                countDown--;
            }

            if (countDown == 0) {
                while (!demand.containsKey(S.charAt(start))
                        || (supply.get(S.charAt(start)) > demand.get(S.charAt(start)))) {
                    char startChar = S.charAt(start);
                    if (demand.containsKey(startChar)) {
                        supply.put(startChar, supply.get(startChar) - 1);
                    }
                    start++;
                }
                String candidate = S.substring(start, i + 1);
                if (candidate.length() < mws.length()) {
                    mws = candidate;
                }
            }
        }
        return countDown == 0 ? mws : "";
    }
}

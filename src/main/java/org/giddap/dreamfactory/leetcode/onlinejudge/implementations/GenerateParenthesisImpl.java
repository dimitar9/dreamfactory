package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.GenerateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisImpl implements GenerateParenthesis {
    @Override
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generate(ret, "", n, n);
        return ret;
    }

    private void generate(List<String> ret, String curr, int open, int close) {
        if (open == 0 && close == 0) {
            ret.add(curr);
        } else {
            if (open > 0) {
                generate(ret, curr + "(", open - 1, close);
            }

            if (open < close) {
                generate(ret, curr + ")", open, close - 1);
            }
        }
    }
}

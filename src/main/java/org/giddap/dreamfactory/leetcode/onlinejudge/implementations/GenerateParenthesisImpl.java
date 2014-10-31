package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.GenerateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisImpl implements GenerateParenthesis {
    @Override
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<String>();
        build(ret, "", n, n);
        return ret;
    }

    private void build(List<String> ret, String curr, int remainOpen, int remainClose) {
        if (remainOpen == 0 && remainClose == 0) {
            ret.add(curr);
            return;
        }

        if (remainOpen > 0) {
            build(ret, curr + "(", remainOpen - 1, remainClose);
        }

        if (remainOpen < remainClose) {
            build(ret, curr + ")", remainOpen, remainClose - 1);
        }
    }
}

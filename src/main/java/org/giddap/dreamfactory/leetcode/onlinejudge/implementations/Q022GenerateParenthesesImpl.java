package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q022GenerateParentheses;

import java.util.ArrayList;

public class Q022GenerateParenthesesImpl implements Q022GenerateParentheses {
    @Override
    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> ret = new ArrayList<String>();
        build(ret, "", n, n);
        return ret;
    }

    private void build(ArrayList<String> ret, String curr, int remainOpen, int remainClose) {
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

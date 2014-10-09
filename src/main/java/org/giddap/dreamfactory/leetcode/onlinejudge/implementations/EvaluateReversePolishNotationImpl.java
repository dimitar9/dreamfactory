package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 */
public class EvaluateReversePolishNotationImpl {
    public int evalRPN(String[] tokens) {
        Deque<Integer> operands = new ArrayDeque<Integer>();

        for (String t : tokens) {
            if (t.equals("+")) {
                int op2 = operands.pop();
                int op1 = operands.pop();
                operands.push(op1 + op2);
            } else if (t.equals("-")) {
                int op2 = operands.pop();
                int op1 = operands.pop();
                operands.push(op1 - op2);
            } else if (t.equals("*")) {
                int op2 = operands.pop();
                int op1 = operands.pop();
                operands.push(op1 * op2);
            } else if (t.equals("/")) {
                int op2 = operands.pop();
                int op1 = operands.pop();
                operands.push(op1 / op2);
            } else {
                operands.push(Integer.parseInt(t));
            }
        }

        return operands.pop();
    }
}

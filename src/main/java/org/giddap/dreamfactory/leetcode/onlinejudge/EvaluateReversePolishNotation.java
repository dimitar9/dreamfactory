package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * https://oj.leetcode.com/problems/evaluate-reverse-polish-notation/
 * <p/>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p/>
 * Valid operators are +, -, *, /. Each operand may be an integer or another
 * expression.
 * <pre>
 * Some examples:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * </pre>
 */
public interface EvaluateReversePolishNotation {
    int evalRPN(String[] tokens);
}

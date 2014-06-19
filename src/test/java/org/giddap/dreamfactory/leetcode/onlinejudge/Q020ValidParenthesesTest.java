package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q020ValidParenthesesImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q020ValidParenthesesTest {
    private Q020ValidParentheses solution = new Q020ValidParenthesesImpl();

    @Test
    public void validCaseOne() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    public void invalidCaseOne() {
        assertFalse(solution.isValid("([)]"));
    }

    @Test
    public void invalidCaseTwo() {
        assertFalse(solution.isValid("]"));
    }
}

/*
Test cases
Input	 Output	 Expected
"["	false	false
"]"	false	false
"()"	true	true
"(("	false	false
"()[]{}"	true	true
"([)]"	false	false
"(["	false	false
"([]"	false	false
"([])"	true	true
"[])"	false	false
"[{()}]"	true	true
"[({(())}[()])]"	true	true
"([]{})"	true	true
"[()](())"	true	true
"{}{}()[]"	true	true
"{}{{}}"	true	true
"[)[}[[{]}][]){[()]{[]]}"	false	false
"{[}[{}{{({)){[}([]{)}({())[}[}"	false	false
"{}][}}{[))){}{}){(}]))})[({"	false	false
"(}(({(}()(({)](({["	false	false
"[()[[]()]]"	true	true
")}{({))[{{[}"	false	false
"}]}()){{)[{[(]"	false	false
"(][(}(])(({]{{){){(]}}}){}))(){(}[{)})[["	false	false
"({]])]})]}([)}{][)]{}{(])}([]}])})}([]}({}([{][{}"	false	false
"){]])([][{{([[))({}]]([{}{]"	false	false
"()({}[])[]{}"	true	true
"[{)(}}({((()){)[((]]]}{])[[][]})]()"	false	false
"[(){}[]({})]"	true	true
"}]]{]}))}[[}[[]()){}{]{]{{{{((]"	false	false
"))}}]]{[([}}[}[(([[]]([}(}}[[[]{){[)"	false	false
"{}[{}]((){})(){}"	true	true
"(()])}[}[}[]][}}[}{})][[(]({])])}}(])){)((){"	false	false
"(({}((({}(]([){)}]{){}{))))]["	false	false
"[]()[()()][{}]()"	true	true
"({][])]]]){)[)}]]]}])]{}("	false	false
"][{]]())(}(([)}[[]]}[[[{[)}[()}{)})}[{(}}{)))"	false	false
"{}([{}{}][])[{}]"	true	true
"}[[((}}[)[{)){([)])}(([}()]("	false	false
"}}(]}}){)(])](}{{}[]"	false	false
"([]{{}})[{}[[]]]"	true	true
"[)[]})(}][}}){({))([)]({]{){([[(())"	false	false
"[{[]{}}[})}]{[]}[)(()]{}{{]()}}](}[("	false	false
"([[][]{({}({}))}])"	true	true
")[({){(}{}]]]{][[{{)[(}}[(}}([)}[{)){}]{{]}}}"	false	false
"}{)}))[{[]]][{{([{])]]([}{(]}]}(}[[]{]]{)}))"	false	false
")}}[[](]()((})[{((}()([()[]()(}[]{]({)(]{"	false	false
"))))[]))([]((}({}{({{{)]{[[]([]})}[([{]}{[[(})"	false	false
"([[]][([][])({})]())"	true	true
"[[}]}((][}((]])[]](((]]}[){{{}}[]){[]]]{["	false	false
"(()])}[}[}[]][}}[}{})][[(]({])])}}(])){)((){"	false	false
"(({}((({}(]([){)}]{){}{))))]["	false	false
"[](([[]]){}{[]}([]))"	true	true
"}(])[{(}([[}])}]))})]]({{(])"	false	false
"[{[}}])()(})}{}]({}])][({"	false	false
"{({))[}()))[{{}(]]([)(({)]]())[)}[([}[(]{"	false	false
"({][])]]]){)[)}]]]}])]{}("	false	false
"[][{[{{}}[][]{{}}]}]"	true	true
"{(}{){)}[]}][[[{()]}(()[({({[}{[))(([])[)([])["	false	false
"}{[{]}[{[(([}]({(]([(){){{)][{["	false	false
"))]}]{([(}[[[}[}{(){})))[{(){)}[{(})(]){[)[[{}}{["	false	false
*/
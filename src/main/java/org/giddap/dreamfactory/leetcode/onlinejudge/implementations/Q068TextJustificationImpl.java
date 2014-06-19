package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q068TextJustification;

import java.util.ArrayList;

public class Q068TextJustificationImpl implements Q068TextJustification {

    @Override
    public ArrayList<String> fullJustify(String[] words, int L) {
        ArrayList<String> ret = new ArrayList<String>();
        if (words.length == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < L; i++) {
                sb.append(" ");
            }
            ret.add(sb.toString());
            return ret;
        }

        int i = 0;
        while (i < words.length) {
            int lineLen = L;
            int j = i;
            while (j < words.length && words[j].length() <= lineLen) { // same line
                if (j > i) {
                    lineLen -= 1;
                }

                if (lineLen < words[j].length()) {
                    lineLen++;
                    break;
                } else {
                    lineLen -= words[j].length();
                }
                j++;
            }

            StringBuilder line = new StringBuilder();
            if (i == j - 1 || j == words.length) { // single word or last line
                line.append(words[i]);
                for (int k = i + 1; k < j; k++) {
                    line.append(" ");
                    line.append(words[k]);
                }
                for (int h = 0; h < lineLen; h++) {
                    line.append(" ");
                }
            } else {
                int extraSpacesPerPair = lineLen / (j - i - 1);
                int extraExtraSpaces = lineLen % (j - i - 1);
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k != j - 1) {
                        line.append(" ");
                        for (int h = 0; h < extraSpacesPerPair; h++) {
                            line.append(" ");
                        }
                    }

                    if (extraExtraSpaces > 0) {
                        line.append(" ");
                        extraExtraSpaces--;
                    }
                }

            }
            ret.add(line.toString());
            i = j;
        }

        return ret;
    }
}

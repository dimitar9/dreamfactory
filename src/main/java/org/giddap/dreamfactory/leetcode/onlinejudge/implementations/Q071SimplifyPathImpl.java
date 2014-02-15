package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q071SimplifyPath;

import java.util.Stack;


public class Q071SimplifyPathImpl implements Q071SimplifyPath {
    @Override
    public String simplifyPath(String path) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (path.length() == 0) {
            return "";
        }
        String[] names = path.split("/");
        Stack<String> pathname = new Stack<String>();
        for (String name : names) {
            if (name.equals("..")) {
                if (!pathname.isEmpty()) {
                    pathname.pop();
                }
            } else if (name.equals(".") || name.isEmpty()) {
                // do nothing
            } else {
                pathname.push(name);
            }
        }

        StringBuilder ret = new StringBuilder();
        if (pathname.isEmpty()) {
            ret.append("/");
        } else {
            while (!pathname.isEmpty()) {
                ret.insert(0, pathname.pop());
                ret.insert(0, "/");
            }
        }
        return ret.toString();
    }
}

package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateParentheses {

    List<String> output;

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return Collections.emptyList();
        }
        if (n == 1) {
            return Arrays.asList("()");
        }
        output = new ArrayList<>();
        int open = 1;
        int close = 0;
        solve("(", open, close, n);
        return output;
    }

    private void solve(String s, int open, int close, int n) {
        if (open == n && close == n)
            output.add(new String(s));
        // either open or close
        if (open < n) {
            solve(s + "(", open + 1, close, n);
        }
        if (open > close) {
            solve(s + ")", open, close + 1, n);
        }
    }
}

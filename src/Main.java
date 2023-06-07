import Leetcode75.GenerateParentheses;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> l = generateParentheses.generateParenthesis(8);
        for (String l1 : l) {
            System.out.println(l1);
        }
    }


}
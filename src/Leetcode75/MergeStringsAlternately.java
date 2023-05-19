package Leetcode75;

/**
 * https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&id=leetcode-75
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        StringBuilder output = new StringBuilder();
        int i = 0, j = 0;
        boolean flag = true;
        while (i < word1.length() && j < word2.length()) {
            if (flag) {
                output.append(w1[i]);
                i++;
            } else {
                output.append(w2[j]);
                j++;
            }
            flag = !flag;
        }
        output.append(word1.substring(i));
        output.append(word2.substring(j));
        return output.toString();
    }
}

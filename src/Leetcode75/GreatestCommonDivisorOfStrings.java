package Leetcode75;
/**
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&id=leetcode-75
 */
public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.equals(str1.substring(0,str2.length()))){
            return str2.substring(str2.length());
        }
        return "";
    }
}

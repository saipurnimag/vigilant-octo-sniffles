package Leetcode75;

import java.util.*;

/**
 * Letter Combinations of a Phone Number
 *
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {

        HashMap<Character,List<String>> map =  new HashMap<>();
        map.put('2', Arrays.asList("a","b","c"));
        map.put('3', Arrays.asList("d","e","f"));
        map.put('4', Arrays.asList("g", "h","i"));
        map.put('5', Arrays.asList("j","k","l"));
        map.put('6', Arrays.asList("m","n","o"));
        map.put('7', Arrays.asList("p","q","r","s"));
        map.put('8', Arrays.asList("u","v","w"));
        map.put('9', Arrays.asList("x","y","z"));
        if (digits.length() == 0){
            return Collections.emptyList();
        }

        List<String> list = map.get(digits.charAt(0));

        for(int i= 1; i<digits.length(); ++i){
            list = multiply(list, map.get(digits.charAt(i)));
        }

        System.out.println(list);

        return list;

    }

    private List<String> multiply(List<String> list, List<String> strings) {
        List<String> op = new ArrayList<>();
        for (String a: list
             ) {
            for (String b: strings
                 ) {
                op.add(a+b);
            }
        }
        return op;
    }
}

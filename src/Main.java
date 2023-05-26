import Leetcode75.LetterCombinationsOfAPhoneNumber;
import Leetcode75.SmallestRangeCoveringElementsFromKLists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ZigzagConversion zigzagConversion = new ZigzagConversion();
//        System.out.println(zigzagConversion.convert("AB", 1));
//
//        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
//        System.out.println(mergeStringsAlternately.mergeAlternately("abcd","pq"));

//        LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
//        System.out.println(letterCombinationsOfAPhoneNumber.letterCombinations("23"));

        SmallestRangeCoveringElementsFromKLists smallestRangeCoveringElementsFromKLists = new SmallestRangeCoveringElementsFromKLists();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(a);
        lists.add(b);
        lists.add(c);
        int op[] = smallestRangeCoveringElementsFromKLists.smallestRange(lists);
        System.out.println(op[0] + " " + op[1]);
    }

}

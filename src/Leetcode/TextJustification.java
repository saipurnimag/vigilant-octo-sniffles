//package Leetcode;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TextJustification {
//    public List<String> fullJustify(String[] words, int maxWidth) {
//
//        List<String> op = new ArrayList<>();
//        int st = 0, len = 0;
//        for(int i=0;i<words.length;++i){
//            if(len+words[i]>=maxWidth){
//                //complete sentence and start a new one
//                op.add(make(st,i-1,words,len));
//                //reset
//                st = i;
//                len = 0;
//            }
//            len += words[i].length()+1;
//        }
//        if(len!=0){
////            op.add(make());
//        }
//        return op;
//    }
//
//    private String makeSentence(int j, int spacesNeeded, String[] words, int len_words, int width) {
//        int space_left = width - len_words;
//        //divide the space_left between spacesNeeded
//        String first_space = generateSpaces((int) Math.ceil(space_left / (1.0 * spacesNeeded)));
//        String other = generateSpaces((int) Math.floor(space_left / (1.0 * spacesNeeded)));
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(words[j++]);
//        stringBuilder.append(first_space);
//        while (j < spacesNeeded - 1) {
//            stringBuilder.append(words[j++]);
//            stringBuilder.append(other);
//        }
//        stringBuilder.append(words[j]);
//        return stringBuilder.toString();
//    }
//
//    private String generateSpaces(int floor) {
//        StringBuilder x = new StringBuilder();
//        while (floor > 0) {
//            x.append(" ");
//            floor--;
//        }
//        return x.toString();
//    }
//
//
//}
//
//
//
//
//
//
//
//
//// --  OP  --
//// |        |
////OL       OR
////
////BST: OP > OL & OR > OP
////
////Ascending order: inorder traversal
////
////inorder traversal: lft -> parent -> right
//////
////
////
////Node
//
////class Node {
////    int val;
////    Node left, right;
////}
//
//
//
//
//
//
//
//
//
//
//

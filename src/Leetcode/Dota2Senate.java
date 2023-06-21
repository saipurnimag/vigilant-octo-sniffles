package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        char win = ' ';
        int r = 0, d = 0;
        for (Character ch : senate.toCharArray()
        ) {
            if (ch == 'R' && d > 0) {
                d--;
                win = 'D';
            } else if (ch == 'D' && r > 0) {
                r--;
                win = 'R';
            } else if (ch == 'R') {
                r++;
            } else if (ch == 'D') {
                d++;
            }
        }
        if (r == d) {
            if (win == 'R')
                return "Radiant";
            return "Dire";
        }
        if (r > d)
            return "Radiant";
        return "Dire";
    }
}

package Leetcode75;

import java.util.*;

public class CinemaSeatAllocation {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            lists.add(new ArrayList<>());
        }
        for (int i = 0; i < reservedSeats.length; ++i) {
            lists.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
        }

        int count = 0;
        // For each row
        for (int i = 0; i < n; ++i) {
            Collections.sort(lists.get(i));
            List<Integer> reserves = lists.get(i);
            // find start
            int start = 1;
            int block = 0;
            while (start != reserves.get(block)) {
                start++;
                block++;
            }
            for (; block < reserves.size(); ++block) {
                if (reserves.get(block) - start >= 4) {
                    count += reserves.get(block) - start + 1;
                }
                start = reserves.get(block) + 1;
                if (block == reserves.size()) {
                    if((10 - (start+1))>=4){
                        count += 10 - start + 1;
                    }
                }
            }
        }
        return count;
    }
}

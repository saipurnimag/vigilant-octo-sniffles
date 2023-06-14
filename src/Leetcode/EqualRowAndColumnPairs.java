package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/equal-row-and-column-pairs/
 */


public class EqualRowAndColumnPairs {

    public int equalPairs(int[][] grid) {
        HashMap<String, Integer[]> map = new HashMap<>();
        // rows
        for (int i = 0; i < grid.length; ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.length; ++j) {
                sb.append(grid[i][j]);sb.append("_");
            }
            Integer ar[] = map.getOrDefault(sb.toString(), new Integer[]{0, 0});
            ar[0]++;
            map.put(sb.toString(), ar);
        }
        for (int i = 0; i < grid.length; ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.length; ++j) {
                sb.append(grid[j][i]);sb.append("_");
            }
            Integer ar[] = map.getOrDefault(sb.toString(), new Integer[]{0, 0});
            ar[1]++;
            map.put(sb.toString(), ar);
        }
        int ans = 0;
        for (Map.Entry<String, Integer[]> e : map.entrySet()
        ) {
            ans += e.getValue()[0] * e.getValue()[1];
        }
        return ans;
    }

}

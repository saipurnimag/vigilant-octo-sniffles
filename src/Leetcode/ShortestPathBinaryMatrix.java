//package Leetcode75;
//
///**
// * https://leetcode.com/problems/shortest-path-in-binary-matrix/
// * <p>
// * 1091. Shortest Path in Binary Matrix
// */
//
//public class ShortestPathBinaryMatrix {
//
//    int[][] ways = {{0, 1}, {1, 0}, {1, 1}};
//
//    public int shortestPathBinaryMatrix(int[][] grid) {
//        boolean[][] visited = new boolean[grid.length][grid[0].length];
//        int[][] opt = new int[grid.length][grid[0].length](Integer.MAX_VALUE);
//        // ans is in opt[0][0]
//        opt[grid.length - 1][grid[0].length - 1] = 1;
//        solve(grid, visited, opt, 0, 0);
//        return opt[0][0];
//    }
//
//    private int solve(int[][] grid, boolean[][] visited, int[][] opt, int a, int b) {
//
//
//        if (a < 0 || a == grid.length || b < 0 || b == grid[0].length) {
//            return Integer.MAX_VALUE;
//        }
//        if (grid[a][b] == 1) {
//            return Integer.MAX_VALUE;
//        }
//        if (visited[a][b]) {
//            return opt[a][b];
//        }
//        visited[a][b] = true;
//        for (int i = 0; i < 3; ++i) {
//            solve(grid, visited, opt, a + ways[i][0], b + ways[i][1]);
//            opt[a][b] = Math.min(opt[a][b], solve(grid, visited, opt, a + ways[i][0], b + ways[i][1]));
//        }
//        if (opt[a][b] != 0) {
//            opt[a][b] += 1;
//        }
//        return opt[a][b];
//    }
//
//
//}

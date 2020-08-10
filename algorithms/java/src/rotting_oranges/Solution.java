/**
 * 994. Rotting Oranges
 * 
 * In a given grid, each cell can have one of three values:
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.
 * 
 * Example 1:
 * Input: [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 * Example 2:
 * 
 * Input: [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
 * 
 * Example 3:
 *  Input: [[0,2]]
 *  Output: 0
 * Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 */
public class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        boolean stillRotting = false;
        int ones = 0;
        for(;;) {
            stillRotting = false;
            ones = 0;
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j] == 1) {
                        ones += 1;
                    }
                    if(grid[i][j] == 2) {
                        if(j != 0 && grid[i][j-1] == 1) {
                            grid[i][j-1] *= 2;
                            stillRotting = true;
                        }
                        if(i != 0 && grid[i-1][j] == 1){
                            grid[i-1][j] *= 2;
                            stillRotting = true;
                        }
                        if(j < grid[i].length-1 && grid[i][j+1] == 1) {
                            grid[i][j+1] *= 2;
                            stillRotting = true;
                        }
                        if(i < grid.length-1 && grid[i+1][j] == 1) {
                            grid[i+1][j] *= 2;
                            stillRotting = true;
                        }
                    }
                }
            }
            time++;
            if(!stillRotting)
                break;
        }
        return ones == 0 ? time : -1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid = {{2,1,1}, {1,1,0}, {0,1,1}};
        int time = sol.orangesRotting(grid);
        System.out.println(time);
    }    
}
class Solution {
    public int[][] largestLocal(int[][] grid) {

        int n = grid.length;
        int m = n - 2;
        
        int ans [][] = new int [m][m];

        for(int i = 0; i < m; i++){
            
            for(int j = 0; j < m; j++){
                ans[i][j] = getMax(grid, i, j);
            }
        }
        return ans;
    }

 int getMax(int [][] grid, int i, int j){
        int max = 0;
        for(int row = i; row < i+3; row++){
            for(int col = j; col < j+3; col++){
                max = Math.max(max, grid[row][col]);
            }
        }
        return max;
    }
}
class Solution {

    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (n < 3 || m < 3)
            return 0;
        int ans = 0;
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                if (isMagicSquare(i, j, grid)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public boolean isMagicSquare(int x, int y, int[][] grid) {
        boolean[] seen = new boolean[10]; // To check if each number 1-9 is used exactly once
        int[] rows = new int[3];
        int[] cols = new int[3];
        int diag1 = 0, diag2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = grid[x + i][y + j];

                // Check if the value is between 1 and 9 and hasn't been used before
                if (val < 1 || val > 9 || seen[val]) {
                    return false;
                }
                seen[val] = true;

                // Sum rows and columns
                rows[i] += val;
                cols[j] += val;

                // Sum diagonals
                if (i == j) {
                    diag1 += val;
                }
                if (i + j == 2) {
                    diag2 += val;
                }
            }
        }

        // Check if all rows, columns, and diagonals sum to the same value
        return rows[0] == rows[1] && rows[1] == rows[2] && rows[0] == cols[0]
                && cols[0] == cols[1] && cols[1] == cols[2] && diag1 == diag2 && diag1 == rows[0];
    }
}

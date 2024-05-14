/**
 * @param {number[][]} grid
 * @return {number[][]}
 */
var largestLocal = function (grid) {
    let n = grid.length;
    let m = n - 2;

    let ans = [];

    for (let i = 0; i < m; i++) {
        let tm = [];
        for (let j = 0; j < m; j++) {
            tm.push(getMax(grid, i, j));
        }
        ans.push(tm);
    }
    return ans;

};
function getMax(grid, i, j) {
    let max = 0;
    for (let row = i; row < i + 3; row++) {
        for (let col = j; col < j + 3; col++) {
            max = Math.max(max, grid[row][col]);
        }
    }
    return max;
}
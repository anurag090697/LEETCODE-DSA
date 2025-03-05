/**
 * @param {number} n
 * @return {number}
 */
var coloredCells = function (n) {
    let ans = 0;
    while (n > 0) {
        ans += n > 1 ? (n - 1) * 4 : 1;
        n--;
    }
    return ans;
};
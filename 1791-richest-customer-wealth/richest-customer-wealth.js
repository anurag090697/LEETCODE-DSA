/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function (accounts) {
    let max = 0;
    for (let i = 0; i < accounts.length; i++) {
        let tm = 0;
        for (let j = 0; j < accounts[0].length; j++) {
            tm += accounts[i][j];
        }
        max = Math.max(tm, max);
    }
    return max;
};
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
    let max = 0, tm = 0;
    let val = prices[0];
    for (let i = 0; i < prices.length; i++) {
        if (val > prices[i]) val = prices[i];
        tm = prices[i] - val;
        max = Math.max(tm, max);
    }
    return max;
};
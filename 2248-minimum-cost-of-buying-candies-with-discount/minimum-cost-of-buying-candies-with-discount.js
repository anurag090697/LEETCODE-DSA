/**
 * @param {number[]} cost
 * @return {number}
 */
var minimumCost = function (cost) {
    let n = cost.length;
    cost.sort(function(a,b){return a-b});
    let i = n - 1, ans = 0, cnt = 0;
    while (i > -1) {
        if (cnt < 2) {
            ans += cost[i];
            cnt++;
        }
        else {
            cnt = 0;
        }
        i--;
    }
    return ans;
};
/**
 * @param {number[]} happiness
 * @param {number} k
 * @return {number}
 */
var maximumHappinessSum = function (happiness, k) {
    happiness.sort((a,b) => a-b);
    let ans = 0, diff = 0;
    let i = happiness.length - 1;

    while (k > 0) {
        let tm = happiness[i] - diff;
        if (tm > 0) ans += tm;
        diff++;
        k--;
        i--;
    }
    return ans;
};
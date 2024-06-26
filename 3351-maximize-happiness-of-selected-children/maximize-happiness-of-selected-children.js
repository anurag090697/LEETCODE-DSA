/**
 * @param {number[]} happiness
 * @param {number} k
 * @return {number}
 */
var maximumHappinessSum = function (happiness, k) {
    happiness.sort((a,b) => b-a);
    let ans = 0, diff = 0;
    let i = 0;

    while (k > 0) {
        let tm = happiness[i] - diff;
        if (tm > 0) ans += tm;
        diff++;
        k--;
        i++;
    }
    return ans;
};
/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function (candies, extraCandies) {
    let max = 0;
    for (let i = 0; i < candies.length; i++) {
        if (candies[i] > max) max = candies[i];
    }
    let ans = [];
    for (let i = 0; i < candies.length; i++) {
        if (candies[i] + extraCandies >= max) {
            ans.push(true);
        }
        else {
            ans.push(false);
        }
    }
    return ans;
};
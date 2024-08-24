/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findPrefixScore = function (nums) {
    let sum1 = 0;
    let max = 0;
    let ans = [];
    for (let i = 0; i < nums.length; i++) {
        max = Math.max(max, nums[i]);
        sum1 += max + nums[i];
        ans.push(sum1);
    }
    return ans;
};
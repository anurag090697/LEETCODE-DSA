/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length, max = 100000, min = -100000;
        let sum = 0;
        for(let i = 0; i < n; i++){
            max = Math.max(nums[i] , max);
            min = Math.min(nums[i], min);
            sum += nums[i];
        }
        let ans = (n * (n+1) / 2) - sum;
        return ans;
};
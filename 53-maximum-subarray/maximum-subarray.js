/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let sum = 0, maxx = -Infinity;
        for(let i = 0; i < nums.length; i++){
            if(sum > 0)sum += nums[i];
            else sum = nums[i];
            maxx = Math.max(sum, maxx);
        }
        return maxx;
};
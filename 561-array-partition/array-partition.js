/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
    nums.sort(function(v,k) {return v-k});
    let ans = 0;
    for(let i = 0; i < nums.length; i +=2){
       ans += nums[i];
    }
    return ans;
};
/**
 * @param {number[]} nums
 * @param {number} k
 * @param {number} multiplier
 * @return {number[]}
 */
var getFinalState = function(nums, k, multiplier) {
    while(k-->0){
            let min = Infinity, mini = -1;
            for(let i = 0; i < nums.length; i++){
                if(min > nums[i]){
                    min = nums[i];
                    mini = i;
                }
            }
            nums[mini] *= multiplier;
        }
        return nums;
};
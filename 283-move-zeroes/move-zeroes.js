/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    for(let i = 0; i < nums.length-1; i++){
        for(let  j = 0; j < nums.length - i - 1; j++){
            if(nums[j] === 0){
                let tm = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = tm;
            }
        }
    }
};
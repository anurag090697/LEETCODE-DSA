/**
 * @param {number[]} nums
 * @return {number}
 */
var firstMissingPositive = function(nums) {
    let i = 0;
        while(i < nums.length){
            let idx = nums[i]-1;
            if(idx >= 0 && idx < nums.length && nums[i] != nums[idx]){
                let tm = nums[i];
                nums[i] = nums[idx];
                nums[idx] = tm;
            }
            else i++;
        }
        for(let j = 0; j < nums.length; j++){
            if(j != nums[j]-1) return j+1;

        }
        return nums.length + 1;
};
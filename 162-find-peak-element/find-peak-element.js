/**
 * @param {number[]} nums
 * @return {number}
 */
var findPeakElement = function(nums) {
     for (let i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
                return i;
        }

        return nums[0] > nums[nums.length-1] ? 0 : nums.length-1;
};
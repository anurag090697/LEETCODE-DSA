/**
 * @param {number[]} nums
 * @return {number}
 */
var dominantIndex = function (nums) {
    let max = -Infinity;
    let idx = -1;
    for (let i = 0; i < nums.length; i++) {

        if (nums[i] > max) {
            max = nums[i];
            idx = i;
        }
    }
    for (let i = 0; i < nums.length; i++) {
        if (i != idx && nums[i] * 2 > max)
            idx = -1;
    }
    return idx;
};
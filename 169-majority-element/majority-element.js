/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
    let idx = 0, cnt = 1;
    for (let i = 1; i < nums.length; i++) {
        if (nums[idx] == nums[i]) cnt++;
        else cnt--;
        if (cnt == 0) {
            idx = i;
            cnt++;
        }
    }
    return nums[idx];
};
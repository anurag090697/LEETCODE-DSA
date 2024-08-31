/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let cnt = 0, tm = 0;
        for (let i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tm++;

            } else {
                cnt = Math.max(tm, cnt);
                tm = 0;
            }
        }
        if (tm > cnt)
            cnt = tm;
        return cnt;
};
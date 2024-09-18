/**
 * @param {number[]} nums
 * @param {number} target
 * @return {boolean}
 */
var search = function (nums, target) {
    let i = 0, j = nums.length - 1;
    if (j == 0) return nums[0] == target;
    while (i <= j) {
        let mid = Math.floor(i + (j - i) / 2);
        if (nums[mid] == target || nums[i] == target || nums[j] == target) return true;
        if (nums[i] == nums[mid] && nums[mid] == nums[j]) {
            i++;
            j--;
            continue;
        }
        if (nums[mid] >= nums[i]) {
            if (nums[i] <= target && nums[mid] >= target) j = mid - 1;
            else i = mid + 1;
        } else {
            if (nums[mid] <= target && nums[j] >= target) i = mid + 1;
            else j = mid - 1;
        }
    }
    return false;
};
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    if(nums.length < 2) return;
    k = k % nums.length;
    let i = 0;
    let j = nums.length - 1;
    let l = j-k;
    while(i <= l){
        let temp = nums[i];
        nums[i] = nums[l];
        nums[l] = temp;
        i++;
        l--;
    }
    l = j-k+1;
    while(l <= j){
        let temp = nums[l];
        nums[l] = nums[j];
        nums[j] = temp;
        l++;
        j--;
    }
    i = 0;
    j = nums.length - 1;
    while(i <= j){
        let temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
};
/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let tm = init;
    for(let i = 0; i < nums.length; i++){
        tm = fn(tm, nums[i]);
    }
    return tm;
};
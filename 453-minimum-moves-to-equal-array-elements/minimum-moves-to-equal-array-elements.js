/**
 * @param {number[]} nums
 * @return {number}
 */
var minMoves = function(nums) {
    let low = Math.min(...nums);
    let sum = nums.reduce((num, ele) => num + ele, 0);
    return sum - (low * nums.length);
};
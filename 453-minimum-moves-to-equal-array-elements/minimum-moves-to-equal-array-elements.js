/**
 * @param {number[]} nums
 * @return {number}
 */
var minMoves = function(nums) {
    let low = Math.min(...nums);
    let ans = 0;
    nums.forEach((ele) =>{
        ans += ele-low;
    })
    return ans;
};
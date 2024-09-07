/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let tm;
    for(let i of nums) tm ^= i;
    return tm;
};
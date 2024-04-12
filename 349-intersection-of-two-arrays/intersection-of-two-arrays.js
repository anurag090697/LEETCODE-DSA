/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    let ans = [];
    for(let i of nums1){
        if(nums2.includes(i) && !ans.includes(i)) ans.push(i);
    }
    return ans;
};
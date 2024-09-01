/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var minNumber = function (nums1, nums2) {
    let min1 = 11;
    let freq = new Array(10);
    let freq2 = new Array(10);
    for (let i of nums1) {
        min1 = Math.min(min1, i);
        freq[i] = true;
    }
    let min2 = 11;
    for (let i of nums2) {
        min2 = Math.min(i, min2);
        freq2[i] = true;
    }
    for (let i = 1; i < 10; i++) {
        if (freq[i] && freq2[i]) return i;
    }
    if (min1 < min2) return min1 * 10 + min2;

    return min2 * 10 + min1;
};
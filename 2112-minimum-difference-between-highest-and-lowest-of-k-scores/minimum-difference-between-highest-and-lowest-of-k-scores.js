/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var minimumDifference = function (arr, k) {
    let n = arr.length;
    let diff = 1000000;
    arr.sort(function(a,b){return a-b});
    for(let i = 0; i <= n - k; i++) {
            let tm = arr[i + k - 1] - arr[i];
        diff = Math.min(tm, diff);
    }
    return diff;
};
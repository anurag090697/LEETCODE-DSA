/**
 * @param {number[]} arr
 * @return {void} Do not return anything, modify arr in-place instead.
 */
var duplicateZeros = function (arr) {
    let ans = new Array(arr.length).fill(0);
    let i = 0, j = 0;
    
    while (j < arr.length) {
        if (arr[i] == 0) {
            if (j + 1 < arr.length) ans[j + 1] = 0;
            j++;
        }
        else {
            ans[j] = arr[i];
        }
        i++;
        j++;
    }
    for (i = 0; i < arr.length; i++) arr[i] = ans[i];
};
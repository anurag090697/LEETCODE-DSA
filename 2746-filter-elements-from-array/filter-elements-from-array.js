/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let ans = [];
    for(let i = 0; i < arr.length; i++){
        let tm = fn(arr[i],i);
        if(tm) ans.push(arr[i]);
        
    }
    return ans;
};
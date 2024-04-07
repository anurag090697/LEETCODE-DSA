/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let ans = 0;
    let arr = [];
    for(let i = 0; i < s.length; i++){
        if(arr.includes(s.charAt(i))){
            if(arr.length > ans) ans = arr.length;
            arr.splice(0, arr.indexOf(s.charAt(i))+1);
        }
        arr.push(s.charAt(i));
    }
    if(arr.length > ans) ans = arr.length;
    return ans;
};
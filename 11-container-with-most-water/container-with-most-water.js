/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let i = 0;
    let j = height.length-1;
    let ans = 0;
    while(i < j){
        let tm = Math.min(height[i], height[j]) * (j - i);
        ans = Math.max(tm, ans);
        if (height[i] < height[j]) i++;
        else j--;
    }
    return ans;
};
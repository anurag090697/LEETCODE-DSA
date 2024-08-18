/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
        let ans = [];
        let j = 0;
        while(j < nums.length*2){
            if(j < nums.length) ans.push(nums[j]);
            else ans.push(nums[j-nums.length]);
            j++;
        }
        return ans;
};
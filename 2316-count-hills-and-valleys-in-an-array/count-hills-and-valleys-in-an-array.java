class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0 , p = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]) continue;
            if((nums[i] > nums[p] && nums[i] > nums[i+1]) || (nums[i] < nums[p] && nums[i] < nums[i+1])){
                ans++;
            }
            p = i;
        }
        return ans;
    }
}
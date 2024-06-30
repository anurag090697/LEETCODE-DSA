class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, max = 100000, min = -100000;
        int sum = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(nums[i] , max);
            min = Math.min(nums[i], min);
            sum += nums[i];
        }
        int ans = (n * (n+1) / 2) - sum;
        return ans;
    }
}
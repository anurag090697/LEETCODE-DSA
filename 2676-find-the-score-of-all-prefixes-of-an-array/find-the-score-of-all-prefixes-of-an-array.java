class Solution {
    public long[] findPrefixScore(int[] nums) {
        long sum1 = 0 ;
        long max = Long.MIN_VALUE;
        long ans [] = new long [nums.length];
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            sum1 += max + nums[i];
            ans[i] = sum1;
        }
        return ans;
    }
}
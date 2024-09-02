class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            int tm = 0;
            for(int j = i; j < nums.length; j++){
                tm += nums[j];
                if(tm == k) cnt++;
            }
        }
        return cnt;
    }
}
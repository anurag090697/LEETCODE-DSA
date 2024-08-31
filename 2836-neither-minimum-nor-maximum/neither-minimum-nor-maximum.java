class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2) return -1;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int cnt = -1;
        for(int i : nums){
            if(i != min && i != max) cnt = i;
        }
        return cnt;
    }
}
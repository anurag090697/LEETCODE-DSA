class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, temp = 0;
        for(int i : nums){
            temp += i;
            max = Math.max(temp,max);
            if(temp < 0) temp = 0;
        }
        return max;
    }
}
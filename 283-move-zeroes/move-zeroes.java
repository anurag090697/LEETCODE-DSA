class Solution {
    public void moveZeroes(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) nums[num++] = nums[i];
        }
        while(num < nums.length) nums[num++] = 0;
    }
}
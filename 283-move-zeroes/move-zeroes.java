class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
        for(int  j = 0; j < nums.length - i - 1; j++){
            if(nums[j] == 0){
                int tm = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = tm;
            }
        }
    }
    }
}
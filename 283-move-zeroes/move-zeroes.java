class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = nums.length-1;
        while(i < j){
            if(nums[j] == 0) j--;
            if(nums[i] == 0){
                int k = i;
                while(k < j){
                    int tm = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = tm;
                    k++;
                }
                
            }
            else i++;
        }
    }
}
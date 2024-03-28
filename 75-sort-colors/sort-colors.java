class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k = nums.length-1;
        while(j <= k){
            if(nums[j] == 0){
                int tm = nums[j];
                nums[j] = nums[i];
                nums[i] = tm;
                i++;
                j++;
            }
            else if(nums[j] == 1) j++;
            else{
                int tm = nums[k];
                nums[k] = nums[j];
                nums[j] = tm;
                k--;
            }
        }
    }
}
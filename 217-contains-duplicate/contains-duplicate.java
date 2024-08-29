class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) return true;
            else if(nums[i] < nums[i-1]){
                int tm = nums[i];
                for(int j = i-2; j > -1; j--){
                    if(tm == nums[j]) return true;
                }
                int tm1 = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = tm1;
            }
        }
        return false;
    }
}
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int idx = nums[i]-1;
            if(idx >= 0 && idx < nums.length && nums[i] != nums[idx]){
                int tm = nums[i];
                nums[i] = nums[idx];
                nums[idx] = tm;
            }
            else i++;
        }
        for(int j = 0; j < nums.length; j++){
            if(j != nums[j]-1) return j+1;

        }
        return nums.length + 1;
    }
}
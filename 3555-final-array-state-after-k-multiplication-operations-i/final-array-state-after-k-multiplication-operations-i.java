class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-->0){
            int min = Integer.MAX_VALUE, mini = -1;
            for(int i = 0; i < nums.length; i++){
                if(min > nums[i]){
                    min = nums[i];
                    mini = i;
                }
            }
            nums[mini] *= multiplier;
        }
        return nums;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length-1, idx = 0;
        int ans [] = new int[j+1];
        while(i <= j){
            if(Math.abs(nums[i]) < nums[j]){
                ans[idx] = nums[j];
                j--;
                idx++;
            }
            else {
                ans[idx] = nums[i];
                i++;
                idx++;
            }
        }
        j = nums.length-1;
        for(i = 0; i < nums.length; i++){
            nums[i] = ans[j]*ans[j];
            j--;
        }
        return nums;
    }
}
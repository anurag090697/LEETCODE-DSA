class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int prod = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) zero++;
            else prod *= nums[i];
        }
        int [] answer = new int[n];
        if(zero == 0){
            for(int i = 0; i < n; i++){
                answer[i] = prod / nums[i];
            }
        }
        else if(zero == 1){
            for(int i = 0; i < n; i++){
            if(nums[i] == 0) answer[i] = prod;
            }
        }
        return answer;
    }
}
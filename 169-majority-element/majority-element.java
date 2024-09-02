class Solution {
    public int majorityElement(int[] nums) {
        int idx = 0, cnt = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[idx] == nums[i]) cnt++;
            else cnt--;
            if(cnt == 0){
                idx = i;
                cnt++;
            }
        }
        return nums[idx];
    }
}
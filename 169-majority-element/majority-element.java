class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0], cnt = 0, max = 0, ans = 0;
        for(int i : nums){
            if(i == num) cnt++;
            else{
                num = i;
                cnt = 1;
            }
            if(cnt > max){
                ans = i;
                max = cnt;
            }
        }
        return ans;
    }
}
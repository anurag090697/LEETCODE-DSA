class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ans= -1;
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i] * -1)) ans = Math.max(ans, Math.abs(nums[i]));
            else hs.add(nums[i]);
        }
        return ans;
    }
}
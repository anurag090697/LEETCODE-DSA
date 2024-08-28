class Solution {
    public boolean canPlaceFlowers(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && (i == 0 || nums[i - 1] == 0) && (i == nums.length - 1 || nums[i + 1] == 0)) {
                cnt++;
                nums[i] = 1;
            }

        }
        return cnt >= k;
    }
}
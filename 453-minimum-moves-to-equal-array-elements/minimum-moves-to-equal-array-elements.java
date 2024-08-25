class Solution {
    public int minMoves(int[] nums) {
        int low = Integer.MAX_VALUE;
        for(int i : nums) low = Math.min(low,i);
        int ans = 0;
        for(int i : nums) ans += i-low;
        return ans;
    }
}
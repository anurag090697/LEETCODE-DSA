class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int [] ans = new int[n+n];
        int j = 0;
        while(j < n*2){
            if(j < n) ans[j] = nums[j];
            else ans[j] = nums[j-n];
            j++;
        }
        return ans;
    }
}
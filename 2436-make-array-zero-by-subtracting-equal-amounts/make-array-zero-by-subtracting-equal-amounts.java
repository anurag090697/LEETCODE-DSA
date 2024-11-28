class Solution {
    public int minimumOperations(int[] nums) {
       int freq[] = new int[101];
        for(int i : nums){
            freq[i]++;
        }
        int cnt = 0;
        for(int i = 1; i < 101; i++){
            cnt = freq[i] > 0 ? cnt + 1 : cnt;
        }
        return cnt;
    }
}
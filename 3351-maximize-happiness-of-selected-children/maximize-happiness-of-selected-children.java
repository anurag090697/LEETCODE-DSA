class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0, diff = 0 ;
        int i = happiness.length - 1;
        Arrays.sort(happiness);
        while(k > 0){
            long tm = happiness[i] - diff;
            if(tm > 0) ans += tm;
            diff++;
            k--;
            i--;
        }
        return ans;
    }

}
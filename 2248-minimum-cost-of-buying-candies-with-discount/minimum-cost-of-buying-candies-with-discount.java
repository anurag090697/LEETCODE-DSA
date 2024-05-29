class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        int i = n-1, ans = 0, cnt = 0;
        while(i > -1){
            if(cnt == 2){
                cnt = 0;
                i--;
                continue;
            }
            ans += cost[i];
                cnt++;
            
            i--;
        }
        return ans;
    }
}
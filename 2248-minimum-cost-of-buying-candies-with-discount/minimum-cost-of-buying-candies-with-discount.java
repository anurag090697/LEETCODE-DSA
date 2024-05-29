class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        int i = n-1, ans = 0, cnt = 0;
        while(i > -1){
            if(cnt < 2){
                ans += cost[i];
                cnt++;
            }
            else{
                cnt = 0;
            }
            i--;
        }
        return ans;
    }
}
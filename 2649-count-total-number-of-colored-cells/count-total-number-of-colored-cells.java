class Solution {
    public long coloredCells(int n) {
        long ans = 0;
        while(n > 0){
            if(n == 1) ans++;
            else ans += (n-1) * 4;
            n--;
        }
        return ans;
    }
}
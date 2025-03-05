class Solution {
    public long coloredCells(int n) {
        long ans = 0;
        while(n > 0){
            ans += n > 1 ? (n-1)*4 : 1;
            n--;
        }
        return ans;
    }
}
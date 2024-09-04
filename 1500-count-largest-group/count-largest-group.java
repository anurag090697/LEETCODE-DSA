class Solution {
    public int countLargestGroup(int n) {
        int ans [] = new int[37];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            int tm = i;
            int temp = 0;
            while(tm > 0){
                temp += tm%10;
                tm /= 10;
            }
            ans[temp]++;
        }
        for(int i : ans) max = Math.max(max,i);
        int cnt = 0;
        for(int i : ans) {
            if(i == max) cnt++;
        }
        return cnt;
    }
}
class Solution {
    public int totalMoney(int n) {
        int mon = 1;
        int week = 0;
        int coin = 0;
        for(int day = 1; day <= n; day++){
            coin += mon;
            mon++;
            if(day % 7 == 0){
                week++;
                mon = week + 1;
            }
        }
        return coin;
    }
}
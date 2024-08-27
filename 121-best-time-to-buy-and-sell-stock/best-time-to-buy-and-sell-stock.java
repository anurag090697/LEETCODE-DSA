class Solution {
    public int maxProfit(int[] prices) {
        int max = 0 , tm = 0;
        int val = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(val > prices[i]) val = prices[i];
            tm = prices[i] - val;
            max = Math.max(tm,max);
        }
        return max;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
       int max = 0, temp = 0, val = prices[0];
       for(int i : prices){
        if(val > i){
            val = i; 
        }
        temp = i - val;
        max = Math.max(temp,max);
       }
       return max;
    }
}
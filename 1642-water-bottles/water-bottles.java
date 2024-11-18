class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles, empty = numBottles, extra = empty % numExchange;
        numBottles = empty / numExchange;
        while(empty/numExchange > 0){
            drank += numBottles;
            empty = numBottles + extra;
            extra = empty % numExchange;
            numBottles = empty / numExchange;
        }
        return drank;
    }
}
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk = numBottles, empty = drunk, extra = 0;
        while(empty/numExchange > 0){
            numBottles = empty / numExchange;
            extra = empty % numExchange;
            drunk += numBottles;
            empty = numBottles + extra;
        }
        return drunk;
    }
}
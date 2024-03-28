class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int emp = drink;
        int ex = 0;
        while(emp/numExchange >= 1){
            numBottles = emp / numExchange;
            ex = emp % numExchange;
            drink += numBottles;
            emp = ex + numBottles;
        }
        return drink;
    }
}
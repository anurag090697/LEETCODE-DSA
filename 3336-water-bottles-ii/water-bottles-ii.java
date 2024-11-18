class Solution {
    public int maxBottlesDrunk(int bot, int exc) {
        int empty = bot, drank = bot;
        while(empty / exc > 0){
            drank++;
            empty = empty - exc++ + 1;    
        }
        return drank;
    }
}
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int turns = 0;
        while(tickets[k] != 0){
            int i = 0;
            while(i < tickets.length && tickets[k] > 0){
                if(tickets[i] != 0){
                    tickets[i]--;
                    turns++;
                }
                i++;
            }
        }
        return turns;
    }
}
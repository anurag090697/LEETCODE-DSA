class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;
        for(int i : piles){
             pq.add(i);
             ans += i;
        }
        while(k-- > 0){
            int tm = pq.remove();
            if(tm % 2 == 0){
                pq.add(tm/2);
            } 
            else{
                pq.add(tm/2 + 1);
            } 
            ans -= tm/2;
        }
        return ans;
    }
}
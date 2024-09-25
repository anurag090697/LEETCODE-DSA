class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : piles) pq.add(i);
        while(k-- > 0){
            int tm = pq.remove();
            if(tm % 2 == 0) pq.add(tm/2);
            else pq.add(tm/2 + 1);
        }
        int ans = 0;
        while(pq.size() > 0) ans += pq.remove();
        return ans;
    }
}
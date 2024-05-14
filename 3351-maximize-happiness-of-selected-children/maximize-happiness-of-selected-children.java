class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0, diff = 0;
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : happiness) pq.add(i);
        while(k > 0){
            long tm = pq.remove() - diff;
            if(tm > 0) ans += tm;
            diff++;
            k--;
        }
        return ans;
    }

}
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < gifts.length; i++) pq.add(gifts[i]);
        while(k-- > 0){
            int tm = pq.remove();
            pq.add((int)Math.sqrt(tm));
        }
        long ans = pq.remove();
        while(!pq.isEmpty()) ans += pq.remove();
        return ans;
    }
}
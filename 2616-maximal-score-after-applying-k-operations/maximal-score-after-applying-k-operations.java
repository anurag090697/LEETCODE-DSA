class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) pq.add(i);
        long ans = 0;
        while(k-- > 0){
            int tm = pq.remove();
            ans += tm;
            pq.add((int)Math.ceil(tm/3.0));
        }
        return ans;
    }
}
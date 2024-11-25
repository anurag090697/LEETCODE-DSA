class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr) pq.add(i);
        while(pq.size() > 1){
            int tm = pq.remove() - pq.remove();
            if(tm != 0) pq.add(tm);
        }
        return pq.isEmpty() ? 0 : pq.remove();
    }
}
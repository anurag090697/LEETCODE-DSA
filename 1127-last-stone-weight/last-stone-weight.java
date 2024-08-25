class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr) pq.add(i);
        while(pq.size() > 1){
            int stone1 = pq.remove(), stone2 = pq.remove();
            if(stone1 - stone2 != 0) pq.add(stone1-stone2);
        }
        return pq.isEmpty() ? 0 : pq.remove();
    }
}
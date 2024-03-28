class Solution {
    public int lastStoneWeight(int[] arr) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) pq.add(arr[i]);
        while(pq.size() > 1){
            int a = pq.remove(), b = pq.remove();
            if(a-b > 0) pq.add(a-b);
        }
        if(pq.size() > 0) return pq.remove();
        return 0;
    }
}
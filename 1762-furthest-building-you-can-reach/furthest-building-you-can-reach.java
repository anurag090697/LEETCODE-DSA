class Solution {
    public int furthestBuilding(int[] arr, int bricks, int ladders) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue();
        int bused = 0;
        for(int i = 1; i < n; i++){
            int diff = arr[i] - arr[i-1];
                if(diff > 0){
                    pq.add(diff);
                    if(pq.size() > ladders){
                        bused += pq.remove();
                    }
                    if(bused > bricks) return i-1;
                }
        }
        return n-1;
    }
}
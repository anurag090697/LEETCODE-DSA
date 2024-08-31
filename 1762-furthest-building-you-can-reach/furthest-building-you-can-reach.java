class Solution {
    public int furthestBuilding(int[] arr, int bricks, int ladders) {
        int wall = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 1; i < arr.length; i++){
            int tm = arr[i] - arr[i-1];
            if(tm > 0){
                pq.add(tm);
                if(pq.size() > ladders) wall += pq.remove();
            }
            if(wall > bricks) return i-1;
        }
        return arr.length-1;
    }

}
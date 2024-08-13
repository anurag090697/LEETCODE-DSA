class Solution {
    public int furthestBuilding(int[] arr, int bricks, int ladders) {
        // int n = arr.length;
        int brickUsed = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff > 0) {
                pq.add(diff);
                if (pq.size() > ladders) {
                    brickUsed += pq.remove();
                }

            }
            if (brickUsed > bricks)
                return i - 1;
        }
        return arr.length - 1;
    }

}
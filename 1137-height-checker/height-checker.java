class Solution {
    public int heightChecker(int[] heights) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : heights) pq.add(i);
        int cnt = 0;
        for(int i : heights){
            if(pq.peek() != i) cnt++;
            pq.remove();
        }
        return cnt;
    }
}
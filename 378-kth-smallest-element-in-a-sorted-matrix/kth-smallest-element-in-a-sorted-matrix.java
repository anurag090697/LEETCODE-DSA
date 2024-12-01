class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < matrix.length; i++){
            // if(cnt == 0) break;
            for(int j = 0; j < matrix[0].length; j++){
                pq.add(matrix[i][j]);
            }
            
        }
        // System.out.print(pq.size());
        while(k-- > 1) pq.remove();
        return pq.remove();
    }
}
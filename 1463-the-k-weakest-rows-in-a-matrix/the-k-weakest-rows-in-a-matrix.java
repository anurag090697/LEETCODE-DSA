class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < m; j++){
                cnt += mat[i][j];
            }
            pq.add(cnt * 1000 + i);
        }
        int arr [] = new int[k];
        for(int i = 0 ; i < k; i++){
            arr[i] = pq.remove() % 1000;
        }
        return arr;
    }
}
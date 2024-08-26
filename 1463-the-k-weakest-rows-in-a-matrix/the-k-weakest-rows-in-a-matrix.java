class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += mat[i][j];
            }
            pq.add((sum * 10000) + i);
        }
        int ans[] = new int[k];
        for(int i = 0; i < ans.length; i++) ans[i] = pq.remove() % 10000;
        return ans;
    }
}
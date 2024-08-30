class Solution {
    public String[] findRelativeRanks(int[] arr) {
        int n = arr.length;
        HashMap<Integer,String> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
        }
        for(int i = 0; i < n; i++){
            
            if(pq.size() == n){
                hm.put(pq.remove(), "Gold Medal");
            }
            else if(pq.size() == n-1){
                hm.put(pq.remove(), "Silver Medal");
            }
            else if(pq.size() == n-2){
                hm.put(pq.remove(), "Bronze Medal");
            }
            else{
                hm.put(pq.remove(), (n-pq.size()) +"");
            }
        }
        String ans[] = new String[n];
        for(int i = 0; i < n; i++) ans[i] = hm.get(arr[i]);
        return ans; 
    }
}
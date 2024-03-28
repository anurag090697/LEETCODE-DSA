class Solution {
    public String[] findRelativeRanks(int[] arr) {
        int n = arr.length;
        HashMap<Integer, String> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) pq.add(arr[i]);
        int tm = pq.remove();
        hm.put(tm, "Gold Medal");

        while(!pq.isEmpty()){
            if(pq.size() == n-1){
                tm = pq.remove();
                hm.put(tm, "Silver Medal");
            }
            else if(pq.size() == n-2){
                tm = pq.remove();
                hm.put(tm, "Bronze Medal");
            }
            else{
                tm = pq.remove();
                String l = "" + (hm.size()+1);
                hm.put(tm, l);
            }
        }
        String ans [] = new String[n];
        for(int i = 0; i < n; i++){
            ans[i] = hm.get(arr[i]);
        }
        return ans;
    }
}
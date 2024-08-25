class Solution {
    public int maxOperations(int[] arr, int k) {
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        // for(int i : arr) hm.put(i, hm.getOrDefault(i,0)+1);

        for(int i : arr){
            int res = k - i;
            if(hm.containsKey(res)){
                ans++;
                hm.put(res, hm.get(res)-1);
                if(hm.get(res) == 0) hm.remove(res);
            }
            else hm.put(i, hm.getOrDefault(i,0)+1);
            
        }
        return ans;
    }
}
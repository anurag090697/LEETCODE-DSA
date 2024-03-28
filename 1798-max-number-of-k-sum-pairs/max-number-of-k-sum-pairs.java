class Solution {
    public int maxOperations(int[] arr, int k) {
         int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int sum = k - arr[i];
            if(hm.containsKey(sum)){
                ans++;
                hm.put(sum, hm.get(sum)-1);
                if(hm.get(sum) == 0){
                    hm.remove(sum);
                }    
            }
            else{
                    hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
            }
        }
        return(ans);
    }
}
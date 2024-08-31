class Solution {
    public String[] findRelativeRanks(int[] arr) {
        int n = arr.length;
        HashMap<Integer,String> hm = new HashMap<>();
        int nums [] = new int[n];
        
        for(int i = n-1; i > -1; i--){
           nums[i] = arr[i];
        }
        Arrays.sort(arr);
        for(int i = n-1; i > -1; i--){
            
            if(i == n-1){
                hm.put(arr[i], "Gold Medal");
            }
            else if(i == n-2){
                hm.put(arr[i], "Silver Medal");
            }
            else if(i == n-3){
                hm.put(arr[i], "Bronze Medal");
            }
            else{
                hm.put(arr[i], (n-i) +"");
            }
        }
        String ans[] = new String[n];
        for(int i = 0; i < n; i++) ans[i] = hm.get(nums[i]);
        return ans; 
    }
}
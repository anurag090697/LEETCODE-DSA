class Solution {
    public int[] twoSum(int[] arr, int k) {
        int ans [] = new int[2];
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = k - arr[i];
            if(hm.containsKey(num)){
                ans[0] = hm.get(num);
                ans[1] = i;
                break;
            }
            hm.put(arr[i], i);
        }
        return ans;
    }
}
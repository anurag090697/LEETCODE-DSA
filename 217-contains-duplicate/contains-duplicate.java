class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            int tm = nums[i];
            hm.put(tm, hm.getOrDefault(tm, 0)+1);
            if(hm.get(nums[i]) >= 2) return true;
        }
        
        return false;
    }
}
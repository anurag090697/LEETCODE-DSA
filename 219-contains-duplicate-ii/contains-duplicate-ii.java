class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i = 0; i < nums.length; i++){   
        if(i-hm.getOrDefault(nums[i],-110000)<= k){
            System.out.print(i);
            return true;
        } 
        hm.put(nums[i],i);
       }
       return false;
    }
}
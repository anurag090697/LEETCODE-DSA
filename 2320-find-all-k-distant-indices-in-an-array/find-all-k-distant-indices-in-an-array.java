class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        // HashSet<Integer> hs = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key){
                int st = Math.max(0,i-k);
                int en = Math.min(nums.length-1, i+k);
                if(ans.size() > 0){
                    st = Math.max(ans.get(ans.size()-1)+1, st);
                }
                for(int j = st; j <= en; j++){
                    ans.add(j);
                }
            }
        }
        return ans;
    }
}
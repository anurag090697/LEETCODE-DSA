class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int max = Integer.MIN_VALUE;
        int ans [] = new int[nums1.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) hm.put(nums2[i], i);

        for(int i = 0; i < nums1.length; i++){
            int tm = nums1[i];
            int idx = hm.get(tm);
            while(idx < nums2.length){
                if(nums2[idx] > tm){
                    tm = nums2[idx];
                    break;
                }
                idx++;
            }          
            if(tm > nums1[i]) ans[i] = tm;
            else ans[i] = -1;
        }
        return ans;
    }
}
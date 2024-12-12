class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 ,j = 0;
        Stack<Integer> st = new Stack<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                st.push(nums1[i]);
                i++;
                j++;
            } 
            else if(nums1[i] < nums2[j]) i++;
            else j++;
        }
        int ans [] = new int[st.size()];
        for(i = 0; i < ans.length; i++) ans[i] = st.pop();
        return ans;
    }
}
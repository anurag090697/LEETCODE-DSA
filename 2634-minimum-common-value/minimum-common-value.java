class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        if(nums1[0] > nums2[nums2.length-1]) return -1;
        if(nums2[0] > nums1[nums1.length-1]) return -1;
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i] > nums2[j]) j++;
            else i++;
        }
        // while(i < nums1.length && j < nums2.length){
        //     if(nums1[i] == nums2[j]) return nums1[i];
        //     i++;
        // }
        //  while(j < nums2.length && i < nums1.length ){
        //     if(nums2[j] == nums1[i]) return nums2[j];
        //     j++;
        // }
        return -1;
    }
}
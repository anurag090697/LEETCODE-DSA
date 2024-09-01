class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min1 = 11;
        boolean freq [] = new boolean[10];
        boolean freq2 [] = new boolean[10];
        for(int i : nums1){
            min1 = Math.min(min1,i);
            freq[i] = true;
        }
        int min2 = 11;
        for(int i : nums2){
            min2 = Math.min(i,min2);
            freq2[i] = true;
        }
        for(int i = 1; i < 10; i++){
            if(freq[i] && freq2[i]) return i;
        }
        if(min1 < min2) return min1*10+min2;
        
        return min2*10+min1;
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int brr[] = new int[n];
        for(int i = 1; i < n; i++) arr[i] = nums[i-1] + arr[i-1];
        for(int i = n-2; i > -1; i--) brr[i] = nums[i+1] + brr[i+1];
        for(int i = 0; i < n; i++){
            if(arr[i] == brr[i]) return i;
        }
        return -1;
    }
}
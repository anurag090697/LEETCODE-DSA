class Solution {
    public int[] shuffle(int[] arr, int n) {
        int ans [] = new int[n+n];
        int j = 0;
        for(int i = 0; i < n; i++){
            ans[j] = arr[i];
            ans[j+1] = arr[n+i];
            j +=2;
        }
        return ans;
    }
}
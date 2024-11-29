class Solution {
    public int maxProduct(int[] a) {
         int n = a.length;
        int left = 1;
        int right = 1;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            left *= a[i];
            right *= a[n-i-1];
            ans = Math.max(ans, Math.max(left, right));
            if(left == 0) left = 1;
            if(right == 0) right = 1;
        }
        return ans;
    }
}
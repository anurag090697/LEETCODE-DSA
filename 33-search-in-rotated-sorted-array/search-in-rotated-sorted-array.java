class Solution {
    public int search(int[] a, int k) {
        int n = a.length;
        int i = 0, j = n-1;
        while(i <= j){
            int m = (i + j)/ 2;
            if(a[m] == k){
                return m;
            }
            else if(a[m] >= a[i]){
                if(a[i] <= k && a[m] > k){
                    j = m-1;
                }
                else{
                    i = m + 1;
                }
            }
            else{
                if(a[m] < k && k <= a[j]){
                    i = m + 1;
                }
                else{
                    j = m - 1;
                }
            }
        }
        return -1;
    }
}
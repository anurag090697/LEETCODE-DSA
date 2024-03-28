class Solution {
    public int search(int[] a, int k) {
        int i = 0, j = a.length-1;
        while(i <= j){
            int m = (i+j)/ 2;
            if(a[m] == k) return m;
            else if(a[m] > k) j = m-1;
            else i = m+1;
        }
        return -1;
    }
}
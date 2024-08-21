class Solution {
    public boolean canPlaceFlowers(int[] a, int k) {
        int n = a.length;
        int t = 0;
        for (int i = 0; i < n ; i++) {
            if (a[i] == 0 && (i == 0 || a[i - 1] == 0) && (i == n - 1 || a[i + 1] == 0)) {
                t++;
                a[i] = 1;
            }
        }       
        return (t >= k);
    }
}
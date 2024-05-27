class Solution {
    public int minimumDifference(int[] arr, int k) {

        int n = arr.length;

        int diff = 1000000;
        Arrays.sort(arr);
        for (int i = 0; i <= n - k; i++) {
            int tm = arr[i + k - 1] - arr[i];
            diff = Math.min(tm, diff);
        }
        return diff;
    }
}
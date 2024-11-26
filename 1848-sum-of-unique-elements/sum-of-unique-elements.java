class Solution {
    public int sumOfUnique(int[] arr) {
        int sum = 0;
        int n = arr.length;
        if(arr.length == 1) return arr[0];
        int freq[] = new int[101];
        for(int i : arr) freq[i]++;
        for(int i = 0; i < 101; i++) sum += freq[i] == 1 ? i : 0;
        return sum;
    }
}
class Solution {
    public int firstUniqChar(String s) {
       char[] arr = s.toCharArray();
        int[] count = new int[123];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] == 1) {
                return i;
            }
        }
        return -1;
    }
}
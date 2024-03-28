class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int cnt = 0;
        while(arr[k] != 0){
            int j = 0;
            while( j < arr.length && arr[k] > 0){
                if(arr[j] != 0){
                    arr[j]--;
                    cnt++;
                }
                j++;
            }
        }
        return cnt;
    }
}
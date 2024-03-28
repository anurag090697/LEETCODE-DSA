class Solution {
    public int thirdMax(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int cnt = 1, max = arr[n-1];
        for(int i = n-1; i > -1; i--){
            if(arr[i] < max){
                cnt++;
                max = arr[i];
            } 
            if(cnt == 3) return arr[i];
        }
        return arr[n-1];
    }
}
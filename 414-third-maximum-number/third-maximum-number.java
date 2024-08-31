class Solution {
    public int thirdMax(int[] arr) {
       Arrays.sort(arr);
        int tm = arr[arr.length-1], cnt = 1;
        for(int i = arr.length-1; i > -1; i--){
            if(arr[i] != tm){
                tm = arr[i];
                cnt++;
            }
          if(cnt == 3) return arr[i];
        }
        return arr[arr.length-1];
    }
}
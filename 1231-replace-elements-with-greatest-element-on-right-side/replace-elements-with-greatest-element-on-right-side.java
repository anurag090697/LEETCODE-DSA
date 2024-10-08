class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
       int max = -1;
       for(int i = arr.length -1; i >= 0; i--){
        int tm = arr[i];
        arr[i] = max;
        max = Math.max(tm,max);
       }
       return arr;
    }
}
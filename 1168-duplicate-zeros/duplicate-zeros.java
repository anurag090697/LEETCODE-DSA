class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                shiftIt(arr,i);
                i++;
            } 
        }
    }
    public static void shiftIt(int arr[], int idx){
        for(int i = arr.length-1; i > idx; i--){
            arr[i] = arr[i-1];
        }
    }
}
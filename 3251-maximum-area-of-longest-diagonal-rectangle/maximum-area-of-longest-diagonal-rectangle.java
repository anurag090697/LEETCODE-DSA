class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        int temp = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            int tm = (arr[i][0] * arr[i][0]) + (arr[i][1] * arr[i][1]);
            if(tm > temp){
                temp = tm;
                ans = arr[i][0] * arr[i][1];
            }
            else if(tm == temp){
                temp = tm;
                ans = Math.max(ans,(arr[i][0] * arr[i][1]));
            }
        }
        return ans;
    }
}
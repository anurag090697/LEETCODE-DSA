class Solution {
    public int[] constructRectangle(int area) {
        int ans [] = new int[2];
        for(int i = (int)Math.sqrt(area); i > 0; i--){
            if(area % i == 0){
                int j = area/i;
                ans[0] = j;
                ans[1] = i;
                break;
            }
           
        }
         return ans;
    }
}
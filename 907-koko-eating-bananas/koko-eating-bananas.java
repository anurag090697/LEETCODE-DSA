class Solution {
    public static boolean  canEat(int arr[], int num, int hr){
        int tm = 0;
        for(int i : arr){
           tm += Math.ceil((i*1.0) /num);
        }
        return tm <= hr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int right = 0;
        for(int i : piles) right = Math.max(i,right);
        int left = 1, ans = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(canEat(piles,mid,h)){
                ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }
}
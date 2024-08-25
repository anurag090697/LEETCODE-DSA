class Solution {
    public static boolean canEat(int arr [], int num, int time){
        int tm = 0;
        for(int i = 0; i < arr.length; i++){
            tm += Math.ceil((arr[i] * 1.0)/num);
        }
        return tm <= time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i : piles) max = Math.max(i, max);
        int i = 1, j = max, totalTime = -1;
        while(i <= j){
            int mid = i + (j-i) / 2;
            if(canEat(piles,mid,h)){
                totalTime = mid;
                j = mid - 1;
            }
            else i = mid + 1;
        }
        return totalTime;
    }
}
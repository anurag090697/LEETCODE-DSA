class Solution {
    public static boolean possible(int arr[], int w, int k){
        int tm = 0, cnt = 1;
        for(int i : arr){
            if(i + tm <= w) tm += i;
            else{
                tm = i;
                cnt++;
            }
        }
        return cnt <= k;
    }
    public int shipWithinDays(int[] weights, int days) {
        int i = 0, j = 0;
        for(int ele : weights){
            i = Math.max(i,ele);
            j += ele;
        }
        int ans = -1;
        while(i <= j){
            int mid = (i+j)/2;
            if(possible(weights,mid,days)){
                j = mid - 1;
                 ans = mid;
            }
            else i = mid + 1;
        }
        return ans;
    }
}
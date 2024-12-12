class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        int ans[] = new int[2];
        int t1 = -1, t2 = -1;
        while(i <= j){
            int mid = (i + j) / 2;
            if(nums[mid] < target) i = mid+1;
            else if(nums[mid] > target) j = mid-1;
            else{
                t1 = mid;
                t2 = mid;
                while(t1 > 0 && nums[t1-1] == target) t1--;
                while(t2 < nums.length-1 && nums[t2+1] == target) t2++;
                break;
            }
        }
        ans[0] = t1;
        ans[1] = t2;
        return ans;
    }
}
class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int prev = 0;
        for(int num : nums){
            if(num - prev > 1 && k > 0){
                long st = prev + 1;
                long en = Math.min(num-1, st+k-1);
                long cnt = en - st + 1;
                sum += (st + en) * cnt/2;
                k -= cnt;
            }
            prev = num;
            if(k == 0) break;
        }
        if(k > 0){
            long st = prev+1;
            long en = st + k - 1;
            sum += (st + en) * k/2;
        }
        return sum;
    }
}
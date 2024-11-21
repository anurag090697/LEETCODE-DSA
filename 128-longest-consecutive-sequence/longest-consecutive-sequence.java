class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return 1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums) hs.add(i);
        int ans = 0;
        for(int i : nums){
            int prev = i-1, next = i+1;
            while(hs.contains(prev)) hs.remove(prev--);
            while (hs.contains(next)) hs.remove(next++);
            ans = Math.max(ans, next-prev-1);
        }
        return ans;
    }
}
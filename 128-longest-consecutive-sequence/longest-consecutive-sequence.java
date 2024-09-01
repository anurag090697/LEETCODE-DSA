class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        HashSet<Integer> hs = new HashSet<>();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : nums) {
            hs.add(i);
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        int ans = 0;
        for (int i : nums) {
            if (!hs.contains(i))
                hs.remove(i);
            int prev = i - 1;
            int next = i + 1;

            while (hs.contains(prev)) {
                hs.remove(prev);
                prev--;
            }
            while (hs.contains(next)) {
                hs.remove(next);
                next++;
            }
            int p = next - prev - 1;
            ans = Math.max(p, ans);
        }
        return ans;
    }
}
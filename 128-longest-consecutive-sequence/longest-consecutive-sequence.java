class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums)
            hs.add(i);
        int max = 0;
        for (int i : nums) {          
            int prev = i - 1, next = i + 1;
            while (hs.contains(prev)) {
                hs.remove(prev--);
                // prev--;
            }
            while (hs.contains(next)) {
                hs.remove(next++);
                // next++;
            }
            max = Math.max(next - prev - 1, max);
        }
        return max;
    }
}
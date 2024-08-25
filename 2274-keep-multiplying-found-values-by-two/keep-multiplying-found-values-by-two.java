class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums) hs.add(i);
        for (int i : nums) {
            if (hs.contains(original))
                original = original * 2;
        }
        return original;
    }
}
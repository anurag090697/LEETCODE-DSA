class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int tm = t.indexOf(s.charAt(i));
            ans += Math.abs(i-tm);
        }
        return ans;
    }
}
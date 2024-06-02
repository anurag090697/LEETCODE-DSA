class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int cnt [] = new int [s.length()];
        for(int i = 0; i < s.length(); i++){
          cnt[i] =  Math.abs(s.charAt(i) - t.charAt(i));
        } 
        int ans = 0, tm = 0;
        int l = 0, r = 0;
        while(r < cnt.length){
            tm += cnt[r];
            while(tm > maxCost){
                tm -= cnt[l];
                l++;
            }
            ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }
}
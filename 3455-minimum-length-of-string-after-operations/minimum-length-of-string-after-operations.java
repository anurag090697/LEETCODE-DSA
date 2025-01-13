class Solution {
    public int minimumLength(String s) {
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        int ans = 0;
        for(int i : freq){
            ans += i < 3 ? i : i % 2 == 0 ? 2 : 1;
        }
        return ans;
    }
}
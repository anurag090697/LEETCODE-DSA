class Solution {
    public boolean canConstruct(String s, int k) {
        if(k > s.length()) return false;
        int freq [] = new int [26];
        for(int i = 0; i < s.length(); i++) freq[s.charAt(i)-'a']++;
        int odd = 0;
        for(int i : freq){
            if(i % 2 == 1) odd++;
            if(odd > k) return false;
        }
        return true;
    }
}
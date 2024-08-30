class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq [] = new int [26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        int tm = freq[s.charAt(0) - 'a'];
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] != tm) return false;
        }
        return true;
    }
}
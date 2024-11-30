class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        String ans = "";
        while(i < word1.length() && i < word2.length()){
            ans += word1.charAt(i);
            ans += word2.charAt(i++);
        }
        while(i < word1.length()) ans += word1.charAt(i++);
        while(i < word2.length()) ans += word2.charAt(i++);
        return ans;
    }
}
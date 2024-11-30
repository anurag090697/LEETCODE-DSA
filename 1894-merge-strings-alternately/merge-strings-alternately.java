class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        char arr[] = new char[word1.length() + word2.length()];
        String ans = "";
        // System.out.print(arr.toString());
        while(i < word1.length() && i < word2.length()){
            arr[j++] = word1.charAt(i);
            arr[j++] = word2.charAt(i++);
        }
        
        while(i < word1.length()) arr[j++] = word1.charAt(i++);
        while(i < word2.length()) arr[j++] = word2.charAt(i++);
        for(char p : arr) ans += p;
        return ans;
    }
}
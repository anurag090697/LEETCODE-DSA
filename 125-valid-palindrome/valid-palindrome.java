class Solution {
    public boolean isPalindrome(String s) {
        
        String str = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)) str +=Character.toUpperCase(ch);
        }
        
        int i = 0;
        int j = str.length()-1;
        while(i <= j){
            char ch = str.charAt(i);
            char cj = str.charAt(j);
            if(ch != cj){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
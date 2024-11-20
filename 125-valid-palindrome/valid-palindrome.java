class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j){
            char tm1 = Character.toLowerCase(s.charAt(i));
            char tm2 = Character.toLowerCase(s.charAt(j));
            if(!Character.isLetterOrDigit(tm1)) i++;
            else if(!Character.isLetterOrDigit(tm2)) j--;
            else if(tm1 != tm2) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
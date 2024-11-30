class Solution {
    public static boolean pld(String a){
        int i = 0, j = a.length()-1;
        while(i < j){
            if(a.charAt(i) != a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String i : words){
            if(pld(i)) return i;
        }
        return "";
    }
}
class Solution {
    public boolean isLongPressedName(String a, String b) {
        if(a.length() > b.length()) return false;
        int j = 0, i = 0;
        while(i < a.length() && j < b.length()){
            if(a.charAt(i) == b.charAt(j)){
                i++;
                j++;
            }
            else if(i > 0 && a.charAt(i-1) == b.charAt(j)) j++;
            else return false;
        }
        while(j < b.length()){
            if(a.charAt(i-1) != b.charAt(j)) return false;
            j++;
        }
        if(a.charAt(a.length()-1) != b.charAt(b.length()-1) || i < a.length()) return false;
        return true;
    }
}
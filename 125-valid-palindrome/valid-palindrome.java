class Solution {
    public boolean isPalindrome(String s) {
         int i = 0, j = s.length() - 1;
        char arr [] = s.toCharArray();
        while (i < j) {
            char c1 = Character.toLowerCase(arr[i]);
            char c2 = Character.toLowerCase(arr[j]);
            if (!Character.isLetterOrDigit(c1)) {
                i++;
            } else if (!Character.isLetterOrDigit(c2)) {
                j--;
            } else if (c1 != c2) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true; 
    }
}
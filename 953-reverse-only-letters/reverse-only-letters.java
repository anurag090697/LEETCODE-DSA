class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[] = s.toCharArray();
        int i = 0, j = arr.length-1;
        while(i < j){
            if(!Character.isAlphabetic(s.charAt(i))) i++;
            else if(!Character.isAlphabetic(s.charAt(j))) j--;
            else{
                char tm = arr[i];
                arr[i] = arr[j];
                arr[j] = tm;
                i++;
                j--;
            }
        }
        String ans = "";
        for(char p : arr) ans += p;
        return ans;
    }
}
class Solution {
    public int longestPalindrome(String s) {
        char arr [] = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        int len = 0;
        for(int i = 0; i < arr.length; i++){
            if(hs.contains(arr[i])){
                len += 2;
                hs.remove(arr[i]);
            }
            else hs.add(arr[i]);
        }
        if(!hs.isEmpty()) len++;
       return(len);
    }
}
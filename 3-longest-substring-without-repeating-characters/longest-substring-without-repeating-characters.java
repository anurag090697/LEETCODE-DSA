class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int i = 0, j = 0;
        int len = 0;
        while(j < s.length()){
            char tm = s.charAt(j);
            if(hs.contains(tm)){
                hs.remove(s.charAt(i));
                i++;
            }else{
                hs.add(s.charAt(j));
                j++;
            }
            len = Math.max(len, hs.size());
        }
        return len;
    }
}
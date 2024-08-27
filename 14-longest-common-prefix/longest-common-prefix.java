class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minl = 400;
        for(int i = 0; i < strs.length; i++){
            int idx = 0;
            while(idx < strs[i].length() && idx < minl){
                if(strs[0].charAt(idx) == strs[i].charAt(idx)) idx++;
                else break;
            }
            minl = Math.min(minl,idx);
        }
        return strs[0].substring(0,minl);
    }
}
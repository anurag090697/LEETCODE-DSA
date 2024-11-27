class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minl = 400;
        String tm = strs[0];
        for(int i = 0; i < strs.length; i++){
            int idx = 0;
            while(idx < strs[i].length() && idx < minl){
                if(tm.charAt(idx) == strs[i].charAt(idx)) idx++;
                else break;
            }
            minl = Math.min(minl,idx);
        }
        return tm.substring(0,minl);
    }
}
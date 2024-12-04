class Solution {
    public String addSpaces(String s, int[] spaces) {
        char str[] = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        for(int i = 0; i < str.length; i++){
           if(idx < spaces.length && i == spaces[idx]){
            ans.append(" ");
            idx++;
           }
           ans.append(str[i]);
        }  
        return ans.toString();
    }
}
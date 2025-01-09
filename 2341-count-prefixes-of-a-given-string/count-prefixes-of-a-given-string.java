class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt = 0;
        for(String i : words){
            if(s.indexOf(i) == 0) cnt++;
        }
        return cnt;
    }
}
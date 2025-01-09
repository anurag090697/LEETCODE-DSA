class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        for(String i : words){
            if(i.indexOf(pref) == 0) cnt++;
        }
        return cnt;
    }
}
class Solution {
    public String longestCommonPrefix(String[] a) {
        int n = a.length;
        String m = a[0];
        
        int cnt = 300;
        for(int i = 0; i < n; i++){
            int idx = 0;
            String tm = a[i];
            while(idx < tm.length() && idx < cnt){
                if(m.charAt(idx) == tm.charAt(idx)){
                    idx++;
                }
                else break;
            }
            cnt = Math.min(idx, cnt);
        }
        return (m.substring(0, cnt));
    }
}
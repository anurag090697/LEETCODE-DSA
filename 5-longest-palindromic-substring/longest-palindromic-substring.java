class Solution {
     public static int pd(String a){
        int q = a.length(), i = 0, j = a.length()-1;
        while(i <= j){
            if(a.charAt(i) != a.charAt(j)) return 0;
            i++;
            j--;
        }
        return q;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int cnt = 0;
        String b = "";
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                String a = s.substring(i, j+1);
                int tm = pd(a);
                if(tm > cnt){
                    cnt = tm;
                    b = a;
                }
            }
        }
        return (b);
    }
}
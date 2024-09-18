class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder ans = new StringBuilder("");
        String s1 = num1 + "", s2 = num2 + "", s3 = num3 + "";
        int i = s1.length()-1, j = s2.length()-1, k = s3.length()-1;
        
        while (i > -1 && j > -1 && k > -1) {
            char t1 = s1.charAt(i), t2 = s2.charAt(j), t3 = s3.charAt(k);
            char tm = (char) Math.min(t1, Math.min(t2, t3));
            ans.append(tm);
            i--;
            j--;
            k--;
        }
        String a = ans.reverse().toString();
        return Integer.parseInt(a);
    }
}
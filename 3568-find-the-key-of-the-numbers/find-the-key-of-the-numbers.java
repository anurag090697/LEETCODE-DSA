class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans = 0 , n = 1;
        for(int i = 0; i < 4; i++){
            int tm = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            ans += n * tm;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            n *= 10;
        }
        return ans;
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for(int i = n-1; i >= 0; i--){
            int val = digits[i] + carry;
            if(val < 10){
                carry = 0;
                digits[i] = val;
            }
            else{
                digits[i] = 0;
                carry = 1;
            }
        }
        if(carry == 1){
            digits = new int[n+1];
            digits[0] = 1;
        }
        return digits;
    }
}
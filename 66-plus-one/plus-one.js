/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
     let n = digits.length;
        let carry = 1;
    for (let i = n - 1; i >= 0; i--) {
            let val = digits[i] + carry;
        if (val < 10) {
            carry = 0;
            digits[i] = val;
        }
        else {
            digits[i] = 0;
            carry = 1;
        }
    }
    if (carry == 1) {

        digits.unshift(carry);
    }
    return digits;
};
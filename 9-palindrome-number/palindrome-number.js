/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let str = "" + x;
    let rev = str.split('').reverse().join('');
    console.log(str, x);
    return str == rev;
};
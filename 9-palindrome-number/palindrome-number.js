/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let tm = x;
    let temp = 0;
    while(tm > 0){
        temp = (temp * 10) + (tm % 10);
        tm = parseInt(tm/10);
    }
    return x === temp;
};
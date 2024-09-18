/**
 * @param {number} num1
 * @param {number} num2
 * @param {number} num3
 * @return {number}
 */
var generateKey = function(num1, num2, num3) {
    let ans = 0 , n = 1;
        for(let i = 0; i < 4; i++){
            let tm = parseInt(Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10)));
            ans += n * tm;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            n *= 10;
        }
        return ans;
};
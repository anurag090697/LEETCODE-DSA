/**
 * @param {string} s
 * @param {string} t
 * @return {number}
 */
var findPermutationDifference = function(s, t) {
    let ans = 0;
        for(let i = 0; i < s.length; i++){
            let tm = t.indexOf(s.charAt(i));
            ans += Math.abs(i-tm);
        }
        return ans;
};
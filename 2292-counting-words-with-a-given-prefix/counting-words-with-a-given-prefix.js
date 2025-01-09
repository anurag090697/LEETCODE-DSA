/**
 * @param {string[]} words
 * @param {string} pref
 * @return {number}
 */
var prefixCount = function (words, pref) {
    let cnt = 0;
    for (let i of words) {
        if (i.indexOf(pref) == 0) cnt++;
    }
    return cnt;
};
/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function (a) {
    let n = a.length;
    let m = a[0];
    let cnt = 300;
    for (let i = 0; i < n; i++) {
        let idx = 0;
        let tm = a[i];
        while (idx < tm.length && idx < cnt) {
            if (m.charAt(idx) == tm.charAt(idx)) {
                idx++;
            }
            else break;
        }
        cnt = Math.min(idx, cnt);
    }
    return m.substring(0, cnt);
};
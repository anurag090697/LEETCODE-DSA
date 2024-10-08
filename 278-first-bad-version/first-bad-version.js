/**
 * Definition for isBadVersion()
 * 
 * @param {integer} version number
 * @return {boolean} whether the version is bad
 * isBadVersion = function(version) {
 *     ...
 * };
 */

/**
 * @param {function} isBadVersion()
 * @return {function}
 */
var solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function(n) {
        if (n == 1)
            return n;
        let i = 1, j = n;

        while (i < j) {
            let mid = parseInt(i + (j - i) / 2);
            if (isBadVersion(mid)) j = mid;
            else i = mid + 1;
        }
        return i;
    };
};
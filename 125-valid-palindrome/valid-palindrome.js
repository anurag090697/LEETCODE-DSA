/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function (s) {
    let i = 0, j = s.length - 1;
    let arr = s.split('');
    while (i < j) {
        let c1 = arr[i].toLowerCase();
        let c2 = arr[j].toLowerCase();
        if (!/[a-zA-Z0-9]/.test(c1)) {
            i++;
        } else if (!/[a-zA-Z0-9]/.test(c2)) {
            j--;
        } else if (c1 != c2) {
            return false;
        } else {
            i++;
            j--;
        }
    }

    return true;
};
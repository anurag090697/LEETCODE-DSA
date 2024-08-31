/**
 * @param {string} s
 * @return {character}
 */
var repeatedCharacter = function (s) {
    let freq = new Array(126).fill(0);
    for (let i = 0; i < s.length; i++) {
        freq[s.charCodeAt(i) - 'a'.charCodeAt(0)]++;
        if (freq[s.charCodeAt(i) - 'a'.charCodeAt(0)]==2) return s.charAt(i);
    }
    return s.charAt(0);
};
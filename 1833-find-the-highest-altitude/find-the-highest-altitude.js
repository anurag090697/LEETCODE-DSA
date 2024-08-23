/**
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function (gain) {
    let max = 0, ha = 0;
    for (let i = 0; i < gain.length; i++) {
        ha += gain[i];
        max = Math.max(max, ha);
    }
    return max;
};
/**
 * @param {number} x
 * @param {number} y
 * @param {number} z
 * @return {number}
 */
var findClosest = function(x, y, z) {
     let diff1 = Math.abs(z-x), diff2 = Math.abs(z-y);
        if(diff1 == diff2) return 0;
        else if(diff1 > diff2) return 2;
        return 1;
};
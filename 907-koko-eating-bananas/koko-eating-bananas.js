/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {
    function canEat(arr, speed, time) {
        let hoursNeeded = 0;
        for (let pile of arr) {
            hoursNeeded += Math.ceil(pile / speed);
        }
        return hoursNeeded <= time;
    }
    
    let left = 1;
    let right = Math.max(...piles);
    
    while (left < right) {
        let mid = Math.floor((left + right) / 2);
        if (canEat(piles, mid, h)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }  
    return left;
};
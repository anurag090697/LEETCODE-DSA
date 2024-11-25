/**
 * @param {number[]} plants
 * @param {number} capacity
 * @return {number}
 */
var wateringPlants = function (plants, capacity) {
    let step = 0, can = capacity;
    for (let i = 0; i < plants.length; i++) {
        if (can >= plants[i]) {
            step++;
            can -= plants[i];
        }
        else {
            can = capacity;
            step += i + i + 1;
            can -= plants[i];
        }
    }
    return step;
};
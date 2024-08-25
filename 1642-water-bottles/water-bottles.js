/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function (numBottles, numExchange) {
    let drunk = numBottles;
    let empty = drunk;
    let extra = 0;

    while (Math.floor(empty / numExchange) > 0) {
        numBottles = Math.floor(empty / numExchange);
        extra = empty % numExchange;
        drunk += numBottles;
        empty = numBottles + extra;
    }

    return drunk;
};
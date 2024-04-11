/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    let now = 0;
    let total = 0;
    let idx = 0;
    for(let i = 0; i < gas.length; i++){
        let fuel = gas[i] - cost[i];
        total += fuel;
        now += fuel;
        if(now < 0){
            now = 0;
            idx = i + 1;
        }
    }
    if(total >=0) return idx;
    return -1;
};
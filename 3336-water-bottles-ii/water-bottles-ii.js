/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var maxBottlesDrunk = function(bot, exc) {
     let empty = bot, drank = bot;
        while(empty / exc >= 1){
            drank++;
            empty = empty - exc++ + 1;    
        }
        return drank;
};
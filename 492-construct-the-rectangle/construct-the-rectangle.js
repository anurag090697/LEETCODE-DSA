/**
 * @param {number} area
 * @return {number[]}
 */
var constructRectangle = function(area) {
    let ans = [];
        for(let i = Math.floor(Math.sqrt(area)); i > 0; i--){
            if(area % i == 0){
                let j = area/i;
                ans[0] = j;
                ans[1] = i;
                break;
            }
           
        }
         return ans;
};
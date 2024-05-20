/**
 * @param {number[]} asteroids
 * @return {number[]}
 */
var asteroidCollision = function(asteroids) {
    let ans = [];
    for(let i = 0; i < asteroids.length; i++){
        let tm = asteroids[i];
        while(ans.length > 0 && ans[ans.length-1] > 0 && tm < 0){
            let sum = tm + ans[ans.length-1];
            if(sum > 0) tm = 0;
            else if(sum < 0) ans.pop();
            else{
                ans.pop();
                tm = 0;
            }
        }
        if(tm !== 0) ans.push(tm);
    }
    return ans;
};
/**
 * @param {character[]} chars
 * @return {number}
 */
var compress = function(chars) {
    let ans = [];
    if(chars.length < 2) return;
    for(let i = 0; i < chars.length-1; i++){
        let cnt = 1;
        let j = i+1;
        while(j < chars.length && chars[i] === chars[j]){
            cnt++;
            j++;
        }
        ans.push(chars[i]);
        
        if(cnt > 1){
            let fq = cnt + "";
            for(let p = 0; p < fq.length; p++){
                ans.push(fq.charAt(p));
                } 
        }
        
        
        i = j - 1;
    }
    if(chars[chars.length-1] !== chars[chars.length-2]) ans.push(chars[chars.length-1]);
   for(let i = 0; i < chars.length; i++){
    chars[i] = ans[i];
   }
    return ans.length;
};
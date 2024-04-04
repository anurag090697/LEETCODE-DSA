/**
 * @param {string} s
 * @return {string}
 */
var removeDuplicates = function(s) {
    let arr = [];
    for(let i = 0; i < s.length; i++){
        let ch = s.charAt(i);
        if(arr.length > 0 &&  ch === arr[arr.length-1]){
            arr.pop();
        }
        else{
            arr.push(ch);
        }
    }
    return arr.join('');
};
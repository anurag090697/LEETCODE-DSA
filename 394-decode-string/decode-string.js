/**
 * @param {string} s
 * @return {string}
 */
var decodeString = function(s) {
    let arr = [];
    let cnt = 0;
    let temp = "";
    for(let i = 0; i < s.length; i++){
        let ch = s.charAt(i);
        if(ch <= '9' &&  ch >= '0'){
            cnt = cnt * 10 + parseInt(ch);
        }
        else if(ch === '['){
            arr.push({str: temp, num : cnt});
            temp = '';
            cnt = 0;
        }
        else if(ch === ']'){
            let {str : prev, num} = arr.pop();
            temp = prev + temp.repeat(num);
        }
        else{
            temp += ch;
        }
    }
    return temp;
};
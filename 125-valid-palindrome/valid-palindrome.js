/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let s1 = "";
    for(let i = 0; i < s.length; i++){
        let char = s.charAt(i);
        if ((char >= "a" && char <= "z") || (char >= "A" && char <= "Z") || (char >= "0" && char <= "9")){
            s1 += char.toLowerCase();
        }
    }
    
    let i = 0;
    let j = s1.length-1;
    while(i <= j){
        if(s1.charAt(i) !== s1.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
};
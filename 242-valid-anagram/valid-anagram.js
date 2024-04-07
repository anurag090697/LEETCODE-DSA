/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length != t.length) return false;
    let s1 = s.split('');
    let t1 = t.split('');
    s1.sort();
    t1.sort();
    console.log(t1, s1);
    for(let i = 0; i < s1.length; i++){
        if(s1[i] != t1[i]) return false;
    }
    
    return true;
};
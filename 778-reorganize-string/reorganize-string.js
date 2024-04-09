/**
 * @param {string} s
 * @return {string}
 */
var reorganizeString = function(s) {
    let n = s.length;
    let ans = new Array(n);
    let hashMap = new Map();
    let fq = 0;
    let ch ;
    for(let i of s){
        hashMap.set(i, (hashMap.get(i) || 0) + 1);
        if(hashMap.get(i) > fq){
            fq = hashMap.get(i);
            ch = i;
        }
    }

    let i = 0;
    while(fq > 0 && i < n){
        ans[i] = ch;
        i +=2;
        fq--;
    }
    if(fq !== 0) return "";
    hashMap.set(ch , 0);
    for(let [key, value] of hashMap){
        while(hashMap.get(key) > 0){
            i = i >= n ? 1 : i;
            ans[i] = key;
            hashMap.set(key, hashMap.get(key) -1);
            i += 2;
        }
    }
    return ans.join("");
};
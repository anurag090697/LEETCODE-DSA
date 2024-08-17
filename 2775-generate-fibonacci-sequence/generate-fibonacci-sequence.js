/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let a = 0, b = 1;
    let c;
    while(true){
        yield a;
        c = a;
        a = b;
        b = c + a;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */
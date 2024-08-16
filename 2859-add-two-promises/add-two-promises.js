/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    return promise1.then(rt1 => {
        return promise2.then(rt2 => {
            return rt1 + rt2;
        });
    }).catch(error => {
        throw error;
    });
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var minimalKSum = function (nums, k) {
    nums.sort((a, b) => a - b);
    let sum = 0n;  // Use BigInt for large sums
    let prev = 0;

    for (let num of nums) {
        if (num - prev > 1 && k > 0) {
            let start = BigInt(prev + 1);
            let end = BigInt(Math.min(num - 1, prev + k));
            let count = end - start + 1n;
            sum += (start + end) * count / 2n;
            k -= Number(count);
        }
        prev = num;
        if (k === 0) break;
    }

    if (k > 0) {
        let start = BigInt(prev + 1);
        let end = BigInt(start + BigInt(k) - 1n);
        sum += (start + end) * BigInt(k) / 2n;
    }

    return Number(sum);
};
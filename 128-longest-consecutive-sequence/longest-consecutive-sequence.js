/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    if (nums.length === 0) return 0;
    if (nums.length === 1) return 1;
    const hs = new Set();
    let max = Number.MIN_SAFE_INTEGER;
    let min = Number.MAX_SAFE_INTEGER;
        for (const num of nums) {
            hs.add(num);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        let ans = 0;
        for (const num of nums) {
            if (!hs.has(num)) hs.delete(num);
            let prev = num - 1;
            let next = num + 1;
            while (hs.has(prev)) {
                hs.delete(prev);
                prev--;
            }
            while (hs.has(next)) {
                hs.delete(next);
                next++;
            }
            const p = next - prev - 1;
            ans = Math.max(p, ans);
        }
        return ans;
};
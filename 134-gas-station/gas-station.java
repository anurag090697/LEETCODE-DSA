class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int now = 0;
    int total = 0;
    int idx = 0;
    for(int i = 0; i < gas.length; i++){
        int fuel = gas[i] - cost[i];
        total += fuel;
        now += fuel;
        if(now < 0){
            now = 0;
            idx = i + 1;
        }
    }
    if(total >=0) return idx;
    return -1;
    }
}
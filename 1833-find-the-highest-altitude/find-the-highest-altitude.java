class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, ha = 0;
        for(int i = 0; i< gain.length; i++){
            ha += gain[i];
            max = Math.max(max, ha);
        }
        return max;
    }
}
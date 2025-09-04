class Solution {
    public int findClosest(int x, int y, int z) {
        int diff1 = Math.abs(z-x), diff2 = Math.abs(z-y);
        if(diff1 == diff2) return 0;
        else if(diff1 > diff2) return 2;
        return 1;
    }
}
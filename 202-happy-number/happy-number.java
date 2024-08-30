class Solution {
    public boolean isHappy(int n) {
        int og = n;
        while(true){
            int sum = 0, tm = 0;
            while(og > 0){
                tm = og % 10;
                sum += tm * tm;
                og /= 10;
            }
            og = sum;
            tm = 0;
            sum = 0;
            if(og == 1) return true;
            else if(og < 10 && og != 7) break;
        }
        return false;
    }
}
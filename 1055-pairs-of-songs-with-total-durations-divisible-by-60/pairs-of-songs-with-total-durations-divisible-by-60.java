class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int n = time.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        
        for(Integer ele : time){
            int mod = ele % 60;
            if(mod == 0){
                ans += hm.getOrDefault(0, 0);
            }
            else{
                ans += hm.getOrDefault(60-mod, 0);
            }
            hm.put(mod, hm.getOrDefault(mod, 0)+1);
        }
        return ans;
    }
}
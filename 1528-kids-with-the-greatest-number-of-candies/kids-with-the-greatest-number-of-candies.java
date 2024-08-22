class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        List<Boolean> ans = new ArrayList<>();
        // Boolean [] ans = new Boolean[candies.length];
        // System.out.print(max);
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}
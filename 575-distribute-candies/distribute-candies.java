class Solution {
    public int distributeCandies(int[] candyType) {
        int max = candyType.length / 2;
        HashSet<Integer> hs = new HashSet<>();
        for(int  i = 0; i < candyType.length; i++){
            hs.add(candyType[i]);
        }
        return hs.size() > max ? max : hs.size();
    }
}
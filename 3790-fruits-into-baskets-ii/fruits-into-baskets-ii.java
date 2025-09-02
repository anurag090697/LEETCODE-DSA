class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans = 0;
        for(int i = 0; i < fruits.length; i++){
            for(int j = 0; j < baskets.length; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = 0;
                    ans++;
                    break;
                }
            }
        }
        return fruits.length - ans;
    }
}
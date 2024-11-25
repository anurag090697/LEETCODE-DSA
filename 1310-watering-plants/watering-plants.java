class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int step = 0, can = capacity;
        for(int i = 0; i < plants.length; i++){
            if(can >= plants[i]){
                step++;
                can -= plants[i];
            }
            else{
                can = capacity;
                step += i + i + 1;
                can -= plants[i];
            }
        }
        return step;
    }
}
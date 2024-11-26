class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int alc = capacityA, bob = capacityB;
        int i = 0, j = plants.length-1;
        int total = 0;
        while(i <= j){
            if(i == j ){
                if(plants[i] > alc && plants[j] > bob) total++;
                break;
            }
            if(alc < plants[i]){
                total++;
                alc = capacityA;
            }
            if(bob < plants[j]){
                total++;
                bob = capacityB;
            }
            alc -= plants[i];
            bob -= plants[j];
            i++;
            j--;
        }
        return total;
    }
}
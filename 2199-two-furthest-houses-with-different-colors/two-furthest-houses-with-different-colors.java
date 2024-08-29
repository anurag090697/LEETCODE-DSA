class Solution {
    public int maxDistance(int[] colors) {
        int dis = -1;
        for(int i = 0; i < colors.length-1; i++){
            int j = i;
            while(j < colors.length){
                if(colors[j] != colors[i]){
                    dis = Math.max(Math.abs(i-j),dis);
                }
                j++;
            }
        }
        return dis;
    }
}
class Solution {
    public int sumOfUnique(int[] a) {
        int sum = 0;
        if(a.length == 1) return a[0];
        for(int i = 0; i < a.length; i++){
            int cnt = 0;
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j]) cnt++;
            }
            if(cnt == 1) sum += a[i];
        }
        return sum;
    }
}
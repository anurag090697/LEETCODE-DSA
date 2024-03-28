class Solution {
    public int sumOfUnique(int[] arr) {
        int sum = 0;
        int n = arr.length;
        if(arr.length == 1) return arr[0];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        for(Integer k: hm.keySet()){
            if(hm.get(k) == 1) sum += k; 
            // System.out.println(hm.get(key));
        }
        return sum;
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int key : hm.keySet()){
            hs.add(hm.get(key));
        }
        return(hs.size() == hm.size());
    }
}
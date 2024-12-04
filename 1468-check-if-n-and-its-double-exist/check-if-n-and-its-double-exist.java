class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i : arr) {
            if(hm.contains(i*2) || (i % 2 == 0 && hm.contains(i/2))) return true;
            hm.add(i);
        }
        return false;
    }
}
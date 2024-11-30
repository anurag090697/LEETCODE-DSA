class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        for(String i : words1) hm1.put(i,hm1.getOrDefault(i,0)+1);
        for(String i : words2) hm2.put(i,hm2.getOrDefault(i,0)+1);
        int cnt = 0;
        for(String i : hm1.keySet()){
            // System.out.println(hm2.getOrDefault(i,0));
            if(hm1.get(i) == 1 && hm2.getOrDefault(i,0) == 1) cnt++;
        }
        return cnt;
    }
}
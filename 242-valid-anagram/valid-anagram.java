class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length(), m = t.length();
        if(n != m) return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0; i < n; i++){
            hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0)+1);
            hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i), 0)+1);
        }
        return hm1.equals(hm2);
    }
}
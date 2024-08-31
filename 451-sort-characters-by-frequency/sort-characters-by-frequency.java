class Solution {
    public String frequencySort(String s) {
        Character [] ch = new Character[s.length()];
        for(int i = 0; i < s.length(); i++) ch[i] = s.charAt(i);
        int[] freq = new int[128]; 
        for (int i = 0; i < ch.length; i++) {
            freq[ch[i]]++;
        }
        Comparator<Character> myComp = (a, b) -> {
            if (freq[a] == freq[b]) {
                return a - b;
            }
            return freq[b] - freq[a];
        };
        Arrays.sort(ch, myComp);
        StringBuilder result = new StringBuilder();
        for (char c : ch) {
            result.append(c);
        }
        return result.toString();
    }
}
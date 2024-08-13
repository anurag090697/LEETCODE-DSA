class Solution {
    public String frequencySort(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        List<Character> characters = new ArrayList<>();
        for (char c : str.toCharArray()) {
            characters.add(c);
        }
        characters.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            if (freqCompare != 0) {
                return freqCompare;
            } else {
                return Character.compare(a, b);
            }
        });
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : characters) {
            sb.append(c);
        }
        return sb.toString();
    }
}
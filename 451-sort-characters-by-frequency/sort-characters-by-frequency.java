class Solution {
    public String frequencySort(String str) {
        Character arr[] = new Character[str.length()];
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        Comparator<Character> myComp = new Comparator<>() {
            public int compare(Character a, Character b) {
                if (hm.get(a).equals(hm.get(b))) {
                    return a - b;
                }
                return hm.get(b) - hm.get(a);
            }
        };
        Arrays.sort(arr, myComp);
        StringBuilder sb = new StringBuilder(arr.length);
        for (Character c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }
}
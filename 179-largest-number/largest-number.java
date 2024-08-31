class Solution {
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = nums[i] + "";
        Comparator<String> myComp = new Comparator<>() {
            public int compare(String a, String b) {
                String p = a + b, k = b + a;
                return k.compareTo(p);
            }
        };
        Arrays.sort(arr, myComp);
        String ans = "";
        for (String i : arr)
            ans += i;
        if (ans.charAt(0) == ('0'))
            return "0";
        return ans;
    }
}
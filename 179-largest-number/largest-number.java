class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String ans [] = new String[n];
        for(int i = 0; i < n; i++) ans[i] = "" + nums[i];
        Comparator<String> myComp = new Comparator<>(){
            public int compare(String a, String b){
                String x = a+b, y = b+a;
                return y.compareTo(x);
            }
        };
        Arrays.sort(ans, myComp);
        if(ans[0].equals("0")) return "0";
        String uttar = "";
        for(int i = 0; i < n; i++) uttar += ans[i];
        return uttar;
    }
}
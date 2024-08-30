class Solution {
    public String largestNumber(int[] nums) {
        String ans [] = new String[nums.length];
        for(int i = 0; i < nums.length; i++) ans[i] = nums[i] + "";
        Comparator<String> myComp = new Comparator<>(){
            public int compare(String a, String b){
                String s = a+b, t = b+a;
                return t.compareTo(s);
            }
        };
        Arrays.sort(ans,myComp);
        String str = "";
        for(String i : ans) str += i;
        if(str.charAt(0) == '0') return "0";
        return str;
    }
}
class Solution {
    public String largestGoodInteger(String num) {
        for(int i = 9 ; i > -1; i--){
            String tm = i + "" + i + i;
            if(num.contains(tm)){
                return tm;
            }
        }
       return "";
    }
}
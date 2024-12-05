class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < num.length(); i++){
            char tm = num.charAt(i);
            while(k > 0 && st.size() > 0 && tm < st.peek()){
                k--;
                st.pop();
            }
            st.push(tm);
        }
        while(k > 0 && st.size() > 0){
            k--;
            st.pop();
        }
        StringBuilder ans = new StringBuilder();
        while(st.size() > 0) ans.insert(0,st.pop());
        int i = 0;
        while(i < ans.length() && ans.charAt(i) == '0'){
            i++;
        }
        ans.delete(0, i);
        if(ans.length() == 0) return "0";
        return ans.toString();
    }
}
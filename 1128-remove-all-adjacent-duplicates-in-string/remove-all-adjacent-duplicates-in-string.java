class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        st.push(s.charAt(0));
        for(int i = 1; i < n; i++){
            char ch = s.charAt(i);
            if(st.size() > 0 && st.peek() != ch) st.push(ch);
            else if(st.size() == 0) st.push(ch);
            else st.pop();
        }
        StringBuilder ans = new StringBuilder();
        while(st.size() > 0) ans.append(st.pop()) ;
        ans.reverse();
        return ans.toString();
    }
}
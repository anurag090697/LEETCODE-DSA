class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            String tm = operations[i];
            if(tm.equals("C")) st.pop();
            else if(tm.equals("+")){
                int tm1 = st.pop();
                int sum = tm1 + st.peek();
                st.push(tm1);
                st.push(sum);
            }
            else if(tm.equals("D")) st.push(st.peek() * 2);
            else st.push(Integer.parseInt(tm));
        }
        int ans = 0;
        while(st.size() > 0) ans += st.pop();
        return ans;
    }
}
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> st = new Stack<>();
       for(int i : asteroids){
        if(i > 0) st.push(i);
        else{
            while(st.size() > 0 && st.peek() > 0 && st.peek() + i < 0) st.pop();
            if(st.isEmpty() || st.peek() < 0){
                st.push(i);
            }
            if(st.peek() + i == 0) st.pop();
        }
       }
       int ans [] = new int[st.size()];
       for(int i = 0; i < ans.length; i++) ans[i] = st.get(i);
       return ans;
    }
}
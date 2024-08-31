class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> st = new Stack<>();
       for(int i : asteroids){
        int tm = i;
        while(!st.isEmpty() && tm < 0 && st.peek() > 0){
            if(st.peek() + tm > 0) tm = 0;
            else if(tm + st.peek() < 0) st.pop();
            else{
                st.pop();
                tm = 0;
            }
        }
        if(tm != 0) st.push(tm);
       }
       int ans [] = new int [st.size()];
       for(int i = ans.length-1; i > -1; i--) ans[i] = st.pop();
       return ans;
    }
}
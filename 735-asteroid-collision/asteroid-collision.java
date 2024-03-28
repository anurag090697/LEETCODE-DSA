class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            int tm = asteroids[i];
            while(st.size() > 0 && tm < 0 && st.peek() > 0){
                int sum = tm + st.peek();
                if(sum > 0) tm = 0;
                else if(sum < 0) st.pop();
                else{
                    st.pop();
                    tm = 0;
                }
            }
            if(tm != 0) st.push(tm);
        }
        int ans [] = new int[st.size()];
        for(int i = ans.length-1; i > -1; i--) ans[i] = st.pop();
        return ans;
    }
}
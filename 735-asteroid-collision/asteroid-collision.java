class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            int temp = asteroids[i];
            while(!st.isEmpty() && st.peek() > 0 && temp < 0){
                if(temp + st.peek() < 0) st.pop();
                else if(temp + st.peek() > 0) temp = 0;
                else{
                    temp = 0;
                    st.pop();
                }
            }
            if(temp != 0) st.push(temp);
        }
        int ans [] = new int[st.size()];
        for(int i = ans.length-1; i > -1; i--) ans[i] = st.pop();
        return ans;
    }
}
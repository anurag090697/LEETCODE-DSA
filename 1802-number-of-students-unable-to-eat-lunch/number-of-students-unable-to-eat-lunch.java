class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qu = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = students.length-1; i > -1 ; i--){
            qu.add(students[i]);
            st.push(sandwiches[i]);
        } 
       int turns = 0;
        while(!st.isEmpty()){
            if(st.peek() == qu.peek()){
                st.pop();
                qu.remove();
            }
            else{
                int tm = qu.remove();
                qu.add(tm);
                turns++;
            }
            if(turns == students.length * 3) break;   
        }
        return qu.size();
    }
}
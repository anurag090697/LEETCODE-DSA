class Solution {
    public int countBinarySubstrings(String s) {
        int back = 0;
        int front = 1;
        int total = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)) front++;
            else{
                total += Math.min(front, back);
                back = front;
                front = 1;
            }
        }
        total += Math.min(front, back);
        return(total);
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();
        //boolean ans = true;
        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            if(chr == '(' || chr == '{' || chr == '[') ch.push(chr);
            
            else if(ch.size() == 0){
                return false;       
            }
            
            else if((chr == ')' && ch.peek() != '(') ){
                return false;
            }
            
            else if((chr == '}' && ch.peek() != '{')){
                return false;
            }
            
            else if((chr == ']' && ch.peek() != '[')){
                return false;
            }
            
            else ch.pop();
        }
        if(ch.size() != 0) return false;
        return true;
    }
}
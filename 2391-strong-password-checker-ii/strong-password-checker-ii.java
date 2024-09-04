class Solution {
    public boolean strongPasswordCheckerII(String password) {
        // System.out.print(password.length());
        if(password.length() < 8) return false; 
        boolean ans [] = new boolean[5];
        int ls = 0;
        for(int i = 0; i < password.length(); i++){
            char tm = password.charAt(i);
            if(tm >= 'a' &&  tm <= 'z') ans[0] = true;
            else if(tm >= 'A' && tm <= 'Z') ans[1] = true;
            else if (tm >= '0' && tm <= '9') ans[2] = true;
            else if("!@#$%^&*()-+".indexOf(tm) != -1) ans[3] = true;
             if(i != 0 && tm == password.charAt(i-1)) ls++;
        }
        if(ls == 0) ans[4] = true;
        
        for(boolean i : ans) {
            if(!i) return i;
            // System.out.print(ls);
        }
        return true;
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String tm = s+s;
        return tm.contains(goal);
    }
}
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0, j = skill.length-1;
        int k = skill[i] + skill[j];
        long ans = 0;
        while(i < j){
            if(skill[i] + skill[j] != k) return -1;
            ans += skill[i] * skill[j];
            i++;
            j--;
        }
        return ans;
    }
}
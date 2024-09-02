class Solution {
    public List<Integer> majorityElement(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> qu = new ArrayList<>();
        for(int i : nums) pq.add(i);
        System.out.print(pq);
        int prev = pq.remove(), cnt = 1;
        while(pq.size() > 0){
            int tm = pq.peek();
            if(tm == prev) cnt++;
            else{
                if(cnt > nums.length/3) qu.add(prev);
                cnt = 1;
                prev = tm;
            }
            pq.remove();
        }
        if(cnt > nums.length/3) qu.add(prev);
        return qu;
    }
}
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int count=0;
        for(long n : nums) pq.offer(n);
        while(pq.peek()<k){
            
            long num = pq.poll()*2 + pq.poll();
            pq.offer(num);
            count++;
        }
        return count;
    }
}
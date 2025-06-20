class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            if(a>b)pq.add(a-b);
            else if(b>a)pq.add(b-a);
        }
        if(pq.size()==1)
        return pq.peek();
        else return 0;     
    }
}
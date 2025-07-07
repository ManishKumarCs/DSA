// class Solution {
//     public int maxEvents(int[][] events) {
//         Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));
//         boolean[] attended = new boolean[100001]; 
//         int count = 0;
//         for (int[] event : events) {
//             for (int day = event[0]; day <= event[1]; day++) {
//                 if (!attended[day]) {
//                     attended[day] = true;
//                     count++;
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }   Time Limit Exceed-----------------------

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0])); // Sort by start day
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int day = 1, i = 0, res = 0;
        int n = events.length;
        while (i < n || !pq.isEmpty()) {
            while (i < n && events[i][0] == day) {
                pq.offer(events[i][1]);
                i++;
            }
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                pq.poll();
                res++;
            }
            day++;
        }
        return res;
    }
}


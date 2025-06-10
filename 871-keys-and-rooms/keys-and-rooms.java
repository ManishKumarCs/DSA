class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    List<Integer> visited = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(0);
    visited.add(0);
    while(!queue.isEmpty()){
        int room = queue.poll();
        for(int key : rooms.get(room)){
            if(!visited.contains(key)){
                visited.add(key);
                queue.offer(key);
            }
        }
    }  
    return visited.size()==rooms.size();
    }
}
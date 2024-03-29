//Number of recent calls

class RecentCounter {
     private Queue<Integer> queue;
    public RecentCounter() {
        this.queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

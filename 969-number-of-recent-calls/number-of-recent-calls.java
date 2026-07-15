class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        this.queue.add(t);
        while(queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
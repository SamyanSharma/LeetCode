class MyStack {
    private Deque<Integer> queue;

    public MyStack() {
        this.queue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        this.queue.addFirst(x);
    }
    
    public int pop() {
        return this.queue.removeFirst();
    }
    
    public int top() {
        return this.queue.peek();
    }
    
    public boolean empty() {
        return this.queue.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
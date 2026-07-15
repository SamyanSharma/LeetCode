class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }
    
    public void push(int x) {
        this.s1.push(x);
    }
    
    public int pop() {
        peek();
        return this.s2.pop();
    }
    
    public int peek() {
        if(this.s2.isEmpty()){
            while(!this.s1.isEmpty()){
                this.s2.push(this.s1.pop());
            }
        }
        return this.s2.peek();
    }
    
    public boolean empty() {
        return this.s1.isEmpty() && this.s2.isEmpty(); 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
class MyCircularQueue {
    private int[] arr;
    private int front;
    private int capacity;
    private int size;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.arr = new int[k];
        this.size = 0;
        this.front = 0;
    }
    
    public boolean enQueue(int value) {
        if(this.size == this.capacity){
            return false;
        }
        int rear = (this.front + this.size) % this.capacity;
        this.arr[rear] = value;
        this.size++;
        return true;
    }
    
    public boolean deQueue() {
        if(this.size == 0){
            return false;
        }
        this.front = (this.front + 1) % this.capacity;
        this.size--;
        return true;
    }
    
    public int Front() {
        if(this.size == 0){
            return -1;
        }
        return this.arr[this.front];
    }
    
    public int Rear() {
        if(this.size == 0){
            return -1;
        }
        int rear = (this.front + this.size - 1) % this.capacity;
        return this.arr[rear];
    }
    
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    public boolean isFull() {
        return this.size == this.capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
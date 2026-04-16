class MyLinkedList {
    class ListNode{
        int val;
        ListNode prev;
        ListNode next;

        ListNode (int val){
            this.val = val;
        }
    }

    int size;
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
        tail = new ListNode(0);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size){
            return -1;
        }
        ListNode curr = head;
        if(index + 1 < size - index){
            for(int i = 0; i < index + 1; i++){
                curr = curr.next;
            }
        }else{
            curr = tail;
            for(int i = 0; i < size - index; i++){
                curr = curr.prev;
            }
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode pred = head;
        ListNode succ = head.next;

        size++;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;

        pred.next = toAdd;
        succ.prev = toAdd;
    }
    
    public void addAtTail(int val) {
        ListNode pred = tail.prev;
        ListNode succ = tail;

        size++;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        
        pred.next = toAdd;
        succ.prev = toAdd;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        if (index < 0){
            index = 0;
        }
        ListNode pred, succ;
        if(index < size - index){
            pred = head;
            for(int i = 0; i < index; i++){
                pred = pred.next;
            }
            succ = pred.next;
        }else{
            succ = tail;
            for(int i = 0; i < size - index; i++){
                succ = succ.prev;
            }
            pred = succ.prev;
        }
        size++;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;

        pred.next = toAdd;
        succ.prev = toAdd;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }

        ListNode pred, succ;
        if(index < size - index){
            pred = head;
            for(int i = 0; i < index; i++){
                pred = pred.next;
            }
            succ = pred.next.next;
        }else{
            succ = tail;
            for(int i = 0; i < size - index - 1; i++){
                succ = succ.prev;
            }
            pred = succ.prev.prev;
        }
        size--;

        pred.next = succ;
        succ.prev = pred;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
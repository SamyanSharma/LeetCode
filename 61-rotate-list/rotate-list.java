/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int size = 1;
        ListNode lastNode = head;
        while(lastNode.next != null){
            size++;
            lastNode = lastNode.next;
        }
        k = k % size;
        if(k == 0){
            return head;
        }
        lastNode.next = head;
        ListNode newTail = head;
        for(int i = 0; i < size - k - 1; i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
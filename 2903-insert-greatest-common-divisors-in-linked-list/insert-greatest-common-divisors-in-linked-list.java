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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        while(curr != null && curr.next != null){
            int gcdValue = calculateGCD(curr.val, curr.next.val);
            ListNode gcdNode = new ListNode(gcdValue);
            gcdNode.next = curr.next;
            curr.next = gcdNode;
            curr = gcdNode.next;
        }
        return head;
    }

    private int calculateGCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
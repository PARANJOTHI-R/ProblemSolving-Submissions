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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null){
            ListNode next=fast.next; 
            fast.next=prev;
            prev=fast;
            fast=next;
        }
       return prev;

    }
}

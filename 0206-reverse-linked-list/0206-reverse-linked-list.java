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
        ListNode curr=head, prev=null;

        while(curr!=null) //curr, not curr.next because we are returning prev
        {
            ListNode nxt=curr.next; //new node nxt
            curr.next=prev; // current.next points to prev

            prev=curr;
            curr=nxt;
        }
        // head.next=null;
        head=prev;
        return head;
    }
}
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
        ListNode prev, curr, nxt;
        if(head==null || head.next==null)
        return head;
        prev=head;
        curr=head.next;

        while(curr!=null)
        {
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head.next=null;
        head=prev;
        return head;
    }
}
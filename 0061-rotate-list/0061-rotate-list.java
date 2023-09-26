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
         if (head == null || head.next == null || k == 0) {
            return head;
        }
         ListNode curr=head;
         int length = 0;
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        if(k>=length)
        {
            k=k%length;
        }

         if (k == 0) {
            return head;
        }


        curr=head;
        int ptr1=k;
        //if we want to traverse till n-k places, first traverse k, and then traverse upto k!=0 and 2nd ptr will be at n-k

        while(ptr1!=0)
        {
            curr=curr.next;
            ptr1--;
        }

        ListNode prev=head;

        while(curr.next!=null)
        {
            curr=curr.next;
            prev=prev.next;
        }

        //now prev points at where we need to divide list
        //now we need to reverse prev to curr

        ListNode dummy=prev.next;
        prev.next=null;

        curr.next=head;

        return dummy;
    }
}
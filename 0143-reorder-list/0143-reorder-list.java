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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        //FIND MIDDLE OF LL

     ListNode fast=head, slow=head;
     while(fast.next!=null && fast.next.next!=null)  // here we check for fast only because obviously, it'll reach the end of LL first and we need to know if fast.next and fast.next.next both are not null otherwise there will be a nullpointer exception 
     {
         slow=slow.next; //when fast reaches the end, slow will reach the middle
         fast=fast.next.next;
     }

     //CUT OFF LEFT PART FROM RIGHT
     ListNode leftHead=head; //first part
     ListNode right=slow.next; //second part of LL
     slow.next=null;

     //REVERSE RIGHT LIST AND REMEMBER ITS NEW BEGINNING
     ListNode prev=null;
     ListNode curr=right;
     while(curr!=null) //curr, not curr.next, ye dekhna pdhega
     {
        ListNode nxt=curr.next;
        curr.next=prev;

        prev=curr;
        curr=nxt;
     }
     right.next=null;
     ListNode rightHead=prev;

     //MERGE NODES hoping ki itna code is enough, like really?

     while(rightHead!=null)
     {
        ListNode nextLeft=leftHead.next;
        ListNode nextRight=rightHead.next;

        leftHead.next=rightHead; // a   c   e  -> left
        rightHead.next=nextLeft; // | / | /
                                //  b   d      -> right

        leftHead=nextLeft;
        rightHead=nextRight;
     }

    }
}
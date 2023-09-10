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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int m=size(head)-n;
        return(delete(head,m));
    }

    public int size(ListNode head)
    {
        int size=0;
        while(head!=null)
        {
            head=head.next;
            size++;
        }
        System.out.println(size);
        return size;
    }

    public ListNode delete(ListNode head, int m)
    {
        ListNode prev=null;
        ListNode curr=head;

        if(m==0 && curr!=null)
        {
            head=head.next;
        }
        else
        {
            int c=0;
            while(curr!=null)
            {
                if(c==m)
                {
                prev.next=curr.next;
                break;
                }
                else
                {
                    c++;
                    prev=curr;
                    curr=curr.next;
                }
            }
        }
        return head;

    }
}
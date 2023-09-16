/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node != null && node.next != null) {
                node.val = node.next.val;// for 2 in 1->2->3->4 to 1->3->3->4
                node.next = node.next.next;//1->3->4
            }
    }
}
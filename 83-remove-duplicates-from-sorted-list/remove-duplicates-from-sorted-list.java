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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head != null && head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode curr = head.next;

        while (curr != null) {

            if (curr.val != pre.val && curr.next!=null) {
                pre.next = curr;
                pre = curr;
            }
            else if(curr.next == null && curr.val == pre.val){
                pre.next = null;

            }
            else if(curr.next == null && curr.val != pre.val){
                pre.next = curr;
                pre =curr;
            }
            curr = curr.next;

        }

        return head;

    }
}
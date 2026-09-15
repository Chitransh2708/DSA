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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode pre = null;
        ListNode curr = head;
        while(head!=null && head.val == val){
            head = head.next;
            curr.next = null;
            curr = head;
        }

        while(curr!=null){
            if(curr.val == val){
                ListNode temp = curr;
                curr= curr.next;
                pre.next = temp.next;
                temp.next = null;

            }
            else{
                pre = curr;
                curr = curr.next;
            }

        }
        return head;
    }
}